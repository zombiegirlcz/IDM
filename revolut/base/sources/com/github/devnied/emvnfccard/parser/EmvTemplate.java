package com.github.devnied.emvnfccard.parser;

import com.github.devnied.emvnfccard.enums.CommandEnum;
import com.github.devnied.emvnfccard.enums.EmvCardScheme;
import com.github.devnied.emvnfccard.exception.CommunicationException;
import com.github.devnied.emvnfccard.iso7816emv.EmvTags;
import com.github.devnied.emvnfccard.iso7816emv.ITerminal;
import com.github.devnied.emvnfccard.iso7816emv.TLV;
import com.github.devnied.emvnfccard.iso7816emv.impl.DefaultTerminalImpl;
import com.github.devnied.emvnfccard.model.Application;
import com.github.devnied.emvnfccard.model.EmvCard;
import com.github.devnied.emvnfccard.model.enums.CardStateEnum;
import com.github.devnied.emvnfccard.parser.impl.EmvParser;
import com.github.devnied.emvnfccard.parser.impl.GeldKarteParser;
import com.github.devnied.emvnfccard.parser.impl.ProviderWrapper;
import com.github.devnied.emvnfccard.utils.AtrUtils;
import com.github.devnied.emvnfccard.utils.CPLCUtils;
import com.github.devnied.emvnfccard.utils.CommandApdu;
import com.github.devnied.emvnfccard.utils.ResponseUtils;
import com.github.devnied.emvnfccard.utils.TlvUtil;
import fr.devnied.bitlib.BytesUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* JADX INFO: loaded from: classes16.dex */
public class EmvTemplate {
    public static final int MAX_RECORD_SFI = 16;
    private EmvCard card;
    private Config config;
    private List<IParser> parsers;
    private IProvider provider;
    private ITerminal terminal;
    private static final Logger LOGGER = LoggerFactory.getLogger((Class<?>) EmvTemplate.class);
    private static final byte[] PPSE = "2PAY.SYS.DDF01".getBytes();
    private static final byte[] PSE = "1PAY.SYS.DDF01".getBytes();

    public static class Builder {
        private Config config;
        private IProvider provider;
        private ITerminal terminal;

        public EmvTemplate build() {
            if (this.provider == null) {
                throw new IllegalArgumentException("Provider may not be null.");
            }
            if (this.terminal == null) {
                this.terminal = new DefaultTerminalImpl();
            }
            return new EmvTemplate(this.provider, this.terminal, this.config);
        }

        public Builder setConfig(Config config) {
            this.config = config;
            return this;
        }

        public Builder setProvider(IProvider iProvider) {
            this.provider = iProvider;
            return this;
        }

        public Builder setTerminal(ITerminal iTerminal) {
            this.terminal = iTerminal;
            return this;
        }
    }

    public static class Config {
        public boolean removeDefaultParsers;
        public boolean contactLess = true;
        public boolean readTransactions = true;
        public boolean readAllAids = true;
        public boolean readAt = true;
        public boolean readCplc = false;

        public Config setContactLess(boolean z) {
            this.contactLess = z;
            return this;
        }

        public Config setReadAllAids(boolean z) {
            this.readAllAids = z;
            return this;
        }

        public Config setReadAt(boolean z) {
            this.readAt = z;
            return this;
        }

        public Config setReadCplc(boolean z) {
            this.readCplc = z;
            return this;
        }

        public Config setReadTransactions(boolean z) {
            this.readTransactions = z;
            return this;
        }

        public Config setRemoveDefaultParsers(boolean z) {
            this.removeDefaultParsers = z;
            return this;
        }
    }

    public static Builder Builder() {
        return new Builder();
    }

    public static Config Config() {
        return new Config();
    }

    private void addDefaultParsers() {
        ArrayList arrayList = new ArrayList();
        this.parsers = arrayList;
        arrayList.add(new GeldKarteParser(this));
        this.parsers.add(new EmvParser(this));
    }

    public EmvTemplate addParsers(IParser... iParserArr) {
        if (iParserArr != null) {
            for (IParser iParser : iParserArr) {
                this.parsers.add(0, iParser);
            }
        }
        return this;
    }

    public List<Application> getApplicationTemplate(byte[] bArr) {
        ArrayList arrayList = new ArrayList();
        for (TLV tlv : TlvUtil.getlistTLV(bArr, EmvTags.APPLICATION_TEMPLATE)) {
            Application application = new Application();
            for (TLV tlv2 : TlvUtil.getlistTLV(tlv.getValueBytes(), EmvTags.AID_CARD, EmvTags.APPLICATION_LABEL, EmvTags.APPLICATION_PRIORITY_INDICATOR)) {
                if (tlv2.getTag() == EmvTags.APPLICATION_PRIORITY_INDICATOR) {
                    application.setPriority(BytesUtils.byteArrayToInt(tlv2.getValueBytes()));
                } else if (tlv2.getTag() == EmvTags.APPLICATION_LABEL) {
                    application.setApplicationLabel(new String(tlv2.getValueBytes()));
                } else {
                    application.setAid(tlv2.getValueBytes());
                    arrayList.add(application);
                }
            }
        }
        return arrayList;
    }

    public EmvCard getCard() {
        return this.card;
    }

    public Config getConfig() {
        return this.config;
    }

    public List<IParser> getParsers() {
        return Collections.unmodifiableList(this.parsers);
    }

    public IProvider getProvider() {
        return this.provider;
    }

    public ITerminal getTerminal() {
        return this.terminal;
    }

    public List<Application> parseFCIProprietaryTemplate(byte[] bArr) throws CommunicationException {
        ArrayList arrayList = new ArrayList();
        byte[] value = TlvUtil.getValue(bArr, EmvTags.SFI);
        if (value != null) {
            int iByteArrayToInt = BytesUtils.byteArrayToInt(value);
            Logger logger = LOGGER;
            if (logger.isDebugEnabled()) {
                logger.debug("SFI found:" + iByteArrayToInt);
            }
            for (int i = 0; i < 16; i++) {
                byte[] bArrTransceive = this.provider.transceive(new CommandApdu(CommandEnum.READ_RECORD, i, (iByteArrayToInt << 3) | 4, 0).toBytes());
                if (!ResponseUtils.isSucceed(bArrTransceive)) {
                    break;
                }
                arrayList.addAll(getApplicationTemplate(bArrTransceive));
            }
        } else {
            arrayList.addAll(getApplicationTemplate(bArr));
            Logger logger2 = LOGGER;
            if (logger2.isDebugEnabled()) {
                logger2.debug("(FCI) Issuer Discretionary Data is already present");
            }
        }
        return arrayList;
    }

    public void readCPLCInfos() throws CommunicationException {
        this.card.setCplc(CPLCUtils.parse(this.provider.transceive(new CommandApdu(CommandEnum.GET_DATA, 159, CertificateBody.profileType, null, 0).toBytes())));
    }

    public EmvCard readEmvCard() throws CommunicationException {
        if (this.config.readCplc) {
            readCPLCInfos();
        }
        if (this.config.readAt) {
            this.card.setAt(BytesUtils.bytesToStringNoSpace(this.provider.getAt()));
            EmvCard emvCard = this.card;
            emvCard.setAtrDescription(this.config.contactLess ? AtrUtils.getDescriptionFromAts(emvCard.getAt()) : AtrUtils.getDescription(emvCard.getAt()));
        }
        if (!readWithPSE()) {
            readWithAID();
        }
        return this.card;
    }

    public void readWithAID() throws CommunicationException {
        Logger logger = LOGGER;
        if (logger.isDebugEnabled()) {
            logger.debug("Try to read card with AID");
        }
        Application application = new Application();
        for (EmvCardScheme emvCardScheme : EmvCardScheme.values()) {
            for (byte[] bArr : emvCardScheme.getAidByte()) {
                application.setAid(bArr);
                application.setApplicationLabel(emvCardScheme.getName());
                String strBytesToStringNoSpace = BytesUtils.bytesToStringNoSpace(bArr);
                for (IParser iParser : this.parsers) {
                    if (iParser.getId() != null && iParser.getId().matcher(strBytesToStringNoSpace).matches() && iParser.parse(application)) {
                        this.card.getApplications().clear();
                        this.card.getApplications().add(application);
                        return;
                    }
                }
            }
        }
    }

    public boolean readWithPSE() throws CommunicationException {
        boolean z;
        Logger logger = LOGGER;
        if (logger.isDebugEnabled()) {
            logger.debug("Try to read card with Payment System Environment");
        }
        byte[] bArrSelectPaymentEnvironment = selectPaymentEnvironment();
        if (!ResponseUtils.isSucceed(bArrSelectPaymentEnvironment)) {
            if (logger.isDebugEnabled()) {
                logger.debug((this.config.contactLess ? "PPSE" : "PSE").concat(" not found -> Use kown AID"));
            }
            return false;
        }
        this.card.getApplications().addAll(parseFCIProprietaryTemplate(bArrSelectPaymentEnvironment));
        Collections.sort(this.card.getApplications());
        Iterator<Application> it8 = this.card.getApplications().iterator();
        boolean z3 = false;
        while (true) {
            if (!it8.hasNext()) {
                break;
            }
            Application next = it8.next();
            String strBytesToStringNoSpace = BytesUtils.bytesToStringNoSpace(next.getAid());
            Iterator<IParser> it9 = this.parsers.iterator();
            while (true) {
                if (!it9.hasNext()) {
                    z = false;
                    break;
                }
                IParser next2 = it9.next();
                if (next2.getId() != null && next2.getId().matcher(strBytesToStringNoSpace).matches()) {
                    z = next2.parse(next);
                    break;
                }
            }
            if (!z3 && z) {
                if (!this.config.readAllAids) {
                    z3 = z;
                    break;
                }
                z3 = z;
            }
        }
        if (!z3) {
            this.card.setState(CardStateEnum.LOCKED);
        }
        return z3;
    }

    public byte[] selectPaymentEnvironment() throws CommunicationException {
        Logger logger = LOGGER;
        if (logger.isDebugEnabled()) {
            StringBuilder sb6 = new StringBuilder("Select ");
            sb6.append(this.config.contactLess ? "PPSE" : "PSE");
            sb6.append(" Application");
            logger.debug(sb6.toString());
        }
        return this.provider.transceive(new CommandApdu(CommandEnum.SELECT, this.config.contactLess ? PPSE : PSE, 0).toBytes());
    }

    private EmvTemplate(IProvider iProvider, ITerminal iTerminal, Config config) {
        this.provider = new ProviderWrapper(iProvider);
        this.terminal = iTerminal;
        this.config = config;
        if (config == null) {
            this.config = Config();
        }
        if (!this.config.removeDefaultParsers) {
            addDefaultParsers();
        }
        this.card = new EmvCard();
    }
}

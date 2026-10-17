package com.github.devnied.emvnfccard.parser.impl;

import com.github.devnied.emvnfccard.enums.CommandEnum;
import com.github.devnied.emvnfccard.enums.EmvCardScheme;
import com.github.devnied.emvnfccard.enums.SwEnum;
import com.github.devnied.emvnfccard.exception.CommunicationException;
import com.github.devnied.emvnfccard.iso7816emv.EmvTags;
import com.github.devnied.emvnfccard.iso7816emv.TagAndLength;
import com.github.devnied.emvnfccard.model.Afl;
import com.github.devnied.emvnfccard.model.Application;
import com.github.devnied.emvnfccard.model.EmvCard;
import com.github.devnied.emvnfccard.model.enums.ApplicationStepEnum;
import com.github.devnied.emvnfccard.model.enums.CardStateEnum;
import com.github.devnied.emvnfccard.parser.EmvTemplate;
import com.github.devnied.emvnfccard.utils.CommandApdu;
import com.github.devnied.emvnfccard.utils.ResponseUtils;
import com.github.devnied.emvnfccard.utils.TlvUtil;
import com.github.devnied.emvnfccard.utils.TrackUtils;
import fr.devnied.bitlib.BytesUtils;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ymm.a;

/* JADX INFO: loaded from: classes16.dex */
public class EmvParser extends AbstractParser {
    private static final Logger LOGGER = LoggerFactory.getLogger((Class<?>) EmvParser.class);
    private static final Pattern PATTERN = Pattern.compile(".*");

    public EmvParser(EmvTemplate emvTemplate) {
        super(emvTemplate);
    }

    public List<Afl> extractAfl(byte[] bArr) {
        ArrayList arrayList = new ArrayList();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        while (byteArrayInputStream.available() >= 4) {
            Afl afl2 = new Afl();
            afl2.setSfi(byteArrayInputStream.read() >> 3);
            afl2.setFirstRecord(byteArrayInputStream.read());
            afl2.setLastRecord(byteArrayInputStream.read());
            boolean z = true;
            if (byteArrayInputStream.read() != 1) {
                z = false;
            }
            afl2.setOfflineAuthentication(z);
            arrayList.add(afl2);
        }
        return arrayList;
    }

    public boolean extractCommonsCardData(byte[] bArr) throws CommunicationException {
        boolean zExtractTrackData;
        byte[] value = TlvUtil.getValue(bArr, EmvTags.RESPONSE_MESSAGE_TEMPLATE_1);
        if (value != null) {
            int length = value.length;
            if (length > value.length) {
                length = value.length;
            }
            int i = length - 2;
            if (i <= 0) {
                value = a.f315055a;
            } else {
                byte[] bArr2 = new byte[i];
                System.arraycopy(value, 2, bArr2, 0, i);
                value = bArr2;
            }
            zExtractTrackData = false;
        } else {
            zExtractTrackData = extractTrackData(this.template.get().getCard(), bArr);
            if (zExtractTrackData) {
                extractCardHolderName(bArr);
            } else {
                value = TlvUtil.getValue(bArr, EmvTags.APPLICATION_FILE_LOCATOR);
            }
        }
        if (value != null) {
            for (Afl afl2 : extractAfl(value)) {
                for (int firstRecord = afl2.getFirstRecord(); firstRecord <= afl2.getLastRecord(); firstRecord++) {
                    byte[] bArrTransceive = this.template.get().getProvider().transceive(new CommandApdu(CommandEnum.READ_RECORD, firstRecord, (afl2.getSfi() << 3) | 4, 0).toBytes());
                    if (ResponseUtils.isSucceed(bArrTransceive)) {
                        extractCardHolderName(bArrTransceive);
                        if (extractTrackData(this.template.get().getCard(), bArrTransceive)) {
                            return true;
                        }
                    }
                }
            }
        }
        return zExtractTrackData;
    }

    public boolean extractPublicData(Application application) throws CommunicationException {
        byte[] bArrSelectAID = selectAID(application.getAid());
        if (!ResponseUtils.contains(bArrSelectAID, SwEnum.SW_9000, SwEnum.SW_6285)) {
            return false;
        }
        application.setReadingStep(ApplicationStepEnum.SELECTED);
        boolean z = parse(bArrSelectAID, application);
        if (z) {
            String strBytesToStringNoSpace = BytesUtils.bytesToStringNoSpace(TlvUtil.getValue(bArrSelectAID, EmvTags.DEDICATED_FILE_NAME));
            String strExtractApplicationLabel = extractApplicationLabel(bArrSelectAID);
            if (strExtractApplicationLabel == null) {
                strExtractApplicationLabel = application.getApplicationLabel();
            }
            Logger logger = LOGGER;
            if (logger.isDebugEnabled()) {
                logger.debug("Application label:" + strExtractApplicationLabel + " with Aid:" + strBytesToStringNoSpace);
            }
            this.template.get().getCard().setType(findCardScheme(strBytesToStringNoSpace, this.template.get().getCard().getCardNumber()));
            application.setAid(BytesUtils.fromString(strBytesToStringNoSpace));
            application.setApplicationLabel(strExtractApplicationLabel);
            application.setLeftPinTry(getLeftPinTry());
            application.setTransactionCounter(getTransactionCounter());
            this.template.get().getCard().setState(CardStateEnum.ACTIVE);
        }
        return z;
    }

    public boolean extractTrackData(EmvCard emvCard, byte[] bArr) {
        this.template.get().getCard().setTrack1(TrackUtils.extractTrack1Data(TlvUtil.getValue(bArr, EmvTags.TRACK1_DATA)));
        this.template.get().getCard().setTrack2(TrackUtils.extractTrack2EquivalentData(TlvUtil.getValue(bArr, EmvTags.TRACK_2_EQV_DATA, EmvTags.TRACK2_DATA)));
        return (emvCard.getTrack1() == null && emvCard.getTrack2() == null) ? false : true;
    }

    public EmvCardScheme findCardScheme(String str, String str2) {
        EmvCardScheme cardTypeByAid = EmvCardScheme.getCardTypeByAid(str);
        if (cardTypeByAid == EmvCardScheme.CB && (cardTypeByAid = EmvCardScheme.getCardTypeByCardNumber(str2)) != null) {
            LOGGER.debug("Real type:" + cardTypeByAid.getName());
        }
        return cardTypeByAid;
    }

    public byte[] getGetProcessingOptions(byte[] bArr) throws CommunicationException {
        List<TagAndLength> tagAndLength = TlvUtil.parseTagAndLength(bArr);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write(EmvTags.COMMAND_TEMPLATE.getTagBytes());
            byteArrayOutputStream.write(TlvUtil.getLength(tagAndLength));
            if (tagAndLength != null) {
                Iterator<TagAndLength> it8 = tagAndLength.iterator();
                while (it8.hasNext()) {
                    byteArrayOutputStream.write(this.template.get().getTerminal().constructValue(it8.next()));
                }
            }
        } catch (IOException e) {
            LOGGER.error("Construct GPO Command:" + e.getMessage(), (Throwable) e);
        }
        return this.template.get().getProvider().transceive(new CommandApdu(CommandEnum.GPO, byteArrayOutputStream.toByteArray(), 0).toBytes());
    }

    @Override // com.github.devnied.emvnfccard.parser.IParser
    public Pattern getId() {
        return PATTERN;
    }

    @Override // com.github.devnied.emvnfccard.parser.IParser
    public boolean parse(Application application) throws CommunicationException {
        return extractPublicData(application);
    }

    public boolean parse(byte[] bArr, Application application) throws CommunicationException {
        byte[] logEntry = getLogEntry(bArr);
        byte[] value = TlvUtil.getValue(bArr, EmvTags.PDOL);
        byte[] getProcessingOptions = getGetProcessingOptions(value);
        extractBankData(bArr);
        if (!ResponseUtils.isSucceed(getProcessingOptions)) {
            if (value != null) {
                getProcessingOptions = getGetProcessingOptions(null);
            }
            if (value == null || !ResponseUtils.isSucceed(getProcessingOptions)) {
                getProcessingOptions = this.template.get().getProvider().transceive(new CommandApdu(CommandEnum.READ_RECORD, 1, 12, 0).toBytes());
                if (!ResponseUtils.isSucceed(getProcessingOptions)) {
                    return false;
                }
            }
        }
        application.setReadingStep(ApplicationStepEnum.READ);
        if (!extractCommonsCardData(getProcessingOptions)) {
            return false;
        }
        application.setListTransactions(extractLogEntry(logEntry));
        return true;
    }
}

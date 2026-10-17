package com.github.devnied.emvnfccard.parser.impl;

import com.github.devnied.emvnfccard.enums.CommandEnum;
import com.github.devnied.emvnfccard.enums.EmvCardScheme;
import com.github.devnied.emvnfccard.exception.CommunicationException;
import com.github.devnied.emvnfccard.iso7816emv.EmvTags;
import com.github.devnied.emvnfccard.model.Application;
import com.github.devnied.emvnfccard.model.EmvTrack2;
import com.github.devnied.emvnfccard.model.EmvTransactionRecord;
import com.github.devnied.emvnfccard.model.enums.ApplicationStepEnum;
import com.github.devnied.emvnfccard.model.enums.CardStateEnum;
import com.github.devnied.emvnfccard.model.enums.CurrencyEnum;
import com.github.devnied.emvnfccard.model.enums.TransactionTypeEnum;
import com.github.devnied.emvnfccard.parser.EmvTemplate;
import com.github.devnied.emvnfccard.utils.CommandApdu;
import com.github.devnied.emvnfccard.utils.ResponseUtils;
import com.github.devnied.emvnfccard.utils.TlvUtil;
import com.youTransactor.uCube.rpc.Constants;
import fr.devnied.bitlib.BytesUtils;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.regex.Pattern;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ymm.g;

/* JADX INFO: loaded from: classes16.dex */
public class GeldKarteParser extends AbstractParser {
    private static final Logger LOGGER = LoggerFactory.getLogger((Class<?>) GeldKarteParser.class);
    private static final Pattern PATTERN = Pattern.compile(g.a(EmvCardScheme.GELDKARTE.getAid()[2]) + ".*");

    public GeldKarteParser(EmvTemplate emvTemplate) {
        super(emvTemplate);
    }

    public void extractEF_ID(Application application) throws CommunicationException {
        byte[] bArrTransceive = this.template.get().getProvider().transceive(new CommandApdu(CommandEnum.READ_RECORD, 1, 188, 0).toBytes());
        if (ResponseUtils.isSucceed(bArrTransceive)) {
            application.setReadingStep(ApplicationStepEnum.READ);
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/yy", Locale.getDefault());
            EmvTrack2 emvTrack2 = new EmvTrack2();
            emvTrack2.setCardNumber(BytesUtils.bytesToStringNoSpace(Arrays.copyOfRange(bArrTransceive, 4, 9)));
            try {
                emvTrack2.setExpireDate(simpleDateFormat.parse(String.format("%02x/%02x", Byte.valueOf(bArrTransceive[11]), Byte.valueOf(bArrTransceive[10]))));
            } catch (ParseException e) {
                LOGGER.error(e.getMessage(), (Throwable) e);
            }
            this.template.get().getCard().setTrack2(emvTrack2);
        }
    }

    @Override // com.github.devnied.emvnfccard.parser.IParser
    public Pattern getId() {
        return PATTERN;
    }

    public TransactionTypeEnum getType(byte b4) {
        int i = (b4 & 96) >> 5;
        if (i == 0) {
            return TransactionTypeEnum.LOADED;
        }
        if (i == 1) {
            return TransactionTypeEnum.UNLOADED;
        }
        if (i == 2) {
            return TransactionTypeEnum.PURCHASE;
        }
        if (i != 3) {
            return null;
        }
        return TransactionTypeEnum.REFUND;
    }

    @Override // com.github.devnied.emvnfccard.parser.IParser
    public boolean parse(Application application) throws CommunicationException {
        byte[] bArrSelectAID = selectAID(application.getAid());
        if (!ResponseUtils.isSucceed(bArrSelectAID)) {
            return false;
        }
        application.setReadingStep(ApplicationStepEnum.SELECTED);
        byte[] logEntry = getLogEntry(bArrSelectAID);
        application.setAid(TlvUtil.getValue(bArrSelectAID, EmvTags.DEDICATED_FILE_NAME));
        application.setApplicationLabel(extractApplicationLabel(bArrSelectAID));
        this.template.get().getCard().setType(EmvCardScheme.getCardTypeByAid(BytesUtils.bytesToStringNoSpace(application.getAid())));
        extractBankData(bArrSelectAID);
        extractEF_ID(application);
        readEfBetrag(application);
        readEF_BLOG(application);
        application.setLeftPinTry(getLeftPinTry());
        application.setTransactionCounter(getTransactionCounter());
        application.getListTransactions().addAll(extractLogEntry(logEntry));
        this.template.get().getCard().setState(CardStateEnum.ACTIVE);
        return true;
    }

    public void readEF_BLOG(Application application) throws CommunicationException {
        ArrayList arrayList = new ArrayList();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy");
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("HH:mm:ss");
        for (int i = 1; i < 16; i++) {
            byte[] bArrTransceive = this.template.get().getProvider().transceive(new CommandApdu(CommandEnum.READ_RECORD, i, Constants.TAG_OS_VERSION, 0).toBytes());
            if (!ResponseUtils.isSucceed(bArrTransceive)) {
                break;
            }
            if (bArrTransceive.length >= 35) {
                EmvTransactionRecord emvTransactionRecord = new EmvTransactionRecord();
                emvTransactionRecord.setCurrency(CurrencyEnum.EUR);
                emvTransactionRecord.setTransactionType(getType(bArrTransceive[0]));
                emvTransactionRecord.setAmount(Float.valueOf(Float.parseFloat(BytesUtils.bytesToStringNoSpace(Arrays.copyOfRange(bArrTransceive, 21, 24))) / 100.0f));
                try {
                    emvTransactionRecord.setDate(simpleDateFormat.parse(String.format("%02x.%02x.%02x%02x", Byte.valueOf(bArrTransceive[32]), Byte.valueOf(bArrTransceive[31]), Byte.valueOf(bArrTransceive[29]), Byte.valueOf(bArrTransceive[30]))));
                    emvTransactionRecord.setTime(simpleDateFormat2.parse(String.format("%02x:%02x:%02x", Byte.valueOf(bArrTransceive[33]), Byte.valueOf(bArrTransceive[34]), Byte.valueOf(bArrTransceive[35]))));
                } catch (ParseException e) {
                    LOGGER.error(e.getMessage(), (Throwable) e);
                }
                arrayList.add(emvTransactionRecord);
            }
        }
        application.setListTransactions(arrayList);
    }

    public void readEfBetrag(Application application) throws CommunicationException {
        byte[] bArrTransceive = this.template.get().getProvider().transceive(new CommandApdu(CommandEnum.READ_RECORD, 1, 196, 0).toBytes());
        if (ResponseUtils.isSucceed(bArrTransceive)) {
            application.setAmount(Float.parseFloat(String.format("%02x%02x%02x", Byte.valueOf(bArrTransceive[0]), Byte.valueOf(bArrTransceive[1]), Byte.valueOf(bArrTransceive[2]))) / 100.0f);
        }
    }
}

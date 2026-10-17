package com.github.devnied.emvnfccard.parser.impl;

import com.github.devnied.emvnfccard.enums.CommandEnum;
import com.github.devnied.emvnfccard.exception.CommunicationException;
import com.github.devnied.emvnfccard.iso7816emv.EmvTags;
import com.github.devnied.emvnfccard.iso7816emv.TagAndLength;
import com.github.devnied.emvnfccard.parser.EmvTemplate;
import com.github.devnied.emvnfccard.parser.IParser;
import com.github.devnied.emvnfccard.utils.CommandApdu;
import com.github.devnied.emvnfccard.utils.ResponseUtils;
import com.github.devnied.emvnfccard.utils.TlvUtil;
import fr.devnied.bitlib.BytesUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ymm.g;

/* JADX INFO: loaded from: classes16.dex */
public abstract class AbstractParser implements IParser {
    private static final Logger LOGGER = LoggerFactory.getLogger((Class<?>) AbstractParser.class);
    public static final int UNKNOW = -1;
    protected final WeakReference<EmvTemplate> template;

    public AbstractParser(EmvTemplate emvTemplate) {
        this.template = new WeakReference<>(emvTemplate);
    }

    public String extractApplicationLabel(byte[] bArr) {
        Logger logger = LOGGER;
        if (logger.isDebugEnabled()) {
            logger.debug("Extract Application label");
        }
        byte[] value = TlvUtil.getValue(bArr, EmvTags.APPLICATION_PREFERRED_NAME);
        if (value == null) {
            value = TlvUtil.getValue(bArr, EmvTags.APPLICATION_LABEL);
        }
        if (value != null) {
            return new String(value);
        }
        return null;
    }

    public void extractBankData(byte[] bArr) {
        byte[] value = TlvUtil.getValue(bArr, EmvTags.BANK_IDENTIFIER_CODE);
        if (value != null) {
            this.template.get().getCard().setBic(new String(value));
        }
        byte[] value2 = TlvUtil.getValue(bArr, EmvTags.IBAN);
        if (value2 != null) {
            this.template.get().getCard().setIban(new String(value2));
        }
    }

    public void extractCardHolderName(byte[] bArr) {
        String[] strArrI;
        byte[] value = TlvUtil.getValue(bArr, EmvTags.CARDHOLDER_NAME);
        if (value == null || (strArrI = g.i(new String(value).trim())) == null || strArrI.length <= 0) {
            return;
        }
        this.template.get().getCard().setHolderLastname(g.j(strArrI[0]));
        if (strArrI.length == 2) {
            this.template.get().getCard().setHolderFirstname(g.j(strArrI[1]));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0096 A[Catch: Exception -> 0x007f, TryCatch #0 {Exception -> 0x007f, blocks: (B:14:0x0051, B:16:0x005f, B:18:0x006e, B:21:0x0081, B:23:0x0087, B:26:0x0096, B:28:0x009c, B:29:0x00a1), top: B:34:0x0051 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List<com.github.devnied.emvnfccard.model.EmvTransactionRecord> extractLogEntry(byte[] r10) throws com.github.devnied.emvnfccard.exception.CommunicationException {
        /*
            r9 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.ref.WeakReference<com.github.devnied.emvnfccard.parser.EmvTemplate> r1 = r9.template
            java.lang.Object r1 = r1.get()
            com.github.devnied.emvnfccard.parser.EmvTemplate r1 = (com.github.devnied.emvnfccard.parser.EmvTemplate) r1
            com.github.devnied.emvnfccard.parser.EmvTemplate$Config r1 = r1.getConfig()
            boolean r1 = r1.readTransactions
            if (r1 == 0) goto Lc0
            if (r10 == 0) goto Lc0
            java.util.List r1 = r9.getLogFormat()
            if (r1 == 0) goto Lc0
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto Lc0
            r2 = 1
            r3 = r2
        L25:
            r4 = r10[r2]
            if (r3 > r4) goto Lc0
            java.lang.ref.WeakReference<com.github.devnied.emvnfccard.parser.EmvTemplate> r4 = r9.template
            java.lang.Object r4 = r4.get()
            com.github.devnied.emvnfccard.parser.EmvTemplate r4 = (com.github.devnied.emvnfccard.parser.EmvTemplate) r4
            com.github.devnied.emvnfccard.parser.IProvider r4 = r4.getProvider()
            com.github.devnied.emvnfccard.utils.CommandApdu r5 = new com.github.devnied.emvnfccard.utils.CommandApdu
            com.github.devnied.emvnfccard.enums.CommandEnum r6 = com.github.devnied.emvnfccard.enums.CommandEnum.READ_RECORD
            r7 = 0
            r8 = r10[r7]
            int r8 = r8 << 3
            r8 = r8 | 4
            r5.<init>(r6, r3, r8, r7)
            byte[] r5 = r5.toBytes()
            byte[] r4 = r4.transceive(r5)
            boolean r5 = com.github.devnied.emvnfccard.utils.ResponseUtils.isSucceed(r4)
            if (r5 == 0) goto Lc0
            com.github.devnied.emvnfccard.model.EmvTransactionRecord r5 = new com.github.devnied.emvnfccard.model.EmvTransactionRecord     // Catch: java.lang.Exception -> L7f
            r5.<init>()     // Catch: java.lang.Exception -> L7f
            r5.parse(r4, r1)     // Catch: java.lang.Exception -> L7f
            java.lang.Float r4 = r5.getAmount()     // Catch: java.lang.Exception -> L7f
            if (r4 == 0) goto L96
            java.lang.Float r4 = r5.getAmount()     // Catch: java.lang.Exception -> L7f
            float r4 = r4.floatValue()     // Catch: java.lang.Exception -> L7f
            r6 = 1320341598(0x4eb2d05e, float:1.5E9)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 < 0) goto L81
            java.lang.Float r4 = r5.getAmount()     // Catch: java.lang.Exception -> L7f
            float r4 = r4.floatValue()     // Catch: java.lang.Exception -> L7f
            float r4 = r4 - r6
            java.lang.Float r4 = java.lang.Float.valueOf(r4)     // Catch: java.lang.Exception -> L7f
            r5.setAmount(r4)     // Catch: java.lang.Exception -> L7f
            goto L81
        L7f:
            r4 = move-exception
            goto La5
        L81:
            java.lang.Float r4 = r5.getAmount()     // Catch: java.lang.Exception -> L7f
            if (r4 == 0) goto Lbc
            java.lang.Float r4 = r5.getAmount()     // Catch: java.lang.Exception -> L7f
            float r4 = r4.floatValue()     // Catch: java.lang.Exception -> L7f
            r6 = 1065353216(0x3f800000, float:1.0)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 > 0) goto L96
            goto Lbc
        L96:
            com.github.devnied.emvnfccard.model.enums.CurrencyEnum r4 = r5.getCurrency()     // Catch: java.lang.Exception -> L7f
            if (r4 != 0) goto La1
            com.github.devnied.emvnfccard.model.enums.CurrencyEnum r4 = com.github.devnied.emvnfccard.model.enums.CurrencyEnum.XXX     // Catch: java.lang.Exception -> L7f
            r5.setCurrency(r4)     // Catch: java.lang.Exception -> L7f
        La1:
            r0.add(r5)     // Catch: java.lang.Exception -> L7f
            goto Lbc
        La5:
            org.slf4j.Logger r5 = com.github.devnied.emvnfccard.parser.impl.AbstractParser.LOGGER
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Error in transaction format: "
            r6.<init>(r7)
            java.lang.String r7 = r4.getMessage()
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            r5.error(r6, r4)
        Lbc:
            int r3 = r3 + 1
            goto L25
        Lc0:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.devnied.emvnfccard.parser.impl.AbstractParser.extractLogEntry(byte[]):java.util.List");
    }

    public int getLeftPinTry() throws CommunicationException {
        byte[] value;
        Logger logger = LOGGER;
        if (logger.isDebugEnabled()) {
            logger.debug("Get Left PIN try");
        }
        byte[] bArrTransceive = this.template.get().getProvider().transceive(new CommandApdu(CommandEnum.GET_DATA, 159, 23, 0).toBytes());
        if (!ResponseUtils.isSucceed(bArrTransceive) || (value = TlvUtil.getValue(bArrTransceive, EmvTags.PIN_TRY_COUNTER)) == null) {
            return -1;
        }
        return BytesUtils.byteArrayToInt(value);
    }

    public byte[] getLogEntry(byte[] bArr) {
        return TlvUtil.getValue(bArr, EmvTags.LOG_ENTRY, EmvTags.VISA_LOG_ENTRY);
    }

    public List<TagAndLength> getLogFormat() throws CommunicationException {
        ArrayList arrayList = new ArrayList();
        Logger logger = LOGGER;
        if (logger.isDebugEnabled()) {
            logger.debug("GET log format");
        }
        byte[] bArrTransceive = this.template.get().getProvider().transceive(new CommandApdu(CommandEnum.GET_DATA, 159, 79, 0).toBytes());
        if (ResponseUtils.isSucceed(bArrTransceive)) {
            return TlvUtil.parseTagAndLength(TlvUtil.getValue(bArrTransceive, EmvTags.LOG_FORMAT));
        }
        logger.warn("No Log format found");
        return arrayList;
    }

    public int getTransactionCounter() throws CommunicationException {
        byte[] value;
        Logger logger = LOGGER;
        if (logger.isDebugEnabled()) {
            logger.debug("Get Transaction Counter ATC");
        }
        byte[] bArrTransceive = this.template.get().getProvider().transceive(new CommandApdu(CommandEnum.GET_DATA, 159, 54, 0).toBytes());
        if (!ResponseUtils.isSucceed(bArrTransceive) || (value = TlvUtil.getValue(bArrTransceive, EmvTags.APP_TRANSACTION_COUNTER)) == null) {
            return -1;
        }
        return BytesUtils.byteArrayToInt(value);
    }

    public byte[] selectAID(byte[] bArr) throws CommunicationException {
        Logger logger = LOGGER;
        if (logger.isDebugEnabled()) {
            logger.debug("Select AID: " + BytesUtils.bytesToString(bArr));
        }
        return this.template.get().getProvider().transceive(new CommandApdu(CommandEnum.SELECT, bArr, 0).toBytes());
    }
}

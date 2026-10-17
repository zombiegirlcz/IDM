package com.github.devnied.emvnfccard.iso7816emv.impl;

import com.github.devnied.emvnfccard.iso7816emv.EmvTags;
import com.github.devnied.emvnfccard.iso7816emv.ITerminal;
import com.github.devnied.emvnfccard.iso7816emv.TagAndLength;
import com.github.devnied.emvnfccard.iso7816emv.TerminalTransactionQualifiers;
import com.github.devnied.emvnfccard.model.enums.CountryCodeEnum;
import com.github.devnied.emvnfccard.model.enums.CurrencyEnum;
import com.github.devnied.emvnfccard.model.enums.TransactionTypeEnum;
import fr.devnied.bitlib.BytesUtils;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.Date;
import net.sf.scuba.smartcards.ISO7816;
import net.sf.scuba.smartcards.ISOFileInfo;
import ymm.g;

/* JADX INFO: loaded from: classes16.dex */
public final class DefaultTerminalImpl implements ITerminal {
    private static final SecureRandom random = new SecureRandom();
    private CountryCodeEnum countryCode = CountryCodeEnum.FR;

    @Override // com.github.devnied.emvnfccard.iso7816emv.ITerminal
    public byte[] constructValue(TagAndLength tagAndLength) {
        byte[] bArrFromString;
        int length = tagAndLength.getLength();
        byte[] bArr = new byte[length];
        if (tagAndLength.getTag() == EmvTags.TERMINAL_TRANSACTION_QUALIFIERS) {
            TerminalTransactionQualifiers terminalTransactionQualifiers = new TerminalTransactionQualifiers();
            terminalTransactionQualifiers.setContactlessVSDCsupported(true);
            terminalTransactionQualifiers.setContactEMVsupported(true);
            terminalTransactionQualifiers.setMagneticStripeSupported(true);
            terminalTransactionQualifiers.setContactlessEMVmodeSupported(true);
            terminalTransactionQualifiers.setOnlinePINsupported(true);
            terminalTransactionQualifiers.setReaderIsOfflineOnly(false);
            terminalTransactionQualifiers.setSignatureSupported(true);
            terminalTransactionQualifiers.setContactChipOfflinePINsupported(true);
            terminalTransactionQualifiers.setIssuerUpdateProcessingSupported(true);
            terminalTransactionQualifiers.setConsumerDeviceCVMsupported(true);
            bArrFromString = terminalTransactionQualifiers.getBytes();
        } else if (tagAndLength.getTag() == EmvTags.TERMINAL_COUNTRY_CODE) {
            bArrFromString = BytesUtils.fromString(g.e(tagAndLength.getLength() * 2, String.valueOf(this.countryCode.getNumeric()), "0"));
        } else if (tagAndLength.getTag() == EmvTags.TRANSACTION_CURRENCY_CODE) {
            bArrFromString = BytesUtils.fromString(g.e(tagAndLength.getLength() * 2, String.valueOf(CurrencyEnum.find(this.countryCode, CurrencyEnum.EUR).getISOCodeNumeric()), "0"));
        } else if (tagAndLength.getTag() == EmvTags.TRANSACTION_DATE) {
            bArrFromString = BytesUtils.fromString(new SimpleDateFormat("yyMMdd").format(new Date()));
        } else if (tagAndLength.getTag() == EmvTags.TRANSACTION_TYPE || tagAndLength.getTag() == EmvTags.TERMINAL_TRANSACTION_TYPE) {
            bArrFromString = new byte[]{(byte) TransactionTypeEnum.PURCHASE.getKey()};
        } else if (tagAndLength.getTag() == EmvTags.AMOUNT_AUTHORISED_NUMERIC) {
            bArrFromString = BytesUtils.fromString("01");
        } else if (tagAndLength.getTag() == EmvTags.TERMINAL_TYPE) {
            bArrFromString = new byte[]{ISO7816.INS_MSE};
        } else if (tagAndLength.getTag() == EmvTags.TERMINAL_CAPABILITIES) {
            bArrFromString = new byte[]{ISO7816.INS_CREATE_FILE, ISOFileInfo.A0, 0};
        } else if (tagAndLength.getTag() == EmvTags.ADDITIONAL_TERMINAL_CAPABILITIES) {
            bArrFromString = new byte[]{ISOFileInfo.CHANNEL_SECURITY, 0, ISO7816.INS_READ_BINARY, 80, 5};
        } else if (tagAndLength.getTag() == EmvTags.DS_REQUESTED_OPERATOR_ID) {
            bArrFromString = BytesUtils.fromString("7A45123EE59C7F40");
        } else {
            if (tagAndLength.getTag() == EmvTags.UNPREDICTABLE_NUMBER) {
                random.nextBytes(bArr);
            } else if (tagAndLength.getTag() == EmvTags.MERCHANT_TYPE_INDICATOR) {
                bArrFromString = new byte[]{1};
            } else if (tagAndLength.getTag() == EmvTags.TERMINAL_TRANSACTION_INFORMATION) {
                bArrFromString = new byte[]{ISO7816.INS_GET_RESPONSE, -128, 0};
            }
            bArrFromString = null;
        }
        if (bArrFromString != null) {
            System.arraycopy(bArrFromString, 0, bArr, Math.max(length - bArrFromString.length, 0), Math.min(bArrFromString.length, length));
        }
        return bArr;
    }

    public void setCountryCode(CountryCodeEnum countryCodeEnum) {
        if (countryCodeEnum != null) {
            this.countryCode = countryCodeEnum;
        }
    }
}

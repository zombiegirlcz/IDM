package com.youTransactor.uCube.payment;

import ch.qos.logback.core.CoreConstants;
import com.youTransactor.uCube.rpc.CardReaderType;
import com.youTransactor.uCube.rpc.Currency;
import com.youTransactor.uCube.rpc.EMVApplicationDescriptor;
import com.youTransactor.uCube.rpc.TransactionType;
import java.text.MessageFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes17.dex */
public class PaymentContext {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f107601a;
    public byte activatedReader;
    public int applicationVersion;
    public byte[] authorizationGetPlainTagsResponse;
    public int[] authorizationPlainTags;
    public Map<Integer, byte[]> authorizationPlainTagsValues;
    public byte[] authorizationResponse;
    public int[] authorizationSecuredTags;
    public byte[] authorizationSecuredTagsValues;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f107602b;
    public String cardWaitMessage;
    public Currency currency;
    public byte[] finalizationGetPlainTagsResponse;
    public int[] finalizationPlainTags;
    public Map<Integer, byte[]> finalizationPlainTagsValues;
    public int[] finalizationSecuredTags;
    public byte[] finalizationSecuredTagsValues;
    public boolean forceOnlinePIN;
    public byte[] inputProprietaryTLVStream;
    public byte[] nfcOutcome;
    public byte[] onlinePinBlock;
    public PaymentStatus paymentStatus;
    public byte[] pinKsn;
    public List<String> preferredLanguageList;
    public List<CardReaderType> readerList;
    public EMVApplicationDescriptor selectedApplication;
    public boolean signatureRequired;
    public byte[] sredKsn;
    public byte[] tagCC;
    public byte[] tagF4;
    public byte[] tagF5;
    public Date transactionDate;
    public byte[] transactionFinalisationData;
    public byte[] transactionInitData;
    public byte[] transactionProcessData;
    public TransactionType transactionType;
    public byte[] uCubeInfos;
    public int cardWaitTimeout = 30;
    public long amount = -1;
    public byte onlinePinBlockFormat = 0;
    public boolean forceDebug = false;
    public boolean getSystemFailureInfoL2 = false;
    public boolean retrieveF5Tag = false;
    public boolean skipStartingSteps = false;
    public String pinRequestLabel = "PIN ?";
    public String waitLabel = "...";
    public int pinRequestLabelFont = 0;
    public int waitLabelFont = 0;
    public byte pinRequestLabelXPosition = 0;
    public byte pinRequestLabelYPosition = 0;
    public byte waitLabelXPosition = 0;
    public byte waitLabelYPosition = 0;
    public boolean tip = false;
    public boolean skipCardRemoval = false;
    public byte[] tvr = {0, 0, 0, 0, 0};
    public boolean containsOnlinePinChallengeResponse = false;

    public byte getActivatedReader() {
        return this.activatedReader;
    }

    public long getAmount() {
        return this.amount;
    }

    public int getApplicationVersion() {
        return this.applicationVersion;
    }

    public byte[] getAuthorizationGetPlainTagsResponse() {
        return this.authorizationGetPlainTagsResponse;
    }

    public int[] getAuthorizationPlainTags() {
        return this.authorizationPlainTags;
    }

    public Map<Integer, byte[]> getAuthorizationPlainTagsValues() {
        return this.authorizationPlainTagsValues;
    }

    public byte[] getAuthorizationResponse() {
        return this.authorizationResponse;
    }

    public int[] getAuthorizationSecuredTags() {
        return this.authorizationSecuredTags;
    }

    public byte[] getAuthorizationSecuredTagsValues() {
        return this.authorizationSecuredTagsValues;
    }

    public String getCardWaitMessage() {
        return this.cardWaitMessage;
    }

    public int getCardWaitTimeout() {
        return this.cardWaitTimeout;
    }

    public Currency getCurrency() {
        return this.currency;
    }

    public byte[] getFinalizationGetPlainTagsResponse() {
        return this.finalizationGetPlainTagsResponse;
    }

    public int[] getFinalizationPlainTags() {
        return this.finalizationPlainTags;
    }

    public Map<Integer, byte[]> getFinalizationPlainTagsValues() {
        return this.finalizationPlainTagsValues;
    }

    public int[] getFinalizationSecuredTags() {
        return this.finalizationSecuredTags;
    }

    public byte[] getFinalizationSecuredTagsValues() {
        return this.finalizationSecuredTagsValues;
    }

    public String getFormattedAmount() {
        if (this.currency.getExponent() == 0) {
            return Long.toString(this.amount);
        }
        StringBuilder sb6 = new StringBuilder(10);
        sb6.append("{0,number,#0.0");
        for (int i = 1; i < this.currency.getExponent(); i++) {
            sb6.append('0');
        }
        sb6.append(CoreConstants.CURLY_RIGHT);
        return MessageFormat.format(sb6.toString(), Long.valueOf(this.amount));
    }

    public byte[] getInputProprietaryTLVStream() {
        return this.inputProprietaryTLVStream;
    }

    public byte[] getNFCOutcome() {
        return this.nfcOutcome;
    }

    public byte[] getNfcOutcome() {
        return this.nfcOutcome;
    }

    public byte[] getOnlinePinBlock() {
        return this.onlinePinBlock;
    }

    public byte getOnlinePinBlockFormat() {
        return this.onlinePinBlockFormat;
    }

    public PaymentStatus getPaymentStatus() {
        return this.paymentStatus;
    }

    public byte[] getPinKsn() {
        return this.pinKsn;
    }

    public String getPinRequestLabel() {
        return this.pinRequestLabel;
    }

    public int getPinRequestLabelFont() {
        return this.pinRequestLabelFont;
    }

    public byte getPinRequestLabelXPosition() {
        return this.pinRequestLabelXPosition;
    }

    public byte getPinRequestLabelYPosition() {
        return this.pinRequestLabelYPosition;
    }

    public List<String> getPreferredLanguageList() {
        return this.preferredLanguageList;
    }

    public List<CardReaderType> getReaderList() {
        return this.readerList;
    }

    public EMVApplicationDescriptor getSelectedApplication() {
        return this.selectedApplication;
    }

    public byte[] getSredKsn() {
        return this.sredKsn;
    }

    public byte[] getStartNFCTransactionInputProprietaryTLVStream() {
        return this.inputProprietaryTLVStream;
    }

    public byte[] getTagCC() {
        return this.tagCC;
    }

    public byte[] getTagF4() {
        return this.tagF4;
    }

    public byte[] getTagF5() {
        return this.tagF5;
    }

    public byte[] getTransactionData() {
        return this.f107602b;
    }

    public Date getTransactionDate() {
        return this.transactionDate;
    }

    public byte[] getTransactionFinalisationData() {
        return this.transactionFinalisationData;
    }

    public byte[] getTransactionInitData() {
        return this.transactionInitData;
    }

    public byte[] getTransactionProcessData() {
        return this.transactionProcessData;
    }

    public TransactionType getTransactionType() {
        return this.transactionType;
    }

    public byte[] getTvr() {
        return this.tvr;
    }

    public String getWaitLabel() {
        return this.waitLabel;
    }

    public int getWaitLabelFont() {
        return this.waitLabelFont;
    }

    public byte getWaitLabelXPosition() {
        return this.waitLabelXPosition;
    }

    public byte getWaitLabelYPosition() {
        return this.waitLabelYPosition;
    }

    public byte[] getuCubeInfos() {
        return this.uCubeInfos;
    }

    public boolean isContainsOnlinePinChallengeResponse() {
        return this.containsOnlinePinChallengeResponse;
    }

    public boolean isForceAuthorization() {
        return this.f107601a;
    }

    public boolean isForceDebug() {
        return this.forceDebug;
    }

    public boolean isForceOnlinePIN() {
        return this.forceOnlinePIN;
    }

    public boolean isGetSystemFailureInfoL2() {
        return this.getSystemFailureInfoL2;
    }

    public boolean isRetrieveF5Tag() {
        return this.retrieveF5Tag;
    }

    public boolean isSignatureRequired() {
        return this.signatureRequired;
    }

    public boolean isSkipCardRemoval() {
        return this.skipCardRemoval;
    }

    public boolean isSkipStartingSteps() {
        return this.skipStartingSteps;
    }

    public boolean isTip() {
        return this.tip;
    }

    public void setActivatedReader(byte b4) {
        this.activatedReader = b4;
    }

    public void setAmount(int i) {
        if (i >= 0) {
            this.amount = i;
        }
    }

    public void setApplicationVersion(int i) {
        this.applicationVersion = i;
    }

    public void setAuthorizationPlainTags(int[] iArr) {
        this.authorizationPlainTags = iArr;
    }

    public void setAuthorizationPlainTagsValues(Map<Integer, byte[]> map) {
        this.authorizationPlainTagsValues = map;
    }

    public void setAuthorizationResponse(byte[] bArr) {
        this.authorizationResponse = bArr;
    }

    public void setAuthorizationSecuredTags(int[] iArr) {
        this.authorizationSecuredTags = iArr;
    }

    public void setAuthorizationSecuredTagsValues(byte[] bArr) {
        this.authorizationSecuredTagsValues = bArr;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public void setFinalizationPlainTags(int[] iArr) {
        this.finalizationPlainTags = iArr;
    }

    public void setFinalizationPlainTagsValues(Map<Integer, byte[]> map) {
        this.finalizationPlainTagsValues = map;
    }

    public void setFinalizationSecuredTags(int[] iArr) {
        this.finalizationSecuredTags = iArr;
    }

    public void setFinalizationSecuredTagsValues(byte[] bArr) {
        this.finalizationSecuredTagsValues = bArr;
    }

    public void setForceAuthorization(boolean z) {
        this.f107601a = z;
        if (z) {
            byte[] bArr = this.tvr;
            bArr[3] = (byte) (bArr[3] | 8);
        } else {
            byte[] bArr2 = this.tvr;
            bArr2[3] = (byte) (bArr2[3] & 247);
        }
    }

    public void setForceOnlinePIN(boolean z) {
        this.forceOnlinePIN = z;
    }

    public void setGetSystemFailureInfoL2(boolean z) {
        this.getSystemFailureInfoL2 = z;
    }

    public void setNFCOutcome(byte[] bArr) {
        this.nfcOutcome = bArr;
    }

    public void setOnlinePinBlockFormat(byte b4) {
        this.onlinePinBlockFormat = b4;
    }

    public void setPaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public void setPinKsn(byte[] bArr) {
        this.pinKsn = bArr;
    }

    public void setPinRequestLabel(String str) {
        this.pinRequestLabel = str;
    }

    public void setPinRequestLabelFont(int i) {
        this.pinRequestLabelFont = i;
    }

    public void setPinRequestLabelXPosition(byte b4) {
        this.pinRequestLabelXPosition = b4;
    }

    public void setPinRequestLabelYPosition(byte b4) {
        this.pinRequestLabelYPosition = b4;
    }

    public void setPreferredLanguageList(List<String> list) {
        this.preferredLanguageList = list;
    }

    public void setSelectedApplication(EMVApplicationDescriptor eMVApplicationDescriptor) {
        this.selectedApplication = eMVApplicationDescriptor;
    }

    public void setSignatureRequired(boolean z) {
        this.signatureRequired = z;
    }

    public void setSredKsn(byte[] bArr) {
        this.sredKsn = bArr;
    }

    public void setStartNFCTransactionInputProprietaryTLVStream(byte[] bArr) {
        this.inputProprietaryTLVStream = bArr;
    }

    public void setTagCC(byte[] bArr) {
        this.tagCC = bArr;
    }

    public void setTagF4(byte[] bArr) {
        this.tagF4 = bArr;
    }

    public void setTagF5(byte[] bArr) {
        this.tagF5 = bArr;
    }

    public void setTip(boolean z) {
        this.tip = z;
    }

    public void setTransactionData(byte[] bArr) {
        this.f107602b = bArr;
    }

    public void setTransactionDate(Date date) {
        this.transactionDate = date;
    }

    public void setTransactionFinalisationData(byte[] bArr) {
        this.transactionFinalisationData = bArr;
    }

    public void setTransactionInitData(byte[] bArr) {
        this.transactionInitData = bArr;
    }

    public void setTransactionProcessData(byte[] bArr) {
        this.transactionProcessData = bArr;
    }

    public void setTransactionType(TransactionType transactionType) {
        this.transactionType = transactionType;
    }

    public void setTvr(byte[] bArr) {
        if (bArr != null && bArr.length == 5) {
            System.arraycopy(bArr, 0, this.tvr, 0, 5);
        }
        setForceAuthorization(this.f107601a);
    }

    public void setWaitLabel(String str) {
        this.waitLabel = str;
    }

    public void setWaitLabelFont(int i) {
        this.waitLabelFont = i;
    }

    public void setWaitLabelXPosition(byte b4) {
        this.waitLabelXPosition = b4;
    }

    public void setWaitLabelYPosition(byte b4) {
        this.waitLabelYPosition = b4;
    }

    public void setuCubeInfos(byte[] bArr) {
        this.uCubeInfos = bArr;
    }
}

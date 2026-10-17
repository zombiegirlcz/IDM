package com.revolut.feature.statements.api.models;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.jetbrains.annotations.NotNull;
import p.a;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\bO\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B÷\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\t\u00108\u001a\u00020\u0003HÆ\u0003J\t\u00109\u001a\u00020\u0003HÆ\u0003J\t\u0010:\u001a\u00020\u0003HÆ\u0003J\t\u0010;\u001a\u00020\u0003HÆ\u0003J\t\u0010<\u001a\u00020\u0003HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u0003HÆ\u0003J«\u0002\u0010Q\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010R\u001a\u00020S2\b\u0010T\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010U\u001a\u00020VHÖ\u0001J\t\u0010W\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001fR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001fR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001fR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001fR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001fR\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001fR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001fR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001fR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001fR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001fR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001fR\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001fR\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\u001fR\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\u001fR\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b2\u0010\u001fR\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b3\u0010\u001fR\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b4\u0010\u001fR\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b5\u0010\u001fR\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b6\u0010\u001fR\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b7\u0010\u001f¨\u0006X"}, d2 = {"Lcom/revolut/feature/statements/api/models/TopUpConfirmation;", "", "state", "", "amount", "acquirer", "transactionTimestamp", "valueDate", "cvdResult", "failReason", "maskedPan", "user", "usage", "authorizationCode", "entryMode", "eci", "cardholderAuthenticationValue", "cardholderAuthenticationStatus", "authorisationId", "transactionIdentifier", "schemeId", "acquirerTransactionId", "retrievalReferenceNumber", "cavv", "xid", "copyright", "legalInfo", "surchargeFee", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getState", "()Ljava/lang/String;", "getAmount", "getAcquirer", "getTransactionTimestamp", "getValueDate", "getCvdResult", "getFailReason", "getMaskedPan", "getUser", "getUsage", "getAuthorizationCode", "getEntryMode", "getEci", "getCardholderAuthenticationValue", "getCardholderAuthenticationStatus", "getAuthorisationId", "getTransactionIdentifier", "getSchemeId", "getAcquirerTransactionId", "getRetrievalReferenceNumber", "getCavv", "getXid", "getCopyright", "getLegalInfo", "getSurchargeFee", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "copy", "equals", "", "other", "hashCode", "", "toString", "retail_feature_statements_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TopUpConfirmation {

    @NotNull
    private final String acquirer;
    private final String acquirerTransactionId;

    @NotNull
    private final String amount;
    private final String authorisationId;
    private final String authorizationCode;
    private final String cardholderAuthenticationStatus;
    private final String cardholderAuthenticationValue;
    private final String cavv;
    private final String copyright;
    private final String cvdResult;
    private final String eci;
    private final String entryMode;
    private final String failReason;
    private final String legalInfo;
    private final String maskedPan;
    private final String retrievalReferenceNumber;
    private final String schemeId;

    @NotNull
    private final String state;
    private final String surchargeFee;
    private final String transactionIdentifier;

    @NotNull
    private final String transactionTimestamp;
    private final String usage;
    private final String user;

    @NotNull
    private final String valueDate;
    private final String xid;

    public TopUpConfirmation(@NotNull String state, @NotNull String amount, @NotNull String acquirer, @NotNull String transactionTimestamp, @NotNull String valueDate, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(acquirer, "acquirer");
        Intrinsics.checkNotNullParameter(transactionTimestamp, "transactionTimestamp");
        Intrinsics.checkNotNullParameter(valueDate, "valueDate");
        this.state = state;
        this.amount = amount;
        this.acquirer = acquirer;
        this.transactionTimestamp = transactionTimestamp;
        this.valueDate = valueDate;
        this.cvdResult = str;
        this.failReason = str2;
        this.maskedPan = str3;
        this.user = str4;
        this.usage = str5;
        this.authorizationCode = str6;
        this.entryMode = str7;
        this.eci = str8;
        this.cardholderAuthenticationValue = str9;
        this.cardholderAuthenticationStatus = str10;
        this.authorisationId = str11;
        this.transactionIdentifier = str12;
        this.schemeId = str13;
        this.acquirerTransactionId = str14;
        this.retrievalReferenceNumber = str15;
        this.cavv = str16;
        this.xid = str17;
        this.copyright = str18;
        this.legalInfo = str19;
        this.surchargeFee = str20;
    }

    public static /* synthetic */ TopUpConfirmation copy$default(TopUpConfirmation topUpConfirmation, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, int i, Object obj2) {
        String str26;
        String str27;
        String str28 = (i & 1) != 0 ? topUpConfirmation.state : str;
        String str29 = (i & 2) != 0 ? topUpConfirmation.amount : str2;
        String str30 = (i & 4) != 0 ? topUpConfirmation.acquirer : str3;
        String str31 = (i & 8) != 0 ? topUpConfirmation.transactionTimestamp : str4;
        String str32 = (i & 16) != 0 ? topUpConfirmation.valueDate : str5;
        String str33 = (i & 32) != 0 ? topUpConfirmation.cvdResult : str6;
        String str34 = (i & 64) != 0 ? topUpConfirmation.failReason : str7;
        String str35 = (i & 128) != 0 ? topUpConfirmation.maskedPan : str8;
        String str36 = (i & 256) != 0 ? topUpConfirmation.user : str9;
        String str37 = (i & 512) != 0 ? topUpConfirmation.usage : str10;
        String str38 = (i & 1024) != 0 ? topUpConfirmation.authorizationCode : str11;
        String str39 = (i & 2048) != 0 ? topUpConfirmation.entryMode : str12;
        String str40 = (i & 4096) != 0 ? topUpConfirmation.eci : str13;
        String str41 = (i & 8192) != 0 ? topUpConfirmation.cardholderAuthenticationValue : str14;
        String str42 = str28;
        String str43 = (i & 16384) != 0 ? topUpConfirmation.cardholderAuthenticationStatus : str15;
        String str44 = (i & 32768) != 0 ? topUpConfirmation.authorisationId : str16;
        String str45 = (i & 65536) != 0 ? topUpConfirmation.transactionIdentifier : str17;
        String str46 = (i & 131072) != 0 ? topUpConfirmation.schemeId : str18;
        String str47 = (i & 262144) != 0 ? topUpConfirmation.acquirerTransactionId : str19;
        String str48 = (i & 524288) != 0 ? topUpConfirmation.retrievalReferenceNumber : str20;
        String str49 = (i & PKIFailureInfo.badCertTemplate) != 0 ? topUpConfirmation.cavv : str21;
        String str50 = (i & PKIFailureInfo.badSenderNonce) != 0 ? topUpConfirmation.xid : str22;
        String str51 = (i & 4194304) != 0 ? topUpConfirmation.copyright : str23;
        String str52 = (i & 8388608) != 0 ? topUpConfirmation.legalInfo : str24;
        if ((i & 16777216) != 0) {
            str27 = str52;
            str26 = topUpConfirmation.surchargeFee;
        } else {
            str26 = str25;
            str27 = str52;
        }
        return topUpConfirmation.copy(str42, str29, str30, str31, str32, str33, str34, str35, str36, str37, str38, str39, str40, str41, str43, str44, str45, str46, str47, str48, str49, str50, str51, str27, str26);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getUsage() {
        return this.usage;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getAuthorizationCode() {
        return this.authorizationCode;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getEntryMode() {
        return this.entryMode;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getEci() {
        return this.eci;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getCardholderAuthenticationValue() {
        return this.cardholderAuthenticationValue;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getCardholderAuthenticationStatus() {
        return this.cardholderAuthenticationStatus;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getAuthorisationId() {
        return this.authorisationId;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getTransactionIdentifier() {
        return this.transactionIdentifier;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getSchemeId() {
        return this.schemeId;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getAcquirerTransactionId() {
        return this.acquirerTransactionId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAmount() {
        return this.amount;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final String getRetrievalReferenceNumber() {
        return this.retrievalReferenceNumber;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final String getCavv() {
        return this.cavv;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final String getXid() {
        return this.xid;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final String getCopyright() {
        return this.copyright;
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    public final String getLegalInfo() {
        return this.legalInfo;
    }

    /* JADX INFO: renamed from: component25, reason: from getter */
    public final String getSurchargeFee() {
        return this.surchargeFee;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAcquirer() {
        return this.acquirer;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTransactionTimestamp() {
        return this.transactionTimestamp;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getValueDate() {
        return this.valueDate;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getCvdResult() {
        return this.cvdResult;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getFailReason() {
        return this.failReason;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getMaskedPan() {
        return this.maskedPan;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getUser() {
        return this.user;
    }

    @NotNull
    public final TopUpConfirmation copy(@NotNull String state, @NotNull String amount, @NotNull String acquirer, @NotNull String transactionTimestamp, @NotNull String valueDate, String cvdResult, String failReason, String maskedPan, String user, String usage, String authorizationCode, String entryMode, String eci2, String cardholderAuthenticationValue, String cardholderAuthenticationStatus, String authorisationId, String transactionIdentifier, String schemeId, String acquirerTransactionId, String retrievalReferenceNumber, String cavv, String xid2, String copyright, String legalInfo, String surchargeFee) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(acquirer, "acquirer");
        Intrinsics.checkNotNullParameter(transactionTimestamp, "transactionTimestamp");
        Intrinsics.checkNotNullParameter(valueDate, "valueDate");
        return new TopUpConfirmation(state, amount, acquirer, transactionTimestamp, valueDate, cvdResult, failReason, maskedPan, user, usage, authorizationCode, entryMode, eci2, cardholderAuthenticationValue, cardholderAuthenticationStatus, authorisationId, transactionIdentifier, schemeId, acquirerTransactionId, retrievalReferenceNumber, cavv, xid2, copyright, legalInfo, surchargeFee);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TopUpConfirmation)) {
            return false;
        }
        TopUpConfirmation topUpConfirmation = (TopUpConfirmation) other;
        return Intrinsics.f(this.state, topUpConfirmation.state) && Intrinsics.f(this.amount, topUpConfirmation.amount) && Intrinsics.f(this.acquirer, topUpConfirmation.acquirer) && Intrinsics.f(this.transactionTimestamp, topUpConfirmation.transactionTimestamp) && Intrinsics.f(this.valueDate, topUpConfirmation.valueDate) && Intrinsics.f(this.cvdResult, topUpConfirmation.cvdResult) && Intrinsics.f(this.failReason, topUpConfirmation.failReason) && Intrinsics.f(this.maskedPan, topUpConfirmation.maskedPan) && Intrinsics.f(this.user, topUpConfirmation.user) && Intrinsics.f(this.usage, topUpConfirmation.usage) && Intrinsics.f(this.authorizationCode, topUpConfirmation.authorizationCode) && Intrinsics.f(this.entryMode, topUpConfirmation.entryMode) && Intrinsics.f(this.eci, topUpConfirmation.eci) && Intrinsics.f(this.cardholderAuthenticationValue, topUpConfirmation.cardholderAuthenticationValue) && Intrinsics.f(this.cardholderAuthenticationStatus, topUpConfirmation.cardholderAuthenticationStatus) && Intrinsics.f(this.authorisationId, topUpConfirmation.authorisationId) && Intrinsics.f(this.transactionIdentifier, topUpConfirmation.transactionIdentifier) && Intrinsics.f(this.schemeId, topUpConfirmation.schemeId) && Intrinsics.f(this.acquirerTransactionId, topUpConfirmation.acquirerTransactionId) && Intrinsics.f(this.retrievalReferenceNumber, topUpConfirmation.retrievalReferenceNumber) && Intrinsics.f(this.cavv, topUpConfirmation.cavv) && Intrinsics.f(this.xid, topUpConfirmation.xid) && Intrinsics.f(this.copyright, topUpConfirmation.copyright) && Intrinsics.f(this.legalInfo, topUpConfirmation.legalInfo) && Intrinsics.f(this.surchargeFee, topUpConfirmation.surchargeFee);
    }

    @NotNull
    public final String getAcquirer() {
        return this.acquirer;
    }

    public final String getAcquirerTransactionId() {
        return this.acquirerTransactionId;
    }

    @NotNull
    public final String getAmount() {
        return this.amount;
    }

    public final String getAuthorisationId() {
        return this.authorisationId;
    }

    public final String getAuthorizationCode() {
        return this.authorizationCode;
    }

    public final String getCardholderAuthenticationStatus() {
        return this.cardholderAuthenticationStatus;
    }

    public final String getCardholderAuthenticationValue() {
        return this.cardholderAuthenticationValue;
    }

    public final String getCavv() {
        return this.cavv;
    }

    public final String getCopyright() {
        return this.copyright;
    }

    public final String getCvdResult() {
        return this.cvdResult;
    }

    public final String getEci() {
        return this.eci;
    }

    public final String getEntryMode() {
        return this.entryMode;
    }

    public final String getFailReason() {
        return this.failReason;
    }

    public final String getLegalInfo() {
        return this.legalInfo;
    }

    public final String getMaskedPan() {
        return this.maskedPan;
    }

    public final String getRetrievalReferenceNumber() {
        return this.retrievalReferenceNumber;
    }

    public final String getSchemeId() {
        return this.schemeId;
    }

    @NotNull
    public final String getState() {
        return this.state;
    }

    public final String getSurchargeFee() {
        return this.surchargeFee;
    }

    public final String getTransactionIdentifier() {
        return this.transactionIdentifier;
    }

    @NotNull
    public final String getTransactionTimestamp() {
        return this.transactionTimestamp;
    }

    public final String getUsage() {
        return this.usage;
    }

    public final String getUser() {
        return this.user;
    }

    @NotNull
    public final String getValueDate() {
        return this.valueDate;
    }

    public final String getXid() {
        return this.xid;
    }

    public int hashCode() {
        int iC = a.c(a.c(a.c(a.c(this.state.hashCode() * 31, 31, this.amount), 31, this.acquirer), 31, this.transactionTimestamp), 31, this.valueDate);
        String str = this.cvdResult;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.failReason;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.maskedPan;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.user;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.usage;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.authorizationCode;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.entryMode;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.eci;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.cardholderAuthenticationValue;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.cardholderAuthenticationStatus;
        int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.authorisationId;
        int iHashCode11 = (iHashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.transactionIdentifier;
        int iHashCode12 = (iHashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.schemeId;
        int iHashCode13 = (iHashCode12 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.acquirerTransactionId;
        int iHashCode14 = (iHashCode13 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.retrievalReferenceNumber;
        int iHashCode15 = (iHashCode14 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.cavv;
        int iHashCode16 = (iHashCode15 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.xid;
        int iHashCode17 = (iHashCode16 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.copyright;
        int iHashCode18 = (iHashCode17 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.legalInfo;
        int iHashCode19 = (iHashCode18 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.surchargeFee;
        return iHashCode19 + (str20 != null ? str20.hashCode() : 0);
    }
}

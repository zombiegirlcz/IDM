package com.revolut.feature.statements.api.models;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p.a;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\bM\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B¿\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u000e\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003J\u000e\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003J\u000e\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0003J\u000e\u0010 \u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0003J\u000e\u0010\"\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0003J\u000e\u0010$\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0003J\u000e\u0010&\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0003J\u000e\u00100\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0003J\u000e\u00102\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0003J\u000e\u0010*\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0003J\u000e\u0010(\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0003J\u000e\u0010,\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u0003J\u000e\u0010.\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u0003J\u000e\u00104\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0003J\u000e\u00106\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0003J\u000e\u00108\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0003J\t\u0010=\u001a\u00020\u0003HÆ\u0003J\t\u0010>\u001a\u00020\u0003HÆ\u0003J\t\u0010?\u001a\u00020\u0003HÆ\u0003J\t\u0010@\u001a\u00020\u0003HÆ\u0003J\t\u0010A\u001a\u00020\u0003HÆ\u0003J\t\u0010B\u001a\u00020\u0003HÆ\u0003J\t\u0010C\u001a\u00020\u0003HÆ\u0003J\t\u0010D\u001a\u00020\u0003HÆ\u0003J\t\u0010E\u001a\u00020\u0003HÆ\u0003J\t\u0010F\u001a\u00020\u0003HÆ\u0003J\t\u0010G\u001a\u00020\u0003HÆ\u0003J\t\u0010H\u001a\u00020\u0003HÆ\u0003J\t\u0010I\u001a\u00020\u0003HÆ\u0003J\t\u0010J\u001a\u00020\u0003HÆ\u0003J\t\u0010K\u001a\u00020\u0003HÆ\u0003J\t\u0010L\u001a\u00020\u0003HÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u0003HÆ\u0003JÁ\u0001\u0010O\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010P\u001a\u00020Q2\b\u0010R\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010S\u001a\u00020THÖ\u0001J\t\u0010U\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0018\"\u0004\b\u001c\u0010\u001aR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0018\"\u0004\b\u001e\u0010\u001aR\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0018\"\u0004\b \u0010\u001aR\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0018\"\u0004\b\"\u0010\u001aR\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0018\"\u0004\b$\u0010\u001aR\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0018\"\u0004\b&\u0010\u001aR\u001a\u0010\n\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u0018\"\u0004\b(\u0010\u001aR\u001a\u0010\u000b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0018\"\u0004\b*\u0010\u001aR\u001a\u0010\f\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0018\"\u0004\b,\u0010\u001aR\u001a\u0010\r\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u0018\"\u0004\b.\u0010\u001aR\u001a\u0010\u000e\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u0018\"\u0004\b0\u0010\u001aR\u001a\u0010\u000f\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u0018\"\u0004\b2\u0010\u001aR\u001a\u0010\u0010\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\u0018\"\u0004\b4\u0010\u001aR\u001a\u0010\u0011\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\u0018\"\u0004\b6\u0010\u001aR\u001a\u0010\u0012\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u0018\"\u0004\b8\u0010\u001aR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010\u0018\"\u0004\b:\u0010\u001aR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010\u0018\"\u0004\b<\u0010\u001a¨\u0006V"}, d2 = {"Lcom/revolut/feature/statements/api/models/TransactionRowModel;", "", "transactionDate", "", "description", "rate", "pocketCcy", "amount", "partyCcy", "partyAmount", "paidInCcy", "paidInAmount", "paidInPartyAmount", "paidInPartyCcy", "balance", "balanceLong", "category", "creditAmount", "note", "referenceNumber", "cryptoMarkupDescription", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTransactionDate", "()Ljava/lang/String;", "setTransactionDate", "(Ljava/lang/String;)V", "getDescription", "setDescription", "getRate", "setRate", "getPocketCcy", "setPocketCcy", "getAmount", "setAmount", "getPartyCcy", "setPartyCcy", "getPartyAmount", "setPartyAmount", "getPaidInCcy", "setPaidInCcy", "getPaidInAmount", "setPaidInAmount", "getPaidInPartyAmount", "setPaidInPartyAmount", "getPaidInPartyCcy", "setPaidInPartyCcy", "getBalance", "setBalance", "getBalanceLong", "setBalanceLong", "getCategory", "setCategory", "getCreditAmount", "setCreditAmount", "getNote", "setNote", "getReferenceNumber", "setReferenceNumber", "getCryptoMarkupDescription", "setCryptoMarkupDescription", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "copy", "equals", "", "other", "hashCode", "", "toString", "retail_feature_statements_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TransactionRowModel {

    @NotNull
    private String amount;

    @NotNull
    private String balance;

    @NotNull
    private String balanceLong;

    @NotNull
    private String category;

    @NotNull
    private String creditAmount;
    private String cryptoMarkupDescription;

    @NotNull
    private String description;

    @NotNull
    private String note;

    @NotNull
    private String paidInAmount;

    @NotNull
    private String paidInCcy;

    @NotNull
    private String paidInPartyAmount;

    @NotNull
    private String paidInPartyCcy;

    @NotNull
    private String partyAmount;

    @NotNull
    private String partyCcy;

    @NotNull
    private String pocketCcy;

    @NotNull
    private String rate;
    private String referenceNumber;

    @NotNull
    private String transactionDate;

    public TransactionRowModel() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 262143, null);
    }

    public static /* synthetic */ TransactionRowModel copy$default(TransactionRowModel transactionRowModel, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, int i, Object obj2) {
        String str19;
        String str20;
        String str21 = (i & 1) != 0 ? transactionRowModel.transactionDate : str;
        String str22 = (i & 2) != 0 ? transactionRowModel.description : str2;
        String str23 = (i & 4) != 0 ? transactionRowModel.rate : str3;
        String str24 = (i & 8) != 0 ? transactionRowModel.pocketCcy : str4;
        String str25 = (i & 16) != 0 ? transactionRowModel.amount : str5;
        String str26 = (i & 32) != 0 ? transactionRowModel.partyCcy : str6;
        String str27 = (i & 64) != 0 ? transactionRowModel.partyAmount : str7;
        String str28 = (i & 128) != 0 ? transactionRowModel.paidInCcy : str8;
        String str29 = (i & 256) != 0 ? transactionRowModel.paidInAmount : str9;
        String str30 = (i & 512) != 0 ? transactionRowModel.paidInPartyAmount : str10;
        String str31 = (i & 1024) != 0 ? transactionRowModel.paidInPartyCcy : str11;
        String str32 = (i & 2048) != 0 ? transactionRowModel.balance : str12;
        String str33 = (i & 4096) != 0 ? transactionRowModel.balanceLong : str13;
        String str34 = (i & 8192) != 0 ? transactionRowModel.category : str14;
        String str35 = str21;
        String str36 = (i & 16384) != 0 ? transactionRowModel.creditAmount : str15;
        String str37 = (i & 32768) != 0 ? transactionRowModel.note : str16;
        String str38 = (i & 65536) != 0 ? transactionRowModel.referenceNumber : str17;
        if ((i & 131072) != 0) {
            str20 = str38;
            str19 = transactionRowModel.cryptoMarkupDescription;
        } else {
            str19 = str18;
            str20 = str38;
        }
        return transactionRowModel.copy(str35, str22, str23, str24, str25, str26, str27, str28, str29, str30, str31, str32, str33, str34, str36, str37, str20, str19);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTransactionDate() {
        return this.transactionDate;
    }

    @NotNull
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getPaidInPartyAmount() {
        return this.paidInPartyAmount;
    }

    @NotNull
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getPaidInPartyCcy() {
        return this.paidInPartyCcy;
    }

    @NotNull
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getBalance() {
        return this.balance;
    }

    @NotNull
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getBalanceLong() {
        return this.balanceLong;
    }

    @NotNull
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getCategory() {
        return this.category;
    }

    @NotNull
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getCreditAmount() {
        return this.creditAmount;
    }

    @NotNull
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getNote() {
        return this.note;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getReferenceNumber() {
        return this.referenceNumber;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getCryptoMarkupDescription() {
        return this.cryptoMarkupDescription;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getRate() {
        return this.rate;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPocketCcy() {
        return this.pocketCcy;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getAmount() {
        return this.amount;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getPartyCcy() {
        return this.partyCcy;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getPartyAmount() {
        return this.partyAmount;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getPaidInCcy() {
        return this.paidInCcy;
    }

    @NotNull
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getPaidInAmount() {
        return this.paidInAmount;
    }

    @NotNull
    public final TransactionRowModel copy(@NotNull String transactionDate, @NotNull String description, @NotNull String rate, @NotNull String pocketCcy, @NotNull String amount, @NotNull String partyCcy, @NotNull String partyAmount, @NotNull String paidInCcy, @NotNull String paidInAmount, @NotNull String paidInPartyAmount, @NotNull String paidInPartyCcy, @NotNull String balance, @NotNull String balanceLong, @NotNull String category, @NotNull String creditAmount, @NotNull String note, String referenceNumber, String cryptoMarkupDescription) {
        Intrinsics.checkNotNullParameter(transactionDate, "transactionDate");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(rate, "rate");
        Intrinsics.checkNotNullParameter(pocketCcy, "pocketCcy");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(partyCcy, "partyCcy");
        Intrinsics.checkNotNullParameter(partyAmount, "partyAmount");
        Intrinsics.checkNotNullParameter(paidInCcy, "paidInCcy");
        Intrinsics.checkNotNullParameter(paidInAmount, "paidInAmount");
        Intrinsics.checkNotNullParameter(paidInPartyAmount, "paidInPartyAmount");
        Intrinsics.checkNotNullParameter(paidInPartyCcy, "paidInPartyCcy");
        Intrinsics.checkNotNullParameter(balance, "balance");
        Intrinsics.checkNotNullParameter(balanceLong, "balanceLong");
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(creditAmount, "creditAmount");
        Intrinsics.checkNotNullParameter(note, "note");
        return new TransactionRowModel(transactionDate, description, rate, pocketCcy, amount, partyCcy, partyAmount, paidInCcy, paidInAmount, paidInPartyAmount, paidInPartyCcy, balance, balanceLong, category, creditAmount, note, referenceNumber, cryptoMarkupDescription);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransactionRowModel)) {
            return false;
        }
        TransactionRowModel transactionRowModel = (TransactionRowModel) other;
        return Intrinsics.f(this.transactionDate, transactionRowModel.transactionDate) && Intrinsics.f(this.description, transactionRowModel.description) && Intrinsics.f(this.rate, transactionRowModel.rate) && Intrinsics.f(this.pocketCcy, transactionRowModel.pocketCcy) && Intrinsics.f(this.amount, transactionRowModel.amount) && Intrinsics.f(this.partyCcy, transactionRowModel.partyCcy) && Intrinsics.f(this.partyAmount, transactionRowModel.partyAmount) && Intrinsics.f(this.paidInCcy, transactionRowModel.paidInCcy) && Intrinsics.f(this.paidInAmount, transactionRowModel.paidInAmount) && Intrinsics.f(this.paidInPartyAmount, transactionRowModel.paidInPartyAmount) && Intrinsics.f(this.paidInPartyCcy, transactionRowModel.paidInPartyCcy) && Intrinsics.f(this.balance, transactionRowModel.balance) && Intrinsics.f(this.balanceLong, transactionRowModel.balanceLong) && Intrinsics.f(this.category, transactionRowModel.category) && Intrinsics.f(this.creditAmount, transactionRowModel.creditAmount) && Intrinsics.f(this.note, transactionRowModel.note) && Intrinsics.f(this.referenceNumber, transactionRowModel.referenceNumber) && Intrinsics.f(this.cryptoMarkupDescription, transactionRowModel.cryptoMarkupDescription);
    }

    @NotNull
    public final String getAmount() {
        return this.amount;
    }

    @NotNull
    public final String getBalance() {
        return this.balance;
    }

    @NotNull
    public final String getBalanceLong() {
        return this.balanceLong;
    }

    @NotNull
    public final String getCategory() {
        return this.category;
    }

    @NotNull
    public final String getCreditAmount() {
        return this.creditAmount;
    }

    public final String getCryptoMarkupDescription() {
        return this.cryptoMarkupDescription;
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    public final String getNote() {
        return this.note;
    }

    @NotNull
    public final String getPaidInAmount() {
        return this.paidInAmount;
    }

    @NotNull
    public final String getPaidInCcy() {
        return this.paidInCcy;
    }

    @NotNull
    public final String getPaidInPartyAmount() {
        return this.paidInPartyAmount;
    }

    @NotNull
    public final String getPaidInPartyCcy() {
        return this.paidInPartyCcy;
    }

    @NotNull
    public final String getPartyAmount() {
        return this.partyAmount;
    }

    @NotNull
    public final String getPartyCcy() {
        return this.partyCcy;
    }

    @NotNull
    public final String getPocketCcy() {
        return this.pocketCcy;
    }

    @NotNull
    public final String getRate() {
        return this.rate;
    }

    public final String getReferenceNumber() {
        return this.referenceNumber;
    }

    @NotNull
    public final String getTransactionDate() {
        return this.transactionDate;
    }

    public int hashCode() {
        int iC = a.c(a.c(a.c(a.c(a.c(a.c(a.c(a.c(a.c(a.c(a.c(a.c(a.c(a.c(a.c(this.transactionDate.hashCode() * 31, 31, this.description), 31, this.rate), 31, this.pocketCcy), 31, this.amount), 31, this.partyCcy), 31, this.partyAmount), 31, this.paidInCcy), 31, this.paidInAmount), 31, this.paidInPartyAmount), 31, this.paidInPartyCcy), 31, this.balance), 31, this.balanceLong), 31, this.category), 31, this.creditAmount), 31, this.note);
        String str = this.referenceNumber;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.cryptoMarkupDescription;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX INFO: renamed from: setAmount, reason: collision with other method in class */
    public final void m3762setAmount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.amount = str;
    }

    /* JADX INFO: renamed from: setBalance, reason: collision with other method in class */
    public final void m3763setBalance(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.balance = str;
    }

    /* JADX INFO: renamed from: setBalanceLong, reason: collision with other method in class */
    public final void m3764setBalanceLong(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.balanceLong = str;
    }

    /* JADX INFO: renamed from: setCategory, reason: collision with other method in class */
    public final void m3765setCategory(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.category = str;
    }

    /* JADX INFO: renamed from: setCreditAmount, reason: collision with other method in class */
    public final void m3766setCreditAmount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.creditAmount = str;
    }

    public final void setCryptoMarkupDescription(String str) {
        this.cryptoMarkupDescription = str;
    }

    /* JADX INFO: renamed from: setDescription, reason: collision with other method in class */
    public final void m3767setDescription(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.description = str;
    }

    /* JADX INFO: renamed from: setNote, reason: collision with other method in class */
    public final void m3768setNote(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.note = str;
    }

    /* JADX INFO: renamed from: setPaidInAmount, reason: collision with other method in class */
    public final void m3769setPaidInAmount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.paidInAmount = str;
    }

    /* JADX INFO: renamed from: setPaidInCcy, reason: collision with other method in class */
    public final void m3770setPaidInCcy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.paidInCcy = str;
    }

    /* JADX INFO: renamed from: setPaidInPartyAmount, reason: collision with other method in class */
    public final void m3771setPaidInPartyAmount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.paidInPartyAmount = str;
    }

    /* JADX INFO: renamed from: setPaidInPartyCcy, reason: collision with other method in class */
    public final void m3772setPaidInPartyCcy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.paidInPartyCcy = str;
    }

    /* JADX INFO: renamed from: setPartyAmount, reason: collision with other method in class */
    public final void m3773setPartyAmount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.partyAmount = str;
    }

    /* JADX INFO: renamed from: setPartyCcy, reason: collision with other method in class */
    public final void m3774setPartyCcy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.partyCcy = str;
    }

    /* JADX INFO: renamed from: setPocketCcy, reason: collision with other method in class */
    public final void m3775setPocketCcy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.pocketCcy = str;
    }

    /* JADX INFO: renamed from: setRate, reason: collision with other method in class */
    public final void m3776setRate(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.rate = str;
    }

    public final void setReferenceNumber(String str) {
        this.referenceNumber = str;
    }

    /* JADX INFO: renamed from: setTransactionDate, reason: collision with other method in class */
    public final void m3777setTransactionDate(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.transactionDate = str;
    }

    public TransactionRowModel(@NotNull String transactionDate, @NotNull String description, @NotNull String rate, @NotNull String pocketCcy, @NotNull String amount, @NotNull String partyCcy, @NotNull String partyAmount, @NotNull String paidInCcy, @NotNull String paidInAmount, @NotNull String paidInPartyAmount, @NotNull String paidInPartyCcy, @NotNull String balance, @NotNull String balanceLong, @NotNull String category, @NotNull String creditAmount, @NotNull String note, String str, String str2) {
        Intrinsics.checkNotNullParameter(transactionDate, "transactionDate");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(rate, "rate");
        Intrinsics.checkNotNullParameter(pocketCcy, "pocketCcy");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(partyCcy, "partyCcy");
        Intrinsics.checkNotNullParameter(partyAmount, "partyAmount");
        Intrinsics.checkNotNullParameter(paidInCcy, "paidInCcy");
        Intrinsics.checkNotNullParameter(paidInAmount, "paidInAmount");
        Intrinsics.checkNotNullParameter(paidInPartyAmount, "paidInPartyAmount");
        Intrinsics.checkNotNullParameter(paidInPartyCcy, "paidInPartyCcy");
        Intrinsics.checkNotNullParameter(balance, "balance");
        Intrinsics.checkNotNullParameter(balanceLong, "balanceLong");
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(creditAmount, "creditAmount");
        Intrinsics.checkNotNullParameter(note, "note");
        this.transactionDate = transactionDate;
        this.description = description;
        this.rate = rate;
        this.pocketCcy = pocketCcy;
        this.amount = amount;
        this.partyCcy = partyCcy;
        this.partyAmount = partyAmount;
        this.paidInCcy = paidInCcy;
        this.paidInAmount = paidInAmount;
        this.paidInPartyAmount = paidInPartyAmount;
        this.paidInPartyCcy = paidInPartyCcy;
        this.balance = balance;
        this.balanceLong = balanceLong;
        this.category = category;
        this.creditAmount = creditAmount;
        this.note = note;
        this.referenceNumber = str;
        this.cryptoMarkupDescription = str2;
    }

    @NotNull
    public final TransactionRowModel setAmount(@NotNull String amount) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.amount = amount;
        return this;
    }

    @NotNull
    public final TransactionRowModel setBalance(@NotNull String balance) {
        Intrinsics.checkNotNullParameter(balance, "balance");
        this.balance = balance;
        return this;
    }

    @NotNull
    public final TransactionRowModel setBalanceLong(@NotNull String balance) {
        Intrinsics.checkNotNullParameter(balance, "balance");
        this.balanceLong = balance;
        return this;
    }

    @NotNull
    public final TransactionRowModel setCategory(@NotNull String category) {
        Intrinsics.checkNotNullParameter(category, "category");
        this.category = category;
        return this;
    }

    @NotNull
    public final TransactionRowModel setCreditAmount(@NotNull String creditAmount) {
        Intrinsics.checkNotNullParameter(creditAmount, "creditAmount");
        this.creditAmount = creditAmount;
        return this;
    }

    @NotNull
    public final TransactionRowModel setDescription(@NotNull String description) {
        Intrinsics.checkNotNullParameter(description, "description");
        this.description = description;
        return this;
    }

    @NotNull
    public final TransactionRowModel setNote(@NotNull String note) {
        Intrinsics.checkNotNullParameter(note, "note");
        this.note = note;
        return this;
    }

    @NotNull
    public final TransactionRowModel setPaidInAmount(@NotNull String paidInAmount) {
        Intrinsics.checkNotNullParameter(paidInAmount, "paidInAmount");
        this.paidInAmount = paidInAmount;
        return this;
    }

    @NotNull
    public final TransactionRowModel setPaidInCcy(@NotNull String paidInCcy) {
        Intrinsics.checkNotNullParameter(paidInCcy, "paidInCcy");
        this.paidInCcy = paidInCcy;
        return this;
    }

    @NotNull
    public final TransactionRowModel setPaidInPartyAmount(@NotNull String paidInPartyAmount) {
        Intrinsics.checkNotNullParameter(paidInPartyAmount, "paidInPartyAmount");
        this.paidInPartyAmount = paidInPartyAmount;
        return this;
    }

    @NotNull
    public final TransactionRowModel setPaidInPartyCcy(@NotNull String paidInPartyCcy) {
        Intrinsics.checkNotNullParameter(paidInPartyCcy, "paidInPartyCcy");
        this.paidInPartyCcy = paidInPartyCcy;
        return this;
    }

    @NotNull
    public final TransactionRowModel setPartyAmount(@NotNull String partyAmount) {
        Intrinsics.checkNotNullParameter(partyAmount, "partyAmount");
        this.partyAmount = partyAmount;
        return this;
    }

    @NotNull
    public final TransactionRowModel setPartyCcy(@NotNull String partyCcy) {
        Intrinsics.checkNotNullParameter(partyCcy, "partyCcy");
        this.partyCcy = partyCcy;
        return this;
    }

    @NotNull
    public final TransactionRowModel setPocketCcy(@NotNull String pocketCcy) {
        Intrinsics.checkNotNullParameter(pocketCcy, "pocketCcy");
        this.pocketCcy = pocketCcy;
        return this;
    }

    @NotNull
    public final TransactionRowModel setRate(@NotNull String rate) {
        Intrinsics.checkNotNullParameter(rate, "rate");
        this.rate = rate;
        return this;
    }

    @NotNull
    public final TransactionRowModel setTransactionDate(@NotNull String transactionDate) {
        Intrinsics.checkNotNullParameter(transactionDate, "transactionDate");
        this.transactionDate = transactionDate;
        return this;
    }

    public /* synthetic */ TransactionRowModel(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? "" : str9, (i & 512) != 0 ? "" : str10, (i & 1024) != 0 ? "" : str11, (i & 2048) != 0 ? "" : str12, (i & 4096) != 0 ? "" : str13, (i & 8192) != 0 ? "" : str14, (i & 16384) != 0 ? "" : str15, (i & 32768) == 0 ? str16 : "", (i & 65536) != 0 ? null : str17, (i & 131072) != 0 ? null : str18);
    }
}

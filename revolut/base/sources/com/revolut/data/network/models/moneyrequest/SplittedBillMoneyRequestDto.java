package com.revolut.data.network.models.moneyrequest;

import a0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import org.jetbrains.annotations.NotNull;
import p.a;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B[\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u000bHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jo\u0010%\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020*HÖ\u0001J\t\u0010+\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0011R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0011¨\u0006,"}, d2 = {"Lcom/revolut/data/network/models/moneyrequest/SplittedBillMoneyRequestDto;", "", "state", "", "status", "itemId", "amount", "", "moneyRequestId", "transactionId", "payer", "Lcom/revolut/data/network/models/moneyrequest/SplitBillPayerDto;", "errorCode", "errorMessage", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Lcom/revolut/data/network/models/moneyrequest/SplitBillPayerDto;Ljava/lang/String;Ljava/lang/String;)V", "getState", "()Ljava/lang/String;", "getStatus", "getItemId", "getAmount", "()J", "getMoneyRequestId", "getTransactionId", "getPayer", "()Lcom/revolut/data/network/models/moneyrequest/SplitBillPayerDto;", "getErrorCode", "getErrorMessage", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SplittedBillMoneyRequestDto {

    @b("amount")
    private final long amount;

    @b("errorCode")
    private final String errorCode;

    @b("errorMessage")
    private final String errorMessage;

    @b("itemId")
    @NotNull
    private final String itemId;

    @b("moneyRequestId")
    private final String moneyRequestId;

    @b("payer")
    @NotNull
    private final SplitBillPayerDto payer;

    @b("state")
    private final String state;

    @b("status")
    private final String status;

    @b("transactionId")
    private final String transactionId;

    public SplittedBillMoneyRequestDto(String str, String str2, @NotNull String itemId, long j2, String str3, String str4, @NotNull SplitBillPayerDto payer, String str5, String str6) {
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        Intrinsics.checkNotNullParameter(payer, "payer");
        this.state = str;
        this.status = str2;
        this.itemId = itemId;
        this.amount = j2;
        this.moneyRequestId = str3;
        this.transactionId = str4;
        this.payer = payer;
        this.errorCode = str5;
        this.errorMessage = str6;
    }

    public static /* synthetic */ SplittedBillMoneyRequestDto copy$default(SplittedBillMoneyRequestDto splittedBillMoneyRequestDto, String str, String str2, String str3, long j2, String str4, String str5, SplitBillPayerDto splitBillPayerDto, String str6, String str7, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = splittedBillMoneyRequestDto.state;
        }
        if ((i & 2) != 0) {
            str2 = splittedBillMoneyRequestDto.status;
        }
        if ((i & 4) != 0) {
            str3 = splittedBillMoneyRequestDto.itemId;
        }
        if ((i & 8) != 0) {
            j2 = splittedBillMoneyRequestDto.amount;
        }
        if ((i & 16) != 0) {
            str4 = splittedBillMoneyRequestDto.moneyRequestId;
        }
        if ((i & 32) != 0) {
            str5 = splittedBillMoneyRequestDto.transactionId;
        }
        if ((i & 64) != 0) {
            splitBillPayerDto = splittedBillMoneyRequestDto.payer;
        }
        if ((i & 128) != 0) {
            str6 = splittedBillMoneyRequestDto.errorCode;
        }
        if ((i & 256) != 0) {
            str7 = splittedBillMoneyRequestDto.errorMessage;
        }
        String str8 = str7;
        SplitBillPayerDto splitBillPayerDto2 = splitBillPayerDto;
        String str9 = str4;
        long j3 = j2;
        String str10 = str3;
        return splittedBillMoneyRequestDto.copy(str, str2, str10, j3, str9, str5, splitBillPayerDto2, str6, str8);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getItemId() {
        return this.itemId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getAmount() {
        return this.amount;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getMoneyRequestId() {
        return this.moneyRequestId;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getTransactionId() {
        return this.transactionId;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final SplitBillPayerDto getPayer() {
        return this.payer;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getErrorCode() {
        return this.errorCode;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    @NotNull
    public final SplittedBillMoneyRequestDto copy(String state, String status, @NotNull String itemId, long amount, String moneyRequestId, String transactionId, @NotNull SplitBillPayerDto payer, String errorCode, String errorMessage) {
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        Intrinsics.checkNotNullParameter(payer, "payer");
        return new SplittedBillMoneyRequestDto(state, status, itemId, amount, moneyRequestId, transactionId, payer, errorCode, errorMessage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SplittedBillMoneyRequestDto)) {
            return false;
        }
        SplittedBillMoneyRequestDto splittedBillMoneyRequestDto = (SplittedBillMoneyRequestDto) other;
        return Intrinsics.f(this.state, splittedBillMoneyRequestDto.state) && Intrinsics.f(this.status, splittedBillMoneyRequestDto.status) && Intrinsics.f(this.itemId, splittedBillMoneyRequestDto.itemId) && this.amount == splittedBillMoneyRequestDto.amount && Intrinsics.f(this.moneyRequestId, splittedBillMoneyRequestDto.moneyRequestId) && Intrinsics.f(this.transactionId, splittedBillMoneyRequestDto.transactionId) && Intrinsics.f(this.payer, splittedBillMoneyRequestDto.payer) && Intrinsics.f(this.errorCode, splittedBillMoneyRequestDto.errorCode) && Intrinsics.f(this.errorMessage, splittedBillMoneyRequestDto.errorMessage);
    }

    public final long getAmount() {
        return this.amount;
    }

    public final String getErrorCode() {
        return this.errorCode;
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }

    @NotNull
    public final String getItemId() {
        return this.itemId;
    }

    public final String getMoneyRequestId() {
        return this.moneyRequestId;
    }

    @NotNull
    public final SplitBillPayerDto getPayer() {
        return this.payer;
    }

    public final String getState() {
        return this.state;
    }

    public final String getStatus() {
        return this.status;
    }

    public final String getTransactionId() {
        return this.transactionId;
    }

    public int hashCode() {
        String str = this.state;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.status;
        int iC = d.c(a.c((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.itemId), 31, this.amount);
        String str3 = this.moneyRequestId;
        int iHashCode2 = (iC + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.transactionId;
        int iHashCode3 = (this.payer.hashCode() + ((iHashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31)) * 31;
        String str5 = this.errorCode;
        int iHashCode4 = (iHashCode3 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.errorMessage;
        return iHashCode4 + (str6 != null ? str6.hashCode() : 0);
    }
}

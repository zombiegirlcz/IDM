package com.revolut.data.network.models.moneyrequest;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import org.jetbrains.annotations.NotNull;
import p.a;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B?\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\tHÆ\u0003JM\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006!"}, d2 = {"Lcom/revolut/data/network/models/moneyrequest/SplitBillMoneyRequestDto;", "", "payerId", "", "payerPhone", "payerEmail", "payerCode", "itemId", "amount", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V", "getPayerId", "()Ljava/lang/String;", "getPayerPhone", "getPayerEmail", "getPayerCode", "getItemId", "getAmount", "()J", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SplitBillMoneyRequestDto {

    @b("amount")
    private final long amount;

    @b("itemId")
    @NotNull
    private final String itemId;

    @b("payerCode")
    private final String payerCode;

    @b("payerEmail")
    private final String payerEmail;

    @b("payerId")
    private final String payerId;

    @b("payerPhone")
    private final String payerPhone;

    public SplitBillMoneyRequestDto(String str, String str2, String str3, String str4, @NotNull String itemId, long j2) {
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        this.payerId = str;
        this.payerPhone = str2;
        this.payerEmail = str3;
        this.payerCode = str4;
        this.itemId = itemId;
        this.amount = j2;
    }

    public static /* synthetic */ SplitBillMoneyRequestDto copy$default(SplitBillMoneyRequestDto splitBillMoneyRequestDto, String str, String str2, String str3, String str4, String str5, long j2, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = splitBillMoneyRequestDto.payerId;
        }
        if ((i & 2) != 0) {
            str2 = splitBillMoneyRequestDto.payerPhone;
        }
        if ((i & 4) != 0) {
            str3 = splitBillMoneyRequestDto.payerEmail;
        }
        if ((i & 8) != 0) {
            str4 = splitBillMoneyRequestDto.payerCode;
        }
        if ((i & 16) != 0) {
            str5 = splitBillMoneyRequestDto.itemId;
        }
        if ((i & 32) != 0) {
            j2 = splitBillMoneyRequestDto.amount;
        }
        long j3 = j2;
        String str6 = str5;
        String str7 = str3;
        return splitBillMoneyRequestDto.copy(str, str2, str7, str4, str6, j3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPayerId() {
        return this.payerId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPayerPhone() {
        return this.payerPhone;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPayerEmail() {
        return this.payerEmail;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPayerCode() {
        return this.payerCode;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getItemId() {
        return this.itemId;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final long getAmount() {
        return this.amount;
    }

    @NotNull
    public final SplitBillMoneyRequestDto copy(String payerId, String payerPhone, String payerEmail, String payerCode, @NotNull String itemId, long amount) {
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        return new SplitBillMoneyRequestDto(payerId, payerPhone, payerEmail, payerCode, itemId, amount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SplitBillMoneyRequestDto)) {
            return false;
        }
        SplitBillMoneyRequestDto splitBillMoneyRequestDto = (SplitBillMoneyRequestDto) other;
        return Intrinsics.f(this.payerId, splitBillMoneyRequestDto.payerId) && Intrinsics.f(this.payerPhone, splitBillMoneyRequestDto.payerPhone) && Intrinsics.f(this.payerEmail, splitBillMoneyRequestDto.payerEmail) && Intrinsics.f(this.payerCode, splitBillMoneyRequestDto.payerCode) && Intrinsics.f(this.itemId, splitBillMoneyRequestDto.itemId) && this.amount == splitBillMoneyRequestDto.amount;
    }

    public final long getAmount() {
        return this.amount;
    }

    @NotNull
    public final String getItemId() {
        return this.itemId;
    }

    public final String getPayerCode() {
        return this.payerCode;
    }

    public final String getPayerEmail() {
        return this.payerEmail;
    }

    public final String getPayerId() {
        return this.payerId;
    }

    public final String getPayerPhone() {
        return this.payerPhone;
    }

    public int hashCode() {
        String str = this.payerId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.payerPhone;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.payerEmail;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.payerCode;
        return Long.hashCode(this.amount) + a.c((iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31, 31, this.itemId);
    }
}

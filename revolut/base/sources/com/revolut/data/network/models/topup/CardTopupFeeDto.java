package com.revolut.data.network.models.topup;

import jo3.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0080\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0010JL\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0010R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b%\u0010\u0012R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010&\u001a\u0004\b'\u0010\u0014R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\"\u001a\u0004\b(\u0010\u0010¨\u0006)"}, d2 = {"Lcom/revolut/data/network/models/topup/CardTopupFeeDto;", "", "Ljo3/a;", "fee", "", "feeMessage", "Lcom/revolut/data/network/models/topup/CrossProfileFeeDto;", "crossProfileFeeDto", "", "amount", "currency", "<init>", "(Ljo3/a;Ljava/lang/String;Lcom/revolut/data/network/models/topup/CrossProfileFeeDto;Ljava/lang/Long;Ljava/lang/String;)V", "component1", "()Ljo3/a;", "component2", "()Ljava/lang/String;", "component3", "()Lcom/revolut/data/network/models/topup/CrossProfileFeeDto;", "component4", "()Ljava/lang/Long;", "component5", "copy", "(Ljo3/a;Ljava/lang/String;Lcom/revolut/data/network/models/topup/CrossProfileFeeDto;Ljava/lang/Long;Ljava/lang/String;)Lcom/revolut/data/network/models/topup/CardTopupFeeDto;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "toString", "Ljo3/a;", "getFee", "Ljava/lang/String;", "getFeeMessage", "Lcom/revolut/data/network/models/topup/CrossProfileFeeDto;", "getCrossProfileFeeDto", "Ljava/lang/Long;", "getAmount", "getCurrency", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CardTopupFeeDto {

    @b("amount")
    private final Long amount;

    @b("crossProfileFee")
    private final CrossProfileFeeDto crossProfileFeeDto;

    @b("currency")
    private final String currency;

    @b("fee")
    private final a fee;

    @b("message")
    private final String feeMessage;

    public CardTopupFeeDto(a aVar, String str, CrossProfileFeeDto crossProfileFeeDto, Long l2, String str2) {
        this.fee = aVar;
        this.feeMessage = str;
        this.crossProfileFeeDto = crossProfileFeeDto;
        this.amount = l2;
        this.currency = str2;
    }

    public static /* synthetic */ CardTopupFeeDto copy$default(CardTopupFeeDto cardTopupFeeDto, a aVar, String str, CrossProfileFeeDto crossProfileFeeDto, Long l2, String str2, int i, Object obj2) {
        if ((i & 1) != 0) {
            aVar = cardTopupFeeDto.fee;
        }
        if ((i & 2) != 0) {
            str = cardTopupFeeDto.feeMessage;
        }
        if ((i & 4) != 0) {
            crossProfileFeeDto = cardTopupFeeDto.crossProfileFeeDto;
        }
        if ((i & 8) != 0) {
            l2 = cardTopupFeeDto.amount;
        }
        if ((i & 16) != 0) {
            str2 = cardTopupFeeDto.currency;
        }
        String str3 = str2;
        CrossProfileFeeDto crossProfileFeeDto2 = crossProfileFeeDto;
        return cardTopupFeeDto.copy(aVar, str, crossProfileFeeDto2, l2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final a getFee() {
        return this.fee;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getFeeMessage() {
        return this.feeMessage;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final CrossProfileFeeDto getCrossProfileFeeDto() {
        return this.crossProfileFeeDto;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Long getAmount() {
        return this.amount;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @NotNull
    public final CardTopupFeeDto copy(a fee2, String feeMessage, CrossProfileFeeDto crossProfileFeeDto, Long amount, String currency) {
        return new CardTopupFeeDto(fee2, feeMessage, crossProfileFeeDto, amount, currency);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CardTopupFeeDto)) {
            return false;
        }
        CardTopupFeeDto cardTopupFeeDto = (CardTopupFeeDto) other;
        return Intrinsics.f(this.fee, cardTopupFeeDto.fee) && Intrinsics.f(this.feeMessage, cardTopupFeeDto.feeMessage) && Intrinsics.f(this.crossProfileFeeDto, cardTopupFeeDto.crossProfileFeeDto) && Intrinsics.f(this.amount, cardTopupFeeDto.amount) && Intrinsics.f(this.currency, cardTopupFeeDto.currency);
    }

    public final Long getAmount() {
        return this.amount;
    }

    public final CrossProfileFeeDto getCrossProfileFeeDto() {
        return this.crossProfileFeeDto;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final a getFee() {
        return this.fee;
    }

    public final String getFeeMessage() {
        return this.feeMessage;
    }

    public int hashCode() {
        a aVar = this.fee;
        int iHashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
        String str = this.feeMessage;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        CrossProfileFeeDto crossProfileFeeDto = this.crossProfileFeeDto;
        int iHashCode3 = (iHashCode2 + (crossProfileFeeDto == null ? 0 : crossProfileFeeDto.hashCode())) * 31;
        Long l2 = this.amount;
        int iHashCode4 = (iHashCode3 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str2 = this.currency;
        return iHashCode4 + (str2 != null ? str2.hashCode() : 0);
    }
}

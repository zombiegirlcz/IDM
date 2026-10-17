package com.revolut.data.network.models.transfer;

import a0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import org.jetbrains.annotations.NotNull;
import p.a;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003JI\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006!"}, d2 = {"Lcom/revolut/data/network/models/transfer/CurrencyExchangeToRequestDto;", "", "fromCcy", "", "toCcy", "toAmount", "", "rateTimestamp", "reason", "signedQuote", "<init>", "(Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;)V", "getFromCcy", "()Ljava/lang/String;", "getToCcy", "getToAmount", "()J", "getRateTimestamp", "getReason", "getSignedQuote", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CurrencyExchangeToRequestDto {

    @b("fromCcy")
    @NotNull
    private final String fromCcy;

    @b("rateTimestamp")
    private final long rateTimestamp;

    @b("reason")
    private final String reason;

    @b("signedQuote")
    private final String signedQuote;

    @b("toAmount")
    private final long toAmount;

    @b("toCcy")
    @NotNull
    private final String toCcy;

    public CurrencyExchangeToRequestDto(@NotNull String fromCcy, @NotNull String toCcy, long j2, long j3, String str, String str2) {
        Intrinsics.checkNotNullParameter(fromCcy, "fromCcy");
        Intrinsics.checkNotNullParameter(toCcy, "toCcy");
        this.fromCcy = fromCcy;
        this.toCcy = toCcy;
        this.toAmount = j2;
        this.rateTimestamp = j3;
        this.reason = str;
        this.signedQuote = str2;
    }

    public static /* synthetic */ CurrencyExchangeToRequestDto copy$default(CurrencyExchangeToRequestDto currencyExchangeToRequestDto, String str, String str2, long j2, long j3, String str3, String str4, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = currencyExchangeToRequestDto.fromCcy;
        }
        if ((i & 2) != 0) {
            str2 = currencyExchangeToRequestDto.toCcy;
        }
        if ((i & 4) != 0) {
            j2 = currencyExchangeToRequestDto.toAmount;
        }
        if ((i & 8) != 0) {
            j3 = currencyExchangeToRequestDto.rateTimestamp;
        }
        if ((i & 16) != 0) {
            str3 = currencyExchangeToRequestDto.reason;
        }
        if ((i & 32) != 0) {
            str4 = currencyExchangeToRequestDto.signedQuote;
        }
        long j5 = j3;
        long j16 = j2;
        return currencyExchangeToRequestDto.copy(str, str2, j16, j5, str3, str4);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getFromCcy() {
        return this.fromCcy;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getToCcy() {
        return this.toCcy;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getToAmount() {
        return this.toAmount;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getRateTimestamp() {
        return this.rateTimestamp;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getReason() {
        return this.reason;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getSignedQuote() {
        return this.signedQuote;
    }

    @NotNull
    public final CurrencyExchangeToRequestDto copy(@NotNull String fromCcy, @NotNull String toCcy, long toAmount, long rateTimestamp, String reason, String signedQuote) {
        Intrinsics.checkNotNullParameter(fromCcy, "fromCcy");
        Intrinsics.checkNotNullParameter(toCcy, "toCcy");
        return new CurrencyExchangeToRequestDto(fromCcy, toCcy, toAmount, rateTimestamp, reason, signedQuote);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CurrencyExchangeToRequestDto)) {
            return false;
        }
        CurrencyExchangeToRequestDto currencyExchangeToRequestDto = (CurrencyExchangeToRequestDto) other;
        return Intrinsics.f(this.fromCcy, currencyExchangeToRequestDto.fromCcy) && Intrinsics.f(this.toCcy, currencyExchangeToRequestDto.toCcy) && this.toAmount == currencyExchangeToRequestDto.toAmount && this.rateTimestamp == currencyExchangeToRequestDto.rateTimestamp && Intrinsics.f(this.reason, currencyExchangeToRequestDto.reason) && Intrinsics.f(this.signedQuote, currencyExchangeToRequestDto.signedQuote);
    }

    @NotNull
    public final String getFromCcy() {
        return this.fromCcy;
    }

    public final long getRateTimestamp() {
        return this.rateTimestamp;
    }

    public final String getReason() {
        return this.reason;
    }

    public final String getSignedQuote() {
        return this.signedQuote;
    }

    public final long getToAmount() {
        return this.toAmount;
    }

    @NotNull
    public final String getToCcy() {
        return this.toCcy;
    }

    public int hashCode() {
        int iC = d.c(d.c(a.c(this.fromCcy.hashCode() * 31, 31, this.toCcy), 31, this.toAmount), 31, this.rateTimestamp);
        String str = this.reason;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.signedQuote;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public /* synthetic */ CurrencyExchangeToRequestDto(String str, String str2, long j2, long j3, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, j2, j3, str3, (i & 32) != 0 ? null : str4);
    }
}

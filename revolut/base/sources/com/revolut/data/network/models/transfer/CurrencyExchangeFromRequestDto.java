package com.revolut.data.network.models.transfer;

import a0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import org.jetbrains.annotations.NotNull;
import p.a;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003JI\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006!"}, d2 = {"Lcom/revolut/data/network/models/transfer/CurrencyExchangeFromRequestDto;", "", "fromCcy", "", "fromAmount", "", "toCcy", "rateTimestamp", "reason", "signedQuote", "<init>", "(Ljava/lang/String;JLjava/lang/String;JLjava/lang/String;Ljava/lang/String;)V", "getFromCcy", "()Ljava/lang/String;", "getFromAmount", "()J", "getToCcy", "getRateTimestamp", "getReason", "getSignedQuote", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CurrencyExchangeFromRequestDto {

    @b("fromAmount")
    private final long fromAmount;

    @b("fromCcy")
    @NotNull
    private final String fromCcy;

    @b("rateTimestamp")
    private final long rateTimestamp;

    @b("reason")
    private final String reason;

    @b("signedQuote")
    private final String signedQuote;

    @b("toCcy")
    @NotNull
    private final String toCcy;

    public CurrencyExchangeFromRequestDto(@NotNull String fromCcy, long j2, @NotNull String toCcy, long j3, String str, String str2) {
        Intrinsics.checkNotNullParameter(fromCcy, "fromCcy");
        Intrinsics.checkNotNullParameter(toCcy, "toCcy");
        this.fromCcy = fromCcy;
        this.fromAmount = j2;
        this.toCcy = toCcy;
        this.rateTimestamp = j3;
        this.reason = str;
        this.signedQuote = str2;
    }

    public static /* synthetic */ CurrencyExchangeFromRequestDto copy$default(CurrencyExchangeFromRequestDto currencyExchangeFromRequestDto, String str, long j2, String str2, long j3, String str3, String str4, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = currencyExchangeFromRequestDto.fromCcy;
        }
        if ((i & 2) != 0) {
            j2 = currencyExchangeFromRequestDto.fromAmount;
        }
        if ((i & 4) != 0) {
            str2 = currencyExchangeFromRequestDto.toCcy;
        }
        if ((i & 8) != 0) {
            j3 = currencyExchangeFromRequestDto.rateTimestamp;
        }
        if ((i & 16) != 0) {
            str3 = currencyExchangeFromRequestDto.reason;
        }
        if ((i & 32) != 0) {
            str4 = currencyExchangeFromRequestDto.signedQuote;
        }
        String str5 = str2;
        return currencyExchangeFromRequestDto.copy(str, j2, str5, j3, str3, str4);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getFromCcy() {
        return this.fromCcy;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getFromAmount() {
        return this.fromAmount;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getToCcy() {
        return this.toCcy;
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
    public final CurrencyExchangeFromRequestDto copy(@NotNull String fromCcy, long fromAmount, @NotNull String toCcy, long rateTimestamp, String reason, String signedQuote) {
        Intrinsics.checkNotNullParameter(fromCcy, "fromCcy");
        Intrinsics.checkNotNullParameter(toCcy, "toCcy");
        return new CurrencyExchangeFromRequestDto(fromCcy, fromAmount, toCcy, rateTimestamp, reason, signedQuote);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CurrencyExchangeFromRequestDto)) {
            return false;
        }
        CurrencyExchangeFromRequestDto currencyExchangeFromRequestDto = (CurrencyExchangeFromRequestDto) other;
        return Intrinsics.f(this.fromCcy, currencyExchangeFromRequestDto.fromCcy) && this.fromAmount == currencyExchangeFromRequestDto.fromAmount && Intrinsics.f(this.toCcy, currencyExchangeFromRequestDto.toCcy) && this.rateTimestamp == currencyExchangeFromRequestDto.rateTimestamp && Intrinsics.f(this.reason, currencyExchangeFromRequestDto.reason) && Intrinsics.f(this.signedQuote, currencyExchangeFromRequestDto.signedQuote);
    }

    public final long getFromAmount() {
        return this.fromAmount;
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

    @NotNull
    public final String getToCcy() {
        return this.toCcy;
    }

    public int hashCode() {
        int iC = d.c(a.c(d.c(this.fromCcy.hashCode() * 31, 31, this.fromAmount), 31, this.toCcy), 31, this.rateTimestamp);
        String str = this.reason;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.signedQuote;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public /* synthetic */ CurrencyExchangeFromRequestDto(String str, long j2, String str2, long j3, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j2, str2, j3, str3, (i & 32) != 0 ? null : str4);
    }
}

package com.revolut.data.network.models.transfer;

import a0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import org.jetbrains.annotations.NotNull;
import p.a;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0006HÆ\u0003J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0014J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0014J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jh\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010#J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0016\u0010\u0014R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000fR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000fR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u000f¨\u0006*"}, d2 = {"Lcom/revolut/data/network/models/transfer/PocketExchangeRequestDto;", "", "fromPocket", "", "toPocket", "rateTimestamp", "", "fromAmount", "toAmount", "takeProfitRate", "stopLossRate", "signedQuote", "<init>", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getFromPocket", "()Ljava/lang/String;", "getToPocket", "getRateTimestamp", "()J", "getFromAmount", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getToAmount", "getTakeProfitRate", "getStopLossRate", "getSignedQuote", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/revolut/data/network/models/transfer/PocketExchangeRequestDto;", "equals", "", "other", "hashCode", "", "toString", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PocketExchangeRequestDto {

    @b("fromAmount")
    private final Long fromAmount;

    @b("fromPocket")
    @NotNull
    private final String fromPocket;

    @b("rateTimestamp")
    private final long rateTimestamp;

    @b("signedQuote")
    private final String signedQuote;

    @b("stopLossRate")
    private final String stopLossRate;

    @b("takeProfitRate")
    private final String takeProfitRate;

    @b("toAmount")
    private final Long toAmount;

    @b("toPocket")
    @NotNull
    private final String toPocket;

    public PocketExchangeRequestDto(@NotNull String fromPocket, @NotNull String toPocket, long j2, Long l2, Long l3, String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(fromPocket, "fromPocket");
        Intrinsics.checkNotNullParameter(toPocket, "toPocket");
        this.fromPocket = fromPocket;
        this.toPocket = toPocket;
        this.rateTimestamp = j2;
        this.fromAmount = l2;
        this.toAmount = l3;
        this.takeProfitRate = str;
        this.stopLossRate = str2;
        this.signedQuote = str3;
    }

    public static /* synthetic */ PocketExchangeRequestDto copy$default(PocketExchangeRequestDto pocketExchangeRequestDto, String str, String str2, long j2, Long l2, Long l3, String str3, String str4, String str5, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = pocketExchangeRequestDto.fromPocket;
        }
        if ((i & 2) != 0) {
            str2 = pocketExchangeRequestDto.toPocket;
        }
        if ((i & 4) != 0) {
            j2 = pocketExchangeRequestDto.rateTimestamp;
        }
        if ((i & 8) != 0) {
            l2 = pocketExchangeRequestDto.fromAmount;
        }
        if ((i & 16) != 0) {
            l3 = pocketExchangeRequestDto.toAmount;
        }
        if ((i & 32) != 0) {
            str3 = pocketExchangeRequestDto.takeProfitRate;
        }
        if ((i & 64) != 0) {
            str4 = pocketExchangeRequestDto.stopLossRate;
        }
        if ((i & 128) != 0) {
            str5 = pocketExchangeRequestDto.signedQuote;
        }
        String str6 = str5;
        String str7 = str3;
        Long l4 = l2;
        long j3 = j2;
        return pocketExchangeRequestDto.copy(str, str2, j3, l4, l3, str7, str4, str6);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getFromPocket() {
        return this.fromPocket;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getToPocket() {
        return this.toPocket;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getRateTimestamp() {
        return this.rateTimestamp;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Long getFromAmount() {
        return this.fromAmount;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Long getToAmount() {
        return this.toAmount;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getTakeProfitRate() {
        return this.takeProfitRate;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getStopLossRate() {
        return this.stopLossRate;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getSignedQuote() {
        return this.signedQuote;
    }

    @NotNull
    public final PocketExchangeRequestDto copy(@NotNull String fromPocket, @NotNull String toPocket, long rateTimestamp, Long fromAmount, Long toAmount, String takeProfitRate, String stopLossRate, String signedQuote) {
        Intrinsics.checkNotNullParameter(fromPocket, "fromPocket");
        Intrinsics.checkNotNullParameter(toPocket, "toPocket");
        return new PocketExchangeRequestDto(fromPocket, toPocket, rateTimestamp, fromAmount, toAmount, takeProfitRate, stopLossRate, signedQuote);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PocketExchangeRequestDto)) {
            return false;
        }
        PocketExchangeRequestDto pocketExchangeRequestDto = (PocketExchangeRequestDto) other;
        return Intrinsics.f(this.fromPocket, pocketExchangeRequestDto.fromPocket) && Intrinsics.f(this.toPocket, pocketExchangeRequestDto.toPocket) && this.rateTimestamp == pocketExchangeRequestDto.rateTimestamp && Intrinsics.f(this.fromAmount, pocketExchangeRequestDto.fromAmount) && Intrinsics.f(this.toAmount, pocketExchangeRequestDto.toAmount) && Intrinsics.f(this.takeProfitRate, pocketExchangeRequestDto.takeProfitRate) && Intrinsics.f(this.stopLossRate, pocketExchangeRequestDto.stopLossRate) && Intrinsics.f(this.signedQuote, pocketExchangeRequestDto.signedQuote);
    }

    public final Long getFromAmount() {
        return this.fromAmount;
    }

    @NotNull
    public final String getFromPocket() {
        return this.fromPocket;
    }

    public final long getRateTimestamp() {
        return this.rateTimestamp;
    }

    public final String getSignedQuote() {
        return this.signedQuote;
    }

    public final String getStopLossRate() {
        return this.stopLossRate;
    }

    public final String getTakeProfitRate() {
        return this.takeProfitRate;
    }

    public final Long getToAmount() {
        return this.toAmount;
    }

    @NotNull
    public final String getToPocket() {
        return this.toPocket;
    }

    public int hashCode() {
        int iC = d.c(a.c(this.fromPocket.hashCode() * 31, 31, this.toPocket), 31, this.rateTimestamp);
        Long l2 = this.fromAmount;
        int iHashCode = (iC + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.toAmount;
        int iHashCode2 = (iHashCode + (l3 == null ? 0 : l3.hashCode())) * 31;
        String str = this.takeProfitRate;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.stopLossRate;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.signedQuote;
        return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public /* synthetic */ PocketExchangeRequestDto(String str, String str2, long j2, Long l2, Long l3, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, j2, (i & 8) != 0 ? null : l2, (i & 16) != 0 ? null : l3, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? null : str5);
    }
}

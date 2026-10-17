package com.revolut.data.network.models.topup;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import org.jetbrains.annotations.NotNull;
import p.a;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/revolut/data/network/models/topup/McyExchangeRateDto;", "", "ask", "", "bid", "pair", "timestamp", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V", "getAsk", "()Ljava/lang/String;", "getBid", "getPair", "getTimestamp", "()J", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class McyExchangeRateDto {

    @b("ask")
    @NotNull
    private final String ask;

    @b("bid")
    @NotNull
    private final String bid;

    @b("pair")
    @NotNull
    private final String pair;

    @b("timestamp")
    private final long timestamp;

    public McyExchangeRateDto(@NotNull String ask2, @NotNull String bid2, @NotNull String pair, long j2) {
        Intrinsics.checkNotNullParameter(ask2, "ask");
        Intrinsics.checkNotNullParameter(bid2, "bid");
        Intrinsics.checkNotNullParameter(pair, "pair");
        this.ask = ask2;
        this.bid = bid2;
        this.pair = pair;
        this.timestamp = j2;
    }

    public static /* synthetic */ McyExchangeRateDto copy$default(McyExchangeRateDto mcyExchangeRateDto, String str, String str2, String str3, long j2, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = mcyExchangeRateDto.ask;
        }
        if ((i & 2) != 0) {
            str2 = mcyExchangeRateDto.bid;
        }
        if ((i & 4) != 0) {
            str3 = mcyExchangeRateDto.pair;
        }
        if ((i & 8) != 0) {
            j2 = mcyExchangeRateDto.timestamp;
        }
        String str4 = str3;
        return mcyExchangeRateDto.copy(str, str2, str4, j2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAsk() {
        return this.ask;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getBid() {
        return this.bid;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPair() {
        return this.pair;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    @NotNull
    public final McyExchangeRateDto copy(@NotNull String ask2, @NotNull String bid2, @NotNull String pair, long timestamp) {
        Intrinsics.checkNotNullParameter(ask2, "ask");
        Intrinsics.checkNotNullParameter(bid2, "bid");
        Intrinsics.checkNotNullParameter(pair, "pair");
        return new McyExchangeRateDto(ask2, bid2, pair, timestamp);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof McyExchangeRateDto)) {
            return false;
        }
        McyExchangeRateDto mcyExchangeRateDto = (McyExchangeRateDto) other;
        return Intrinsics.f(this.ask, mcyExchangeRateDto.ask) && Intrinsics.f(this.bid, mcyExchangeRateDto.bid) && Intrinsics.f(this.pair, mcyExchangeRateDto.pair) && this.timestamp == mcyExchangeRateDto.timestamp;
    }

    @NotNull
    public final String getAsk() {
        return this.ask;
    }

    @NotNull
    public final String getBid() {
        return this.bid;
    }

    @NotNull
    public final String getPair() {
        return this.pair;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        return Long.hashCode(this.timestamp) + a.c(a.c(this.ask.hashCode() * 31, 31, this.bid), 31, this.pair);
    }
}

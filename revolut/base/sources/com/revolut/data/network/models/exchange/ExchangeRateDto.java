package com.revolut.data.network.models.exchange;

import a0.d;
import ip0.v7;
import jo3.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000eJ\u0010\u0010\u0011\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016JN\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b%\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b&\u0010\u000eR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010'\u001a\u0004\b(\u0010\u0012R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010)\u001a\u0004\b*\u0010\u0014R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010+\u001a\u0004\b,\u0010\u0016¨\u0006-"}, d2 = {"Lcom/revolut/data/network/models/exchange/ExchangeRateDto;", "", "Ljo3/a;", "from", "to", "fee", "", "rate", "", "timestamp", "markup", "<init>", "(Ljo3/a;Ljo3/a;Ljo3/a;DJLjava/lang/Double;)V", "component1", "()Ljo3/a;", "component2", "component3", "component4", "()D", "component5", "()J", "component6", "()Ljava/lang/Double;", "copy", "(Ljo3/a;Ljo3/a;Ljo3/a;DJLjava/lang/Double;)Lcom/revolut/data/network/models/exchange/ExchangeRateDto;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "toString", "()Ljava/lang/String;", "Ljo3/a;", "getFrom", "getTo", "getFee", "D", "getRate", "J", "getTimestamp", "Ljava/lang/Double;", "getMarkup", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ExchangeRateDto {

    @b("fee")
    @NotNull
    private final a fee;

    @b("from")
    @NotNull
    private final a from;

    @b("markup")
    private final Double markup;

    @b("rate")
    private final double rate;

    @b("timestamp")
    private final long timestamp;

    @b("to")
    @NotNull
    private final a to;

    public ExchangeRateDto(@NotNull a from, @NotNull a to6, @NotNull a fee2, double d, long j2, Double d5) {
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(to6, "to");
        Intrinsics.checkNotNullParameter(fee2, "fee");
        this.from = from;
        this.to = to6;
        this.fee = fee2;
        this.rate = d;
        this.timestamp = j2;
        this.markup = d5;
    }

    public static /* synthetic */ ExchangeRateDto copy$default(ExchangeRateDto exchangeRateDto, a aVar, a aVar2, a aVar3, double d, long j2, Double d5, int i, Object obj2) {
        if ((i & 1) != 0) {
            aVar = exchangeRateDto.from;
        }
        if ((i & 2) != 0) {
            aVar2 = exchangeRateDto.to;
        }
        if ((i & 4) != 0) {
            aVar3 = exchangeRateDto.fee;
        }
        if ((i & 8) != 0) {
            d = exchangeRateDto.rate;
        }
        if ((i & 16) != 0) {
            j2 = exchangeRateDto.timestamp;
        }
        if ((i & 32) != 0) {
            d5 = exchangeRateDto.markup;
        }
        Double d6 = d5;
        long j3 = j2;
        a aVar4 = aVar3;
        return exchangeRateDto.copy(aVar, aVar2, aVar4, d, j3, d6);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final a getFrom() {
        return this.from;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final a getTo() {
        return this.to;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final a getFee() {
        return this.fee;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final double getRate() {
        return this.rate;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Double getMarkup() {
        return this.markup;
    }

    @NotNull
    public final ExchangeRateDto copy(@NotNull a from, @NotNull a to6, @NotNull a fee2, double rate, long timestamp, Double markup) {
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(to6, "to");
        Intrinsics.checkNotNullParameter(fee2, "fee");
        return new ExchangeRateDto(from, to6, fee2, rate, timestamp, markup);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExchangeRateDto)) {
            return false;
        }
        ExchangeRateDto exchangeRateDto = (ExchangeRateDto) other;
        return Intrinsics.f(this.from, exchangeRateDto.from) && Intrinsics.f(this.to, exchangeRateDto.to) && Intrinsics.f(this.fee, exchangeRateDto.fee) && Double.compare(this.rate, exchangeRateDto.rate) == 0 && this.timestamp == exchangeRateDto.timestamp && Intrinsics.f(this.markup, exchangeRateDto.markup);
    }

    @NotNull
    public final a getFee() {
        return this.fee;
    }

    @NotNull
    public final a getFrom() {
        return this.from;
    }

    public final Double getMarkup() {
        return this.markup;
    }

    public final double getRate() {
        return this.rate;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    @NotNull
    public final a getTo() {
        return this.to;
    }

    public int hashCode() {
        int iC = d.c(m72.b.c(v7.j(this.fee, v7.j(this.to, this.from.hashCode() * 31, 31), 31), this.rate, 31), 31, this.timestamp);
        Double d = this.markup;
        return iC + (d == null ? 0 : d.hashCode());
    }

    public /* synthetic */ ExchangeRateDto(a aVar, a aVar2, a aVar3, double d, long j2, Double d5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, aVar2, aVar3, d, j2, (i & 32) != 0 ? null : d5);
    }
}

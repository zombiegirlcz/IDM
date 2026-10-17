package y49;

import ip0.v7;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import nel.n;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class h {

    @NotNull
    public static final g Companion = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f310847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BigDecimal f310848b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f310849c;
    public final BigDecimal d;
    public final dj0.d e;
    public final ej0.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final dj0.d f310850g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ej0.b f310851h;
    public final ej0.b i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ej0.b f310852j;
    public final BigDecimal k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final List f310853l;

    public h(n instrument, BigDecimal quantity, dj0.d unrealisedPnl, BigDecimal unrealisedPerformance, dj0.d margin, ej0.b initialMargin, dj0.d exposure, ej0.b bVar, ej0.b currentPrice, ej0.b averageOpeningPrice, BigDecimal leverage, List positions) {
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        Intrinsics.checkNotNullParameter(unrealisedPnl, "unrealisedPnl");
        Intrinsics.checkNotNullParameter(unrealisedPerformance, "unrealisedPerformance");
        Intrinsics.checkNotNullParameter(margin, "margin");
        Intrinsics.checkNotNullParameter(initialMargin, "initialMargin");
        Intrinsics.checkNotNullParameter(exposure, "exposure");
        Intrinsics.checkNotNullParameter(currentPrice, "currentPrice");
        Intrinsics.checkNotNullParameter(averageOpeningPrice, "averageOpeningPrice");
        Intrinsics.checkNotNullParameter(leverage, "leverage");
        Intrinsics.checkNotNullParameter(positions, "positions");
        this.f310847a = instrument;
        this.f310848b = quantity;
        this.f310849c = unrealisedPnl;
        this.d = unrealisedPerformance;
        this.e = margin;
        this.f = initialMargin;
        this.f310850g = exposure;
        this.f310851h = bVar;
        this.i = currentPrice;
        this.f310852j = averageOpeningPrice;
        this.k = leverage;
        this.f310853l = positions;
    }

    public static h a(h hVar, BigDecimal bigDecimal, dj0.d dVar, BigDecimal bigDecimal2, dj0.d dVar2, ej0.b bVar, dj0.d dVar3, ej0.b bVar2, ArrayList arrayList, int i) {
        n instrument = hVar.f310847a;
        if ((i & 2) != 0) {
            bigDecimal = hVar.f310848b;
        }
        BigDecimal quantity = bigDecimal;
        if ((i & 4) != 0) {
            dVar = hVar.f310849c;
        }
        dj0.d unrealisedPnl = dVar;
        BigDecimal unrealisedPerformance = (i & 8) != 0 ? hVar.d : bigDecimal2;
        dj0.d margin = (i & 16) != 0 ? hVar.e : dVar2;
        ej0.b initialMargin = (i & 32) != 0 ? hVar.f : bVar;
        dj0.d exposure = (i & 64) != 0 ? hVar.f310850g : dVar3;
        ej0.b bVar3 = hVar.f310851h;
        ej0.b currentPrice = hVar.i;
        ej0.b averageOpeningPrice = (i & 512) != 0 ? hVar.f310852j : bVar2;
        BigDecimal leverage = hVar.k;
        List positions = (i & 2048) != 0 ? hVar.f310853l : arrayList;
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        Intrinsics.checkNotNullParameter(unrealisedPnl, "unrealisedPnl");
        Intrinsics.checkNotNullParameter(unrealisedPerformance, "unrealisedPerformance");
        Intrinsics.checkNotNullParameter(margin, "margin");
        Intrinsics.checkNotNullParameter(initialMargin, "initialMargin");
        Intrinsics.checkNotNullParameter(exposure, "exposure");
        Intrinsics.checkNotNullParameter(currentPrice, "currentPrice");
        Intrinsics.checkNotNullParameter(averageOpeningPrice, "averageOpeningPrice");
        Intrinsics.checkNotNullParameter(leverage, "leverage");
        Intrinsics.checkNotNullParameter(positions, "positions");
        return new h(instrument, quantity, unrealisedPnl, unrealisedPerformance, margin, initialMargin, exposure, bVar3, currentPrice, averageOpeningPrice, leverage, positions);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f310847a, hVar.f310847a) && Intrinsics.f(this.f310848b, hVar.f310848b) && Intrinsics.f(this.f310849c, hVar.f310849c) && Intrinsics.f(this.d, hVar.d) && Intrinsics.f(this.e, hVar.e) && Intrinsics.f(this.f, hVar.f) && Intrinsics.f(this.f310850g, hVar.f310850g) && Intrinsics.f(this.f310851h, hVar.f310851h) && Intrinsics.f(this.i, hVar.i) && Intrinsics.f(this.f310852j, hVar.f310852j) && Intrinsics.f(this.k, hVar.k) && Intrinsics.f(this.f310853l, hVar.f310853l);
    }

    public final int hashCode() {
        int iC = v7.c(org.bouncycastle.jcajce.provider.digest.a.d(this.f, v7.c(t61.a.d(this.d, v7.c(t61.a.d(this.f310848b, this.f310847a.hashCode() * 31, 31), 31, this.f310849c), 31), 31, this.e), 31), 31, this.f310850g);
        ej0.b bVar = this.f310851h;
        return this.f310853l.hashCode() + t61.a.d(this.k, org.bouncycastle.jcajce.provider.digest.a.d(this.f310852j, org.bouncycastle.jcajce.provider.digest.a.d(this.i, (iC + (bVar == null ? 0 : bVar.hashCode())) * 31, 31), 31), 31);
    }
}

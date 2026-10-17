package y49;

import ip0.v7;
import java.math.BigDecimal;
import java.time.Instant;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class e {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f310837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f310838b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f310839c;
    public final BigDecimal d;
    public final dj0.d e;
    public final dj0.d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ej0.b f310840g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ej0.b f310841h;
    public final ej0.b i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final BigDecimal f310842j;
    public final BigDecimal k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Instant f310843l;

    public e(String id10, String str, dj0.d unrealisedPnl, BigDecimal unrealisedPerformance, dj0.d value, dj0.d exposure, ej0.b bVar, ej0.b currentPrice, ej0.b bVar2, BigDecimal bigDecimal, BigDecimal bigDecimal2, Instant instant) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(unrealisedPnl, "unrealisedPnl");
        Intrinsics.checkNotNullParameter(unrealisedPerformance, "unrealisedPerformance");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(exposure, "exposure");
        Intrinsics.checkNotNullParameter(currentPrice, "currentPrice");
        this.f310837a = id10;
        this.f310838b = str;
        this.f310839c = unrealisedPnl;
        this.d = unrealisedPerformance;
        this.e = value;
        this.f = exposure;
        this.f310840g = bVar;
        this.f310841h = currentPrice;
        this.i = bVar2;
        this.f310842j = bigDecimal;
        this.k = bigDecimal2;
        this.f310843l = instant;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f310837a, eVar.f310837a) && Intrinsics.f(this.f310838b, eVar.f310838b) && Intrinsics.f(this.f310839c, eVar.f310839c) && Intrinsics.f(this.d, eVar.d) && Intrinsics.f(this.e, eVar.e) && Intrinsics.f(this.f, eVar.f) && Intrinsics.f(this.f310840g, eVar.f310840g) && Intrinsics.f(this.f310841h, eVar.f310841h) && Intrinsics.f(this.i, eVar.i) && Intrinsics.f(this.f310842j, eVar.f310842j) && Intrinsics.f(this.k, eVar.k) && Intrinsics.f(this.f310843l, eVar.f310843l);
    }

    public final int hashCode() {
        int iHashCode = this.f310837a.hashCode() * 31;
        String str = this.f310838b;
        int iC = v7.c(v7.c(t61.a.d(this.d, v7.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f310839c), 31), 31, this.e), 31, this.f);
        ej0.b bVar = this.f310840g;
        int iD = org.bouncycastle.jcajce.provider.digest.a.d(this.f310841h, (iC + (bVar == null ? 0 : bVar.hashCode())) * 31, 31);
        ej0.b bVar2 = this.i;
        int iHashCode2 = (iD + (bVar2 == null ? 0 : bVar2.hashCode())) * 31;
        BigDecimal bigDecimal = this.f310842j;
        int iHashCode3 = (iHashCode2 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.k;
        int iHashCode4 = (iHashCode3 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        Instant instant = this.f310843l;
        return iHashCode4 + (instant != null ? instant.hashCode() : 0);
    }
}

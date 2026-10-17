package mwg;

import ip0.v7;
import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes9.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iwg.a f209453a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f209454b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f209455c;
    public final dj0.d d;
    public final float e;
    public final Float f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LocalDate f209456g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f209457h;
    public final ej0.b i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f209458j;
    public final BigDecimal k;

    public f(iwg.a analyticsProductType, boolean z, String asset, dj0.d pnl2, float f, Float f4, LocalDate localDate, String str, ej0.b bVar, String str2, BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(analyticsProductType, "analyticsProductType");
        Intrinsics.checkNotNullParameter(asset, "asset");
        Intrinsics.checkNotNullParameter(pnl2, "pnl");
        this.f209453a = analyticsProductType;
        this.f209454b = z;
        this.f209455c = asset;
        this.d = pnl2;
        this.e = f;
        this.f = f4;
        this.f209456g = localDate;
        this.f209457h = str;
        this.i = bVar;
        this.f209458j = str2;
        this.k = bigDecimal;
    }

    public static f a(f fVar, iwg.a aVar, dj0.d dVar, float f, Float f4, int i) {
        iwg.a analyticsProductType = (i & 1) != 0 ? fVar.f209453a : aVar;
        boolean z = fVar.f209454b;
        String asset = fVar.f209455c;
        dj0.d pnl2 = (i & 8) != 0 ? fVar.d : dVar;
        float f5 = (i & 16) != 0 ? fVar.e : f;
        Float f6 = (i & 32) != 0 ? fVar.f : f4;
        LocalDate localDate = (i & 64) != 0 ? fVar.f209456g : null;
        String str = fVar.f209457h;
        ej0.b bVar = (i & 256) != 0 ? fVar.i : null;
        String str2 = (i & 512) != 0 ? fVar.f209458j : null;
        BigDecimal bigDecimal = (i & 1024) != 0 ? fVar.k : null;
        fVar.getClass();
        Intrinsics.checkNotNullParameter(analyticsProductType, "analyticsProductType");
        Intrinsics.checkNotNullParameter(asset, "asset");
        Intrinsics.checkNotNullParameter(pnl2, "pnl");
        return new f(analyticsProductType, z, asset, pnl2, f5, f6, localDate, str, bVar, str2, bigDecimal);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f209453a == fVar.f209453a && this.f209454b == fVar.f209454b && Intrinsics.f(this.f209455c, fVar.f209455c) && Intrinsics.f(this.d, fVar.d) && Float.compare(this.e, fVar.e) == 0 && Intrinsics.f(this.f, fVar.f) && Intrinsics.f(this.f209456g, fVar.f209456g) && Intrinsics.f(this.f209457h, fVar.f209457h) && Intrinsics.f(this.i, fVar.i) && Intrinsics.f(this.f209458j, fVar.f209458j) && Intrinsics.f(this.k, fVar.k);
    }

    public final int hashCode() {
        int iB = m72.b.b(this.e, v7.c(p.a.c(j6.a.c(this.f209453a.hashCode() * 31, 31, this.f209454b), 31, this.f209455c), 31, this.d), 31);
        Float f = this.f;
        int iHashCode = (iB + (f == null ? 0 : f.hashCode())) * 31;
        LocalDate localDate = this.f209456g;
        int iHashCode2 = (iHashCode + (localDate == null ? 0 : localDate.hashCode())) * 31;
        String str = this.f209457h;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        ej0.b bVar = this.i;
        int iHashCode4 = (iHashCode3 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        String str2 = this.f209458j;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        BigDecimal bigDecimal = this.k;
        return iHashCode5 + (bigDecimal != null ? bigDecimal.hashCode() : 0);
    }
}

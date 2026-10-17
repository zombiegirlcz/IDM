package rxg;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes9.dex */
public final class g implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iwg.a f258174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f258175b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f258176c;
    public final LocalDate d;

    public g(iwg.a analyticsProductType, dj0.d pnl2, float f, LocalDate localDate) {
        Intrinsics.checkNotNullParameter(analyticsProductType, "analyticsProductType");
        Intrinsics.checkNotNullParameter(pnl2, "pnl");
        this.f258174a = analyticsProductType;
        this.f258175b = pnl2;
        this.f258176c = f;
        this.d = localDate;
    }

    @Override // rxg.j
    public final LocalDate b() {
        return this.d;
    }

    @Override // rxg.j
    public final float c() {
        return this.f258176c;
    }

    @Override // rxg.j
    public final dj0.d d() {
        return this.f258175b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f258174a == gVar.f258174a && Intrinsics.f(this.f258175b, gVar.f258175b) && Float.compare(this.f258176c, gVar.f258176c) == 0 && Intrinsics.f(this.d, gVar.d);
    }

    public final int hashCode() {
        int iB = m72.b.b(this.f258176c, v7.c(this.f258174a.hashCode() * 31, 31, this.f258175b), 31);
        LocalDate localDate = this.d;
        return iB + (localDate == null ? 0 : localDate.hashCode());
    }
}

package mwg;

import ip0.v7;
import jel.a3;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes9.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iwg.a f209477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a3 f209478b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f209479c;
    public final dj0.d d;
    public final float e;
    public final LocalDate f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f209480g;

    public m(iwg.a analyticsProductType, a3 sector, String asset, dj0.d pnl2, float f, LocalDate localDate, String str) {
        Intrinsics.checkNotNullParameter(analyticsProductType, "analyticsProductType");
        Intrinsics.checkNotNullParameter(sector, "sector");
        Intrinsics.checkNotNullParameter(asset, "asset");
        Intrinsics.checkNotNullParameter(pnl2, "pnl");
        this.f209477a = analyticsProductType;
        this.f209478b = sector;
        this.f209479c = asset;
        this.d = pnl2;
        this.e = f;
        this.f = localDate;
        this.f209480g = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return this.f209477a == mVar.f209477a && this.f209478b == mVar.f209478b && Intrinsics.f(this.f209479c, mVar.f209479c) && Intrinsics.f(this.d, mVar.d) && Float.compare(this.e, mVar.e) == 0 && Intrinsics.f(this.f, mVar.f) && Intrinsics.f(this.f209480g, mVar.f209480g);
    }

    public final int hashCode() {
        int iB = m72.b.b(this.e, v7.c(p.a.c((this.f209478b.hashCode() + (this.f209477a.hashCode() * 31)) * 31, 31, this.f209479c), 31, this.d), 31);
        LocalDate localDate = this.f;
        int iHashCode = (iB + (localDate == null ? 0 : localDate.hashCode())) * 31;
        String str = this.f209480g;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}

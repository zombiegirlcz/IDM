package mwg;

import ip0.v7;
import java.util.List;
import jel.a3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iwg.a f209474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a3 f209475b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f209476c;
    public final List d;

    public l(iwg.a analyticsProductType, a3 sector, dj0.d totalValue, List assets) {
        Intrinsics.checkNotNullParameter(analyticsProductType, "analyticsProductType");
        Intrinsics.checkNotNullParameter(sector, "sector");
        Intrinsics.checkNotNullParameter(totalValue, "totalValue");
        Intrinsics.checkNotNullParameter(assets, "assets");
        this.f209474a = analyticsProductType;
        this.f209475b = sector;
        this.f209476c = totalValue;
        this.d = assets;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return this.f209474a == lVar.f209474a && this.f209475b == lVar.f209475b && Intrinsics.f(this.f209476c, lVar.f209476c) && Intrinsics.f(this.d, lVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + v7.c((this.f209475b.hashCode() + (this.f209474a.hashCode() * 31)) * 31, 31, this.f209476c);
    }
}

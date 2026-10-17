package mwg;

import ip0.v7;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes9.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iwg.a f209434a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f209435b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f209436c;
    public final List d;
    public final List e;

    public a(iwg.a analyticsProductType, boolean z, dj0.d totalValue, List cash, List assets) {
        Intrinsics.checkNotNullParameter(analyticsProductType, "analyticsProductType");
        Intrinsics.checkNotNullParameter(totalValue, "totalValue");
        Intrinsics.checkNotNullParameter(cash, "cash");
        Intrinsics.checkNotNullParameter(assets, "assets");
        this.f209434a = analyticsProductType;
        this.f209435b = z;
        this.f209436c = totalValue;
        this.d = cash;
        this.e = assets;
    }

    public static a a(a aVar, iwg.a aVar2, f0 f0Var, List list, int i) {
        if ((i & 1) != 0) {
            aVar2 = aVar.f209434a;
        }
        iwg.a analyticsProductType = aVar2;
        boolean z = aVar.f209435b;
        dj0.d totalValue = aVar.f209436c;
        List list2 = f0Var;
        if ((i & 8) != 0) {
            list2 = aVar.d;
        }
        List cash = list2;
        if ((i & 16) != 0) {
            list = aVar.e;
        }
        List assets = list;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(analyticsProductType, "analyticsProductType");
        Intrinsics.checkNotNullParameter(totalValue, "totalValue");
        Intrinsics.checkNotNullParameter(cash, "cash");
        Intrinsics.checkNotNullParameter(assets, "assets");
        return new a(analyticsProductType, z, totalValue, cash, assets);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f209434a == aVar.f209434a && this.f209435b == aVar.f209435b && Intrinsics.f(this.f209436c, aVar.f209436c) && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + p.a.d(v7.c(j6.a.c(this.f209434a.hashCode() * 31, 31, this.f209435b), 31, this.f209436c), 31, this.d);
    }
}

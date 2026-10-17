package uke;

import efm.r;
import kotlin.jvm.internal.Intrinsics;
import rd0.e;
import te0.w;
import tzg.m;
import uj6.v;
import vkm.d;
import yoj.c;

/* JADX INFO: loaded from: classes8.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xoj.a f280730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f280731b;

    public a(xoj.a featuresInteractor, m wealthAccountsInteractor) {
        Intrinsics.checkNotNullParameter(featuresInteractor, "featuresInteractor");
        Intrinsics.checkNotNullParameter(wealthAccountsInteractor, "wealthAccountsInteractor");
        this.f280730a = featuresInteractor;
        this.f280731b = wealthAccountsInteractor;
    }

    public final d a() {
        c cVar = c.WEALTH_TRADING;
        cpj.b bVar = (cpj.b) this.f280730a;
        r map = w.m(bVar.l(cVar), bVar.l(c.COMMODITIES), bVar.l(c.ROBO)).map(new uhl.b(new v(7), 17));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return e.b(map);
    }
}

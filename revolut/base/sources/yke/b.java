package yke;

import efm.d0;
import kbb.r;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import q06.i;
import q06.k;
import sri.m;
import wp5.y;

/* JADX INFO: loaded from: classes8.dex */
public final class b implements jf0.d, k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f314609a;

    public b(m navigator, r wealthMainTabProvider) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(wealthMainTabProvider, "wealthMainTabProvider");
        this.f314609a = navigator;
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c cVar) {
        return y.D(cVar, "deeplink", 1, "trading") && cVar.e(2).length() == 0;
    }

    @Override // q06.k
    public final Object e(jf0.c cVar, Continuation continuation) {
        return new i(new q06.b(ibb.c.f160141b, null));
    }

    @Override // jf0.d
    public final d0 f(jf0.c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        ufm.c cVar = new ufm.c(new s2i.i(this, 22), 2);
        Intrinsics.checkNotNullExpressionValue(cVar, "fromCallable(...)");
        return cVar;
    }
}

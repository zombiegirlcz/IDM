package koh;

import com.revolut.feature.wealth_discovery.api.declaration.ScreenerRedesignAddNewCollectionDestination;
import efm.d0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import q06.h;
import sri.m;
import wp5.y;

/* JADX INFO: loaded from: classes10.dex */
public final class d implements ynh.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f186367a;

    public d(m navigator) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f186367a = navigator;
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c cVar) {
        return y.D(cVar, "deeplink", 1, "trading") && Intrinsics.f(cVar.e(2), "screener");
    }

    @Override // q06.k
    public final Object e(jf0.c cVar, Continuation continuation) {
        return new h(new ScreenerRedesignAddNewCollectionDestination(null), null);
    }

    @Override // jf0.d
    public final d0 f(jf0.c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        ufm.c cVar = new ufm.c(new h4d.d(this, 14), 2);
        Intrinsics.checkNotNullExpressionValue(cVar, "fromCallable(...)");
        return cVar;
    }
}

package o4f;

import efm.d0;
import jf0.c;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import q06.b;
import q06.i;
import sri.m;
import wp5.y;

/* JADX INFO: loaded from: classes8.dex */
public final class a implements c3f.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f222269a;

    public a(m navigator) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f222269a = navigator;
    }

    @Override // jf0.d, q06.k
    public final boolean a(c cVar) {
        return y.D(cVar, "deeplink", 1, "trading") && Intrinsics.f(cVar.e(2), "invest");
    }

    @Override // q06.k
    public final Object e(c cVar, Continuation continuation) {
        return new i(new b(ibb.c.f160141b, null));
    }

    @Override // jf0.d
    public final d0 f(c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        ufm.c cVar = new ufm.c(new nc0.a(this, 3), 2);
        Intrinsics.checkNotNullExpressionValue(cVar, "fromCallable(...)");
        return cVar;
    }
}

package yd8;

import com.revolut.core.ui_kit.delegates.t;
import efm.r;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import te0.w;
import vkm.q;
import y4f.o;
import ybh.a0;
import zhm.h0;

/* JADX INFO: loaded from: classes4.dex */
public final class n implements td8.b {

    @NotNull
    public static final i Companion = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ao.h f312652a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o7.d f312653b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hj8.a f312654c;
    public final zq.a d;
    public final gte.a e;
    public final jla.h f;

    public n(ao.h juniorCoparentInteractor, o7.d coparentRequestInteractor, hj8.a profileInteractor, zq.a juniorCoparentLauncherFactory, gte.a featureToggleInteractor, jla.h productCatalogueInteractor) {
        Intrinsics.checkNotNullParameter(juniorCoparentInteractor, "juniorCoparentInteractor");
        Intrinsics.checkNotNullParameter(coparentRequestInteractor, "coparentRequestInteractor");
        Intrinsics.checkNotNullParameter(profileInteractor, "profileInteractor");
        Intrinsics.checkNotNullParameter(juniorCoparentLauncherFactory, "juniorCoparentLauncherFactory");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(productCatalogueInteractor, "productCatalogueInteractor");
        this.f312652a = juniorCoparentInteractor;
        this.f312653b = coparentRequestInteractor;
        this.f312654c = profileInteractor;
        this.d = juniorCoparentLauncherFactory;
        this.e = featureToggleInteractor;
        this.f = productCatalogueInteractor;
    }

    @Override // i49.c
    public final boolean a(t data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return data.f54722b.f51596l instanceof vd8.c;
    }

    @Override // i49.c
    public final Flow f(j49.i params) {
        Intrinsics.checkNotNullParameter(params, "params");
        r map = rd0.e.c(bla.b.b(this.f, ne8.a.f214420c.a()), kotlin.coroutines.g.f186406a).map(new ya6.f(new a0(22), 14));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        Continuation continuation = null;
        return rd0.e.e(q.Q(rd0.e.b(w.v(map, this.f312652a.o(), new a(1))), new o(continuation, this, 11)), h0.f322473a, new x18.c(3, 22, continuation));
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x005e, code lost:
    
        if (r9 == r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0083, code lost:
    
        if (r7.f312653b.f(r8, r0) == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // i49.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(com.revolut.core.ui_kit.delegates.t r8, kotlin.coroutines.Continuation r9) {
        /*
            Method dump skipped, instruction units count: 206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yd8.n.g(com.revolut.core.ui_kit.delegates.t, kotlin.coroutines.Continuation):java.lang.Object");
    }
}

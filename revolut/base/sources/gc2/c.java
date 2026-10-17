package gc2;

import efm.d0;
import g4k.e;
import g9j.v;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rd0.d;
import sri.m;
import ufm.i;
import wp5.y;

/* JADX INFO: loaded from: classes20.dex */
public final class c implements bc2.b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f142314a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final uw1.c f142315b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fn2.c f142316c;

    public c(m navigator, uw1.c apmFeatureChecker, fn2.c productCatalogueLoader) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(apmFeatureChecker, "apmFeatureChecker");
        Intrinsics.checkNotNullParameter(productCatalogueLoader, "productCatalogueLoader");
        this.f142314a = navigator;
        this.f142315b = apmFeatureChecker;
        this.f142316c = productCatalogueLoader;
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c cVar) {
        return y.D(cVar, "deeplink", 1, "qvik");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // q06.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(jf0.c r7, kotlin.coroutines.Continuation r8) {
        /*
            Method dump skipped, instruction units count: 201
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gc2.c.e(jf0.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // jf0.d
    public final d0 f(jf0.c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Intrinsics.checkNotNullExpressionValue("c", "TAG");
        CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
        d.b(rd0.c.INFO, "c", j6.a.q("QVIK Deeplink uri: ", deeplink.f173629c), null, null, 16);
        i iVar = new i(((ty1.b) this.f142315b).g(), new v(new e(this, 22), 8), 0);
        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
        i iVar2 = new i(iVar, new v(new gbi.c(this, deeplink, 3), 7), 1);
        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
        return iVar2;
    }
}

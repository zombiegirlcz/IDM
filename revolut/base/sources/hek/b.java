package hek;

import efm.d0;
import hae.k;
import jf0.c;
import kotlin.jvm.internal.Intrinsics;
import sri.m;
import ufm.i;
import wp5.y;

/* JADX INFO: loaded from: classes11.dex */
public final class b implements zdk.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f151714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lek.a f151715b;

    public b(m navigator, lek.a podNomineesFeatureChecker) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(podNomineesFeatureChecker, "podNomineesFeatureChecker");
        this.f151714a = navigator;
        this.f151715b = podNomineesFeatureChecker;
    }

    @Override // jf0.d, q06.k
    public final boolean a(c cVar) {
        return y.D(cVar, "deeplink", 1, "pod-nominees");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // q06.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(jf0.c r4, kotlin.coroutines.Continuation r5) {
        /*
            r3 = this;
            boolean r4 = r5 instanceof hek.a
            if (r4 == 0) goto L13
            r4 = r5
            hek.a r4 = (hek.a) r4
            int r0 = r4.f151713w
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r4.f151713w = r0
            goto L1a
        L13:
            hek.a r4 = new hek.a
            gim.c r5 = (gim.c) r5
            r4.<init>(r3, r5)
        L1a:
            java.lang.Object r5 = r4.u
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r4.f151713w
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            yhm.o.b(r5)
            goto L43
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            yhm.o.b(r5)
            lek.a r5 = r3.f151715b
            pfm.z r5 = r5.a()
            r4.f151713w = r2
            java.lang.Object r5 = nim.a.b(r5, r4)
            if (r5 != r0) goto L43
            return r0
        L43:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r4 = r5.booleanValue()
            r5 = 0
            if (r4 == 0) goto L54
            q06.h r4 = new q06.h
            com.revolut.retail.feature.pod_nominees.api.navigation.PodNomineesDestination r0 = com.revolut.retail.feature.pod_nominees.api.navigation.PodNomineesDestination.f102578a
            r4.<init>(r0, r5)
            return r4
        L54:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: hek.b.e(jf0.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // jf0.d
    public final d0 f(c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        i iVar = new i(this.f151715b.a(), new k(new h56.a(this, 29), 12), 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return iVar;
    }
}

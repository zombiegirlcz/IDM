package dfj;

import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class j implements bej.a {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final long f114002g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final he2.b f114003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final cej.a f114004b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final oej.c f114005c;
    public final v2 d;
    public final oej.a e;
    public final kej.d f;

    static {
        b.Companion companion = kotlin.time.b.INSTANCE;
        f114002g = kotlin.time.c.g(5, pkm.e.SECONDS);
    }

    public j(he2.b esimApnFeatureToggleInteractor, cej.a esimAvailabilityInteractor, oej.c esimInstallationInteractor, v2 esimProfilesInteractor, oej.a esimCoreInteractor, kej.d esimApnConfigurator) {
        Intrinsics.checkNotNullParameter(esimApnFeatureToggleInteractor, "esimApnFeatureToggleInteractor");
        Intrinsics.checkNotNullParameter(esimAvailabilityInteractor, "esimAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(esimInstallationInteractor, "esimInstallationInteractor");
        Intrinsics.checkNotNullParameter(esimProfilesInteractor, "esimProfilesInteractor");
        Intrinsics.checkNotNullParameter(esimCoreInteractor, "esimCoreInteractor");
        Intrinsics.checkNotNullParameter(esimApnConfigurator, "esimApnConfigurator");
        this.f114003a = esimApnFeatureToggleInteractor;
        this.f114004b = esimAvailabilityInteractor;
        this.f114005c = esimInstallationInteractor;
        this.d = esimProfilesInteractor;
        this.e = esimCoreInteractor;
        this.f = esimApnConfigurator;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(int r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof dfj.c
            if (r0 == 0) goto L13
            r0 = r6
            dfj.c r0 = (dfj.c) r0
            int r1 = r0.f113925x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f113925x = r1
            goto L18
        L13:
            dfj.c r0 = new dfj.c
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f113925x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            int r5 = r0.u
            yhm.o.b(r6)
            goto L43
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r6)
            r0.u = r5
            r0.f113925x = r3
            oej.a r6 = r4.e
            oej.b r6 = (oej.b) r6
            java.util.ArrayList r6 = r6.b()
            if (r6 != r1) goto L43
            return r1
        L43:
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r6 = r6.iterator()
        L49:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L5b
            java.lang.Object r0 = r6.next()
            r1 = r0
            pej.c r1 = (pej.c) r1
            int r1 = r1.f235384a
            if (r1 != r5) goto L49
            return r0
        L5b:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: dfj.j.a(int, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(int r7, gim.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof dfj.i
            if (r0 == 0) goto L13
            r0 = r8
            dfj.i r0 = (dfj.i) r0
            int r1 = r0.f113994y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f113994y = r1
            goto L18
        L13:
            dfj.i r0 = new dfj.i
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f113992w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f113994y
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L43
            if (r2 == r5) goto L3d
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            yhm.o.b(r8)
            return r8
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            int r7 = r0.u
            pej.c r2 = r0.v
            yhm.o.b(r8)
            goto L8d
        L3d:
            int r7 = r0.u
            yhm.o.b(r8)
            goto L66
        L43:
            yhm.o.b(r8)
            he2.b r8 = r6.f114003a
            boolean r8 = r8.d()
            if (r8 != 0) goto L5b
            kej.b r7 = new kej.b
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "Failed to update APN: updating config support is disabled"
            r8.<init>(r0)
            r7.<init>(r8)
            return r7
        L5b:
            r0.u = r7
            r0.f113994y = r5
            java.lang.Object r8 = r6.a(r7, r0)
            if (r8 != r1) goto L66
            goto Lab
        L66:
            r2 = r8
            pej.c r2 = (pej.c) r2
            if (r2 != 0) goto L7c
            kej.b r8 = new kej.b
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Failed to update APN: no active eSIM for given subscription id: "
            java.lang.String r7 = a0.d.n(r1, r7)
            r0.<init>(r7)
            r8.<init>(r0)
            return r8
        L7c:
            java.lang.String r8 = r2.f235385b
            r0.v = r2
            r0.u = r7
            r0.f113994y = r4
            dfj.v2 r4 = r6.d
            java.lang.Object r8 = r4.c(r8, r0)
            if (r8 != r1) goto L8d
            goto Lab
        L8d:
            com.revolut.retail.feature.esim.api.model.EsimProfile r8 = (com.revolut.retail.feature.esim.api.model.EsimProfile) r8
            if (r8 == 0) goto Lad
            com.revolut.retail.feature.esim.api.model.EsimProfileApn r8 = r8.i
            if (r8 != 0) goto L96
            goto Lad
        L96:
            kej.a r8 = do3.q.G(r8)
            r4 = 0
            r0.v = r4
            r0.u = r7
            r0.f113994y = r3
            kej.d r7 = r6.f
            kej.f r7 = (kej.f) r7
            java.lang.Object r7 = r7.a(r8, r2, r0)
            if (r7 != r1) goto Lac
        Lab:
            return r1
        Lac:
            return r7
        Lad:
            kej.b r8 = new kej.b
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Failed to update APN: no cached APN config for given subscription id: "
            java.lang.String r7 = a0.d.n(r1, r7)
            r0.<init>(r7)
            r8.<init>(r0)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: dfj.j.b(int, gim.c):java.lang.Object");
    }
}

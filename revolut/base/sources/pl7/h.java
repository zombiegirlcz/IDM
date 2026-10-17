package pl7;

import efm.d0;
import kotlin.jvm.internal.Intrinsics;
import skm.p0;
import sri.m;
import te0.w;
import wp5.y;

/* JADX INFO: loaded from: classes4.dex */
public final class h implements gl7.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rl7.e f237285a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f237286b;

    public h(rl7.e insuranceCarInteractor, m navigator) {
        Intrinsics.checkNotNullParameter(insuranceCarInteractor, "insuranceCarInteractor");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f237285a = insuranceCarInteractor;
        this.f237286b = navigator;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(pl7.h r5, com.revolut.feature.insurance_car.api.navigation.a r6, gim.c r7) {
        /*
            boolean r0 = r7 instanceof pl7.c
            if (r0 == 0) goto L13
            r0 = r7
            pl7.c r0 = (pl7.c) r0
            int r1 = r0.f237279x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f237279x = r1
            goto L18
        L13:
            pl7.c r0 = new pl7.c
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f237279x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            com.revolut.feature.insurance_car.api.navigation.a r6 = r0.u
            yhm.o.b(r7)
            goto L59
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r7)
            r0.u = r6
            r0.f237279x = r3
            rl7.e r7 = r5.f237285a
            kw7.c r7 = r7.f254928c
            gw7.a r2 = gw7.a.CAR_INSURANCE
            akg.n r7 = r7.a(r2)
            zfd.e r7 = zi0.c.w(r7)
            rhj.m r2 = new rhj.m
            r4 = 15
            r2.<init>(r4)
            r4 = 0
            jhi.b r7 = mo3.a.g(r7, r4, r2, r3)
            java.lang.Object r7 = vkm.q.x(r7, r0)
            if (r7 != r1) goto L59
            return r1
        L59:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L94
            java.util.List r6 = r6.f75160b
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r7 = new java.util.ArrayList
            r0 = 10
            int r0 = zhm.w.t(r6, r0)
            r7.<init>(r0)
            java.util.Iterator r6 = r6.iterator()
        L74:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L89
            java.lang.Object r0 = r6.next()
            com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig r0 = (com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig) r0
            com.revolut.retail.core.navigation.FeatureCommand r1 = new com.revolut.retail.core.navigation.FeatureCommand
            r1.<init>(r0)
            r7.add(r1)
            goto L74
        L89:
            com.revolut.retail.core.navigation.CompositeCommand r6 = new com.revolut.retail.core.navigation.CompositeCommand
            r6.<init>(r7)
            sri.m r5 = r5.f237286b
            r5.c(r6)
            goto L95
        L94:
            r3 = 0
        L95:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: pl7.h.b(pl7.h, com.revolut.feature.insurance_car.api.navigation.a, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0072, code lost:
    
        if (r1 == r4) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(pl7.h r17, gim.c r18) {
        /*
            Method dump skipped, instruction units count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pl7.h.c(pl7.h, gim.c):java.lang.Object");
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c cVar) {
        return y.D(cVar, "deeplink", 1, "car-insurance");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(gim.c r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof pl7.b
            if (r0 == 0) goto L13
            r0 = r7
            pl7.b r0 = (pl7.b) r0
            int r1 = r0.f237277w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f237277w = r1
            goto L18
        L13:
            pl7.b r0 = new pl7.b
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f237277w
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L30
            if (r2 != r4) goto L28
            yhm.o.b(r7)
            goto L67
        L28:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L30:
            yhm.o.b(r7)
            rl7.e r7 = r6.f237285a
            ll7.a r2 = r7.f254926a
            ll7.h r2 = (ll7.h) r2
            w4l.f r2 = r2.f196635h
            kotlin.Unit r5 = kotlin.Unit.f186387a
            efm.r r2 = r2.f(r5, r3)
            vkm.d r2 = rd0.e.b(r2)
            ll7.v r7 = r7.f254927b
            vkm.d r7 = ll7.v.d(r7)
            t38.e r7 = zh9.u0.m(r2, r7)
            rj7.b r2 = new rj7.b
            r5 = 23
            r2.<init>(r5)
            akg.n r7 = nim.a.v(r7, r2)
            zfd.e r7 = zi0.c.w(r7)
            r0.f237277w = r4
            java.lang.Object r7 = vkm.q.x(r7, r0)
            if (r7 != r1) goto L67
            return r1
        L67:
            com.revolut.data.model.Data r7 = (com.revolut.data.model.Data) r7
            java.lang.Object r7 = r7.getContent()
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            if (r7 == 0) goto L75
            boolean r3 = r7.booleanValue()
        L75:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r3)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: pl7.h.d(gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a5, code lost:
    
        if (r12 == r1) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // q06.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(jf0.c r11, kotlin.coroutines.Continuation r12) {
        /*
            Method dump skipped, instruction units count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pl7.h.e(jf0.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // jf0.d
    public final d0 f(jf0.c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        return w.o0(p0.f264003c, new f(this, deeplink, null));
    }
}

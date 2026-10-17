package yke;

import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerInnerConfiguration;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerNavigationId;
import com.revolut.retail.core.navigation.FeatureCommand;
import efm.d0;
import kotlin.jvm.internal.Intrinsics;
import skm.p0;
import sri.m;
import te0.w;
import wp5.y;
import ybl.i;
import yg6.v;

/* JADX INFO: loaded from: classes8.dex */
public final class h implements jke.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f314614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f314615b;

    public h(m navigator, nlh.b wealthTradeCommandProvider, i productAvailabilityInteractor) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(wealthTradeCommandProvider, "wealthTradeCommandProvider");
        Intrinsics.checkNotNullParameter(productAvailabilityInteractor, "productAvailabilityInteractor");
        this.f314614a = navigator;
        this.f314615b = productAvailabilityInteractor;
    }

    public static FeatureCommand b() {
        return new FeatureCommand(new MainScreenFeatureConfig.WithInnerConfiguration(s49.a.SINGLE_TOP, new MainContainerInnerConfiguration(new MainContainerNavigationId.NewMainScreenContainerTabId(ibb.c.f160141b.f83420a, null), null, null, 6)));
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c cVar) {
        return y.D(cVar, "deeplink", 1, "trading") && Intrinsics.f(cVar.e(2), "trade");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(gim.c r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof yke.d
            if (r0 == 0) goto L13
            r0 = r10
            yke.d r0 = (yke.d) r0
            int r1 = r0.f314610w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f314610w = r1
            goto L18
        L13:
            yke.d r0 = new yke.d
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f314610w
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L37
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            yhm.o.b(r10)
            return r10
        L2b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L33:
            yhm.o.b(r10)
            goto L71
        L37:
            yhm.o.b(r10)
            ybl.i r10 = r9.f314615b
            ael.h0 r10 = (ael.h0) r10
            akg.n r10 = r10.d()
            yjj.j r2 = new yjj.j
            r6 = 5
            r2.<init>(r6)
            akg.n r10 = nim.a.v(r10, r2)
            zhm.h0 r2 = zhm.h0.f322473a
            vkm.q0 r10 = rd0.e.n(r10, r2)
            yjh.b0 r6 = new yjh.b0
            r7 = 5
            r6.<init>(r7)
            jhi.b r10 = mo3.a.g(r10, r5, r6, r4)
            x18.c r6 = new x18.c
            r7 = 3
            r8 = 24
            r6.<init>(r7, r8, r5)
            vkm.y r10 = rd0.e.e(r10, r2, r6)
            r0.f314610w = r4
            java.lang.Object r10 = vkm.q.x(r10, r0)
            if (r10 != r1) goto L71
            goto L83
        L71:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L85
            sih.b r10 = sih.b.MUTUAL_FUNDS
            r0.f314610w = r3
            java.lang.Object r10 = r9.g(r10, r0)
            if (r10 != r1) goto L84
        L83:
            return r1
        L84:
            return r10
        L85:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: yke.h.c(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(gim.c r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof yke.e
            if (r0 == 0) goto L13
            r0 = r10
            yke.e r0 = (yke.e) r0
            int r1 = r0.f314611w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f314611w = r1
            goto L18
        L13:
            yke.e r0 = new yke.e
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f314611w
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L37
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            yhm.o.b(r10)
            return r10
        L2b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L33:
            yhm.o.b(r10)
            goto L71
        L37:
            yhm.o.b(r10)
            ybl.i r10 = r9.f314615b
            ael.h0 r10 = (ael.h0) r10
            akg.n r10 = r10.d()
            yjj.j r2 = new yjj.j
            r6 = 4
            r2.<init>(r6)
            akg.n r10 = nim.a.v(r10, r2)
            zhm.h0 r2 = zhm.h0.f322473a
            vkm.q0 r10 = rd0.e.n(r10, r2)
            yjh.b0 r6 = new yjh.b0
            r7 = 4
            r6.<init>(r7)
            jhi.b r10 = mo3.a.g(r10, r5, r6, r4)
            x18.c r6 = new x18.c
            r7 = 3
            r8 = 25
            r6.<init>(r7, r8, r5)
            vkm.y r10 = rd0.e.e(r10, r2, r6)
            r0.f314611w = r4
            java.lang.Object r10 = vkm.q.x(r10, r0)
            if (r10 != r1) goto L71
            goto L83
        L71:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L85
            sih.b r10 = sih.b.PRIVATE_MARKETS
            r0.f314611w = r3
            java.lang.Object r10 = r9.g(r10, r0)
            if (r10 != r1) goto L84
        L83:
            return r1
        L84:
            return r10
        L85:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: yke.h.d(gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x007b, code lost:
    
        if (r6 == r1) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0096, code lost:
    
        if (r6 == r1) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b0, code lost:
    
        if (r6 == r1) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00cb, code lost:
    
        if (r6 == r1) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00e4, code lost:
    
        if (r6 == r1) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00fd, code lost:
    
        if (r6 == r1) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0113, code lost:
    
        if (r6 == r1) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x012b, code lost:
    
        if (r6 == r1) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0143, code lost:
    
        if (r6 == r1) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0145, code lost:
    
        return r1;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x014a  */
    @Override // q06.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(jf0.c r5, kotlin.coroutines.Continuation r6) {
        /*
            Method dump skipped, instruction units count: 414
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yke.h.e(jf0.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // jf0.d
    public final d0 f(jf0.c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        p0 p0Var = p0.f264001a;
        return w.o0(elm.f.f127540b, new v(deeplink, this, null, 5));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(sih.b r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof yke.f
            if (r0 == 0) goto L13
            r0 = r6
            yke.f r0 = (yke.f) r0
            int r1 = r0.f314612w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f314612w = r1
            goto L18
        L13:
            yke.f r0 = new yke.f
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f314612w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L3b
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            r0.f314612w = r3
            com.revolut.feature.wealth.ui.api.navigation.trade.WealthTradeRedesignDestination r6 = nlh.b.a(r5)
            if (r6 != r1) goto L3b
            return r1
        L3b:
            com.revolut.kompot.bridge.navigation.KompotDestination r6 = (com.revolut.kompot.bridge.navigation.KompotDestination) r6
            if (r6 == 0) goto L44
            com.revolut.retail.core.navigation.FeatureCommand r5 = zh9.u0.f(r6)
            return r5
        L44:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: yke.h.g(sih.b, gim.c):java.lang.Object");
    }
}

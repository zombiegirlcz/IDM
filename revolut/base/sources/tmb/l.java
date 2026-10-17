package tmb;

import kotlin.jvm.internal.Intrinsics;
import wli.x;
import yji.n;

/* JADX INFO: loaded from: classes6.dex */
public final class l extends n implements i {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final j60.a f272182l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final pmb.k f272183m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final mre.c f272184n;
    public final x o;

    public l(j60.a bottomDialogExtension, pmb.k dialogModelProvider, mre.c termsNavigationFactory, x deeplinkHandler) {
        Intrinsics.checkNotNullParameter(bottomDialogExtension, "bottomDialogExtension");
        Intrinsics.checkNotNullParameter(dialogModelProvider, "dialogModelProvider");
        Intrinsics.checkNotNullParameter(termsNavigationFactory, "termsNavigationFactory");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        this.f272182l = bottomDialogExtension;
        this.f272183m = dialogModelProvider;
        this.f272184n = termsNavigationFactory;
        this.o = deeplinkHandler;
    }

    public final void Z2(h event) {
        Intrinsics.checkNotNullParameter(event, "event");
        T2(new tgk.f(this, event, null, 17), new yi5.b(27));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b3(ufm.i r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof tmb.k
            if (r0 == 0) goto L13
            r0 = r6
            tmb.k r0 = (tmb.k) r0
            int r1 = r0.f272181x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f272181x = r1
            goto L18
        L13:
            tmb.k r0 = new tmb.k
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f272181x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            tmb.l r5 = r0.u
            yhm.o.b(r6)
            goto L40
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r6)
            r0.u = r4
            r0.f272181x = r3
            java.lang.Object r6 = nim.a.b(r5, r0)
            if (r6 != r1) goto L3f
            return r1
        L3f:
            r5 = r4
        L40:
            com.revolut.retail.core.navigation.NaviCommand r6 = (com.revolut.retail.core.navigation.NaviCommand) r6
            com.revolut.kompot.bridge.navigation.BridgeDestination r0 = new com.revolut.kompot.bridge.navigation.BridgeDestination
            r0.<init>(r6)
            r5.A2(r0)
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: tmb.l.b3(ufm.i, gim.c):java.lang.Object");
    }
}

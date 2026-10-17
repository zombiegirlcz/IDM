package nze;

import com.revolut.feature.topup_screen.impl.flows.topup_flows.mandate.MandateTopupFlowContract$InputData;
import com.revolut.feature.topup_screen.impl.flows.topup_flows.mandate.MandateTopupFlowContract$Step;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import xg6.x;
import zhm.f0;
import zhm.h0;

/* JADX INFO: loaded from: classes8.dex */
public final class t extends oki.h implements k {
    public final MandateTopupFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final fye.b f221043p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final mp.p f221044q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final gye.a f221045r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final j60.a f221046s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final x f221047t;
    public final yki.a u;

    public t(MandateTopupFlowContract$InputData inputData, fye.b mandateTopupActionExecutor, mp.p mandateOneOffActionExecutor, gye.a mandateLimitsDialogProvider, j60.a bottomDialogExtension, x mandateInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(mandateTopupActionExecutor, "mandateTopupActionExecutor");
        Intrinsics.checkNotNullParameter(mandateOneOffActionExecutor, "mandateOneOffActionExecutor");
        Intrinsics.checkNotNullParameter(mandateLimitsDialogProvider, "mandateLimitsDialogProvider");
        Intrinsics.checkNotNullParameter(bottomDialogExtension, "bottomDialogExtension");
        Intrinsics.checkNotNullParameter(mandateInteractor, "mandateInteractor");
        this.o = inputData;
        this.f221043p = mandateTopupActionExecutor;
        this.f221044q = mandateOneOffActionExecutor;
        this.f221045r = mandateLimitsDialogProvider;
        this.f221046s = bottomDialogExtension;
        this.f221047t = mandateInteractor;
        nz7.g gVar = new nz7.g(3);
        this.u = cp5.d.a(this, MandateTopupFlowContract$Step.f91006a, f0.f322471a, gVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(nze.t r7, gim.c r8) {
        /*
            boolean r0 = r8 instanceof nze.s
            if (r0 == 0) goto L13
            r0 = r8
            nze.s r0 = (nze.s) r0
            int r1 = r0.f221042w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f221042w = r1
            goto L18
        L13:
            nze.s r0 = new nze.s
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f221042w
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L28
            yhm.o.b(r8)
            goto Lad
        L28:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L30:
            yhm.o.b(r8)
            mp.p r8 = r7.f221044q
            nze.b r2 = new nze.b
            com.revolut.feature.topup_screen.impl.flows.topup_flows.mandate.MandateTopupFlowContract$InputData r4 = r7.o
            dj0.d r5 = r4.f91003a
            java.lang.String r6 = r4.f91004b
            com.revolut.domain.models.topup.TopUpContext r4 = r4.f91005c
            r2.<init>(r5, r6, r4)
            r8.getClass()
            java.lang.String r4 = "action"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r4)
            java.lang.Object r4 = r8.f207709b
            xg6.x r4 = (xg6.x) r4
            vkm.d r4 = xg6.x.b(r4, r6)
            kotlin.coroutines.g r5 = kotlin.coroutines.g.f186406a
            efm.r r4 = rd0.e.c(r4, r5)
            fv0.c r5 = new fv0.c
            r6 = 18
            r5.<init>(r6)
            r6 = 0
            efm.r r4 = m70.a.g(r4, r6, r5, r3)
            efm.d0 r4 = r4.firstOrError()
            fye.a r5 = fye.a.f
            dug.e r5 = new dug.e
            r6 = 22
            r5.<init>(r6)
            r4.getClass()
            ufm.i r6 = new ufm.i
            r6.<init>(r4, r5, r3)
            fpk.b r4 = new fpk.b
            r5 = 20
            r4.<init>(r8, r2, r5)
            fwj.h r2 = new fwj.h
            r5 = 7
            r2.<init>(r4, r5)
            ufm.i r4 = new ufm.i
            r5 = 0
            r4.<init>(r6, r2, r5)
            fs2.k r2 = new fs2.k
            r5 = 24
            r2.<init>(r8, r5)
            fwj.h r8 = new fwj.h
            r5 = 8
            r8.<init>(r2, r5)
            ufm.i r2 = new ufm.i
            r2.<init>(r4, r8, r3)
            java.lang.String r8 = "map(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r8)
            r0.f221042w = r3
            java.lang.Object r8 = nim.a.b(r2, r0)
            if (r8 != r1) goto Lad
            return r1
        Lad:
            com.revolut.retail.core.navigation.NaviCommand r8 = (com.revolut.retail.core.navigation.NaviCommand) r8
            nze.n r0 = new nze.n
            kotlin.jvm.internal.Intrinsics.h(r8)
            r0.<init>(r8)
            r7.C2(r0)
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: nze.t.I2(nze.t, gim.c):java.lang.Object");
    }

    @Override // yji.l
    public final void I1() {
        l2(new q(this, null, 0), new yi5.b(26));
    }

    @Override // yji.l
    public final boolean o1(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, throwable, h0Var);
        C2(new m(throwable));
        return true;
    }

    @Override // yki.g
    public final yki.b s() {
        return this.u;
    }
}

package unc;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.robo.impl.ui.screen.spare_change.PortfolioSpareChangeScreenContract$DomainState;
import com.revolut.feature.robo.impl.ui.screen.spare_change.PortfolioSpareChangeScreenContract$Input;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b0 extends oki.h implements dli.b {
    public final PortfolioSpareChangeScreenContract$Input o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final p f281389p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final j60.a f281390q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final qmc.h f281391r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final tul.b f281392s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final xvh.c f281393t;
    public final x8h.k u;
    public final cli.y v;

    public b0(kxk.o mapper, PortfolioSpareChangeScreenContract$Input input, p dialogMapper, j60.a bottomExpandableDialogControllerExtension, qmc.h portfolioInfoProvider, tul.b portfolioSpareChangeProvider, xvh.c autoInvestInteractor, x8h.k displayCurrencyInteractor) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(dialogMapper, "dialogMapper");
        Intrinsics.checkNotNullParameter(bottomExpandableDialogControllerExtension, "bottomExpandableDialogControllerExtension");
        Intrinsics.checkNotNullParameter(portfolioInfoProvider, "portfolioInfoProvider");
        Intrinsics.checkNotNullParameter(portfolioSpareChangeProvider, "portfolioSpareChangeProvider");
        Intrinsics.checkNotNullParameter(autoInvestInteractor, "autoInvestInteractor");
        Intrinsics.checkNotNullParameter(displayCurrencyInteractor, "displayCurrencyInteractor");
        this.o = input;
        this.f281389p = dialogMapper;
        this.f281390q = bottomExpandableDialogControllerExtension;
        this.f281391r = portfolioInfoProvider;
        this.f281392s = portfolioSpareChangeProvider;
        this.f281393t = autoInvestInteractor;
        this.u = displayCurrencyInteractor;
        this.v = mra.d.b(this, new PortfolioSpareChangeScreenContract$DomainState(0), mapper, null, false, 12);
    }

    public static final void I2(b0 b0Var, TextLocalisedClause textLocalisedClause) {
        b0Var.X1(new mii.k("SPARE_CHANGE_SHOT_MESSAGE_ID", textLocalisedClause, null, null, null, 28));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object J2(unc.b0 r5, vnc.b r6, kotlin.jvm.functions.Function1 r7, gim.c r8) {
        /*
            cli.y r0 = r5.v
            boolean r1 = r8 instanceof unc.a0
            if (r1 == 0) goto L15
            r1 = r8
            unc.a0 r1 = (unc.a0) r1
            int r2 = r1.f281388w
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f281388w = r2
            goto L1a
        L15:
            unc.a0 r1 = new unc.a0
            r1.<init>(r5, r8)
        L1a:
            java.lang.Object r8 = r1.u
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r1.f281388w
            r4 = 1
            if (r3 == 0) goto L33
            if (r3 != r4) goto L2b
            yhm.o.b(r8)     // Catch: java.lang.Throwable -> L29
            goto L48
        L29:
            r6 = move-exception
            goto L53
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            yhm.o.b(r8)
            um7.d r8 = new um7.d     // Catch: java.lang.Throwable -> L29
            r3 = 7
            r8.<init>(r6, r3)     // Catch: java.lang.Throwable -> L29
            r5.H2(r0, r8)     // Catch: java.lang.Throwable -> L29
            r1.f281388w = r4     // Catch: java.lang.Throwable -> L29
            java.lang.Object r8 = r7.invoke(r1)     // Catch: java.lang.Throwable -> L29
            if (r8 != r2) goto L48
            return r2
        L48:
            umc.c r6 = new umc.c
            r7 = 10
            r6.<init>(r7)
            r5.H2(r0, r6)
            return r8
        L53:
            umc.c r7 = new umc.c
            r8 = 10
            r7.<init>(r8)
            r5.H2(r0, r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: unc.b0.J2(unc.b0, vnc.b, kotlin.jvm.functions.Function1, gim.c):java.lang.Object");
    }

    @Override // yji.l
    public final void I1() {
        PortfolioSpareChangeScreenContract$Input portfolioSpareChangeScreenContract$Input = this.o;
        String portfolioId = portfolioSpareChangeScreenContract$Input.f85206a;
        tul.b bVar = this.f281392s;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        Continuation continuation = null;
        akg.n nVarV = nim.a.v(rd0.e.b(xvh.c.c((xvh.c) bVar.f274637b, null, w4l.h.f294642c, 1)), new te8.a(portfolioId, 29));
        yji.l.a1(this, nVarV, null, null, new z(this, continuation, 0), 3);
        yji.l.a1(this, vkm.q.P(mo3.a.g(nVarV, null, new uj8.j(22), 1), 1), null, null, new z(this, continuation, 1), 3);
        yji.l.a1(this, glc.a.a(this.f281391r, portfolioSpareChangeScreenContract$Input.f85206a), null, null, new z(this, continuation, 2), 3);
        yji.l.a1(this, this.u.b(), null, null, new z(this, continuation, 3), 3);
    }

    public final void K2() {
        C2(aii.q.f5292a);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.v;
    }
}

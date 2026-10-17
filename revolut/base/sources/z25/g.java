package z25;

import com.revolut.feature.pay_later.api.PayLaterApi$Toggles;
import com.revolut.feature.pay_later.api.navigation.PayLaterKompotFeatureConfig;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import sfe.h;
import sfe.i;
import sfe.j;
import sfe.k;
import sfe.l;
import sfe.m;
import sfe.o;
import sfe.p;
import sfe.q;
import sfe.r;
import sfe.s;
import skm.a2;
import vi9.c0;
import yji.n;
import zh9.r0;

/* JADX INFO: loaded from: classes22.dex */
public final class g extends r25.b {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final uj9.b f318964l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final j60.a f318965m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final xh9.a f318966n;
    public final di9.d o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final qi9.d f318967p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final c0 f318968q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final di9.b f318969r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final oj9.f f318970s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final di9.a f318971t;
    public final com.revolut.domain.interactors.transactions.a u;
    public final gte.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public a2 f318972w;

    public g(uj9.b payLaterExplainerDialogMapper, j60.a bottomDialogExtension, xh9.a payLaterInteractor, di9.d payLaterToggleActionExtension, qi9.d payLaterNavigationCommandFactory, c0 payLaterPaymentTypeMapper, di9.b payLaterGetHelpExtension, oj9.f payLaterCrossSellItemMapper, di9.a payLaterCrossSellExtension, com.revolut.domain.interactors.transactions.a transactionsInteractor, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(payLaterExplainerDialogMapper, "payLaterExplainerDialogMapper");
        Intrinsics.checkNotNullParameter(bottomDialogExtension, "bottomDialogExtension");
        Intrinsics.checkNotNullParameter(payLaterInteractor, "payLaterInteractor");
        Intrinsics.checkNotNullParameter(payLaterToggleActionExtension, "payLaterToggleActionExtension");
        Intrinsics.checkNotNullParameter(payLaterNavigationCommandFactory, "payLaterNavigationCommandFactory");
        Intrinsics.checkNotNullParameter(payLaterPaymentTypeMapper, "payLaterPaymentTypeMapper");
        Intrinsics.checkNotNullParameter(payLaterGetHelpExtension, "payLaterGetHelpExtension");
        Intrinsics.checkNotNullParameter(payLaterCrossSellItemMapper, "payLaterCrossSellItemMapper");
        Intrinsics.checkNotNullParameter(payLaterCrossSellExtension, "payLaterCrossSellExtension");
        Intrinsics.checkNotNullParameter(transactionsInteractor, "transactionsInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f318964l = payLaterExplainerDialogMapper;
        this.f318965m = bottomDialogExtension;
        this.f318966n = payLaterInteractor;
        this.o = payLaterToggleActionExtension;
        this.f318967p = payLaterNavigationCommandFactory;
        this.f318968q = payLaterPaymentTypeMapper;
        this.f318969r = payLaterGetHelpExtension;
        this.f318970s = payLaterCrossSellItemMapper;
        this.f318971t = payLaterCrossSellExtension;
        this.u = transactionsInteractor;
        this.v = featureToggleInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object e3(z25.g r4, gim.c r5) {
        /*
            boolean r0 = r5 instanceof z25.a
            if (r0 == 0) goto L13
            r0 = r5
            z25.a r0 = (z25.a) r0
            int r1 = r0.f318959w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f318959w = r1
            goto L18
        L13:
            z25.a r0 = new z25.a
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f318959w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L50
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            yhm.o.b(r5)
            xh9.a r4 = r4.f318966n
            w4l.h r5 = w4l.h.f294642c
            ti9.g r4 = (ti9.g) r4
            cxe.u r4 = r4.k(r5)
            z0f.a0 r5 = new z0f.a0
            r2 = 6
            r5.<init>(r2)
            r2 = 0
            jhi.b r4 = mo3.a.g(r4, r2, r5, r3)
            r0.f318959w = r3
            java.lang.Object r5 = vkm.q.x(r4, r0)
            if (r5 != r1) goto L50
            return r1
        L50:
            od0.i r5 = (od0.i) r5
            java.lang.Object r4 = r5.c()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: z25.g.e3(z25.g, gim.c):java.lang.Object");
    }

    @Override // yji.n
    public final void D2() {
        n.j2(this, rd0.e.b(this.f318965m.E()), null, new d(this, null, 0), 3);
    }

    @Override // r25.b
    public final Object b3(s sVar, Continuation continuation) {
        Continuation continuation2 = null;
        if (sVar instanceof h) {
            V2(new b(this, continuation2, 1), new yi5.b(29));
        } else if (sVar instanceof m) {
            m mVar = (m) sVar;
            g3(new yx4.b(mVar.f262419a, mVar.f262421c, null));
        } else if (sVar instanceof sfe.n) {
            yx4.a aVar = yx4.b.Companion;
            Object obj2 = ((sfe.n) sVar).f262423b;
            aVar.getClass();
            g3(yx4.a.a(obj2));
        } else {
            if (!(sVar instanceof i) && !(sVar instanceof l) && !(sVar instanceof o) && !(sVar instanceof r) && !(sVar instanceof p) && !(sVar instanceof q) && !(sVar instanceof k) && !(sVar instanceof j)) {
                throw new NoWhenBranchMatchedException();
            }
            int i = jli.h.f175850a;
        }
        return Unit.f186387a;
    }

    @Override // r25.b
    public final boolean d3(Object model) {
        Intrinsics.checkNotNullParameter(model, "model");
        yx4.b.Companion.getClass();
        return g3(yx4.a.a(model));
    }

    public final void f3(r0 r0Var) {
        if (((jte.d) this.v).c(PayLaterApi$Toggles.TransactionDetailsAsPlanDetails.f78807c)) {
            r25.b.c3(this, null, new c(this, r0Var, null), 7);
        } else {
            B2(new PayLaterKompotFeatureConfig.PlanDetailsNavigationDestination(r0Var.f322326a));
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x012a, code lost:
    
        if (r1.equals("ID_PAY_LATER_REPAY_ACTION") == false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0133, code lost:
    
        if (r1.equals("ID_PAY_LATER_REPAY_SWIPE_ACTION") == false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0136, code lost:
    
        V2(new z25.b(r25, r7, r9), new yi5.b(r6));
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:83:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0173  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean g3(yx4.b r26) {
        /*
            Method dump skipped, instruction units count: 634
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z25.g.g3(yx4.b):boolean");
    }
}

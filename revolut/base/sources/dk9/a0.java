package dk9;

import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.data.model.Data;
import com.revolut.feature.pay_later.impl.ui.plandetails.PayLaterPlanDetailsScreenContract$InputData;
import com.revolut.feature.transactions.api.navigation.TransactionsFeatureConfig;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import dce.l0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vi9.c0;
import vi9.e0;
import zh9.r0;
import zh9.s0;
import zhm.h0;

/* JADX INFO: loaded from: classes5.dex */
public final class a0 extends jki.g implements q {

    @NotNull
    public static final u Companion = new u();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final PayLaterPlanDetailsScreenContract$InputData f115462p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final xh9.a f115463q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final j60.a f115464r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e0 f115465s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final com.revolut.domain.interactors.transactions.a f115466t;
    public final c0 u;
    public final di9.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final p f115467w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(PayLaterPlanDetailsScreenContract$InputData inputData, xh9.a payLaterInteractor, j60.a bottomDialog, e0 payLaterStateDialogMapper, com.revolut.domain.interactors.transactions.a transactionsInteractor, c0 payLaterRepayItemFactory, di9.b payLaterGetHelpExtension, jki.p stateMapper) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(payLaterInteractor, "payLaterInteractor");
        Intrinsics.checkNotNullParameter(bottomDialog, "bottomDialog");
        Intrinsics.checkNotNullParameter(payLaterStateDialogMapper, "payLaterStateDialogMapper");
        Intrinsics.checkNotNullParameter(transactionsInteractor, "transactionsInteractor");
        Intrinsics.checkNotNullParameter(payLaterRepayItemFactory, "payLaterRepayItemFactory");
        Intrinsics.checkNotNullParameter(payLaterGetHelpExtension, "payLaterGetHelpExtension");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.f115462p = inputData;
        this.f115463q = payLaterInteractor;
        this.f115464r = bottomDialog;
        this.f115465s = payLaterStateDialogMapper;
        this.f115466t = transactionsInteractor;
        this.u = payLaterRepayItemFactory;
        this.v = payLaterGetHelpExtension;
        this.f115467w = new p(new Data(null, null, true, 3, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object y2(dk9.a0 r4, dj0.d r5, gim.c r6) {
        /*
            r4.getClass()
            boolean r0 = r6 instanceof dk9.x
            if (r0 == 0) goto L16
            r0 = r6
            dk9.x r0 = (dk9.x) r0
            int r1 = r0.f115488x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f115488x = r1
            goto L1b
        L16:
            dk9.x r0 = new dk9.x
            r0.<init>(r4, r6)
        L1b:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f115488x
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            dj0.d r5 = r0.u
            yhm.o.b(r6)
            goto L58
        L2c:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L34:
            yhm.o.b(r6)
            xh9.a r4 = r4.f115463q
            w4l.h r6 = w4l.h.f294642c
            ti9.g r4 = (ti9.g) r4
            efm.r r4 = r4.j(r6)
            dee.a0 r6 = new dee.a0
            r2 = 20
            r6.<init>(r2)
            r2 = 0
            efm.r r4 = m70.a.g(r4, r2, r6, r3)
            r0.u = r5
            r0.f115488x = r3
            java.lang.Object r6 = nim.a.c(r4, r0)
            if (r6 != r1) goto L58
            return r1
        L58:
            dj0.d r6 = (dj0.d) r6
            boolean r4 = r6.f(r5)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: dk9.a0.y2(dk9.a0, dj0.d, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object z2(dk9.a0 r4, gim.c r5) {
        /*
            boolean r0 = r5 instanceof dk9.y
            if (r0 == 0) goto L13
            r0 = r5
            dk9.y r0 = (dk9.y) r0
            int r1 = r0.f115489w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f115489w = r1
            goto L18
        L13:
            dk9.y r0 = new dk9.y
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f115489w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L4f
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            yhm.o.b(r5)
            xh9.a r4 = r4.f115463q
            ti9.g r4 = (ti9.g) r4
            efm.r r4 = r4.i()
            dee.a0 r5 = new dee.a0
            r2 = 21
            r5.<init>(r2)
            r2 = 0
            efm.r r4 = m70.a.g(r4, r2, r5, r3)
            r0.f115489w = r3
            java.lang.Object r5 = nim.a.c(r4, r0)
            if (r5 != r1) goto L4f
            return r1
        L4f:
            java.lang.String r4 = "awaitFirst(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r4)
            java.util.List r5 = (java.util.List) r5
            java.util.ArrayList r4 = d8l.d.k(r5)
            boolean r4 = r4.isEmpty()
            r4 = r4 ^ r3
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: dk9.a0.z2(dk9.a0, gim.c):java.lang.Object");
    }

    public final void A2(ActionsView.Item item) {
        Intrinsics.checkNotNullParameter(item, "item");
        String str = item.f58316a;
        Object obj2 = item.f58324n;
        int iHashCode = str.hashCode();
        Continuation continuation = null;
        if (iHashCode == -1748495751) {
            if (str.equals("ID_ACTION_CONSUME_PLAN_NOTIFICATION")) {
                Intrinsics.i(obj2, "null cannot be cast to non-null type kotlin.String");
                n2(new d3i.g(this, (String) obj2, continuation, 26), new whi.b(6));
                return;
            }
            return;
        }
        if (iHashCode == -418934886) {
            if (str.equals("ID_PAY_NOW_ACTION")) {
                Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.feature.pay_later.api.models.PayLaterPlan");
                n2(new w(this, (r0) obj2, continuation, 2), new whi.b(6));
                return;
            }
            return;
        }
        if (iHashCode == 1098721746 && str.equals("ID_ACTION_SEE_PURCHASE")) {
            Intrinsics.i(obj2, "null cannot be cast to non-null type kotlin.String");
            C1(new BridgeDestination(new FeatureCommand(new TransactionsFeatureConfig.Details(new k71.c((String) obj2), null, null, null, 126))));
        }
    }

    @Override // yji.l
    public final void I1() {
        ti9.g gVar = (ti9.g) this.f115463q;
        efm.r rVarW = nim.a.w(rd0.e.c(gVar.k(w4l.h.f294642c), kotlin.coroutines.g.f186406a), new dg3.d(12));
        efm.r rVarW2 = nim.a.w(gVar.i(), new dg3.d(13));
        PayLaterPlanDetailsScreenContract$InputData payLaterPlanDetailsScreenContract$InputData = this.f115462p;
        efm.r rVarR = pd.b.r(gVar.l(payLaterPlanDetailsScreenContract$InputData.f78898a), new l0(this, 17));
        String planId = payLaterPlanDetailsScreenContract$InputData.f78898a;
        Intrinsics.checkNotNullParameter(planId, "planId");
        w4l.i loadingStrategy = w4l.i.f294643c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        ej9.p pVar = (ej9.p) gVar.f271458c;
        pVar.getClass();
        Intrinsics.checkNotNullParameter(planId, "planId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        yji.l.a1(this, rd0.e.b(ue0.e.p(nim.a.w(mif.a.f(rVarW, rVarW2, rVarR, n14.k.r(pVar.f126824g.e(planId, loadingStrategy), new s0(false))), new dg3.d(14)), h0.f322473a)), null, null, new d8j.c(this, (Continuation) null, 21), 3);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f115467w;
    }
}

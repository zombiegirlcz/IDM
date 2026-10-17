package lk9;

import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.data.model.Data;
import com.revolut.feature.pay_later.impl.ui.repaymentdetails.PayLaterRepaymentDetailsScreenContract$InputData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import ljl.n1;
import org.jetbrains.annotations.NotNull;
import vi9.c0;
import vi9.e0;
import zhm.h0;

/* JADX INFO: loaded from: classes5.dex */
public final class y extends jki.g implements o, di9.a {

    @NotNull
    public static final r Companion = new r();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final PayLaterRepaymentDetailsScreenContract$InputData f196334p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final xh9.a f196335q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final whf.b f196336r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e0 f196337s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final c0 f196338t;
    public final j60.a u;
    public final di9.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final di9.a f196339w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final n f196340x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(PayLaterRepaymentDetailsScreenContract$InputData inputData, xh9.a payLaterInteractor, whf.b transactionsContentProvider, e0 payLaterStateDialogMapper, c0 payLaterRepayItemFactory, j60.a bottomDialog, di9.b payLaterGetHelpExtension, di9.a payLaterCrossSellExtension, jki.p stateMapper) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(payLaterInteractor, "payLaterInteractor");
        Intrinsics.checkNotNullParameter(transactionsContentProvider, "transactionsContentProvider");
        Intrinsics.checkNotNullParameter(payLaterStateDialogMapper, "payLaterStateDialogMapper");
        Intrinsics.checkNotNullParameter(payLaterRepayItemFactory, "payLaterRepayItemFactory");
        Intrinsics.checkNotNullParameter(bottomDialog, "bottomDialog");
        Intrinsics.checkNotNullParameter(payLaterGetHelpExtension, "payLaterGetHelpExtension");
        Intrinsics.checkNotNullParameter(payLaterCrossSellExtension, "payLaterCrossSellExtension");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.f196334p = inputData;
        this.f196335q = payLaterInteractor;
        this.f196336r = transactionsContentProvider;
        this.f196337s = payLaterStateDialogMapper;
        this.f196338t = payLaterRepayItemFactory;
        this.u = bottomDialog;
        this.v = payLaterGetHelpExtension;
        this.f196339w = payLaterCrossSellExtension;
        this.f196340x = new n(new Data(null, null, true, 3, null), null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object y2(lk9.y r4, dj0.d r5, gim.c r6) {
        /*
            boolean r0 = r6 instanceof lk9.s
            if (r0 == 0) goto L13
            r0 = r6
            lk9.s r0 = (lk9.s) r0
            int r1 = r0.f196325x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f196325x = r1
            goto L18
        L13:
            lk9.s r0 = new lk9.s
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f196325x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            dj0.d r5 = r0.u
            yhm.o.b(r6)
            goto L54
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            yhm.o.b(r6)
            xh9.a r4 = r4.f196335q
            w4l.h r6 = w4l.h.f294642c
            ti9.g r4 = (ti9.g) r4
            efm.r r4 = r4.j(r6)
            lk7.m r6 = new lk7.m
            r2 = 5
            r6.<init>(r2)
            r2 = 0
            efm.r r4 = m70.a.g(r4, r2, r6, r3)
            r0.u = r5
            r0.f196325x = r3
            java.lang.Object r6 = nim.a.c(r4, r0)
            if (r6 != r1) goto L54
            return r1
        L54:
            dj0.d r6 = (dj0.d) r6
            boolean r4 = r6.f(r5)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: lk9.y.y2(lk9.y, dj0.d, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object z2(lk9.y r4, gim.c r5) {
        /*
            boolean r0 = r5 instanceof lk9.v
            if (r0 == 0) goto L13
            r0 = r5
            lk9.v r0 = (lk9.v) r0
            int r1 = r0.f196330w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f196330w = r1
            goto L18
        L13:
            lk9.v r0 = new lk9.v
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f196330w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L4e
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            yhm.o.b(r5)
            xh9.a r4 = r4.f196335q
            ti9.g r4 = (ti9.g) r4
            efm.r r4 = r4.i()
            lk7.m r5 = new lk7.m
            r2 = 6
            r5.<init>(r2)
            r2 = 0
            efm.r r4 = m70.a.g(r4, r2, r5, r3)
            r0.f196330w = r3
            java.lang.Object r5 = nim.a.c(r4, r0)
            if (r5 != r1) goto L4e
            return r1
        L4e:
            java.lang.String r4 = "awaitFirst(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r4)
            java.util.List r5 = (java.util.List) r5
            java.util.ArrayList r4 = d8l.d.k(r5)
            boolean r4 = r4.isEmpty()
            r4 = r4 ^ r3
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: lk9.y.z2(lk9.y, gim.c):java.lang.Object");
    }

    public final void A2(ActionsView.Item item) {
        Intrinsics.checkNotNullParameter(item, "item");
        Object obj2 = item.f58324n;
        Continuation continuation = null;
        if (Intrinsics.f(item.f58316a, "ID_ACTION_CONSUME_PLAN_NOTIFICATION")) {
            Intrinsics.i(obj2, "null cannot be cast to non-null type kotlin.String");
            n2(new l34.a(this, (String) obj2, continuation, 27), new whi.b(6));
        } else if (obj2 instanceof bi9.b) {
            n2(new l34.a(this, ((bi9.b) obj2).f15447a, continuation, 28), new whi.b(6));
        }
    }

    @Override // yji.l
    public final void I1() {
        PayLaterRepaymentDetailsScreenContract$InputData payLaterRepaymentDetailsScreenContract$InputData = this.f196334p;
        String str = payLaterRepaymentDetailsScreenContract$InputData.f78916a;
        int i = payLaterRepaymentDetailsScreenContract$InputData.f78917b;
        Continuation continuation = null;
        yji.l.a1(this, this.f196339w.Y0(new ai9.e(str, i)), null, null, new w(this, continuation, 0), 3);
        ti9.g gVar = (ti9.g) this.f196335q;
        efm.r rVarW = nim.a.w(rd0.e.c(gVar.k(w4l.h.f294642c), kotlin.coroutines.g.f186406a), new n1(17));
        String planId = payLaterRepaymentDetailsScreenContract$InputData.f78916a;
        Intrinsics.checkNotNullParameter(planId, "planId");
        yji.l.a1(this, rd0.e.b(ue0.e.p(pd.b.r(kli.a.i(rVarW, nim.a.w(gVar.l(planId), new l2c.l(i, 20)), nim.a.w(gVar.i(), new n1(18))), new lk4.g(this, 3)), h0.f322473a)), null, null, new w(this, continuation, 1), 3);
    }

    @Override // di9.a
    public final Flow Y0(ai9.h slot) {
        Intrinsics.checkNotNullParameter(slot, "slot");
        return this.f196339w.Y0(slot);
    }

    @Override // di9.a
    public final void f1(ai9.b payload) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        this.f196339w.f1(payload);
    }

    @Override // di9.a
    public final void p(ai9.b payload) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        this.f196339w.p(payload);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f196340x;
    }
}

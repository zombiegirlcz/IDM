package com.revolut.feature.topup_screen.impl.flows.checkout.flow;

import android.os.Parcelable;
import b93.f;
import b93.g;
import b93.i;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.checkout.models.CheckoutParams;
import com.revolut.feature.checkout.models.ThreeDsCheckout;
import com.revolut.feature.shared.help_centre.api.faq.SharedFaqDestination;
import com.revolut.feature.topup_screen.impl.R$string;
import com.revolut.feature.topup_screen.impl.flows.checkout.flow.CheckoutFlowContract$Step;
import com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.CheckoutScreenContract$InputData;
import fmc.z;
import grl.k9;
import h93.l0;
import java.util.Set;
import jul.o;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;
import kotlinx.coroutines.flow.SharedFlow;
import nii.g0;
import nii.j1;
import nii.l1;
import nii.n1;
import nii.y0;
import oki.h;
import org.jetbrains.annotations.NotNull;
import qu4.s;
import qwe.k;
import qwe.r;
import tof.v6;
import uwe.j;
import vkm.j2;
import vkm.q;
import yji.l;
import yte.n;
import zh9.u0;
import zhm.f0;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
public final class e extends h implements qwe.b {

    @NotNull
    private static final qwe.e Companion = new qwe.e();
    public static final long O;
    public static final long P;
    public static final Set Q;
    public final qh3.b A;
    public final o B;
    public final wj0.a C;
    public final zte.b D;
    public final twe.a E;
    public final usc.a F;
    public final qq8.b G;
    public final o7.b H;
    public final xye.d I;
    public final aue.d J;
    public final com.revolut.domain.interactors.transactions.a K;
    public final qki.d L;
    public final yki.a M;
    public final n N;
    public final CheckoutFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final rwe.a f90702p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final wwe.a f90703q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final prl.e f90704r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final com.revolut.feature.topup_screen.impl.flows.topup.flow.data.h f90705s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final u51.a f90706t;
    public final z u;
    public final ph3.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final qh3.a f90707w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final sh3.a f90708x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final wsg.n f90709y;
    public final uve.c z;

    static {
        b.Companion companion = kotlin.time.b.INSTANCE;
        O = kotlin.time.c.g(2, pkm.e.SECONDS);
        P = kotlin.time.c.g(400, pkm.e.MILLISECONDS);
        v6[] elements = {v6.COMPLETED, v6.DECLINED, v6.FAILED, v6.CANCELLED, v6.REVERTED};
        Intrinsics.checkNotNullParameter(elements, "elements");
        Q = kotlin.collections.d.y0(elements);
    }

    public e(CheckoutFlowContract$InputData inputData, rwe.a checkoutSelectedExtraTopUpAmountDelegate, wwe.a checkoutSelectedTopUpMethodRelay, prl.e checkoutDefaultTopUpMethodProvider, com.revolut.feature.topup_screen.impl.flows.topup.flow.data.h selectedMethodMapper, u51.a topUpMethodsInteractor, z newCardDataMethodMapper, ph3.b checkoutNavigationFactory, qh3.a createCheckoutExtension, sh3.a checkoutInteractor, wsg.n walletInteractor, uve.c freelancerTopUpInteractor, qh3.b japaneseCardRestrictionExtension, o checkoutTopUpDialogProvider, wj0.a idempotencyKeyHolder, zte.b cardPaymentsTopUpDialogs, twe.a checkoutTargetMapper, usc.a juniorCheckoutDialogProvider, qq8.b juniorTransferInteractor, o7.b topUpLimitsErrorInteractor, xye.d topUpLimitsControllerInputFactory, aue.d topUpLimitUiModelMapper, com.revolut.domain.interactors.transactions.a transactionsInteractor) {
        n nVar;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(checkoutSelectedExtraTopUpAmountDelegate, "checkoutSelectedExtraTopUpAmountDelegate");
        Intrinsics.checkNotNullParameter(checkoutSelectedTopUpMethodRelay, "checkoutSelectedTopUpMethodRelay");
        Intrinsics.checkNotNullParameter(checkoutDefaultTopUpMethodProvider, "checkoutDefaultTopUpMethodProvider");
        Intrinsics.checkNotNullParameter(selectedMethodMapper, "selectedMethodMapper");
        Intrinsics.checkNotNullParameter(topUpMethodsInteractor, "topUpMethodsInteractor");
        Intrinsics.checkNotNullParameter(newCardDataMethodMapper, "newCardDataMethodMapper");
        Intrinsics.checkNotNullParameter(checkoutNavigationFactory, "checkoutNavigationFactory");
        Intrinsics.checkNotNullParameter(createCheckoutExtension, "createCheckoutExtension");
        Intrinsics.checkNotNullParameter(checkoutInteractor, "checkoutInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(freelancerTopUpInteractor, "freelancerTopUpInteractor");
        Intrinsics.checkNotNullParameter(japaneseCardRestrictionExtension, "japaneseCardRestrictionExtension");
        Intrinsics.checkNotNullParameter(checkoutTopUpDialogProvider, "checkoutTopUpDialogProvider");
        Intrinsics.checkNotNullParameter(idempotencyKeyHolder, "idempotencyKeyHolder");
        Intrinsics.checkNotNullParameter(cardPaymentsTopUpDialogs, "cardPaymentsTopUpDialogs");
        Intrinsics.checkNotNullParameter(checkoutTargetMapper, "checkoutTargetMapper");
        Intrinsics.checkNotNullParameter(juniorCheckoutDialogProvider, "juniorCheckoutDialogProvider");
        Intrinsics.checkNotNullParameter(juniorTransferInteractor, "juniorTransferInteractor");
        Intrinsics.checkNotNullParameter(topUpLimitsErrorInteractor, "topUpLimitsErrorInteractor");
        Intrinsics.checkNotNullParameter(topUpLimitsControllerInputFactory, "topUpLimitsControllerInputFactory");
        Intrinsics.checkNotNullParameter(topUpLimitUiModelMapper, "topUpLimitUiModelMapper");
        Intrinsics.checkNotNullParameter(transactionsInteractor, "transactionsInteractor");
        this.o = inputData;
        this.f90702p = checkoutSelectedExtraTopUpAmountDelegate;
        this.f90703q = checkoutSelectedTopUpMethodRelay;
        this.f90704r = checkoutDefaultTopUpMethodProvider;
        this.f90705s = selectedMethodMapper;
        this.f90706t = topUpMethodsInteractor;
        this.u = newCardDataMethodMapper;
        this.v = checkoutNavigationFactory;
        this.f90707w = createCheckoutExtension;
        this.f90708x = checkoutInteractor;
        this.f90709y = walletInteractor;
        this.z = freelancerTopUpInteractor;
        this.A = japaneseCardRestrictionExtension;
        this.B = checkoutTopUpDialogProvider;
        this.C = idempotencyKeyHolder;
        this.D = cardPaymentsTopUpDialogs;
        this.E = checkoutTargetMapper;
        this.F = juniorCheckoutDialogProvider;
        this.G = juniorTransferInteractor;
        this.H = topUpLimitsErrorInteractor;
        this.I = topUpLimitsControllerInputFactory;
        this.J = topUpLimitUiModelMapper;
        this.K = transactionsInteractor;
        qki.d dVarB = hx7.e.b(this, new CheckoutFlowContract$State(inputData.f90668a));
        this.L = dVarB;
        this.M = cp5.d.a(this, new CheckoutFlowContract$Step.Checkout(new CheckoutScreenContract$InputData(inputData.f90668a, inputData.f90669b, inputData.f90670c, inputData.d, inputData.e, checkoutTargetMapper.a(inputData))), f0.f322471a, new qm2.c(this, 15));
        if (inputData.f90669b instanceof ThreeDsCheckout) {
            nVar = n.THREE_DS;
        } else {
            CheckoutParams checkoutParams = ((CheckoutFlowContract$State) ((j2) dVarB.f22677a).getValue()).f90671a;
            CheckoutParams.CardOrder cardOrder = checkoutParams instanceof CheckoutParams.CardOrder ? (CheckoutParams.CardOrder) checkoutParams : null;
            f fVar = cardOrder != null ? cardOrder.f65850a : null;
            g gVar = fVar instanceof g ? (g) fVar : null;
            nVar = (gVar != null ? i.a(gVar) : null) == l0.INDIA_GLOBAL ? n.CARD_CHECKOUT_IND_GLOBAL : n.CARD_CHECKOUT;
        }
        this.N = nVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.io.Serializable I2(com.revolut.feature.topup_screen.impl.flows.checkout.flow.e r5, gim.c r6) {
        /*
            boolean r0 = r6 instanceof qwe.i
            if (r0 == 0) goto L13
            r0 = r6
            qwe.i r0 = (qwe.i) r0
            int r1 = r0.f249897w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f249897w = r1
            goto L18
        L13:
            qwe.i r0 = new qwe.i
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f249897w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L53
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            com.revolut.feature.topup_screen.impl.flows.checkout.flow.CheckoutFlowContract$InputData r6 = r5.o
            com.revolut.feature.checkout.models.CheckoutConfig r2 = r6.f90669b
            boolean r4 = r2 instanceof com.revolut.feature.checkout.models.Checkout.Id
            if (r4 == 0) goto L59
            sh3.a r5 = r5.f90708x
            com.revolut.feature.checkout.models.Checkout$Id r2 = (com.revolut.feature.checkout.models.Checkout.Id) r2
            java.lang.String r2 = r2.f65843a
            com.revolut.feature.topup_screen.common.TopUpTarget r6 = r6.f90670c
            com.revolut.core.model.account.AccountId r6 = e1f.c.a(r6)
            ufm.i r5 = sh3.a.b(r5, r2, r6)
            r0.f249897w = r3
            java.lang.Object r6 = nim.a.b(r5, r0)
            if (r6 != r1) goto L53
            return r1
        L53:
            kotlin.jvm.internal.Intrinsics.h(r6)
            com.revolut.feature.checkout.models.CheckoutOrder r6 = (com.revolut.feature.checkout.models.CheckoutOrder) r6
            return r6
        L59:
            boolean r5 = r2 instanceof com.revolut.feature.checkout.models.Checkout.Order
            if (r5 == 0) goto L62
            com.revolut.feature.checkout.models.Checkout$Order r2 = (com.revolut.feature.checkout.models.Checkout.Order) r2
            com.revolut.feature.checkout.models.CheckoutOrder r5 = r2.f65844a
            return r5
        L62:
            boolean r5 = r2 instanceof com.revolut.feature.checkout.models.ThreeDsCheckout
            if (r5 == 0) goto L6e
            com.revolut.feature.checkout.models.CheckoutOrder$a r5 = com.revolut.feature.checkout.models.CheckoutOrder.INSTANCE
            r5.getClass()
            com.revolut.feature.checkout.models.CheckoutOrder r5 = com.revolut.feature.checkout.models.CheckoutOrder.f65846g
            return r5
        L6e:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.topup_screen.impl.flows.checkout.flow.e.I2(com.revolut.feature.topup_screen.impl.flows.checkout.flow.e, gim.c):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.io.Serializable K2(com.revolut.feature.topup_screen.impl.flows.checkout.flow.e r5, java.lang.String r6, gim.c r7) {
        /*
            boolean r0 = r7 instanceof qwe.j
            if (r0 == 0) goto L13
            r0 = r7
            qwe.j r0 = (qwe.j) r0
            int r1 = r0.f249898w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f249898w = r1
            goto L18
        L13:
            qwe.j r0 = new qwe.j
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f249898w
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r7)     // Catch: java.lang.Throwable -> L28
            goto L62
        L28:
            r5 = move-exception
            goto L67
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            yhm.o.b(r7)
            yhm.m$a r7 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L28
            com.revolut.domain.interactors.transactions.a r5 = r5.K     // Catch: java.lang.Throwable -> L28
            r7 = 6
            efm.r r5 = com.revolut.domain.interactors.transactions.a.c(r5, r6, r4, r3, r7)     // Catch: java.lang.Throwable -> L28
            efm.r r5 = zi0.c.J(r5)     // Catch: java.lang.Throwable -> L28
            qwd.o r6 = new qwd.o     // Catch: java.lang.Throwable -> L28
            r7 = 3
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L28
            efm.r r5 = nim.a.w(r5, r6)     // Catch: java.lang.Throwable -> L28
            efm.r r5 = m70.a.g(r5, r4, r4, r7)     // Catch: java.lang.Throwable -> L28
            efm.d0 r5 = r5.firstOrError()     // Catch: java.lang.Throwable -> L28
            java.lang.String r6 = "firstOrError(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r6)     // Catch: java.lang.Throwable -> L28
            r0.f249898w = r3     // Catch: java.lang.Throwable -> L28
            java.lang.Object r7 = nim.a.b(r5, r0)     // Catch: java.lang.Throwable -> L28
            if (r7 != r1) goto L62
            return r1
        L62:
            tof.a3 r7 = (tof.a3) r7     // Catch: java.lang.Throwable -> L28
            yhm.m$a r5 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L28
            goto L6d
        L67:
            yhm.m$a r6 = yhm.m.INSTANCE
            yhm.n r7 = yhm.o.a(r5)
        L6d:
            boolean r5 = r7 instanceof yhm.n
            if (r5 == 0) goto L72
            goto L73
        L72:
            r4 = r7
        L73:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.topup_screen.impl.flows.checkout.flow.e.K2(com.revolut.feature.topup_screen.impl.flows.checkout.flow.e, java.lang.String, gim.c):java.io.Serializable");
    }

    public static final void L2(e eVar, n1 n1Var, xi0.b bVar) {
        eVar.C.a("TOPUP_IDEMPOTENCY_TAG");
        Continuation continuation = null;
        if (n1Var instanceof j1) {
            eVar.C1(new SharedFaqDestination((SharedFaqDestination.StartPoint) new SharedFaqDestination.StartPoint.FaqExplicit("question.card-deposit-limits-and-fees", 14), (SharedFaqDestination.PassthroughData) null, false, 14));
        } else if (n1Var instanceof l1) {
            eVar.l2(new s(eVar, bVar, continuation, 7), new yi5.b(26));
        } else {
            Unit unit = Unit.f186387a;
        }
    }

    public static Object M2(e eVar, AnalyticsProduct.Retail retail, boolean z, Continuation continuation, int i) {
        if ((i & 1) != 0) {
            k9 k9Var = k9.Topup;
            Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
            retail = com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var);
        }
        if ((i & 2) != 0) {
            z = false;
        }
        eVar.getClass();
        Object objP2 = eVar.p2(continuation, new qwe.g(eVar, retail, z, null));
        return objP2 == fim.a.COROUTINE_SUSPENDED ? objP2 : Unit.f186387a;
    }

    @Override // yji.l
    public final void I1() {
        prl.e eVar = this.f90704r;
        j jVar = (j) eVar.f239326c;
        Continuation continuation = null;
        l.a1(this, xam.a.h(new swe.c(eVar, continuation, 1), q.q(nim.a.u(new swe.c(eVar, continuation, 0), u0.m((SharedFlow) jVar.o.getValue(), (SharedFlow) jVar.f283652p.getValue())))), null, null, new qp7.g(this, continuation, 14), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void N2(java.lang.String r14, java.lang.Throwable r15, xi0.b r16) {
        /*
            Method dump skipped, instruction units count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.topup_screen.impl.flows.checkout.flow.e.N2(java.lang.String, java.lang.Throwable, xi0.b):void");
    }

    public final void O2() {
        l.a1(this, X1(new y0(null, new g0(new TextLocalisedClause(R$string.top_up_pending_title, null, null, 14), new TextLocalisedClause(R$string.topup_transaction_pending_generic_subtitle, null, null, 14), null, null, null, null, null, null, false, null, false, null, 16380), false, 5)), null, null, new k(this, null, 1), 3);
    }

    public final void P2(dj0.d currentParentBalance, dj0.d exceededBalanceAmount) {
        usc.a aVar = this.F;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(currentParentBalance, "currentParentBalance");
        Intrinsics.checkNotNullParameter(exceededBalanceAmount, "exceededBalanceAmount");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.junior_topup_checkout_dialog_insufficient_balance_title, null, null, 14);
        int i = R$string.junior_topup_checkout_dialog_insufficient_balance_description;
        w80.b bVar = (w80.b) aVar.f282889b;
        l.a1(this, X1(new y0(null, new nii.z(textLocalisedClause, new TextLocalisedClause(i, v.k(bVar.e(currentParentBalance), bVar.e(exceededBalanceAmount)), null, 12), new TextLocalisedClause(R$string.junior_topup_checkout_dialog_insufficient_balance_action_topup, null, null, 14), new TextLocalisedClause(R$string.junior_topup_checkout_dialog_insufficient_balance_action_cancel, null, null, 14), null, null, false, null, null, null, null, null, null, 32724), false, 5)), null, null, new r(this, exceededBalanceAmount, null), 3);
    }

    @Override // qki.e
    public final qki.d getState() {
        return this.L;
    }

    @Override // yki.g
    public final yki.b s() {
        return this.M;
    }
}

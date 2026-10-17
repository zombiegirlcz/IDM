package lr;

import com.revolut.biometric_verification.api.models.BiometricVerificationVisionRemoteResource;
import com.revolut.feature.address.common.api.flow.AddressFlowContract$OutputData;
import com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.OfferV2FlowContract$OfferUpdateContext;
import com.revolut.feature.crypto.withdraw.api.models.CryptoAddress;
import com.revolut.feature.crypto.withdraw.api.models.CryptoWithdrawLimits;
import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoice;
import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoiceSettings;
import com.revolut.feature.freelancer.impl.ui.onboarding.validation.OnboardingInputDataValidator$ValidationState;
import com.revolut.feature.selfserve.sot.api.models.DocumentType;
import com.revolut.feature.selfserve.sot.api.models.IncomeSource;
import com.revolut.feature.trade_rev_points.models.TradeRevPointsRate;
import com.revolut.feature.transfer_reasons.models.reason.TransferReasonsValues;
import com.revolut.feature.wealth.models.robo.PortfolioGoal;
import com.revolut.feature_move_money.api.model.AccountWrapper;
import com.revolut.kompot.common.ActionBreadcrumb;
import com.revolut.sso.api.models.Evidence;
import com.revolut.sso.impl.domain.models.Claim;
import com.revolut.sso.impl.ui.combined_authentication.flow.CombinedAuthenticationFlowContract$Step;
import ft3.h1;
import hd.r;
import java.util.List;
import java.util.Map;
import jkl.a3;
import kl.c0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import ma2.s;
import nii.n1;

/* JADX INFO: loaded from: classes17.dex */
public final class l extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f199349w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f199350x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Object f199351y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(int i, Object obj2, Object obj3, String str, Continuation continuation) {
        super(2, continuation);
        this.u = i;
        this.f199351y = obj2;
        this.f199350x = str;
        this.f199349w = obj3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0064, code lost:
    
        if (r10.d(r0, false, r9) != r2) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object b(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.f199350x
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r1 = r9.f199351y
            k18.c r1 = (k18.c) r1
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r9.v
            r4 = 0
            r5 = 3
            r6 = 1
            r7 = 2
            if (r3 == 0) goto L2c
            if (r3 == r6) goto L28
            if (r3 == r7) goto L24
            if (r3 != r5) goto L1c
            yhm.o.b(r10)
            goto L67
        L1c:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L24:
            yhm.o.b(r10)
            goto L5a
        L28:
            yhm.o.b(r10)
            goto L47
        L2c:
            yhm.o.b(r10)
            java.lang.Object r10 = r1.d
            com.revolut.feature.robo.impl.data.network.RoboAccountService r10 = (com.revolut.feature.robo.impl.data.network.RoboAccountService) r10
            slc.b r3 = new slc.b
            java.lang.Object r8 = r9.f199349w
            alc.a r8 = (alc.a) r8
            java.lang.String r8 = r8.f6186a
            r3.<init>(r8)
            r9.v = r6
            java.lang.Object r10 = r10.completePortfolio(r0, r3, r9)
            if (r10 != r2) goto L47
            goto L66
        L47:
            java.lang.Object r10 = r1.f180141c
            w4l.f r10 = (w4l.f) r10
            kotlin.Unit r3 = kotlin.Unit.f186387a
            efm.b r10 = r10.g(r3, r4)
            r9.v = r7
            java.lang.Object r10 = nim.a.a(r10, r9)
            if (r10 != r2) goto L5a
            goto L66
        L5a:
            java.lang.Object r10 = r1.f180140b
            x4l.c r10 = (x4l.c) r10
            r9.v = r5
            java.lang.Object r10 = r10.d(r0, r4, r9)
            if (r10 != r2) goto L67
        L66:
            return r2
        L67:
            kotlin.Unit r10 = kotlin.Unit.f186387a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: lr.l.b(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0062, code lost:
    
        if (r11.d(r0, false, r10) == r2) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object c(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r0 = r10.f199350x
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r1 = r10.f199351y
            k18.c r1 = (k18.c) r1
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r10.v
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L24
            if (r3 == r5) goto L20
            if (r3 != r4) goto L18
            yhm.o.b(r11)
            goto L65
        L18:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L20:
            yhm.o.b(r11)
            goto L57
        L24:
            yhm.o.b(r11)
            java.lang.Object r11 = r1.d
            com.revolut.feature.robo.impl.data.network.RoboAccountService r11 = (com.revolut.feature.robo.impl.data.network.RoboAccountService) r11
            java.lang.Object r3 = r10.f199349w
            com.revolut.feature.wealth.models.robo.PortfolioGoal r3 = (com.revolut.feature.wealth.models.robo.PortfolioGoal) r3
            java.lang.String r6 = "portfolioGoal"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r6)
            slc.e r6 = new slc.e
            dj0.d r7 = r3.f95699a
            jo3.a r7 = mo3.a.p(r7)
            slc.d$c$c r8 = new slc.d$c$c
            java.time.YearMonth r3 = r3.f95700b
            int r9 = r3.getYear()
            int r3 = r3.getMonthValue()
            r8.<init>(r9, r3)
            r6.<init>(r7, r8)
            r10.v = r5
            java.lang.Object r11 = r11.updateGoal(r0, r6, r10)
            if (r11 != r2) goto L57
            goto L64
        L57:
            java.lang.Object r11 = r1.f180140b
            x4l.c r11 = (x4l.c) r11
            r10.v = r4
            r1 = 0
            java.lang.Object r11 = r11.d(r0, r1, r10)
            if (r11 != r2) goto L65
        L64:
            return r2
        L65:
            kotlin.Unit r11 = kotlin.Unit.f186387a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: lr.l.c(java.lang.Object):java.lang.Object");
    }

    private final Object n(Object obj2) {
        Object objZ2;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            com.revolut.sso.impl.ui.combined_authentication.flow.c cVar = (com.revolut.sso.impl.ui.combined_authentication.flow.c) this.f199351y;
            Claim claim = (Claim) this.f199349w;
            a3 a3Var = ((ukl.d) ((ukl.f) this.f199350x)).f280795a;
            this.v = 1;
            if (claim == null) {
                oki.h.t2(cVar, cVar.H, CombinedAuthenticationFlowContract$Step.CollectClaimBeforeChat.f106412a, true, null, false, 12);
                objZ2 = Unit.f186387a;
            } else {
                if (mll.i.f207064a[a3Var.ordinal()] != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                objZ2 = cVar.Z2(claim, this);
                if (objZ2 != aVar) {
                    objZ2 = Unit.f186387a;
                }
            }
            if (objZ2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return Unit.f186387a;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new l((ur.g) this.f199351y, (p) this.f199349w, (String) this.f199350x, continuation, 0);
            case 1:
                return new l((p) this.f199349w, (Map) this.f199351y, (String) this.f199350x, continuation);
            case 2:
                l lVar = new l((lal.a) this.f199349w, (BiometricVerificationVisionRemoteResource) this.f199350x, continuation, 2);
                lVar.f199351y = obj2;
                return lVar;
            case 3:
                return new l(3, (lsf.d) this.f199351y, (TransferReasonsValues) this.f199349w, (String) this.f199350x, continuation);
            case 4:
                return new l((ly6.c) this.f199351y, (FreelancerInvoiceSettings) this.f199349w, (jy6.h) this.f199350x, continuation, 4);
            case 5:
                return new l((ly6.k) this.f199351y, (FreelancerInvoice) this.f199349w, (jy6.h) this.f199350x, continuation, 5);
            case 6:
                return new l((ly6.k) this.f199351y, (FreelancerInvoiceSettings) this.f199349w, (jy6.h) this.f199350x, continuation, 6);
            case 7:
                return new l((IncomeSource) this.f199351y, (DocumentType) this.f199349w, (c0) this.f199350x, continuation, 7);
            case 8:
                l lVar2 = new l((lz6.c) this.f199349w, (jz6.e) this.f199350x, continuation, 8);
                lVar2.f199351y = obj2;
                return lVar2;
            case 9:
                return new l((m0a.n) this.f199351y, (CryptoAddress) this.f199349w, (CryptoWithdrawLimits) this.f199350x, continuation, 9);
            case 10:
                l lVar3 = new l((com.revolut.feature.trade_rev_points.impl.ui.screen.transfer.a) this.f199349w, (u2f.n) this.f199350x, continuation, 10);
                lVar3.f199351y = obj2;
                return lVar3;
            case 11:
                return new l(11, (com.revolut.feature.trade_rev_points.impl.ui.screen.transfer.a) this.f199351y, (TradeRevPointsRate) this.f199349w, (String) this.f199350x, continuation);
            case 12:
                return new l((m34.c) this.f199351y, (h1) this.f199349w, (Map) this.f199350x, continuation, 12);
            case 13:
                return new l((com.revolut.feature.joint.impl.ui.withdraw.b) this.f199349w, (xi0.b) this.f199350x, continuation, 13);
            case 14:
                l lVar4 = new l((r) this.f199349w, (AccountWrapper) this.f199350x, continuation, 14);
                lVar4.f199351y = obj2;
                return lVar4;
            case 15:
                l lVar5 = new l((com.revolut.feature.onboarding.impl.qes.waiting_qes_result.b) this.f199349w, (Throwable) this.f199350x, continuation, 15);
                lVar5.f199351y = obj2;
                return lVar5;
            case 16:
                return new l((com.revolut.retail.feature.pod_nominees.impl.edit.d) this.f199351y, (mek.g) this.f199349w, (AddressFlowContract$OutputData) this.f199350x, continuation, 16);
            case 17:
                return new l((mek.g) this.f199351y, (com.revolut.retail.feature.pod_nominees.impl.edit.d) this.f199349w, (String) this.f199350x, continuation, 17);
            case 18:
                return new l((mf4.c) this.f199351y, (s) this.f199349w, (String) this.f199350x, continuation, 18);
            case 19:
                return new l((com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.g) this.f199351y, (OfferV2FlowContract$OfferUpdateContext) this.f199349w, (oki.g) this.f199350x, continuation, 19);
            case 20:
                return new l((com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.g) this.f199351y, (com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.calculator.a) this.f199349w, (String) this.f199350x, continuation, 20);
            case 21:
                l lVar6 = new l((mh2.b) this.f199350x, continuation);
                lVar6.f199349w = obj2;
                return lVar6;
            case 22:
                l lVar7 = new l((mk0.o) this.f199349w, (tk0.g) this.f199350x, continuation, 22);
                lVar7.f199351y = obj2;
                return lVar7;
            case 23:
                l lVar8 = new l((Function2) this.f199349w, (ActionBreadcrumb) this.f199350x, continuation, 23);
                lVar8.f199351y = obj2;
                return lVar8;
            case 24:
                l lVar9 = new l((nki.a) this.f199349w, (String) this.f199350x, continuation, 24);
                lVar9.f199351y = obj2;
                return lVar9;
            case 25:
                return new l(25, (k18.c) this.f199351y, (String) this.f199349w, (String) this.f199350x, continuation);
            case 26:
                return new l(26, (k18.c) this.f199351y, (alc.a) this.f199349w, (String) this.f199350x, continuation);
            case 27:
                return new l(27, (k18.c) this.f199351y, (PortfolioGoal) this.f199349w, (String) this.f199350x, continuation);
            case 28:
                return new l((com.revolut.sso.impl.ui.combined_authentication.flow.c) this.f199351y, (Claim) this.f199349w, (ukl.f) this.f199350x, continuation, 28);
            default:
                l lVar10 = new l((com.revolut.sso.impl.ui.combined_authentication.flow.c) this.f199349w, (Evidence) this.f199350x, continuation, 29);
                lVar10.f199351y = obj2;
                return lVar10;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((l) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((l) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((l) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((l) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((l) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((l) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((l) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((l) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((l) create((OnboardingInputDataValidator$ValidationState) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 9:
                return ((l) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 10:
                return ((l) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 11:
                return ((l) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 12:
                return ((l) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 13:
                return ((l) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 14:
                return ((l) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 15:
                return ((l) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 16:
                return ((l) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 17:
                return ((l) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 18:
                return ((l) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 19:
                return ((l) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 20:
                return ((l) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 21:
                return ((l) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 22:
                return ((l) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 23:
                return ((l) create(obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 24:
                return ((l) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 25:
                return ((l) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 26:
                return ((l) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 27:
                return ((l) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 28:
                return ((l) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((l) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:220:0x0488  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x04a3  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x04cb  */
    /* JADX WARN: Removed duplicated region for block: B:539:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:540:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:557:? A[RETURN, SYNTHETIC] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r32) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2782
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lr.l.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(Object obj2, Object obj3, Object obj4, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f199351y = obj2;
        this.f199349w = obj3;
        this.f199350x = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f199349w = obj2;
        this.f199350x = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(p pVar, Map map, String str, Continuation continuation) {
        super(2, continuation);
        this.u = 1;
        this.f199349w = pVar;
        this.f199351y = map;
        this.f199350x = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(mh2.b bVar, Continuation continuation) {
        super(2, continuation);
        this.u = 21;
        this.f199350x = bVar;
    }
}

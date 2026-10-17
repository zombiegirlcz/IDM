package eh9;

import com.revolut.data.model.Data;
import com.revolut.feature.apm.bizum.impl.ui.transfer.transfer.BizumTransferData;
import com.revolut.feature.defi.remittances.impl.domain.model.DeFiTransferQuoteRequest;
import com.revolut.feature.pay_bills_taxes.impl.ui_payment.helpers.models.PaymentData;
import com.revolut.feature.payments.api.mapper.PaymentPocketInfo;
import com.revolut.feature.shared.savings.models.info_sheets.InfoSheetParams;
import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import com.revolut.retail.feature.api.rewards_hub.model.RewardsHubChallengeDetailsParams;
import et6.i2;
import g48.r0;
import hfg.a0;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import zhm.f0;

/* JADX INFO: loaded from: classes5.dex */
public final class j extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f125784w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f125785x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f125786y;
    public Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(Object obj2, hmf.a aVar, Continuation continuation, int i) {
        super(3, continuation);
        this.u = i;
        this.f125786y = obj2;
        this.z = aVar;
    }

    private final Object b(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            FlowCollector flowCollector = this.f125784w;
            w4l.k loadingStrategy = (w4l.k) this.f125785x;
            jul.o oVar = ((com.revolut.feature.wealth.analytics.ui.widgetised.dashboard.a) this.f125786y).z;
            pwg.p params = new pwg.p((String) this.z);
            oVar.getClass();
            Intrinsics.checkNotNullParameter(params, "params");
            Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
            swg.f fVar = (swg.f) oVar.f178695b;
            fVar.getClass();
            Intrinsics.checkNotNullParameter(params, "params");
            Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
            vkm.d dVarB = fVar.e.b(params, loadingStrategy);
            this.f125784w = null;
            this.f125785x = null;
            this.v = 1;
            if (vkm.q.u(flowCollector, dVarB, this) == aVar) {
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

    private final Object c(Object obj2) {
        xi0.b bVar = (xi0.b) this.z;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            FlowCollector flowCollector = this.f125784w;
            List list = (List) ((Data) this.f125785x).getContent();
            if (list == null) {
                list = f0.f322471a;
            }
            akg.n nVarV = nim.a.v(rd0.e.b(((j9j.c) this.f125786y).f172349a.q(bVar)), new j9j.b(list, bVar));
            this.f125784w = null;
            this.f125785x = null;
            this.v = 1;
            if (vkm.q.u(flowCollector, nVarV, this) == aVar) {
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

    private final Object n(Object obj2) throws Throwable {
        jie.f fVar = (jie.f) this.z;
        ProductAccountDescriptor$Value productAccountDescriptor$Value = (ProductAccountDescriptor$Value) this.f125786y;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            FlowCollector flowCollector = this.f125784w;
            xi0.b bVar = (xi0.b) this.f125785x;
            Intrinsics.checkNotNullParameter(productAccountDescriptor$Value, "<this>");
            md6.e eVarB = age.b.b(productAccountDescriptor$Value.getF89728b(), productAccountDescriptor$Value.getF89727a());
            md6.f fVarF = age.b.f(productAccountDescriptor$Value.getF89728b(), productAccountDescriptor$Value.getF89727a());
            md6.o.Companion.getClass();
            vkm.y yVarJ = fVar.f174471b.j(new md6.a(eVarB, bVar != null ? new md6.n(bVar) : md6.m.f204493a, age.b.d(productAccountDescriptor$Value), fVarF, true, eVarB != md6.e.CREDIT));
            this.f125784w = null;
            this.f125785x = null;
            this.v = 1;
            vkm.q.w(flowCollector);
            Object objCollect = yVarJ.collect(new jie.c(flowCollector, fVar, 0), this);
            if (objCollect != aVar) {
                objCollect = Unit.f186387a;
            }
            if (objCollect != aVar) {
                objCollect = Unit.f186387a;
            }
            if (objCollect == aVar) {
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

    private final Object o(Object obj2) throws Throwable {
        BizumTransferData bizumTransferData = (BizumTransferData) this.z;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            FlowCollector flowCollector = this.f125784w;
            Pair pair = (Pair) this.f125785x;
            m02.a aVar2 = (m02.a) pair.f186385a;
            PaymentPocketInfo paymentPocketInfo = (PaymentPocketInfo) pair.f186386b;
            s6e.v vVarZ2 = ((st1.f) ((com.revolut.feature.apm.bizum.impl.ui.transfer.amount.b) this.f125786y).f61617b).Z2(bizumTransferData, aVar2.f201040a);
            com.revolut.feature.apm.bizum.impl.ui.transfer.amount.b bVar = (com.revolut.feature.apm.bizum.impl.ui.transfer.amount.b) this.f125786y;
            this.f125784w = null;
            this.f125785x = null;
            this.v = 1;
            vkm.q.w(flowCollector);
            Object objCollect = vVarZ2.collect(new acb.h(flowCollector, aVar2, paymentPocketInfo, bVar, bizumTransferData, 7), this);
            if (objCollect != aVar) {
                objCollect = Unit.f186387a;
            }
            if (objCollect != aVar) {
                objCollect = Unit.f186387a;
            }
            if (objCollect == aVar) {
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

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        switch (this.u) {
            case 0:
                j jVar = new j((Continuation) obj4, (com.revolut.feature.pay_bills_taxes.impl.ui_payment.amount.b) this.f125786y, (PaymentData) this.z, 0);
                jVar.f125784w = flowCollector;
                jVar.f125785x = obj3;
                return jVar.invokeSuspend(Unit.f186387a);
            case 1:
                j jVar2 = new j((Continuation) obj4, (ehk.g) this.f125786y, (lhk.z) this.z, 1);
                jVar2.f125784w = flowCollector;
                jVar2.f125785x = obj3;
                return jVar2.invokeSuspend(Unit.f186387a);
            case 2:
                j jVar3 = new j((Continuation) obj4, (com.revolut.feature.external_accounts.impl.ui.apptoapp.screen.payment.d) this.f125786y, (String) this.z, 2);
                jVar3.f125784w = flowCollector;
                jVar3.f125785x = obj3;
                return jVar3.invokeSuspend(Unit.f186387a);
            case 3:
                j jVar4 = new j((Continuation) obj4, (com.revolut.biometric_verification.impl.ui.flow.launcher.d) this.f125786y, 3);
                jVar4.f125784w = flowCollector;
                jVar4.f125785x = obj3;
                return jVar4.invokeSuspend(Unit.f186387a);
            case 4:
                j jVar5 = new j((Continuation) obj4, (w4l.k) this.f125786y, (i2) this.z, 4);
                jVar5.f125784w = flowCollector;
                jVar5.f125785x = obj3;
                return jVar5.invokeSuspend(Unit.f186387a);
            case 5:
                j jVar6 = new j((Continuation) obj4, (euj.m) this.f125786y, (RewardsHubChallengeDetailsParams) this.z, 5);
                jVar6.f125784w = flowCollector;
                jVar6.f125785x = obj3;
                return jVar6.invokeSuspend(Unit.f186387a);
            case 6:
                j jVar7 = new j((Continuation) obj4, (fg0.e) this.f125786y, (String) this.z, 6);
                jVar7.f125784w = flowCollector;
                jVar7.f125785x = obj3;
                return jVar7.invokeSuspend(Unit.f186387a);
            case 7:
                j jVar8 = new j((Continuation) obj4, (com.revolut.retail.feature.esim.impl.ui.screens.home.get_plan.f) this.f125786y, (List) this.z, 7);
                jVar8.f125784w = flowCollector;
                jVar8.f125785x = obj3;
                return jVar8.invokeSuspend(Unit.f186387a);
            case 8:
                j jVar9 = new j((Continuation) obj4, (fvk.x) this.f125786y, 8);
                jVar9.f125784w = flowCollector;
                jVar9.f125785x = obj3;
                return jVar9.invokeSuspend(Unit.f186387a);
            case 9:
                j jVar10 = new j((Continuation) obj4, (g26.b) this.f125786y, (String) this.z, 9);
                jVar10.f125784w = flowCollector;
                jVar10.f125785x = obj3;
                return jVar10.invokeSuspend(Unit.f186387a);
            case 10:
                j jVar11 = new j((Continuation) obj4, (r0) this.f125786y, (Set) this.z, 10);
                jVar11.f125784w = flowCollector;
                jVar11.f125785x = obj3;
                return jVar11.invokeSuspend(Unit.f186387a);
            case 11:
                j jVar12 = new j((Continuation) obj4, (g98.k) this.f125786y, (j49.i) this.z, 11);
                jVar12.f125784w = flowCollector;
                jVar12.f125785x = obj3;
                return jVar12.invokeSuspend(Unit.f186387a);
            case 12:
                j jVar13 = new j((Continuation) obj4, (gah.e) this.f125786y, (List) this.z, 12);
                jVar13.f125784w = flowCollector;
                jVar13.f125785x = obj3;
                return jVar13.invokeSuspend(Unit.f186387a);
            case 13:
                j jVar14 = new j((Continuation) obj4, (gie.i) this.f125786y, (Flow) this.z, 13);
                jVar14.f125784w = flowCollector;
                jVar14.f125785x = obj3;
                return jVar14.invokeSuspend(Unit.f186387a);
            case 14:
                j jVar15 = new j((Continuation) obj4, (gig.s) this.f125786y, (a0) this.z, 14);
                jVar15.f125784w = flowCollector;
                jVar15.f125785x = obj3;
                return jVar15.invokeSuspend(Unit.f186387a);
            case 15:
                j jVar16 = new j((Continuation) obj4, (r10.t) this.f125786y, (DeFiTransferQuoteRequest) this.z, 15);
                jVar16.f125784w = flowCollector;
                jVar16.f125785x = obj3;
                return jVar16.invokeSuspend(Unit.f186387a);
            case 16:
                j jVar17 = new j((Continuation) obj4, (h76.a) this.f125786y, (String) this.z, 16);
                jVar17.f125784w = flowCollector;
                jVar17.f125785x = obj3;
                return jVar17.invokeSuspend(Unit.f186387a);
            case 17:
                j jVar18 = new j((Continuation) obj4, (hlb.d) this.f125786y, (InfoSheetParams) this.z, 17);
                jVar18.f125784w = flowCollector;
                jVar18.f125785x = obj3;
                return jVar18.invokeSuspend(Unit.f186387a);
            case 18:
                j jVar19 = new j((cmf.k) this.f125786y, (hmf.a) this.z, (Continuation) obj4, 18);
                jVar19.f125784w = flowCollector;
                jVar19.f125785x = (Throwable) obj3;
                return jVar19.invokeSuspend(Unit.f186387a);
            case 19:
                j jVar20 = new j((cmf.p) this.f125786y, (hmf.a) this.z, (Continuation) obj4, 19);
                jVar20.f125784w = flowCollector;
                jVar20.f125785x = (Throwable) obj3;
                return jVar20.invokeSuspend(Unit.f186387a);
            case 20:
                j jVar21 = new j((Continuation) obj4, (i7f.g) this.f125786y, (String) this.z, 20);
                jVar21.f125784w = flowCollector;
                jVar21.f125785x = obj3;
                return jVar21.invokeSuspend(Unit.f186387a);
            case 21:
                j jVar22 = new j((Continuation) obj4, (ikf.h) this.f125786y, 21);
                jVar22.f125784w = flowCollector;
                jVar22.f125785x = obj3;
                return jVar22.invokeSuspend(Unit.f186387a);
            case 22:
                j jVar23 = new j((Continuation) obj4, (imh.n) this.f125786y, (com.revolut.feature.wealth.ui.impl.trade_redesign.screen.a) this.z, 22);
                jVar23.f125784w = flowCollector;
                jVar23.f125785x = obj3;
                return jVar23.invokeSuspend(Unit.f186387a);
            case 23:
                j jVar24 = new j((Continuation) obj4, (com.revolut.feature.wealth.ui.impl.trade_redesign.screen.a) this.f125786y, (imh.g) this.z, 23);
                jVar24.f125784w = flowCollector;
                jVar24.f125785x = obj3;
                return jVar24.invokeSuspend(Unit.f186387a);
            case 24:
                j jVar25 = new j((Continuation) obj4, (com.revolut.feature.freelancer.impl.ui.invoice.create.screen.g) this.f125786y, 24);
                jVar25.f125784w = flowCollector;
                jVar25.f125785x = obj3;
                return jVar25.invokeSuspend(Unit.f186387a);
            case 25:
                j jVar26 = new j((Continuation) obj4, (com.revolut.feature.wealth.analytics.ui.widgetised.dashboard.a) this.f125786y, (String) this.z, 25);
                jVar26.f125784w = flowCollector;
                jVar26.f125785x = obj3;
                return jVar26.invokeSuspend(Unit.f186387a);
            case 26:
                j jVar27 = new j((Continuation) obj4, (j9j.c) this.f125786y, (xi0.b) this.z, 26);
                jVar27.f125784w = flowCollector;
                jVar27.f125785x = obj3;
                return jVar27.invokeSuspend(Unit.f186387a);
            case 27:
                j jVar28 = new j((Continuation) obj4, (ProductAccountDescriptor$Value) this.f125786y, (jie.f) this.z, 27);
                jVar28.f125784w = flowCollector;
                jVar28.f125785x = obj3;
                return jVar28.invokeSuspend(Unit.f186387a);
            case 28:
                j jVar29 = new j((Continuation) obj4, (com.revolut.feature.apm.bizum.impl.ui.transfer.amount.b) this.f125786y, (BizumTransferData) this.z, 28);
                jVar29.f125784w = flowCollector;
                jVar29.f125785x = obj3;
                return jVar29.invokeSuspend(Unit.f186387a);
            default:
                j jVar30 = new j((Continuation) obj4, (jyg.n) this.f125786y, 29);
                jVar30.f125784w = flowCollector;
                jVar30.f125785x = obj3;
                return jVar30.invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:460:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:478:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:485:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v111 */
    /* JADX WARN: Type inference failed for: r5v118 */
    /* JADX WARN: Type inference failed for: r5v4, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r5v44 */
    /* JADX WARN: Type inference failed for: r5v46, types: [java.lang.Object, kotlinx.coroutines.flow.FlowCollector] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, kotlinx.coroutines.flow.FlowCollector] */
    /* JADX WARN: Type inference failed for: r5v6 */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r33) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 3110
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: eh9.j.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(Continuation continuation, Object obj2, int i) {
        super(3, continuation);
        this.u = i;
        this.f125786y = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(Continuation continuation, Object obj2, Object obj3, int i) {
        super(3, continuation);
        this.u = i;
        this.f125786y = obj2;
        this.z = obj3;
    }
}

package vge;

import com.revolut.feature.slot_manager.api.model.SlotContext;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import com.revolut.feature.travel.miles.api.model.TravelMilesAirline;
import com.revolut.retail.feature.esim.api.model.EsimProfile;
import com.revolut.retail.feature.esim.impl.repositories.model.EsimPhoneNumberPortingDynamicFormRequest;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: classes8.dex */
public final class r extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f288985w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f288986x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f288985w = obj2;
        this.f288986x = obj3;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new r((x) this.f288985w, (SlotContext) this.f288986x, continuation, 0);
            case 1:
                r rVar = new r((x) this.f288985w, continuation);
                rVar.f288986x = obj2;
                return rVar;
            case 2:
                r rVar2 = new r((t3) this.f288986x, continuation, 2);
                rVar2.f288985w = obj2;
                return rVar2;
            case 3:
                return new r((com.revolut.feature.travel.miles.impl.ui.screen.airlines.details.b) this.f288985w, (String) this.f288986x, continuation, 3);
            case 4:
                return new r((com.revolut.feature.travel.miles.impl.ui.screen.airlines.details.b) this.f288985w, (TravelMilesAirline) this.f288986x, continuation, 4);
            case 5:
                return new r((com.revolut.retail.feature.pricing_plans.ui.impl.flows.family_plan.d) this.f288985w, (zm3.l) this.f288986x, continuation, 5);
            case 6:
                r rVar3 = new r((com.revolut.feature.credit.application.plugins.impl.ui.sepa_direct_debit.flow.a) this.f288986x, continuation, 6);
                rVar3.f288985w = obj2;
                return rVar3;
            case 7:
                return new r((vha.l) this.f288985w, (io3.d) this.f288986x, continuation, 7);
            case 8:
                return new r((vha.q0) this.f288985w, (io3.d) this.f288986x, continuation, 8);
            case 9:
                return new r((vha.q0) this.f288985w, (String) this.f288986x, continuation, 9);
            case 10:
                return new r((sfe.n) this.f288985w, (vha.q0) this.f288986x, continuation, 10);
            case 11:
                r rVar4 = new r((vha.q0) this.f288986x, continuation, 11);
                rVar4.f288985w = obj2;
                return rVar4;
            case 12:
                return new r((vha.q0) this.f288986x, continuation, 12);
            case 13:
                return new r((vha.q0) this.f288985w, (ProductAccountId) this.f288986x, continuation, 13);
            case 14:
                r rVar5 = new r((vie.h) this.f288986x, continuation, 14);
                rVar5.f288985w = obj2;
                return rVar5;
            case 15:
                r rVar6 = new r((w4l.k) this.f288986x, continuation, 15);
                rVar6.f288985w = obj2;
                return rVar6;
            case 16:
                return new r((com.revolut.feature.product.onboarding.flow.a) this.f288985w, (vja.g) this.f288986x, continuation, 16);
            case 17:
                return new r((com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_details.c) this.f288985w, (String) this.f288986x, continuation, 17);
            case 18:
                return new r((com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_details.c) this.f288985w, (EsimProfile) this.f288986x, continuation, 18);
            case 19:
                return new r((vjk.d) this.f288985w, (Function0) this.f288986x, continuation, 19);
            case 20:
                return new r((vkh.q) this.f288985w, (String) this.f288986x, continuation, 20);
            case 21:
                return new r((vkj.n) this.f288985w, (EsimPhoneNumberPortingDynamicFormRequest) this.f288986x, continuation, 21);
            case 22:
                return new r((Ref$ObjectRef) this.f288985w, (FlowCollector) this.f288986x, continuation, 22);
            case 23:
                r rVar7 = new r((StateFlow) this.f288986x, continuation, 23);
                rVar7.f288985w = obj2;
                return rVar7;
            case 24:
                return new r((com.revolut.feature.external_accounts.impl.ui.consents_kompot.linked_accounts.a) this.f288985w, (String) this.f288986x, continuation, 24);
            case 25:
                return new r((vm5.j) this.f288986x, continuation, 25);
            case 26:
                return new r((vmh.k) this.f288985w, (vmh.f) this.f288986x, continuation, 26);
            case 27:
                return new r((vmi.d) this.f288985w, (ymi.b) this.f288986x, continuation, 27);
            case 28:
                return new r((vmj.j) this.f288985w, this.f288986x, continuation, 28);
            default:
                return new r((Ref$ObjectRef) this.f288985w, (okl.d) this.f288986x, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((r) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:463:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:464:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v27, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0, types: [com.revolut.feature.apm.iris.api.navigation.IrisNavigation$StartType, kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2358
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vge.r.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f288986x = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(x xVar, Continuation continuation) {
        super(2, continuation);
        this.u = 1;
        this.f288985w = xVar;
    }
}

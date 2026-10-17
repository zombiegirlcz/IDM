package xkj;

import a41.j1;
import com.revolut.retail.feature.esim.impl.repositories.model.EsimPhoneNumberPortingDynamicFormRequest;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.dynamic_form.number_transfer_confirmation.EsimMobilePlanDynamicFormNumberTransferConfirmationScreenContract$InputData;
import dfj.q1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import nfj.j0;
import skm.e0;
import skm.p0;

/* JADX INFO: loaded from: classes11.dex */
public final class r extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.dynamic_form.number_transfer_confirmation.b f306842w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ EsimPhoneNumberPortingDynamicFormRequest f306843x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.dynamic_form.number_transfer_confirmation.b bVar, EsimPhoneNumberPortingDynamicFormRequest esimPhoneNumberPortingDynamicFormRequest, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f306842w = bVar;
        this.f306843x = esimPhoneNumberPortingDynamicFormRequest;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new r(this.f306842w, this.f306843x, continuation, 0);
            default:
                return new r(this.f306842w, this.f306843x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((r) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        int i = this.u;
        com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.dynamic_form.number_transfer_confirmation.b bVar = this.f306842w;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                q1 q1Var = bVar.f101279p;
                EsimMobilePlanDynamicFormNumberTransferConfirmationScreenContract$InputData esimMobilePlanDynamicFormNumberTransferConfirmationScreenContract$InputData = bVar.o;
                String str = esimMobilePlanDynamicFormNumberTransferConfirmationScreenContract$InputData.f101262a;
                String str2 = esimMobilePlanDynamicFormNumberTransferConfirmationScreenContract$InputData.f101263b;
                this.v = 1;
                j0 j0Var = q1Var.f114074a;
                j0Var.getClass();
                j1 j1Var = new j1(j0Var, (Object) null, (Object) null, this.f306843x, str, str2, (Continuation) null, 26);
                p0 p0Var = p0.f264001a;
                Object objJ = e0.J(elm.f.f127540b, j1Var, this);
                return objJ == aVar ? aVar : objJ;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                r rVar = new r(bVar, this.f306843x, null, 0);
                this.v = 1;
                Object objT = do3.q.t(bVar, rVar, this);
                return objT == aVar2 ? aVar2 : objT;
        }
    }
}

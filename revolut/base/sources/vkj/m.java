package vkj;

import a41.j1;
import com.revolut.retail.feature.esim.impl.repositories.model.EsimPhoneNumberPortingDynamicFormRequest;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.dynamic_form.business_details.EsimMobilePlanDynamicFormBusinessDetailsScreenContract$InputData;
import dfj.q1;
import do3.q;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import nfj.j0;
import skm.e0;
import skm.p0;
import yhm.o;

/* JADX INFO: loaded from: classes11.dex */
public final class m extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ n f289978w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ EsimPhoneNumberPortingDynamicFormRequest f289979x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(n nVar, EsimPhoneNumberPortingDynamicFormRequest esimPhoneNumberPortingDynamicFormRequest, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f289978w = nVar;
        this.f289979x = esimPhoneNumberPortingDynamicFormRequest;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new m(this.f289978w, this.f289979x, continuation, 0);
            default:
                return new m(this.f289978w, this.f289979x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((m) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        int i = this.u;
        n nVar = this.f289978w;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                q1 q1Var = nVar.f289980p;
                EsimMobilePlanDynamicFormBusinessDetailsScreenContract$InputData esimMobilePlanDynamicFormBusinessDetailsScreenContract$InputData = nVar.o;
                String str = esimMobilePlanDynamicFormBusinessDetailsScreenContract$InputData.f101259a;
                String str2 = esimMobilePlanDynamicFormBusinessDetailsScreenContract$InputData.f101260b;
                this.v = 1;
                j0 j0Var = q1Var.f114074a;
                j0Var.getClass();
                j1 j1Var = new j1(j0Var, (Object) null, (Object) null, this.f289979x, str, str2, (Continuation) null, 26);
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
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                m mVar = new m(nVar, this.f289979x, null, 0);
                this.v = 1;
                Object objT = q.t(nVar, mVar, this);
                return objT == aVar2 ? aVar2 : objT;
        }
    }
}

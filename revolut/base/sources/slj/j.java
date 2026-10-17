package slj;

import a41.j1;
import com.revolut.retail.feature.esim.impl.repositories.model.EsimPhoneNumberPortingPowerOfAttorneyRequest;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.power_of_attorney.terms.EsimMobilePlanPowerOfAttorneyTermsScreenContract$InputData;
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
public final class j extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ k f264216w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(k kVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f264216w = kVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new j(this.f264216w, continuation, 0);
            default:
                return new j(this.f264216w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((j) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        int i = this.u;
        k kVar = this.f264216w;
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
                q1 q1Var = kVar.f264218q;
                EsimMobilePlanPowerOfAttorneyTermsScreenContract$InputData esimMobilePlanPowerOfAttorneyTermsScreenContract$InputData = kVar.o;
                String str = esimMobilePlanPowerOfAttorneyTermsScreenContract$InputData.f101357a;
                String str2 = esimMobilePlanPowerOfAttorneyTermsScreenContract$InputData.f101358b;
                EsimPhoneNumberPortingPowerOfAttorneyRequest esimPhoneNumberPortingPowerOfAttorneyRequest = esimMobilePlanPowerOfAttorneyTermsScreenContract$InputData.f101359c;
                this.v = 1;
                j0 j0Var = q1Var.f114074a;
                j0Var.getClass();
                j1 j1Var = new j1(j0Var, esimPhoneNumberPortingPowerOfAttorneyRequest, (Object) null, (Object) null, str, str2, (Continuation) null, 26);
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
                j jVar = new j(kVar, null, 0);
                this.v = 1;
                Object objT = q.t(kVar, jVar, this);
                return objT == aVar2 ? aVar2 : objT;
        }
    }
}

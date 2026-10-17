package elj;

import a41.j1;
import com.revolut.retail.feature.esim.impl.repositories.model.EsimPhoneNumberPortingPacRequest;
import com.revolut.retail.feature.esim.impl.repositories.model.EsimPhoneNumberPortingPacScheduleRequest;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.pac.number_transfer_confirmation.EsimMobilePlanPacNumberTransferConfirmationScreenContract$InputData;
import dej.z0;
import dfj.q1;
import do3.q;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import nfj.j0;
import skm.e0;
import skm.p0;
import vkm.j2;

/* JADX INFO: loaded from: classes11.dex */
public final class n extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.pac.number_transfer_confirmation.b f127509w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f127510x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ z0 f127511y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.pac.number_transfer_confirmation.b bVar, String str, z0 z0Var, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f127509w = bVar;
        this.f127510x = str;
        this.f127511y = z0Var;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new n(this.f127509w, this.f127510x, this.f127511y, continuation, 0);
            default:
                return new n(this.f127509w, this.f127510x, this.f127511y, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((n) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                this.v = 1;
                com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.pac.number_transfer_confirmation.b bVar = this.f127509w;
                Object objT = q.t(bVar, new n(bVar, this.f127510x, this.f127511y, null, 1), this);
                return objT == aVar ? aVar : objT;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.pac.number_transfer_confirmation.b bVar2 = this.f127509w;
                q1 q1Var = bVar2.f101320r;
                EsimMobilePlanPacNumberTransferConfirmationScreenContract$InputData esimMobilePlanPacNumberTransferConfirmationScreenContract$InputData = bVar2.o;
                String str = esimMobilePlanPacNumberTransferConfirmationScreenContract$InputData.f101307a;
                String str2 = esimMobilePlanPacNumberTransferConfirmationScreenContract$InputData.f101308b;
                EsimPhoneNumberPortingPacRequest esimPhoneNumberPortingPacRequest = new EsimPhoneNumberPortingPacRequest(new EsimPhoneNumberPortingPacScheduleRequest(this.f127511y, ((g) ((j2) bVar2.u.f22677a).getValue()).f127497b), this.f127510x);
                this.v = 1;
                j0 j0Var = q1Var.f114074a;
                j0Var.getClass();
                j1 j1Var = new j1(j0Var, (Object) null, esimPhoneNumberPortingPacRequest, (Object) null, str, str2, (Continuation) null, 26);
                p0 p0Var = p0.f264001a;
                Object objJ = e0.J(elm.f.f127540b, j1Var, this);
                return objJ == aVar2 ? aVar2 : objJ;
        }
    }
}

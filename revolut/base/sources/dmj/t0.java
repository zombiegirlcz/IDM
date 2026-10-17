package dmj;

import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod;
import com.revolut.retail.feature.esim.api.model.EsimCheckoutPrice;
import dfj.w1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import vkm.j2;
import vkm.v1;

/* JADX INFO: loaded from: classes11.dex */
public final class t0 extends gim.i implements Function2 {
    public final /* synthetic */ xi0.b A;
    public final /* synthetic */ String B;
    public final /* synthetic */ Long C;
    public com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_phone_number_checkout.c u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_phone_number_checkout.c f116181w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ EsimCheckoutPrice f116182x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ PaymentMethod.Pocket f116183y;
    public final /* synthetic */ String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_phone_number_checkout.c cVar, EsimCheckoutPrice esimCheckoutPrice, PaymentMethod.Pocket pocket, String str, xi0.b bVar, String str2, Long l2, Continuation continuation) {
        super(2, continuation);
        this.f116181w = cVar;
        this.f116182x = esimCheckoutPrice;
        this.f116183y = pocket;
        this.z = str;
        this.A = bVar;
        this.B = str2;
        this.C = l2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new t0(this.f116181w, this.f116182x, this.f116183y, this.z, this.A, this.B, this.C, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((t0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object objE;
        com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_phone_number_checkout.c cVar;
        com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_phone_number_checkout.c cVar2 = this.f116181w;
        cli.y yVar = cVar2.z;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            w1 w1Var = cVar2.f101387w;
            String str = ((a0) ((j2) yVar.f22677a).getValue()).f116135b;
            String str2 = cVar2.o.f101371a;
            boolean z = ((a0) ((j2) yVar.f22677a).getValue()).f116137g;
            dj0.d dVar = this.f116182x.f100197b;
            String str3 = this.f116183y.f84376a;
            this.u = cVar2;
            this.v = 1;
            w1Var.getClass();
            objE = t1.E(new v1(new dfj.v1(w1Var, str, str2, this.z, z, dVar, str3, this.A, this.B, this.C, null)));
            if (objE == aVar) {
                return aVar;
            }
            cVar = cVar2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_phone_number_checkout.c cVar3 = this.u;
            yhm.o.b(obj2);
            cVar = cVar3;
            objE = obj2;
        }
        return yji.l.a1(cVar, (Flow) objE, null, null, new q0(3, cVar2, null), 3);
    }
}

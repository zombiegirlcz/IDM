package qwe;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature.checkout.models.CheckoutParams;
import com.revolut.feature.topup_screen.impl.flows.checkout.flow.CheckoutFlowContract$State;
import grl.k9;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import skm.h2;
import vkm.j2;

/* JADX INFO: loaded from: classes8.dex */
public final class m extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ com.revolut.feature.topup_screen.impl.flows.checkout.flow.e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f249902w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(com.revolut.feature.topup_screen.impl.flows.checkout.flow.e eVar, String str, Continuation continuation) {
        super(1, continuation);
        this.v = eVar;
        this.f249902w = str;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new m(this.v, this.f249902w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((m) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        com.revolut.feature.topup_screen.impl.flows.checkout.flow.e eVar = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            this.u = 1;
            if (h2.e(com.revolut.feature.topup_screen.impl.flows.checkout.flow.e.O, new n(eVar, this.f249902w, null, 1), this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        qh3.a aVar2 = eVar.f90707w;
        CheckoutParams checkoutParams = ((CheckoutFlowContract$State) ((j2) eVar.L.f22677a).getValue()).f90671a;
        if (checkoutParams == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        k9 k9Var = k9.Topup;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        qh3.a.b3(aVar2, checkoutParams, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), eVar.o.d, false, 44);
        return Unit.f186387a;
    }
}

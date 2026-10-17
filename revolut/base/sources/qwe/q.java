package qwe;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import grl.k9;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes8.dex */
public final class q extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ com.revolut.feature.topup_screen.impl.flows.checkout.flow.e v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(com.revolut.feature.topup_screen.impl.flows.checkout.flow.e eVar, Continuation continuation) {
        super(2, continuation);
        this.v = eVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new q(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((q) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            k9 k9Var = k9.Onboarding;
            Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
            AnalyticsProduct.Retail retailH = com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var);
            this.u = 1;
            if (com.revolut.feature.topup_screen.impl.flows.checkout.flow.e.M2(this.v, retailH, false, this, 2) == aVar) {
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
}

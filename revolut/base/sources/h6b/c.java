package h6b;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature.checkout.models.CheckoutParams;
import gim.i;
import grl.k9;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends i implements Function1 {
    public int u;
    public final /* synthetic */ com.revolut.feature.retail.cobranded_cards.impl.presentation.flows.order_card.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e6b.c f149607w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.revolut.feature.retail.cobranded_cards.impl.presentation.flows.order_card.a aVar, e6b.c cVar, Continuation continuation) {
        super(1, continuation);
        this.v = aVar;
        this.f149607w = cVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new c(this.v, this.f149607w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((c) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            qh3.c cVar = this.v.f82523q;
            CheckoutParams.CardOrder cardOrder = this.f149607w.f122963a;
            k9 k9Var = k9.Cobrands;
            Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
            AnalyticsProduct.Retail retailH = com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var);
            this.u = 1;
            if (cVar.Z2(cardOrder, null, retailH, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        return Unit.f186387a;
    }
}

package hea;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature.checkout.models.CheckoutParams;
import com.revolut.retail.core.navigation.NaviCommand;
import grl.k9;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class j0 extends gim.i implements Function1 {
    public final /* synthetic */ com.revolut.feature.pockets.impl.details_v2.pocket_details.a u;
    public final /* synthetic */ CheckoutParams v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(com.revolut.feature.pockets.impl.details_v2.pocket_details.a aVar, CheckoutParams checkoutParams, Continuation continuation) {
        super(1, continuation);
        this.u = aVar;
        this.v = checkoutParams;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new j0(this.u, this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((j0) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        com.revolut.feature.pockets.impl.details_v2.pocket_details.a aVar2 = this.u;
        qh3.a aVar3 = aVar2.D;
        NaviCommand naviCommand = aVar2.o.i;
        k9 k9Var = k9.Cards;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        qh3.a.b3(aVar3, this.v, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), naviCommand, false, 44);
        return Unit.f186387a;
    }
}

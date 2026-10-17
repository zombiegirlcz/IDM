package f28;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature.wealth.analytics.navigation.ComplexAnalyticsDestination;
import com.revolut.kompot.navigable.TransitionAnimation;
import grl.k9;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class z extends gim.i implements Function2 {
    public final /* synthetic */ a0 u;
    public final /* synthetic */ ixg.a v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(a0 a0Var, ixg.a aVar, Continuation continuation) {
        super(2, continuation);
        this.u = a0Var;
        this.v = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new z(this.u, this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((z) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        ash.d dVar = this.u.f131447a;
        ixg.b bVar = ixg.b.COMBINED;
        k9 k9Var = k9.Wealth;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        dVar.a(new ComplexAnalyticsDestination(null, bVar, this.v, null, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), com.revolut.kompot.common.transition.a.b(TransitionAnimation.INSTANCE), 9));
        return Unit.f186387a;
    }
}

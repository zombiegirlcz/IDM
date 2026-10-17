package cxe;

import com.revolut.core.ui_kit.delegates.AttributeSelectorSmallDelegate;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes8.dex */
public final class w extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ AttributeSelectorSmallDelegate.Model f109975w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.c cVar, AttributeSelectorSmallDelegate.Model model, Continuation continuation) {
        super(2, continuation);
        this.v = cVar;
        this.f109975w = model;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new w(this.v, this.f109975w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((w) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
            return obj2;
        }
        yhm.o.b(obj2);
        AttributeSelectorSmallDelegate.Model model = this.f109975w;
        com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.c cVar = this.v;
        v vVar = new v(cVar, model, null);
        this.u = 1;
        Object objB = pu7.a.B(cVar.k, "updateRevPointsDiscount", vVar, this);
        return objB == aVar ? aVar : objB;
    }
}

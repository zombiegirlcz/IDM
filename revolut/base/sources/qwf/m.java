package qwf;

import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.feature.transport.impl.ui.transit_checkout.TransitCheckoutScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class m extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TransitCheckoutScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(TransitCheckoutScreen transitCheckoutScreen, Continuation continuation) {
        super(2, continuation);
        this.v = transitCheckoutScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        m mVar = new m(this.v, continuation);
        mVar.u = obj2;
        return mVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((m) create((SelectableDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        SelectableDelegate.Model model = (SelectableDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        q qVarH3 = this.v.T2();
        Intrinsics.h(model);
        z zVar = (z) qVarH3;
        zVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        zVar.f249941s.d3(model);
        return Unit.f186387a;
    }
}

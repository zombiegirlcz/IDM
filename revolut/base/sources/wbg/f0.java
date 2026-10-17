package wbg;

import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.checkout.TravelHotelsCheckoutScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class f0 extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TravelHotelsCheckoutScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(TravelHotelsCheckoutScreen travelHotelsCheckoutScreen, Continuation continuation) {
        super(2, continuation);
        this.v = travelHotelsCheckoutScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f0 f0Var = new f0(this.v, continuation);
        f0Var.u = obj2;
        return f0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f0) create((TextDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        TextDelegate.Model model = (TextDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        s0 s0VarE3 = this.v.d();
        Intrinsics.h(model);
        com.revolut.feature.travel.hotels.impl.ui_kompot.screen.checkout.a aVar2 = (com.revolut.feature.travel.hotels.impl.ui_kompot.screen.checkout.a) s0VarE3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        if (Intrinsics.f(model.f53531a, "INCLUDING_TAXES_ITEM_ID")) {
            aVar2.J2();
        }
        return Unit.f186387a;
    }
}

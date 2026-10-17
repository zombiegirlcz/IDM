package dxe;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.bottom_sheet.CheckoutBottomSheetScreen;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes8.dex */
public final class c extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CheckoutBottomSheetScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(CheckoutBottomSheetScreen checkoutBottomSheetScreen, Continuation continuation) {
        super(2, continuation);
        this.v = checkoutBottomSheetScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((LargeActionButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        LargeActionButtonDelegate.Model model = (LargeActionButtonDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        Object obj3 = model.i;
        com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.b action = obj3 instanceof com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.b ? (com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.b) obj3 : null;
        if (action == null) {
            return Unit.f186387a;
        }
        d dVar = (d) this.v.S.getValue();
        dVar.getClass();
        Intrinsics.checkNotNullParameter(action, "action");
        dVar.C2(new a(action));
        return Unit.f186387a;
    }
}

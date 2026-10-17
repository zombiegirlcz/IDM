package g03;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.feature.card_management.impl.ui.kompot.placeholder_settings.DisposableCardSettingsController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class k extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ DisposableCardSettingsController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(DisposableCardSettingsController disposableCardSettingsController, Continuation continuation) {
        super(2, continuation);
        this.v = disposableCardSettingsController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        k kVar = new k(this.v, continuation);
        kVar.u = obj2;
        return kVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((k) create((LargeActionButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        LargeActionButtonDelegate.Model model = (LargeActionButtonDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        e eVarD3 = this.v.d();
        Intrinsics.h(model);
        com.revolut.feature.card_management.impl.ui.kompot.placeholder_settings.b bVar = (com.revolut.feature.card_management.impl.ui.kompot.placeholder_settings.b) eVarD3;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        j60.a.v(bVar.f64873s, false, null, 3);
        String str = model.f52613a;
        if (Intrinsics.f(str, "CARD_TERMINATION_POSITIVE_BUTTON_ID")) {
            bVar.l2(new u(bVar, null, 5), new yi5.b(26));
        } else if (Intrinsics.f(str, "RESET_PIN_TRIES_POSITIVE_BUTTON_ID")) {
            bVar.n2(new u(bVar, null, 4), new whi.b(6));
        }
        return Unit.f186387a;
    }
}

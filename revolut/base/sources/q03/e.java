package q03;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.card_management.impl.ui.kompot.settings.RevolutCardSettingsController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ RevolutCardSettingsController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(RevolutCardSettingsController revolutCardSettingsController, Continuation continuation) {
        super(2, continuation);
        this.v = revolutCardSettingsController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        o0 o0VarD3 = this.v.R2();
        Intrinsics.h(model);
        com.revolut.feature.card_management.impl.ui.kompot.settings.b bVar = (com.revolut.feature.card_management.impl.ui.kompot.settings.b) o0VarD3;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        bVar.n2(new v(model, bVar, null), new whi.b(6));
        return Unit.f186387a;
    }
}

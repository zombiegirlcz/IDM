package cm9;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.pay_with_smile.impl.ui.settings.PayWithSmileSettingsScreen;
import com.revolut.feature.pay_with_smile.impl.ui.settings.PayWithSmileSettingsScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ PayWithSmileSettingsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(PayWithSmileSettingsScreen payWithSmileSettingsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = payWithSmileSettingsScreen;
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
        h hVarE3 = this.v.R2();
        String listId = model.f53228a;
        com.revolut.feature.pay_with_smile.impl.ui.settings.a aVar2 = (com.revolut.feature.pay_with_smile.impl.ui.settings.a) hVarE3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        if (Intrinsics.f(listId, "CHANGE_PASSCODE_ID")) {
            oki.h.v2(aVar2.f78985r, PayWithSmileSettingsScreenContract$ModalStep.ChangePasscode.f78981a, ModalDestination.Style.FULLSCREEN_FADE.f98307a);
        }
        return Unit.f186387a;
    }
}

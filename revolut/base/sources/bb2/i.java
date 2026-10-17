package bb2;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.apm.payid.impl.screen.settings.SettingsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes20.dex */
public final class i extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ SettingsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(SettingsScreen settingsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = settingsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        i iVar = new i(this.v, continuation);
        iVar.u = obj2;
        return iVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((i) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        FullScreenStateDelegate.Model model = (FullScreenStateDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        ((com.revolut.feature.apm.payid.impl.screen.settings.a) this.v.R2()).L2(new p(model.f52373a));
        return Unit.f186387a;
    }
}

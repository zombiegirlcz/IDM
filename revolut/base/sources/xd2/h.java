package xd2;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.apm.spin.impl.ui.settings.SpinSettingsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.z1;

/* JADX INFO: loaded from: classes20.dex */
public final class h extends gim.i implements Function2 {
    public final /* synthetic */ SpinSettingsScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(SpinSettingsScreen spinSettingsScreen, Continuation continuation) {
        super(2, continuation);
        this.u = spinSettingsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new h(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        com.revolut.feature.apm.spin.impl.ui.settings.a aVar2 = (com.revolut.feature.apm.spin.impl.ui.settings.a) ((l) this.u.Q.getValue());
        aVar2.H2(aVar2.f62884r, new n(0));
        z1 z1Var = aVar2.f62886t;
        Unit unit = Unit.f186387a;
        z1Var.k(unit);
        return unit;
    }
}

package p62;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.apm.iris.impl.ui.settings.IrisSettingsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.z1;

/* JADX INFO: loaded from: classes20.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ IrisSettingsScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(IrisSettingsScreen irisSettingsScreen, Continuation continuation) {
        super(2, continuation);
        this.u = irisSettingsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new d(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        com.revolut.feature.apm.iris.impl.ui.settings.a aVar2 = (com.revolut.feature.apm.iris.impl.ui.settings.a) this.u.d();
        aVar2.H2(aVar2.f62537t, new p5a.m(3));
        z1 z1Var = aVar2.v;
        Unit unit = Unit.f186387a;
        z1Var.k(unit);
        return unit;
    }
}

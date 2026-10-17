package w8l;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.shared.feature.offboarding.impl.ui.home.OffboardingScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.z1;
import yhm.o;

/* JADX INFO: loaded from: classes12.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ OffboardingScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(OffboardingScreen offboardingScreen, Continuation continuation) {
        super(2, continuation);
        this.u = offboardingScreen;
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
        o.b(obj2);
        z1 z1Var = ((j) this.u.R2()).f295658p;
        Unit unit = Unit.f186387a;
        z1Var.k(unit);
        return unit;
    }
}

package ts1;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.apm.bizum.impl.ui.area.homescreen.BizumAreaHomescreenScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.z1;

/* JADX INFO: loaded from: classes20.dex */
public final class n extends gim.i implements Function2 {
    public final /* synthetic */ BizumAreaHomescreenScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(BizumAreaHomescreenScreen bizumAreaHomescreenScreen, Continuation continuation) {
        super(2, continuation);
        this.u = bizumAreaHomescreenScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new n(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((n) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        u uVar = (u) this.u.T2();
        uVar.x2(new tpi.g(16));
        z1 z1Var = uVar.f273941y;
        Unit unit = Unit.f186387a;
        z1Var.k(unit);
        return unit;
    }
}

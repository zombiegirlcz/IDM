package qc2;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.apm.qvik.impl.ui.home.area.QvikHomeAreaScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.z1;

/* JADX INFO: loaded from: classes20.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ QvikHomeAreaScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(QvikHomeAreaScreen qvikHomeAreaScreen, Continuation continuation) {
        super(2, continuation);
        this.u = qvikHomeAreaScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new g(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        n nVar = (n) this.u.d();
        nVar.H2(nVar.f244533x, new qb5.a(19));
        z1 z1Var = nVar.f244534y;
        Unit unit = Unit.f186387a;
        z1Var.k(unit);
        return unit;
    }
}

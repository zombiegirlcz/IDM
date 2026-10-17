package aw1;

import au6.e2;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.apm.breb.impl.ui.keys.BrebKeysScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.z1;

/* JADX INFO: loaded from: classes20.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ BrebKeysScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(BrebKeysScreen brebKeysScreen, Continuation continuation) {
        super(2, continuation);
        this.u = brebKeysScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new c(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        q qVar = (q) this.u.R2();
        qVar.H2(qVar.f10663r, new e2(22));
        z1 z1Var = qVar.f10664s;
        Unit unit = Unit.f186387a;
        z1Var.k(unit);
        return unit;
    }
}

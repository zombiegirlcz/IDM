package a92;

import a82.l;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.apm.multibanco.impl.ui.withdrawal.list.WithdrawalCodeListScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.z1;
import yhm.o;

/* JADX INFO: loaded from: classes20.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ WithdrawalCodeListScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(WithdrawalCodeListScreen withdrawalCodeListScreen, Continuation continuation) {
        super(2, continuation);
        this.u = withdrawalCodeListScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new g(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        i iVar = (i) ((c) this.u.U.getValue());
        iVar.H2(iVar.f2306q, new l(17));
        z1 z1Var = iVar.f2307r;
        Unit unit = Unit.f186387a;
        z1Var.k(unit);
        return unit;
    }
}

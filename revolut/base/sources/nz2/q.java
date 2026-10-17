package nz2;

import bo8.w;
import com.revolut.core.model.account.AccountId;
import e7l.g;
import efm.r;
import ha3.x;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes21.dex */
public final class q extends gim.i implements Function2 {
    public final /* synthetic */ com.revolut.feature.card_management.impl.cardlimit.screens.overview.a u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(com.revolut.feature.card_management.impl.cardlimit.screens.overview.a aVar, Continuation continuation) {
        super(2, continuation);
        this.u = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new q(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((q) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        com.revolut.feature.card_management.impl.cardlimit.screens.overview.a aVar2 = this.u;
        vkm.d dVarB = rd0.e.b(m70.a.g(((x) aVar2.f64830p).v(aVar2.o.f64828a), null, new nsl.d(24), 1));
        r rVarX = aVar2.f64832r.x(AccountId.Personal.f51414a).x();
        Intrinsics.checkNotNullExpressionValue(rVarX, "toObservable(...)");
        vkm.d dVarB2 = rd0.e.b(rVarX);
        fk3.a aVar3 = aVar2.f64831q;
        return yji.l.a1(aVar2, new w(yh5.b.e(dVarB, dVarB2, rd0.e.b(m70.a.g(((ik3.c) aVar3).l(g.b.f123407a, w4l.h.f294642c), null, new nsl.d(25), 1))), 6), null, null, new nwc.f(aVar2, null, 9), 3);
    }
}

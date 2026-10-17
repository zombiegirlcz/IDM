package mq4;

import com.revolut.feature.credit.card.impl.ui.collateral_move_money.CollateralMoveMoneyScreenContract$InputData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import mlk.a0;
import om4.y3;
import vkm.v1;
import zh9.u0;
import zhm.h0;

/* JADX INFO: loaded from: classes22.dex */
public final class v extends gim.i implements Function2 {
    public final /* synthetic */ x u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(x xVar, Continuation continuation) {
        super(2, continuation);
        this.u = xVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new v(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((v) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        x xVar = this.u;
        v1 v1VarK = ngm.n.K(new t(xVar, null, 0));
        wsg.n nVar = xVar.o;
        CollateralMoveMoneyScreenContract$InputData collateralMoveMoneyScreenContract$InputData = xVar.v;
        return yji.l.a1(xVar, rd0.e.n(nim.a.v(u0.i(v1VarK, rd0.e.b(osg.b.o(nVar, collateralMoveMoneyScreenContract$InputData.f69167b, null, null, null, null, 126)), nim.a.v(((y3) xVar.f207879r).f(collateralMoveMoneyScreenContract$InputData.f69166a, collateralMoveMoneyScreenContract$InputData.f69168c == com.revolut.feature.credit.card.api.navigation.a.INITIAL_DEPOSIT ? w4l.i.f294643c : w4l.h.f294642c), new a0(23))), new a0(24)), h0.f322473a), null, null, new u(xVar, null), 3);
    }
}

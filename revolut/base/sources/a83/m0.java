package a83;

import com.revolut.data.model.Data;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes21.dex */
public final class m0 extends gim.i implements Function2 {
    public final /* synthetic */ int u = 1;
    public /* synthetic */ boolean v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.card_screen.impl.kompot.cards_list.screen.a f2062w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(com.revolut.feature.card_screen.impl.kompot.cards_list.screen.a aVar, Continuation continuation) {
        super(2, continuation);
        this.f2062w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                m0 m0Var = new m0(continuation, this.f2062w);
                m0Var.v = ((Boolean) obj2).booleanValue();
                return m0Var;
            default:
                m0 m0Var2 = new m0(this.f2062w, continuation);
                m0Var2.v = ((Boolean) obj2).booleanValue();
                return m0Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        int i = this.u;
        Boolean bool = (Boolean) obj2;
        bool.booleanValue();
        Continuation continuation = (Continuation) obj3;
        switch (i) {
        }
        return ((m0) create(bool, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        com.revolut.feature.card_screen.impl.kompot.cards_list.screen.a aVar = this.f2062w;
        switch (i) {
            case 0:
                boolean z = this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                return z ? nim.a.v(xh9.a.c(aVar.f65476t), q0.f2080a) : new go.g(new Data(od0.i.f224256b, null, false, 6, null), 2);
            default:
                boolean z3 = this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.Q, new a2g.p(z3, 4));
                return Unit.f186387a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(Continuation continuation, com.revolut.feature.card_screen.impl.kompot.cards_list.screen.a aVar) {
        super(2, continuation);
        this.f2062w = aVar;
    }
}

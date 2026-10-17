package wyd;

import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes7.dex */
public final class g extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public /* synthetic */ do3.n v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Set f301253w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.statements.impl.ui.account.a f301254x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(com.revolut.feature.statements.impl.ui.account.a aVar, Continuation continuation, int i) {
        super(3, continuation);
        this.u = i;
        this.f301254x = aVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        do3.n nVar = (do3.n) obj2;
        Set set = (Set) obj3;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                g gVar = new g(this.f301254x, continuation, 0);
                gVar.v = nVar;
                gVar.f301253w = set;
                return gVar.invokeSuspend(Unit.f186387a);
            default:
                g gVar2 = new g(this.f301254x, continuation, 1);
                gVar2.v = nVar;
                gVar2.f301253w = set;
                return gVar2.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                do3.n nVar = this.v;
                Set set = this.f301253w;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                return new Pair(nVar, com.revolut.feature.statements.impl.ui.account.a.L2(set));
            default:
                do3.n nVar2 = this.v;
                Set set2 = this.f301253w;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                return new Pair(nVar2, com.revolut.feature.statements.impl.ui.account.a.M2(set2));
        }
    }
}

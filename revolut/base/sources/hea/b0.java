package hea;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class b0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ boolean v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.pockets.impl.details_v2.pocket_details.a f151624w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b0(int i, com.revolut.feature.pockets.impl.details_v2.pocket_details.a aVar, Continuation continuation) {
        super(2, continuation);
        this.u = i;
        this.f151624w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                b0 b0Var = new b0(0, this.f151624w, continuation);
                b0Var.v = ((Boolean) obj2).booleanValue();
                return b0Var;
            default:
                b0 b0Var2 = new b0(1, this.f151624w, continuation);
                b0Var2.v = ((Boolean) obj2).booleanValue();
                return b0Var2;
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
        return ((b0) create(bool, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        com.revolut.feature.pockets.impl.details_v2.pocket_details.a aVar = this.f151624w;
        switch (i) {
            case 0:
                boolean z = this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.U, new g7b.q(z, 11));
                break;
            default:
                boolean z3 = this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.U, new g7b.q(z3, 12));
                break;
        }
        return Unit.f186387a;
    }
}

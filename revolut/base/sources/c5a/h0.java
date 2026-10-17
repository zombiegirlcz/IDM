package c5a;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class h0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ boolean v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.payments.who_to_transfer.impl.ui.chats.f f21492w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h0(com.revolut.feature.payments.who_to_transfer.impl.ui.chats.f fVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f21492w = fVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                h0 h0Var = new h0(this.f21492w, continuation, 0);
                h0Var.v = ((Boolean) obj2).booleanValue();
                return h0Var;
            default:
                h0 h0Var2 = new h0(this.f21492w, continuation, 1);
                h0Var2.v = ((Boolean) obj2).booleanValue();
                return h0Var2;
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
        return ((h0) create(bool, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        com.revolut.feature.payments.who_to_transfer.impl.ui.chats.f fVar = this.f21492w;
        switch (i) {
            case 0:
                boolean z = this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                fVar.H2(fVar.f80171h0, new a2g.p(z, 25));
                break;
            default:
                boolean z3 = this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                fVar.H2(fVar.f80171h0, new a2g.p(z3, 26));
                break;
        }
        return Unit.f186387a;
    }
}

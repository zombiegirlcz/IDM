package bs9;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class c0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ boolean v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.payments.groups.impl.ui_chat.chat.a f18093w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c0(com.revolut.feature.payments.groups.impl.ui_chat.chat.a aVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f18093w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                c0 c0Var = new c0(this.f18093w, continuation, 0);
                c0Var.v = ((Boolean) obj2).booleanValue();
                return c0Var;
            default:
                c0 c0Var2 = new c0(this.f18093w, continuation, 1);
                c0Var2.v = ((Boolean) obj2).booleanValue();
                return c0Var2;
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
        return ((c0) create(bool, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        com.revolut.feature.payments.groups.impl.ui_chat.chat.a aVar = this.f18093w;
        switch (i) {
            case 0:
                boolean z = this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.W, new a2g.p(z, 22));
                break;
            default:
                boolean z3 = this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.W, new a2g.p(z3, 23));
                break;
        }
        return Unit.f186387a;
    }
}

package z8k;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class l0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.amount.b f320194w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l0(com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.amount.b bVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f320194w = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                l0 l0Var = new l0(this.f320194w, continuation, 0);
                l0Var.v = obj2;
                return l0Var;
            default:
                l0 l0Var2 = new l0(this.f320194w, continuation, 1);
                l0Var2.v = obj2;
                return l0Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((l0) create((t) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((l0) create((u) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.amount.b bVar = this.f320194w;
        switch (i) {
            case 0:
                t domainState = (t) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bVar.u.getClass();
                Intrinsics.checkNotNullParameter(domainState, "domainState");
                return Boolean.valueOf(d9k.j.a(domainState) == d9k.i.WITH_PERSONALISATION);
            default:
                u uVar = (u) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bVar.x2(new z2.a(uVar, 26));
                return Unit.f186387a;
        }
    }
}

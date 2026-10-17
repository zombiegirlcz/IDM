package vb2;

import com.revolut.core.ui_kit.delegates.g6;
import com.revolut.feature.apm.payto.impl.screen.topup.linked_account.PayToTopupLinkedAccountScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes20.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ PayToTopupLinkedAccountScreen f287359w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(PayToTopupLinkedAccountScreen payToTopupLinkedAccountScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f287359w = payToTopupLinkedAccountScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                c cVar = new c(this.f287359w, continuation, 0);
                cVar.v = obj2;
                return cVar;
            default:
                c cVar2 = new c(this.f287359w, continuation, 1);
                cVar2.v = obj2;
                return cVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((c) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((c) create((g6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        PayToTopupLinkedAccountScreen payToTopupLinkedAccountScreen = this.f287359w;
        switch (i) {
            case 0:
                ty0.a aVar = (ty0.a) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((s) payToTopupLinkedAccountScreen.e3()).J2(new k(aVar.f275445a));
                break;
            default:
                g6 g6Var = (g6) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((s) payToTopupLinkedAccountScreen.e3()).J2(new l(g6Var.f54199a));
                break;
        }
        return Unit.f186387a;
    }
}

package vha;

import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class o0 extends gim.i implements Function1 {
    public q0 u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ q0 f289413w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(q0 q0Var, Continuation continuation) {
        super(1, continuation);
        this.f289413w = q0Var;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new o0(this.f289413w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((o0) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        q0 q0Var;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        q0 q0Var2 = this.f289413w;
        if (i == 0) {
            yhm.o.b(obj2);
            jr6.h hVar = q0Var2.v;
            this.u = q0Var2;
            this.v = 1;
            obj2 = ((ct6.f) hVar).a(this);
            if (obj2 == aVar) {
                return aVar;
            }
            q0Var = q0Var2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            q0Var = this.u;
            yhm.o.b(obj2);
        }
        q0Var.N2((ViewController) obj2, ModalDestination.Style.POPUP.f98311a, new t(q0Var2, 1));
        return Unit.f186387a;
    }
}

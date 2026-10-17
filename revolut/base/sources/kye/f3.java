package kye;

import com.revolut.feature.topup_screen.impl.flows.topup.flow.data.SelectedMethod;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
public final class f3 extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ k3 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f3(k3 k3Var, Continuation continuation) {
        super(1, continuation);
        this.v = k3Var;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new f3(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((f3) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        k3 k3Var = this.v;
        cli.y yVar = k3Var.f190763d0;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            ote.a aVar2 = k3Var.f190770x;
            this.u = 1;
            obj2 = aVar2.b3(this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        if (((Boolean) obj2).booleanValue()) {
            return Unit.f186387a;
        }
        String str = ((m) ((vkm.j2) yVar.f22677a).getValue()).f190775b;
        SelectedMethod selectedMethod = ((m) ((vkm.j2) yVar.f22677a).getValue()).f190786s;
        SelectedMethod.StoredMethod storedMethod = selectedMethod instanceof SelectedMethod.StoredMethod ? (SelectedMethod.StoredMethod) selectedMethod : null;
        k3Var.C2(new o(str, storedMethod != null ? storedMethod.getF90903a() : null));
        return Unit.f186387a;
    }
}

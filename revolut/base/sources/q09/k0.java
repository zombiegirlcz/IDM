package q09;

import com.revolut.data.model.Data;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import nii.l1;
import nii.n1;

/* JADX INFO: loaded from: classes4.dex */
public final class k0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ m0 f241191w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k0(m0 m0Var, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f241191w = m0Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                k0 k0Var = new k0(this.f241191w, continuation, 0);
                k0Var.v = obj2;
                return k0Var;
            default:
                k0 k0Var2 = new k0(this.f241191w, continuation, 1);
                k0Var2.v = obj2;
                return k0Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((k0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((k0) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        m0 m0Var = this.f241191w;
        switch (i) {
            case 0:
                Data data = (Data) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                pvk.b bVar = new pvk.b(data, 11);
                i0 i0Var = m0.Companion;
                m0Var.x2(bVar);
                break;
            default:
                n1 n1Var = (n1) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (n1Var instanceof l1) {
                    m0Var.z.k(Unit.f186387a);
                }
                break;
        }
        return Unit.f186387a;
    }
}

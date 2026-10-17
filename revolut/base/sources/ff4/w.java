package ff4;

import com.revolut.data.model.Data;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kp0.w0;
import vkm.j2;

/* JADX INFO: loaded from: classes22.dex */
public final class w extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f134749w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ b0 f134750x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(b0 b0Var, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f134750x = b0Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                w wVar = new w(this.f134750x, continuation, 0);
                wVar.f134749w = obj2;
                return wVar;
            default:
                w wVar2 = new w(this.f134750x, continuation, 1);
                wVar2.f134749w = obj2;
                return wVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((w) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((w) create((ax4.b) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                Data data = (Data) this.f134749w;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                b0 b0Var = this.f134750x;
                if (i == 0) {
                    yhm.o.b(obj2);
                    j2 j2Var = b0Var.v;
                    cv3.u.Companion.getClass();
                    cv3.u uVarA = cv3.t.a();
                    this.f134749w = data;
                    this.v = 1;
                    j2Var.getClass();
                    j2Var.g(null, uVarA);
                    if (Unit.f186387a == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                b0Var.H2(b0Var.f134712t, new f9a.i(data, 9));
                return Unit.f186387a;
            default:
                ax4.b bVar = (ax4.b) this.f134749w;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    b0 b0Var2 = this.f134750x;
                    b0Var2.H2(b0Var2.f134712t, new ah4.f(bVar, 3));
                    j2 j2Var2 = b0Var2.v;
                    cv3.u uVarL = w0.l(bVar);
                    this.f134749w = null;
                    this.v = 1;
                    j2Var2.getClass();
                    j2Var2.g(null, uVarL);
                    if (Unit.f186387a == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}

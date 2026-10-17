package ahd;

import com.revolut.data.model.Data;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final class v extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c0 f4963w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(c0 c0Var, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f4963w = c0Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                v vVar = new v(this.f4963w, continuation, 0);
                vVar.v = obj2;
                return vVar;
            case 1:
                v vVar2 = new v(this.f4963w, continuation, 1);
                vVar2.v = obj2;
                return vVar2;
            default:
                v vVar3 = new v(this.f4963w, continuation, 2);
                vVar3.v = obj2;
                return vVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((v) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((v) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((v) create((ogd.k) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        c0 c0Var = this.f4963w;
        switch (i) {
            case 0:
                Data data = (Data) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                c0Var.H2(c0Var.f4943w, new af4.t(data, 11));
                break;
            case 1:
                Data data2 = (Data) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                c0Var.H2(c0Var.f4943w, new af4.t(data2, 12));
                break;
            default:
                ogd.k kVar = (ogd.k) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                c0Var.H2(c0Var.f4943w, new w(kVar, 0));
                break;
        }
        return Unit.f186387a;
    }
}

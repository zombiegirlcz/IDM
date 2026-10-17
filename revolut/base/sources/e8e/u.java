package e8e;

import com.revolut.data.model.Data;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
public final class u extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ x f123655w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(x xVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f123655w = xVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                u uVar = new u(this.f123655w, continuation, 0);
                uVar.v = obj2;
                return uVar;
            case 1:
                u uVar2 = new u(this.f123655w, continuation, 1);
                uVar2.v = obj2;
                return uVar2;
            default:
                u uVar3 = new u(this.f123655w, continuation, 2);
                uVar3.v = obj2;
                return uVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((u) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((u) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((u) create((k71.q) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        x xVar = this.f123655w;
        switch (i) {
            case 0:
                List list = (List) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                xVar.x2(new do2.o(list, 7));
                break;
            case 1:
                Data data = (Data) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                xVar.x2(new e50.t(data, 14));
                break;
            default:
                k71.q qVar = (k71.q) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                xVar.x2(new ahf.v(qVar, 2));
                break;
        }
        return Unit.f186387a;
    }
}

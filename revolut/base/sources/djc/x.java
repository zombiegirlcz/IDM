package djc;

import com.revolut.data.model.Data;
import dcf.g0;
import java.time.LocalDate;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class x extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ b0 f115321w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(int i, b0 b0Var, Continuation continuation) {
        super(2, continuation);
        this.u = i;
        this.f115321w = b0Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                x xVar = new x(0, this.f115321w, continuation);
                xVar.v = obj2;
                return xVar;
            case 1:
                x xVar2 = new x(1, this.f115321w, continuation);
                xVar2.v = obj2;
                return xVar2;
            case 2:
                x xVar3 = new x(2, this.f115321w, continuation);
                xVar3.v = obj2;
                return xVar3;
            case 3:
                x xVar4 = new x(3, this.f115321w, continuation);
                xVar4.v = obj2;
                return xVar4;
            case 4:
                x xVar5 = new x(4, this.f115321w, continuation);
                xVar5.v = obj2;
                return xVar5;
            default:
                x xVar6 = new x(5, this.f115321w, continuation);
                xVar6.v = obj2;
                return xVar6;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((x) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((x) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((x) create((LocalDate) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((x) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((x) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((x) create((od0.i) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        b0 b0Var = this.f115321w;
        switch (i) {
            case 0:
                List list = (List) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                b0Var.H2(b0Var.f115296x, new bke.t(list, 29));
                break;
            case 1:
                Data data = (Data) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                b0Var.H2(b0Var.f115296x, new g0(data, 12));
                break;
            case 2:
                LocalDate localDate = (LocalDate) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                b0Var.H2(b0Var.f115296x, new a15.l(5, localDate));
                break;
            case 3:
                Data data2 = (Data) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                b0Var.H2(b0Var.f115296x, new g0(data2, 13));
                break;
            case 4:
                Data data3 = (Data) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                b0Var.H2(b0Var.f115296x, new g0(data3, 14));
                break;
            default:
                od0.i iVar = (od0.i) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                b0Var.H2(b0Var.f115296x, new z(0, iVar));
                break;
        }
        return Unit.f186387a;
    }
}

package fnc;

import com.revolut.data.model.Data;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class x extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d0 f136668w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(d0 d0Var, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f136668w = d0Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                x xVar = new x(this.f136668w, continuation, 0);
                xVar.v = obj2;
                return xVar;
            case 1:
                x xVar2 = new x(this.f136668w, continuation, 1);
                xVar2.v = obj2;
                return xVar2;
            case 2:
                x xVar3 = new x(this.f136668w, continuation, 2);
                xVar3.v = obj2;
                return xVar3;
            case 3:
                x xVar4 = new x(this.f136668w, continuation, 3);
                xVar4.v = obj2;
                return xVar4;
            case 4:
                x xVar5 = new x(this.f136668w, continuation, 4);
                xVar5.v = obj2;
                return xVar5;
            case 5:
                x xVar6 = new x(this.f136668w, continuation, 5);
                xVar6.v = obj2;
                return xVar6;
            case 6:
                x xVar7 = new x(this.f136668w, continuation, 6);
                xVar7.v = obj2;
                return xVar7;
            case 7:
                x xVar8 = new x(this.f136668w, continuation, 7);
                xVar8.v = obj2;
                return xVar8;
            case 8:
                x xVar9 = new x(this.f136668w, continuation, 8);
                xVar9.v = obj2;
                return xVar9;
            case 9:
                x xVar10 = new x(this.f136668w, continuation, 9);
                xVar10.v = obj2;
                return xVar10;
            case 10:
                x xVar11 = new x(this.f136668w, continuation, 10);
                xVar11.v = obj2;
                return xVar11;
            default:
                x xVar12 = new x(this.f136668w, continuation, 11);
                xVar12.v = obj2;
                return xVar12;
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
                return ((x) create((jlc.r) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((x) create((jlc.n) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((x) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((x) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((x) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((x) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((x) create((e7f.c) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 9:
                return ((x) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 10:
                return ((x) create((doc.j) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((x) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        d0 d0Var = this.f136668w;
        switch (i) {
            case 0:
                List list = (List) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                d0Var.H2(d0Var.F, new do2.o(list, 29));
                break;
            case 1:
                Data data = (Data) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                d0Var.H2(d0Var.F, new fk4.o(data, 6));
                break;
            case 2:
                jlc.r rVar = (jlc.r) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                d0Var.H2(d0Var.F, new z(rVar, 0));
                break;
            case 3:
                jlc.n nVar = (jlc.n) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                d0Var.A.e3(nVar);
                break;
            case 4:
                Data data2 = (Data) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                d0Var.H2(d0Var.F, new fk4.o(data2, 7));
                break;
            case 5:
                Data data3 = (Data) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                d0Var.H2(d0Var.F, new fk4.o(data3, 5));
                break;
            case 6:
                Data data4 = (Data) this.v;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                d0Var.H2(d0Var.F, new fk4.o(data4, 8));
                break;
            case 7:
                Data data5 = (Data) this.v;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                d0Var.H2(d0Var.F, new fk4.o(data5, 9));
                break;
            case 8:
                e7f.c cVar = (e7f.c) this.v;
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                d0Var.H2(d0Var.F, new fjd.w(cVar, 18));
                break;
            case 9:
                Data data6 = (Data) this.v;
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                d0Var.H2(d0Var.F, new fk4.o(data6, 10));
                break;
            case 10:
                doc.j jVar = (doc.j) this.v;
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                d0Var.H2(d0Var.F, new c0(jVar, 0));
                break;
            default:
                Data data7 = (Data) this.v;
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                d0Var.H2(d0Var.F, new fk4.o(data7, 11));
                break;
        }
        return Unit.f186387a;
    }
}

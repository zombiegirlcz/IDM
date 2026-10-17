package avk;

import com.revolut.data.model.Data;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes12.dex */
public final class v extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ h0 f10125w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(int i, h0 h0Var, Continuation continuation) {
        super(2, continuation);
        this.u = i;
        this.f10125w = h0Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                v vVar = new v(0, this.f10125w, continuation);
                vVar.v = obj2;
                return vVar;
            case 1:
                v vVar2 = new v(1, this.f10125w, continuation);
                vVar2.v = obj2;
                return vVar2;
            case 2:
                v vVar3 = new v(2, this.f10125w, continuation);
                vVar3.v = obj2;
                return vVar3;
            case 3:
                v vVar4 = new v(3, this.f10125w, continuation);
                vVar4.v = obj2;
                return vVar4;
            case 4:
                v vVar5 = new v(4, this.f10125w, continuation);
                vVar5.v = obj2;
                return vVar5;
            case 5:
                v vVar6 = new v(5, this.f10125w, continuation);
                vVar6.v = obj2;
                return vVar6;
            case 6:
                v vVar7 = new v(6, this.f10125w, continuation);
                vVar7.v = obj2;
                return vVar7;
            case 7:
                v vVar8 = new v(7, this.f10125w, continuation);
                vVar8.v = obj2;
                return vVar8;
            case 8:
                v vVar9 = new v(8, this.f10125w, continuation);
                vVar9.v = obj2;
                return vVar9;
            case 9:
                v vVar10 = new v(9, this.f10125w, continuation);
                vVar10.v = obj2;
                return vVar10;
            case 10:
                v vVar11 = new v(10, this.f10125w, continuation);
                vVar11.v = obj2;
                return vVar11;
            case 11:
                v vVar12 = new v(11, this.f10125w, continuation);
                vVar12.v = obj2;
                return vVar12;
            case 12:
                v vVar13 = new v(12, this.f10125w, continuation);
                vVar13.v = obj2;
                return vVar13;
            case 13:
                v vVar14 = new v(13, this.f10125w, continuation);
                vVar14.v = obj2;
                return vVar14;
            case 14:
                v vVar15 = new v(14, this.f10125w, continuation);
                vVar15.v = obj2;
                return vVar15;
            default:
                v vVar16 = new v(15, this.f10125w, continuation);
                vVar16.v = obj2;
                return vVar16;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((v) create((n2h.f) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((v) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((v) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((v) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((v) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((v) create((e3h.c) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((v) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((v) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((v) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 9:
                return ((v) create((atk.d) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 10:
                return ((v) create((h3h.d) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 11:
                return ((v) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 12:
                return ((v) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 13:
                return ((v) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 14:
                return ((v) create((jtk.i) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((v) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        h0 h0Var = this.f10125w;
        switch (i) {
            case 0:
                n2h.f fVar = (n2h.f) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                h0Var.H2(h0Var.G, new u(fVar, 0));
                break;
            case 1:
                List list = (List) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                h0Var.H2(h0Var.G, new a26.j(list, 17));
                break;
            case 2:
                List list2 = (List) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                h0Var.H2(h0Var.G, new a26.j(list2, 18));
                break;
            case 3:
                Data data = (Data) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                h0Var.H2(h0Var.G, new ap7.j(data, 9));
                break;
            case 4:
                List list3 = (List) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                h0Var.H2(h0Var.G, new a26.j(list3, 19));
                break;
            case 5:
                e3h.c cVar = (e3h.c) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                h0Var.H2(h0Var.G, new x(cVar, 0));
                break;
            case 6:
                List list4 = (List) this.v;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                h0Var.H2(h0Var.G, new a26.j(list4, 20));
                break;
            case 7:
                Data data2 = (Data) this.v;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                h0Var.H2(h0Var.G, new ap7.j(data2, 10));
                break;
            case 8:
                Data data3 = (Data) this.v;
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                h0Var.H2(h0Var.G, new ap7.j(data3, 11));
                break;
            case 9:
                atk.d dVar = (atk.d) this.v;
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                h0Var.H2(h0Var.G, new z(dVar, 0));
                break;
            case 10:
                h3h.d dVar2 = (h3h.d) this.v;
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                h0Var.H2(h0Var.G, new a0(dVar2, 0));
                break;
            case 11:
                Data data4 = (Data) this.v;
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                h0Var.H2(h0Var.G, new ap7.j(data4, 12));
                break;
            case 12:
                Data data5 = (Data) this.v;
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                h0Var.H2(h0Var.G, new ap7.j(data5, 13));
                break;
            case 13:
                List list5 = (List) this.v;
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                h0Var.H2(h0Var.G, new a26.j(list5, 21));
                break;
            case 14:
                jtk.i iVar = (jtk.i) this.v;
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                h0Var.H2(h0Var.G, new d0(iVar, 0));
                break;
            default:
                Data data6 = (Data) this.v;
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                h0Var.H2(h0Var.G, new ap7.j(data6, 14));
                break;
        }
        return Unit.f186387a;
    }
}

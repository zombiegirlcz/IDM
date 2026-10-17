package fvk;

import a83.p0;
import avk.a0;
import avk.d0;
import avk.z;
import com.revolut.data.model.Data;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes12.dex */
public final class r extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ x f138459w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(int i, x xVar, Continuation continuation) {
        super(2, continuation);
        this.u = i;
        this.f138459w = xVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                r rVar = new r(0, this.f138459w, continuation);
                rVar.v = obj2;
                return rVar;
            case 1:
                r rVar2 = new r(1, this.f138459w, continuation);
                rVar2.v = obj2;
                return rVar2;
            case 2:
                r rVar3 = new r(2, this.f138459w, continuation);
                rVar3.v = obj2;
                return rVar3;
            case 3:
                r rVar4 = new r(3, this.f138459w, continuation);
                rVar4.v = obj2;
                return rVar4;
            case 4:
                r rVar5 = new r(4, this.f138459w, continuation);
                rVar5.v = obj2;
                return rVar5;
            case 5:
                r rVar6 = new r(5, this.f138459w, continuation);
                rVar6.v = obj2;
                return rVar6;
            case 6:
                r rVar7 = new r(6, this.f138459w, continuation);
                rVar7.v = obj2;
                return rVar7;
            case 7:
                r rVar8 = new r(7, this.f138459w, continuation);
                rVar8.v = obj2;
                return rVar8;
            case 8:
                r rVar9 = new r(8, this.f138459w, continuation);
                rVar9.v = obj2;
                return rVar9;
            case 9:
                r rVar10 = new r(9, this.f138459w, continuation);
                rVar10.v = obj2;
                return rVar10;
            case 10:
                r rVar11 = new r(10, this.f138459w, continuation);
                rVar11.v = obj2;
                return rVar11;
            case 11:
                r rVar12 = new r(11, this.f138459w, continuation);
                rVar12.v = obj2;
                return rVar12;
            case 12:
                r rVar13 = new r(12, this.f138459w, continuation);
                rVar13.v = obj2;
                return rVar13;
            case 13:
                r rVar14 = new r(13, this.f138459w, continuation);
                rVar14.v = obj2;
                return rVar14;
            case 14:
                r rVar15 = new r(14, this.f138459w, continuation);
                rVar15.v = obj2;
                return rVar15;
            case 15:
                r rVar16 = new r(15, this.f138459w, continuation);
                rVar16.v = obj2;
                return rVar16;
            case 16:
                r rVar17 = new r(16, this.f138459w, continuation);
                rVar17.v = obj2;
                return rVar17;
            case 17:
                r rVar18 = new r(17, this.f138459w, continuation);
                rVar18.v = obj2;
                return rVar18;
            default:
                r rVar19 = new r(18, this.f138459w, continuation);
                rVar19.v = obj2;
                return rVar19;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((r) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((r) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((r) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((r) create((a3h.d) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((r) create((vsk.g) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((r) create((qdf.c) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((r) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((r) create((e3h.c) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((r) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 9:
                return ((r) create((atk.d) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 10:
                return ((r) create((btk.d) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 11:
                return ((r) create((h3h.d) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 12:
                return ((r) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 13:
                return ((r) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 14:
                return ((r) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 15:
                return ((r) create((ctk.l) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 16:
                return ((r) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 17:
                return ((r) create((jtk.i) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((r) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        int i2 = 2;
        x xVar = this.f138459w;
        switch (i) {
            case 0:
                List list = (List) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                xVar.H2(xVar.K, new q(list, 0));
                break;
            case 1:
                List list2 = (List) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                xVar.H2(xVar.K, new q(list2, 1));
                break;
            case 2:
                Pair pair = (Pair) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                xVar.H2(xVar.K, new p0((Data) pair.f186385a, (Data) pair.f186386b, 18));
                break;
            case 3:
                a3h.d dVar = (a3h.d) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                xVar.H2(xVar.K, new t(dVar, 0));
                break;
            case 4:
                vsk.g gVar = (vsk.g) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                xVar.H2(xVar.K, new u(gVar, 0));
                break;
            case 5:
                qdf.c cVar = (qdf.c) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                xVar.H2(xVar.K, new v(cVar, 0));
                break;
            case 6:
                List list3 = (List) this.v;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                xVar.H2(xVar.K, new q(list3, 2));
                break;
            case 7:
                e3h.c cVar2 = (e3h.c) this.v;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                xVar.H2(xVar.K, new avk.x(cVar2, i2));
                break;
            case 8:
                Data data = (Data) this.v;
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                xVar.H2(xVar.K, new fv6.r(data, 2));
                break;
            case 9:
                atk.d dVar2 = (atk.d) this.v;
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                xVar.H2(xVar.K, new z(dVar2, 1));
                break;
            case 10:
                btk.d dVar3 = (btk.d) this.v;
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                xVar.H2(xVar.K, new btk.i(dVar3, 1));
                break;
            case 11:
                h3h.d dVar4 = (h3h.d) this.v;
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                xVar.H2(xVar.K, new a0(dVar4, 1));
                break;
            case 12:
                Data data2 = (Data) this.v;
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                xVar.H2(xVar.K, new fv6.r(data2, 3));
                break;
            case 13:
                Data data3 = (Data) this.v;
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                xVar.H2(xVar.K, new fv6.r(data3, 4));
                break;
            case 14:
                Data data4 = (Data) this.v;
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                xVar.H2(xVar.K, new fv6.r(data4, 5));
                break;
            case 15:
                ctk.l lVar = (ctk.l) this.v;
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                xVar.H2(xVar.K, new ctk.q(lVar, 1));
                break;
            case 16:
                List list4 = (List) this.v;
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                xVar.H2(xVar.K, new q(list4, 3));
                break;
            case 17:
                jtk.i iVar = (jtk.i) this.v;
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                xVar.H2(xVar.K, new d0(iVar, 1));
                break;
            default:
                Data data5 = (Data) this.v;
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                xVar.H2(xVar.K, new fv6.r(data5, 6));
                break;
        }
        return Unit.f186387a;
    }
}

package d6j;

import com.revolut.data.model.Data;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: classes10.dex */
public final class e0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ n0 f111557w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e0(int i, n0 n0Var, Continuation continuation) {
        super(2, continuation);
        this.u = i;
        this.f111557w = n0Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                e0 e0Var = new e0(0, this.f111557w, continuation);
                e0Var.v = obj2;
                return e0Var;
            case 1:
                e0 e0Var2 = new e0(1, this.f111557w, continuation);
                e0Var2.v = obj2;
                return e0Var2;
            case 2:
                e0 e0Var3 = new e0(2, this.f111557w, continuation);
                e0Var3.v = obj2;
                return e0Var3;
            case 3:
                e0 e0Var4 = new e0(3, this.f111557w, continuation);
                e0Var4.v = obj2;
                return e0Var4;
            case 4:
                e0 e0Var5 = new e0(4, this.f111557w, continuation);
                e0Var5.v = obj2;
                return e0Var5;
            case 5:
                e0 e0Var6 = new e0(5, this.f111557w, continuation);
                e0Var6.v = obj2;
                return e0Var6;
            case 6:
                e0 e0Var7 = new e0(6, this.f111557w, continuation);
                e0Var7.v = obj2;
                return e0Var7;
            case 7:
                e0 e0Var8 = new e0(7, this.f111557w, continuation);
                e0Var8.v = obj2;
                return e0Var8;
            case 8:
                e0 e0Var9 = new e0(8, this.f111557w, continuation);
                e0Var9.v = obj2;
                return e0Var9;
            case 9:
                e0 e0Var10 = new e0(9, this.f111557w, continuation);
                e0Var10.v = obj2;
                return e0Var10;
            case 10:
                e0 e0Var11 = new e0(10, this.f111557w, continuation);
                e0Var11.v = obj2;
                return e0Var11;
            case 11:
                e0 e0Var12 = new e0(11, this.f111557w, continuation);
                e0Var12.v = obj2;
                return e0Var12;
            case 12:
                e0 e0Var13 = new e0(12, this.f111557w, continuation);
                e0Var13.v = obj2;
                return e0Var13;
            case 13:
                e0 e0Var14 = new e0(13, this.f111557w, continuation);
                e0Var14.v = obj2;
                return e0Var14;
            case 14:
                e0 e0Var15 = new e0(14, this.f111557w, continuation);
                e0Var15.v = obj2;
                return e0Var15;
            default:
                e0 e0Var16 = new e0(15, this.f111557w, continuation);
                e0Var16.v = obj2;
                return e0Var16;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((e0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((e0) create((qta.f) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((e0) create((y5j.b) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((e0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((e0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((e0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((e0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((e0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((e0) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 9:
                return ((e0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 10:
                return ((e0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 11:
                return ((e0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 12:
                return ((e0) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 13:
                return ((e0) create((ncj.g) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 14:
                return ((e0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((e0) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        int i2 = 12;
        n0 n0Var = this.f111557w;
        switch (i) {
            case 0:
                Data data = (Data) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                n0Var.H2(n0Var.R, new czc.b0(data, 9));
                ((MutableStateFlow) n0Var.T.getValue()).setValue(data);
                break;
            case 1:
                qta.f fVar = (qta.f) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                n0Var.H2(n0Var.R, new g0(fVar, 0));
                break;
            case 2:
                y5j.b bVar = (y5j.b) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                n0Var.H2(n0Var.R, new d34.b(bVar, i2));
                break;
            case 3:
                Data data2 = (Data) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                n0Var.H2(n0Var.R, new b8d.d0(1, data2, false));
                break;
            case 4:
                Data data3 = (Data) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                n0Var.H2(n0Var.R, new b8d.d0(2, data3, false));
                break;
            case 5:
                Data data4 = (Data) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                n0Var.H2(n0Var.R, new b8d.d0(3, data4, false));
                break;
            case 6:
                Data data5 = (Data) this.v;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                n0Var.H2(n0Var.R, new czc.b0(data5, 10));
                break;
            case 7:
                Data data6 = (Data) this.v;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                n0Var.H2(n0Var.R, new czc.b0(data6, 11));
                break;
            case 8:
                List list = (List) this.v;
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                n0Var.H2(n0Var.R, new bke.t(list, 21));
                break;
            case 9:
                Data data7 = (Data) this.v;
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                n0Var.H2(n0Var.R, new czc.b0(data7, 12));
                n0Var.S.setValue(data7);
                break;
            case 10:
                Data data8 = (Data) this.v;
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                n0Var.H2(n0Var.R, new czc.b0(data8, 13));
                break;
            case 11:
                Data data9 = (Data) this.v;
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                n0Var.H2(n0Var.R, new czc.b0(data9, 14));
                break;
            case 12:
                List list2 = (List) this.v;
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                n0Var.H2(n0Var.R, new bke.t(list2, 22));
                break;
            case 13:
                ncj.g gVar = (ncj.g) this.v;
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                n0Var.H2(n0Var.R, new k0(gVar, 0));
                break;
            case 14:
                Data data10 = (Data) this.v;
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                n0Var.H2(n0Var.R, new czc.b0(data10, 15));
                break;
            default:
                List list3 = (List) this.v;
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                n0Var.H2(n0Var.R, new bke.t(list3, 23));
                break;
        }
        return Unit.f186387a;
    }
}

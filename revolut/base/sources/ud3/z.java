package ud3;

import com.revolut.data.model.Data;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes21.dex */
public final class z extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e0 f279126w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(e0 e0Var, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f279126w = e0Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                z zVar = new z(this.f279126w, continuation, 0);
                zVar.v = obj2;
                return zVar;
            case 1:
                z zVar2 = new z(this.f279126w, continuation, 1);
                zVar2.v = obj2;
                return zVar2;
            case 2:
                z zVar3 = new z(this.f279126w, continuation, 2);
                zVar3.v = obj2;
                return zVar3;
            case 3:
                z zVar4 = new z(this.f279126w, continuation, 3);
                zVar4.v = obj2;
                return zVar4;
            case 4:
                z zVar5 = new z(this.f279126w, continuation, 4);
                zVar5.v = obj2;
                return zVar5;
            case 5:
                z zVar6 = new z(this.f279126w, continuation, 5);
                zVar6.v = obj2;
                return zVar6;
            case 6:
                z zVar7 = new z(this.f279126w, continuation, 6);
                zVar7.v = obj2;
                return zVar7;
            case 7:
                z zVar8 = new z(this.f279126w, continuation, 7);
                zVar8.v = obj2;
                return zVar8;
            case 8:
                z zVar9 = new z(this.f279126w, continuation, 8);
                zVar9.v = obj2;
                return zVar9;
            case 9:
                z zVar10 = new z(this.f279126w, continuation, 9);
                zVar10.v = obj2;
                return zVar10;
            default:
                z zVar11 = new z(this.f279126w, continuation, 10);
                zVar11.v = obj2;
                return zVar11;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Data data = (Data) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((z) create(data, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        e0 e0Var = this.f279126w;
        switch (i) {
            case 0:
                Data data = (Data) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                e0Var.x2(new u4e.l(data, 26));
                break;
            case 1:
                Data data2 = (Data) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                e0Var.x2(new u4e.l(data2, 27));
                break;
            case 2:
                Data data3 = (Data) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                e0Var.x2(new u4e.l(data3, 28));
                break;
            case 3:
                Data data4 = (Data) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                e0Var.x2(new u4e.l(data4, 29));
                break;
            case 4:
                Data data5 = (Data) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                e0Var.x2(new u4e.l(data5, 25));
                break;
            case 5:
                Data data6 = (Data) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                e0Var.x2(new a0(data6, 0));
                break;
            case 6:
                Data data7 = (Data) this.v;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                e0Var.x2(new a0(data7, 1));
                break;
            case 7:
                Data data8 = (Data) this.v;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                e0Var.x2(new a0(data8, 2));
                break;
            case 8:
                Data data9 = (Data) this.v;
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                e0Var.x2(new a0(data9, 3));
                break;
            case 9:
                Data data10 = (Data) this.v;
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                e0Var.x2(new a0(data10, 4));
                break;
            default:
                Data data11 = (Data) this.v;
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                e0Var.x2(new a0(data11, 5));
                break;
        }
        return Unit.f186387a;
    }
}

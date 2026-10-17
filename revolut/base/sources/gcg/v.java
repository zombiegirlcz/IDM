package gcg;

import com.revolut.data.model.Data;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes9.dex */
public final class v extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e0 f142470w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(e0 e0Var, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f142470w = e0Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                v vVar = new v(this.f142470w, continuation, 0);
                vVar.v = obj2;
                return vVar;
            case 1:
                v vVar2 = new v(this.f142470w, continuation, 1);
                vVar2.v = obj2;
                return vVar2;
            case 2:
                v vVar3 = new v(this.f142470w, continuation, 2);
                vVar3.v = obj2;
                return vVar3;
            case 3:
                v vVar4 = new v(this.f142470w, continuation, 3);
                vVar4.v = obj2;
                return vVar4;
            case 4:
                v vVar5 = new v(this.f142470w, continuation, 4);
                vVar5.v = obj2;
                return vVar5;
            case 5:
                v vVar6 = new v(this.f142470w, continuation, 5);
                vVar6.v = obj2;
                return vVar6;
            case 6:
                v vVar7 = new v(this.f142470w, continuation, 6);
                vVar7.v = obj2;
                return vVar7;
            case 7:
                v vVar8 = new v(this.f142470w, continuation, 7);
                vVar8.v = obj2;
                return vVar8;
            case 8:
                v vVar9 = new v(this.f142470w, continuation, 8);
                vVar9.v = obj2;
                return vVar9;
            default:
                v vVar10 = new v(this.f142470w, continuation, 9);
                vVar10.v = obj2;
                return vVar10;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((v) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((v) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((v) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((v) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((v) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((v) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((v) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((v) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((v) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((v) create((s) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        e0 e0Var = this.f142470w;
        switch (i) {
            case 0:
                Data data = (Data) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                e0Var.H2(e0Var.E, new g4c.t(data, 14));
                break;
            case 1:
                Data data2 = (Data) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                e0Var.H2(e0Var.E, new g4c.t(data2, 15));
                break;
            case 2:
                Data data3 = (Data) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                e0Var.H2(e0Var.E, new g4c.t(data3, 16));
                break;
            case 3:
                Data data4 = (Data) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                e0Var.H2(e0Var.E, new g4c.t(data4, 17));
                break;
            case 4:
                Data data5 = (Data) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                e0Var.H2(e0Var.E, new g4c.t(data5, 18));
                break;
            case 5:
                Data data6 = (Data) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                e0Var.H2(e0Var.E, new g4c.t(data6, 19));
                break;
            case 6:
                Data data7 = (Data) this.v;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                e0Var.H2(e0Var.E, new g4c.t(data7, 20));
                break;
            case 7:
                Data data8 = (Data) this.v;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                e0Var.H2(e0Var.E, new g4c.t(data8, 21));
                break;
            case 8:
                Data data9 = (Data) this.v;
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                e0Var.H2(e0Var.E, new g4c.t(data9, 22));
                break;
            default:
                s sVar = (s) this.v;
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                e0Var.H2(e0Var.E, new g4k.e(sVar, 26));
                break;
        }
        return Unit.f186387a;
    }
}

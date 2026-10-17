package yic;

import com.revolut.data.model.Data;
import djc.z;
import java.time.LocalDate;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class u extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ x f314295w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(int i, Continuation continuation, x xVar) {
        super(2, continuation);
        this.u = i;
        this.f314295w = xVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                u uVar = new u(0, continuation, this.f314295w);
                uVar.v = obj2;
                return uVar;
            case 1:
                u uVar2 = new u(1, continuation, this.f314295w);
                uVar2.v = obj2;
                return uVar2;
            case 2:
                u uVar3 = new u(2, continuation, this.f314295w);
                uVar3.v = obj2;
                return uVar3;
            case 3:
                u uVar4 = new u(3, continuation, this.f314295w);
                uVar4.v = obj2;
                return uVar4;
            case 4:
                u uVar5 = new u(4, continuation, this.f314295w);
                uVar5.v = obj2;
                return uVar5;
            case 5:
                u uVar6 = new u(5, continuation, this.f314295w);
                uVar6.v = obj2;
                return uVar6;
            case 6:
                u uVar7 = new u(6, continuation, this.f314295w);
                uVar7.v = obj2;
                return uVar7;
            default:
                u uVar8 = new u(7, continuation, this.f314295w);
                uVar8.v = obj2;
                return uVar8;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((u) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((u) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((u) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((u) create((LocalDate) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((u) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((u) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((u) create((od0.i) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((u) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        x xVar = this.f314295w;
        switch (i) {
            case 0:
                Data data = (Data) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                xVar.H2(xVar.v, new yfd.u(data, 5));
                break;
            case 1:
                List list = (List) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                xVar.H2(xVar.v, new x5f.m(list, 19));
                break;
            case 2:
                Data data2 = (Data) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                xVar.H2(xVar.v, new yfd.u(data2, 6));
                break;
            case 3:
                LocalDate localDate = (LocalDate) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                xVar.H2(xVar.v, new t5g.h(11, localDate));
                break;
            case 4:
                Data data3 = (Data) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                xVar.H2(xVar.v, new yfd.u(data3, 7));
                break;
            case 5:
                Data data4 = (Data) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                xVar.H2(xVar.v, new yfd.u(data4, 8));
                break;
            case 6:
                od0.i iVar = (od0.i) this.v;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                xVar.H2(xVar.v, new z(27, iVar));
                break;
            default:
                Data data5 = (Data) this.v;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                xVar.H2(xVar.v, new yfd.u(data5, 9));
                break;
        }
        return Unit.f186387a;
    }
}

package j2g;

import com.revolut.data.model.Data;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes9.dex */
public final class o extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ y f170880w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(y yVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f170880w = yVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                o oVar = new o(this.f170880w, continuation, 0);
                oVar.v = obj2;
                return oVar;
            case 1:
                o oVar2 = new o(this.f170880w, continuation, 1);
                oVar2.v = obj2;
                return oVar2;
            case 2:
                o oVar3 = new o(this.f170880w, continuation, 2);
                oVar3.v = obj2;
                return oVar3;
            case 3:
                o oVar4 = new o(this.f170880w, continuation, 3);
                oVar4.v = obj2;
                return oVar4;
            case 4:
                o oVar5 = new o(this.f170880w, continuation, 4);
                oVar5.v = obj2;
                return oVar5;
            default:
                o oVar6 = new o(this.f170880w, continuation, 5);
                oVar6.v = obj2;
                return oVar6;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((o) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((o) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((o) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((o) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((o) create((kyf.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((o) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        y yVar = this.f170880w;
        switch (i) {
            case 0:
                Data data = (Data) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                yVar.H2(yVar.f170892x, new iuj.z(data, 24));
                break;
            case 1:
                Data data2 = (Data) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                yVar.H2(yVar.f170892x, new iuj.z(data2, 25));
                break;
            case 2:
                Data data3 = (Data) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                yVar.H2(yVar.f170892x, new iuj.z(data3, 26));
                break;
            case 3:
                Data data4 = (Data) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                yVar.H2(yVar.f170892x, new iuj.z(data4, 27));
                break;
            case 4:
                kyf.a aVar5 = (kyf.a) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                yVar.H2(yVar.f170892x, new iyi.i(aVar5, yVar));
                break;
            default:
                Data data5 = (Data) this.v;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                yVar.H2(yVar.f170892x, new iuj.z(data5, 28));
                break;
        }
        return Unit.f186387a;
    }
}

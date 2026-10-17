package bg9;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes5.dex */
public final class o extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ r f15149w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(r rVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f15149w = rVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                o oVar = new o(this.f15149w, continuation, 0);
                oVar.v = obj2;
                return oVar;
            default:
                o oVar2 = new o(this.f15149w, continuation, 1);
                oVar2.v = obj2;
                return oVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((o) create((xf9.b) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((o) create((xf9.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Flow flowD3;
        Flow flowC3;
        switch (this.u) {
            case 0:
                xf9.b bVar = (xf9.b) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                r rVar = this.f15149w;
                rVar.H2(rVar.f15154r, new b9i.f(bVar, 24));
                break;
            default:
                xf9.a aVar2 = (xf9.a) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                int i = 0;
                Continuation continuation = null;
                r rVar2 = this.f15149w;
                if (aVar2 != null) {
                    yji.l.a1(rVar2, aVar2.e3(), null, null, new o(rVar2, continuation, i), 3);
                }
                if (aVar2 != null && (flowC3 = aVar2.c3()) != null) {
                    yji.l.a1(rVar2, flowC3, null, null, new m(rVar2, continuation, i), 3);
                }
                if (aVar2 != null && (flowD3 = aVar2.d3()) != null) {
                    yji.l.a1(rVar2, flowD3, null, null, new m(rVar2, continuation, 1), 3);
                }
                break;
        }
        return Unit.f186387a;
    }
}

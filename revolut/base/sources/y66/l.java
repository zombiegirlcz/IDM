package y66;

import com.revolut.data.model.Data;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import skm.a2;

/* JADX INFO: loaded from: classes3.dex */
public final class l extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ o f311192w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(int i, Continuation continuation, o oVar) {
        super(2, continuation);
        this.u = i;
        this.f311192w = oVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                l lVar = new l(0, continuation, this.f311192w);
                lVar.v = obj2;
                return lVar;
            case 1:
                l lVar2 = new l(1, continuation, this.f311192w);
                lVar2.v = obj2;
                return lVar2;
            default:
                l lVar3 = new l(2, continuation, this.f311192w);
                lVar3.v = obj2;
                return lVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((l) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((l) create((lk0.g) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((l) create((yhm.r) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        o oVar = this.f311192w;
        switch (i) {
            case 0:
                Data data = (Data) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                oVar.H2(oVar.v, new y4c.i(data, 8));
                break;
            case 1:
                lk0.g gVar = (lk0.g) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                oVar.H2(oVar.v, new a3e.s(gVar, 17));
                break;
            default:
                yhm.r rVar = (yhm.r) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                String str = (String) rVar.f314201a;
                xi0.b bVar = (xi0.b) rVar.f314202b;
                Set set = (Set) rVar.f314203c;
                if (bVar != null) {
                    o oVar2 = this.f311192w;
                    a2 a2Var = oVar2.f311201t;
                    if (a2Var != null) {
                        a2Var.f(null);
                    }
                    oVar2.H2(oVar2.v, new y4b.b(27));
                    oVar2.f311201t = oVar2.l2(new n(oVar2, str, bVar, set, null), new yi5.b(26));
                }
                break;
        }
        return Unit.f186387a;
    }
}

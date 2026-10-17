package ntf;

import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import lfg.d0;
import nfj.j2;
import nii.l1;
import nii.n1;

/* JADX INFO: loaded from: classes9.dex */
public final class o extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ r f219033w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(r rVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f219033w = rVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                o oVar = new o(this.f219033w, continuation, 0);
                oVar.v = obj2;
                return oVar;
            default:
                o oVar2 = new o(this.f219033w, continuation, 1);
                oVar2.v = obj2;
                return oVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((o) create((Set) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((o) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                Set set = (Set) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                r rVar = this.f219033w;
                rVar.H2(rVar.u, new imk.e(20, set));
                break;
            default:
                n1 n1Var = (n1) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (n1Var instanceof l1) {
                    i iVar = i.f219025a;
                    r rVar2 = this.f219033w;
                    rVar2.C2(iVar);
                    yji.l.a1(rVar2, vkm.q.P(new d0(rVar2.u.B(new nrb.c(26)), 23), 1), null, null, new j2(rVar2, null, 28), 3);
                }
                break;
        }
        return Unit.f186387a;
    }
}

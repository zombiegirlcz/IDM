package nfj;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes11.dex */
public final class i1 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ m1 f214959w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i1(m1 m1Var, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f214959w = m1Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                i1 i1Var = new i1(this.f214959w, continuation, 0);
                i1Var.v = obj2;
                return i1Var;
            default:
                i1 i1Var2 = new i1(this.f214959w, continuation, 1);
                i1Var2.v = obj2;
                return i1Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((i1) create((dej.m) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((i1) create((e1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        m1 m1Var = this.f214959w;
        switch (i) {
            case 0:
                dej.m mVar = (dej.m) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ue0.c cVar = m1Var.f214989c;
                String strQ = j6.a.q("PROFILES_KEY", mVar.name());
                m1.Companion.getClass();
                List list = (List) cVar.T2(strQ, m1.i);
                if (list != null) {
                    return ofj.m.b(list);
                }
                return null;
            default:
                e1 e1Var = (e1) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ue0.c cVar2 = m1Var.f214989c;
                String str = e1Var.f214938a;
                if (str == null) {
                    str = "";
                }
                kfj.l lVar = (kfj.l) cVar2.T2("TROUBLESHOOTING_KEY_".concat(str), kfj.l.class);
                if (lVar != null) {
                    return io3.h.B(lVar);
                }
                return null;
        }
    }
}

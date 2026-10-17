package nfj;

import java.util.List;
import kfj.a4;
import kfj.y3;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes11.dex */
public final class t0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ u0 f215044w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t0(u0 u0Var, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f215044w = u0Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                t0 t0Var = new t0(this.f215044w, continuation, 0);
                t0Var.v = obj2;
                return t0Var;
            case 1:
                t0 t0Var2 = new t0(this.f215044w, continuation, 1);
                t0Var2.v = obj2;
                return t0Var2;
            default:
                t0 t0Var3 = new t0(this.f215044w, continuation, 2);
                t0Var3.v = obj2;
                return t0Var3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((t0) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((t0) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((t0) create((q0) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        u0 u0Var = this.f215044w;
        switch (i) {
            case 0:
                String str = (String) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ue0.c cVar = u0Var.f215054c;
                String strQ = j6.a.q("PHONE_NUMBER_CANCELLATION_PREVIEW_KEY", str);
                u0.Companion.getClass();
                y3 y3Var = (y3) cVar.T2(strQ, u0.k);
                if (y3Var != null) {
                    return mif.e0.E(y3Var);
                }
                return null;
            case 1:
                String str2 = (String) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ue0.c cVar2 = u0Var.f215054c;
                String strQ2 = j6.a.q("PHONE_NUMBER_KEY", str2);
                u0.Companion.getClass();
                a4 a4Var = (a4) cVar2.T2(strQ2, u0.f215051l);
                if (a4Var != null) {
                    return ofj.p.b(a4Var, null, null);
                }
                return null;
            default:
                q0 q0Var = (q0) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ue0.c cVar3 = u0Var.f215054c;
                String strA = u0Var.a(q0Var);
                u0.Companion.getClass();
                List list = (List) cVar3.T2(strA, u0.f215050j);
                if (list != null) {
                    return ofj.k.i(list);
                }
                return null;
        }
    }
}

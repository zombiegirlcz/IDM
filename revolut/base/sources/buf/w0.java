package buf;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes9.dex */
public final class w0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ a1 f18844w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w0(a1 a1Var, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f18844w = a1Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                w0 w0Var = new w0(this.f18844w, continuation, 0);
                w0Var.v = obj2;
                return w0Var;
            case 1:
                w0 w0Var2 = new w0(this.f18844w, continuation, 1);
                w0Var2.v = obj2;
                return w0Var2;
            default:
                w0 w0Var3 = new w0(this.f18844w, continuation, 2);
                w0Var3.v = obj2;
                return w0Var3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((w0) create((yhm.r) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((w0) create((d) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((w0) create((Clause) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        a1 a1Var = this.f18844w;
        switch (i) {
            case 0:
                yhm.r rVar = (yhm.r) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                boolean zBooleanValue = ((Boolean) rVar.f314201a).booleanValue();
                boolean zBooleanValue2 = ((Boolean) rVar.f314202b).booleanValue();
                boolean zBooleanValue3 = ((Boolean) rVar.f314203c).booleanValue();
                a1Var.x2(new bq7.j(new b((zBooleanValue && zBooleanValue2) ? e.ENABLED : e.DISABLED, (zBooleanValue2 && zBooleanValue3) ? e.ENABLED : (zBooleanValue2 || !zBooleanValue3) ? e.HIDDEN : e.DISABLED), 14));
                break;
            case 1:
                d dVar = (d) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                a1Var.x2(new bq7.j(dVar, 15));
                break;
            default:
                Clause clause = (Clause) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                a1Var.x2(new ag1.l(clause, 1));
                break;
        }
        return Unit.f186387a;
    }
}

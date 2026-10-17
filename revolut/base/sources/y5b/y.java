package y5b;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import w5b.d3;

/* JADX INFO: loaded from: classes6.dex */
public final class y extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c0 f311071w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(c0 c0Var, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f311071w = c0Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                y yVar = new y(this.f311071w, continuation, 0);
                yVar.v = obj2;
                return yVar;
            default:
                y yVar2 = new y(this.f311071w, continuation, 1);
                yVar2.v = obj2;
                return yVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        String str = (String) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((y) create(str, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        c0 c0Var = this.f311071w;
        switch (i) {
            case 0:
                String str = (String) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ue0.c cVar = c0Var.f311027b;
                c0.Companion.getClass();
                w5b.f fVar = (w5b.f) cVar.T2(x.a(str), w5b.f.class);
                if (fVar != null) {
                    return vc.o.u(fVar);
                }
                return null;
            default:
                String str2 = (String) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ue0.c cVar2 = c0Var.f311027b;
                c0.Companion.getClass();
                d3 d3Var = (d3) cVar2.T2(x.b(str2), d3.class);
                if (d3Var != null) {
                    return c0.a(c0Var, x5b.e.a(d3Var));
                }
                return null;
        }
    }
}

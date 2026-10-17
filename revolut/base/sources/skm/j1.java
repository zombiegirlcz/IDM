package skm;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes13.dex */
public final class j1 extends l {
    public final r1 i;

    public j1(Continuation continuation, r1 r1Var) {
        super(1, continuation);
        this.i = r1Var;
    }

    @Override // skm.l
    public final String B() {
        return "AwaitContinuation";
    }

    @Override // skm.l
    public final Throwable s(r1 r1Var) {
        Throwable thC;
        r1 r1Var2 = this.i;
        r1Var2.getClass();
        Object obj2 = r1.f264005a.get(r1Var2);
        return (!(obj2 instanceof l1) || (thC = ((l1) obj2).c()) == null) ? obj2 instanceof u ? ((u) obj2).f264012a : r1Var.p() : thC;
    }
}

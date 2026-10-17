package d7j;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes10.dex */
public final class n1 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ o1 f112032w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(o1 o1Var, Continuation continuation) {
        super(continuation);
        this.f112032w = o1Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f112032w.emit(null, this);
    }
}

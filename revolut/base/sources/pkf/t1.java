package pkf;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes8.dex */
public final class t1 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d1 f237130w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(d1 d1Var, Continuation continuation) {
        super(continuation);
        this.f237130w = d1Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f237130w.emit(null, this);
    }
}

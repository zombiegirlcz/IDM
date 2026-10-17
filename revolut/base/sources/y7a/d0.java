package y7a;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes5.dex */
public final class d0 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ b0 f311439w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(b0 b0Var, Continuation continuation) {
        super(continuation);
        this.f311439w = b0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f311439w.emit(null, this);
    }
}

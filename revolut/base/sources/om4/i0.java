package om4;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes22.dex */
public final class i0 extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ k0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f226598w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(k0 k0Var, Continuation continuation) {
        super(continuation);
        this.v = k0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f226598w |= Integer.MIN_VALUE;
        return this.v.b(null, null, this);
    }
}

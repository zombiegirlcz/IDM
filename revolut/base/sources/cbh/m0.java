package cbh;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes9.dex */
public final class m0 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ard.b0 f22829w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(ard.b0 b0Var, Continuation continuation) {
        super(continuation);
        this.f22829w = b0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f22829w.emit(null, this);
    }
}

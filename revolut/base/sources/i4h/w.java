package i4h;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes9.dex */
public final class w extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ g23.e0 f158492w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(g23.e0 e0Var, Continuation continuation) {
        super(continuation);
        this.f158492w = e0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f158492w.emit(null, this);
    }
}

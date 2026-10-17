package gld;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes7.dex */
public final class e extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ g23.e0 f144635w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g23.e0 e0Var, Continuation continuation) {
        super(continuation);
        this.f144635w = e0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f144635w.emit(null, this);
    }
}

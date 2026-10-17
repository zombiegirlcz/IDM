package b4b;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ b0a.f f12212w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b0a.f fVar, Continuation continuation) {
        super(continuation);
        this.f12212w = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f12212w.emit(null, this);
    }
}

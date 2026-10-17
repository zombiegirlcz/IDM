package y8j;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes11.dex */
public final class e extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ xv5.f f311664w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(xv5.f fVar, Continuation continuation) {
        super(continuation);
        this.f311664w = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f311664w.emit(null, this);
    }
}

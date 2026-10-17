package d7e;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes8.dex */
public final class e extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d6e.d f111940w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(d6e.d dVar, Continuation continuation) {
        super(continuation);
        this.f111940w = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f111940w.emit(null, this);
    }
}

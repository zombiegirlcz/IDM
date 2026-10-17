package buf;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes9.dex */
public final class v0 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ bq5.o f18843w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(bq5.o oVar, Continuation continuation) {
        super(continuation);
        this.f18843w = oVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f18843w.emit(null, this);
    }
}

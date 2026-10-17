package wa7;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes21.dex */
public final class g extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ wa3.h f295838w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(wa3.h hVar, Continuation continuation) {
        super(continuation);
        this.f295838w = hVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f295838w.emit(null, this);
    }
}

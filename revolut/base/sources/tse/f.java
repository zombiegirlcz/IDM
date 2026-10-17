package tse;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes8.dex */
public final class f extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ sij.c f274103w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(sij.c cVar, Continuation continuation) {
        super(continuation);
        this.f274103w = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f274103w.emit(null, this);
    }
}

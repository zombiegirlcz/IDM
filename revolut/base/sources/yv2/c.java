package yv2;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes21.dex */
public final class c extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ yuc.d f317100w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(yuc.d dVar, Continuation continuation) {
        super(continuation);
        this.f317100w = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f317100w.emit(null, this);
    }
}

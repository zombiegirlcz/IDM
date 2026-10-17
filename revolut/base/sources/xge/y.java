package xge;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes8.dex */
public final class y extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ w f305755w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(w wVar, Continuation continuation) {
        super(continuation);
        this.f305755w = wVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f305755w.emit(null, this);
    }
}

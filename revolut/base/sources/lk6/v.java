package lk6;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes3.dex */
public final class v extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ l5d.d f196267w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(l5d.d dVar, Continuation continuation) {
        super(continuation);
        this.f196267w = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f196267w.emit(null, this);
    }
}

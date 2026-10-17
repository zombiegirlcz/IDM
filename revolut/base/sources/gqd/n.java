package gqd;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes7.dex */
public final class n extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ god.k f145690w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(god.k kVar, Continuation continuation) {
        super(continuation);
        this.f145690w = kVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f145690w.emit(null, this);
    }
}

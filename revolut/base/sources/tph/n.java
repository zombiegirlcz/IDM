package tph;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes10.dex */
public final class n extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ tnb.j f273390w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(tnb.j jVar, Continuation continuation) {
        super(continuation);
        this.f273390w = jVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f273390w.emit(null, this);
    }
}

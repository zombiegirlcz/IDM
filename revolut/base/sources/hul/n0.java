package hul;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes12.dex */
public final class n0 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ hui.d f155751w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(hui.d dVar, Continuation continuation) {
        super(continuation);
        this.f155751w = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f155751w.emit(null, this);
    }
}

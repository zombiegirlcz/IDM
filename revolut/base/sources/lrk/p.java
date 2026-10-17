package lrk;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes12.dex */
public final class p extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ lkf.q f199547w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(lkf.q qVar, Continuation continuation) {
        super(continuation);
        this.f199547w = qVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f199547w.emit(null, this);
    }
}

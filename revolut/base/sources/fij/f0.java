package fij;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes11.dex */
public final class f0 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ dc0.c f135445w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(dc0.c cVar, Continuation continuation) {
        super(continuation);
        this.f135445w = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f135445w.emit(null, this);
    }
}

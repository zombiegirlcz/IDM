package vkm;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes13.dex */
public final class g extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ mk0.j v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f290023w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(mk0.j jVar, Continuation continuation) {
        super(continuation);
        this.v = jVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f290023w |= Integer.MIN_VALUE;
        return this.v.emit(null, this);
    }
}

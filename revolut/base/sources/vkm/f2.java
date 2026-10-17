package vkm;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes14.dex */
public final class f2 extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ fa7.c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f290022w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(fa7.c cVar, Continuation continuation) {
        super(continuation);
        this.v = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f290022w |= Integer.MIN_VALUE;
        return this.v.a(0, this);
    }
}

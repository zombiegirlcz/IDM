package vkm;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes14.dex */
public final class n0 extends gim.c {
    public o0 u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f290078w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ o0 f290079x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(o0 o0Var, Continuation continuation) {
        super(continuation);
        this.f290079x = o0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f290078w |= Integer.MIN_VALUE;
        return this.f290079x.emit(null, this);
    }
}

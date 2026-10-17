package vkm;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes14.dex */
public final class x0 extends gim.c {
    public y0 u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f290142w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ y0 f290143x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Object f290144y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(y0 y0Var, Continuation continuation) {
        super(continuation);
        this.f290143x = y0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f290142w |= Integer.MIN_VALUE;
        return this.f290143x.emit(null, this);
    }
}

package vkm;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes14.dex */
public final class b1 extends gim.c {
    public y0 u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f289997w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ y0 f289998x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Object f289999y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(y0 y0Var, Continuation continuation) {
        super(continuation);
        this.f289998x = y0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f289997w |= Integer.MIN_VALUE;
        return this.f289998x.emit(null, this);
    }
}

package nj8;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes4.dex */
public final class k extends gim.c {
    public boolean u;
    public qj8.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f216400w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ n f216401x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f216402y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(n nVar, Continuation continuation) {
        super(continuation);
        this.f216401x = nVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f216400w = obj2;
        this.f216402y |= Integer.MIN_VALUE;
        return this.f216401x.n(false, this);
    }
}

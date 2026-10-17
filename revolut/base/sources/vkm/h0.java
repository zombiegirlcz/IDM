package vkm;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes13.dex */
public final class h0 extends gim.c {
    public mk0.j u;
    public Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f290033w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ mk0.j f290034x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f290035y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(mk0.j jVar, Continuation continuation) {
        super(continuation);
        this.f290034x = jVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f290033w = obj2;
        this.f290035y |= Integer.MIN_VALUE;
        return this.f290034x.emit(null, this);
    }
}

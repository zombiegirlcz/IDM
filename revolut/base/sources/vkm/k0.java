package vkm;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes14.dex */
public final class k0 extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ c2d.l0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f290057w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(c2d.l0 l0Var, Continuation continuation) {
        super(continuation);
        this.v = l0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f290057w |= Integer.MIN_VALUE;
        return this.v.emit(null, this);
    }
}

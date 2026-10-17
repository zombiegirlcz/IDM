package vkm;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes14.dex */
public final class l0 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ knd.g0 f290062w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public aci.d f290063x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(knd.g0 g0Var, Continuation continuation) {
        super(continuation);
        this.f290062w = g0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f290062w.collect(null, this);
    }
}

package vkm;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes14.dex */
public final class n2 extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ o2 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f290083w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2(o2 o2Var, Continuation continuation) {
        super(continuation);
        this.v = o2Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f290083w |= Integer.MIN_VALUE;
        return this.v.collect(null, this);
    }
}

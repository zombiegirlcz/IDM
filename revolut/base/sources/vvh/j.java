package vvh;

import c2d.l0;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes10.dex */
public final class j extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ l0 f292551w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(l0 l0Var, Continuation continuation) {
        super(continuation);
        this.f292551w = l0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f292551w.emit(null, this);
    }
}

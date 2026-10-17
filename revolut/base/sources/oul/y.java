package oul;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes12.dex */
public final class y extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ood.x f229926w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(ood.x xVar, Continuation continuation) {
        super(continuation);
        this.f229926w = xVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f229926w.emit(null, this);
    }
}

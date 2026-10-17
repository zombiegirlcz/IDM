package ood;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes7.dex */
public final class j0 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ x f227051w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(x xVar, Continuation continuation) {
        super(continuation);
        this.f227051w = xVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f227051w.emit(null, this);
    }
}

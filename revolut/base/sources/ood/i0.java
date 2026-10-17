package ood;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes7.dex */
public final class i0 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ x f227047w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(x xVar, Continuation continuation) {
        super(continuation);
        this.f227047w = xVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f227047w.emit(null, this);
    }
}

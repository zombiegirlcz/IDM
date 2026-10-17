package lfg;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes9.dex */
public final class c0 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ l5d.d f194866w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(l5d.d dVar, Continuation continuation) {
        super(continuation);
        this.f194866w = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f194866w.emit(null, this);
    }
}

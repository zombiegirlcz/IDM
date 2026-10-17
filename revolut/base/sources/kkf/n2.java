package kkf;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes8.dex */
public final class n2 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ kbb.n f184839w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2(kbb.n nVar, Continuation continuation) {
        super(continuation);
        this.f184839w = nVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f184839w.emit(null, this);
    }
}

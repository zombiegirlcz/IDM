package urd;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes7.dex */
public final class i extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ uh7.q f282287w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(uh7.q qVar, Continuation continuation) {
        super(continuation);
        this.f282287w = qVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f282287w.emit(null, this);
    }
}

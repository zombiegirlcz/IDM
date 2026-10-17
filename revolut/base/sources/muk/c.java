package muk;

import kotlin.coroutines.Continuation;
import mle.t;

/* JADX INFO: loaded from: classes12.dex */
public final class c extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ t f209040w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(t tVar, Continuation continuation) {
        super(continuation);
        this.f209040w = tVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f209040w.emit(null, this);
    }
}

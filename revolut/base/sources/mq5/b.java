package mq5;

import kotlin.coroutines.Continuation;
import mle.t;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ t f207885w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(t tVar, Continuation continuation) {
        super(continuation);
        this.f207885w = tVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f207885w.emit(null, this);
    }
}

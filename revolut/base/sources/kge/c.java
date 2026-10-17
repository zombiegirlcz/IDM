package kge;

import kbb.n;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes8.dex */
public final class c extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ n f183972w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(n nVar, Continuation continuation) {
        super(continuation);
        this.f183972w = nVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f183972w.emit(null, this);
    }
}

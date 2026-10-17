package kj6;

import kbb.n;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ n f184306w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(n nVar, Continuation continuation) {
        super(continuation);
        this.f184306w = nVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f184306w.emit(null, this);
    }
}

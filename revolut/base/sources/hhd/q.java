package hhd;

import ha3.w;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes7.dex */
public final class q extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ w f152403w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(w wVar, Continuation continuation) {
        super(continuation);
        this.f152403w = wVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f152403w.emit(null, this);
    }
}

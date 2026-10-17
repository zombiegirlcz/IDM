package ks9;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes5.dex */
public final class q extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ klj.e f189367w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(klj.e eVar, Continuation continuation) {
        super(continuation);
        this.f189367w = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f189367w.emit(null, this);
    }
}

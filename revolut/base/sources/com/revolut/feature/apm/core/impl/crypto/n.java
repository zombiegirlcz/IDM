package com.revolut.feature.apm.core.impl.crypto;

/* JADX INFO: loaded from: classes20.dex */
public final class n extends gim.c {
    public ApmKeyGenerator u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ o f61873w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f61874x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(o oVar, gim.c cVar) {
        super(cVar);
        this.f61873w = oVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f61874x |= Integer.MIN_VALUE;
        return this.f61873w.e(this);
    }
}

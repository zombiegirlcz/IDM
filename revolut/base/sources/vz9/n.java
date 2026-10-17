package vz9;

import tof.a3;

/* JADX INFO: loaded from: classes5.dex */
public final class n extends gim.c {
    public a3 u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ o f293433w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f293434x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(o oVar, gim.c cVar) {
        super(cVar);
        this.f293433w = oVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f293434x |= Integer.MIN_VALUE;
        return this.f293433w.a(null, null, this);
    }
}

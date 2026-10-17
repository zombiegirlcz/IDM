package vr2;

import tof.a3;

/* JADX INFO: loaded from: classes21.dex */
public final class c extends gim.c {
    public a3 u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d f291463w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f291464x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, gim.c cVar) {
        super(cVar);
        this.f291463w = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f291464x |= Integer.MIN_VALUE;
        return this.f291463w.c(null, this);
    }
}

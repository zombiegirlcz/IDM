package qpf;

import tof.a3;

/* JADX INFO: loaded from: classes9.dex */
public final class c extends gim.c {
    public a3 u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d f248381w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f248382x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, gim.c cVar) {
        super(cVar);
        this.f248381w = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f248382x |= Integer.MIN_VALUE;
        return this.f248381w.g(null, this);
    }
}

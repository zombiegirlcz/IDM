package gce;

import qua.p;

/* JADX INFO: loaded from: classes8.dex */
public final class g extends gim.c {
    public p u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ twg.c f142423w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f142424x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(twg.c cVar, gim.c cVar2) {
        super(cVar2);
        this.f142423w = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f142424x |= Integer.MIN_VALUE;
        return this.f142423w.p(null, this);
    }
}

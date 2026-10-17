package ujf;

import tof.a3;

/* JADX INFO: loaded from: classes8.dex */
public final class f extends gim.c {
    public a3 u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ h f280616w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f280617x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h hVar, gim.c cVar) {
        super(cVar);
        this.f280616w = hVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f280617x |= Integer.MIN_VALUE;
        return this.f280616w.h(null, this);
    }
}

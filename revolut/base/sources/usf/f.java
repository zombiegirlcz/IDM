package usf;

import tof.a3;

/* JADX INFO: loaded from: classes9.dex */
public final class f extends gim.c {
    public a3 u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ g f282897w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f282898x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, gim.c cVar) {
        super(cVar);
        this.f282897w = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f282898x |= Integer.MIN_VALUE;
        return this.f282897w.a(null, this);
    }
}

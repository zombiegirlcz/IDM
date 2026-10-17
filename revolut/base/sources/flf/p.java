package flf;

import tof.a3;

/* JADX INFO: loaded from: classes8.dex */
public final class p extends gim.c {
    public a3 u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f135971w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ t f135972x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f135973y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(t tVar, gim.c cVar) {
        super(cVar);
        this.f135972x = tVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f135971w = obj2;
        this.f135973y |= Integer.MIN_VALUE;
        return t.Z2(this.f135972x, null, this);
    }
}

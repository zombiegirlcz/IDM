package jf2;

/* JADX INFO: loaded from: classes21.dex */
public final class b extends gim.c {
    public eim.c u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d f173634w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f173635x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, gim.c cVar) {
        super(cVar);
        this.f173634w = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f173635x |= Integer.MIN_VALUE;
        return d.Z2(this.f173634w, null, null, null, null, this);
    }
}

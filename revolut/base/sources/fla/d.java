package fla;

/* JADX INFO: loaded from: classes5.dex */
public final class d extends gim.c {
    public w4l.k u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ g f135919w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f135920x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(g gVar, gim.c cVar) {
        super(cVar);
        this.f135919w = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f135920x |= Integer.MIN_VALUE;
        return this.f135919w.b(null, this);
    }
}

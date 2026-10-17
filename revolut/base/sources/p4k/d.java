package p4k;

/* JADX INFO: loaded from: classes11.dex */
public final class d extends gim.c {
    public f5j.a u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ g f232957w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f232958x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(g gVar, gim.c cVar) {
        super(cVar);
        this.f232957w = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f232958x |= Integer.MIN_VALUE;
        return this.f232957w.d(null, this);
    }
}

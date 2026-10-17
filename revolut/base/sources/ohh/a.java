package ohh;

/* JADX INFO: loaded from: classes9.dex */
public final class a extends gim.c {
    public dj0.d u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ b f225365w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f225366x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, gim.c cVar) {
        super(cVar);
        this.f225365w = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f225366x |= Integer.MIN_VALUE;
        return this.f225365w.b(null, null, null, this);
    }
}

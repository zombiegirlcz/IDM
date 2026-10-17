package zz4;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d f326505w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f326506x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(d dVar, gim.c cVar) {
        super(cVar);
        this.f326505w = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f326506x |= Integer.MIN_VALUE;
        return this.f326505w.a(null, this);
    }
}

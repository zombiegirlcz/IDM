package m2m;

/* JADX INFO: loaded from: classes12.dex */
public final class c extends gim.c {
    public Object u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d f202244w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f202245x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, gim.c cVar) {
        super(cVar);
        this.f202244w = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f202245x |= Integer.MIN_VALUE;
        return this.f202244w.a(this);
    }
}

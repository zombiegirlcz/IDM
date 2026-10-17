package z1l;

/* JADX INFO: loaded from: classes12.dex */
public final class c extends gim.c {
    public String u;
    public a2l.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f318894w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ d f318895x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f318896y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, gim.c cVar) {
        super(cVar);
        this.f318895x = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f318894w = obj2;
        this.f318896y |= Integer.MIN_VALUE;
        return this.f318895x.c(null, this);
    }
}

package ami;

/* JADX INFO: loaded from: classes10.dex */
public final class e extends gim.c {
    public zli.b u;
    public q06.k v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f6442w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ f f6443x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f6444y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, gim.c cVar) {
        super(cVar);
        this.f6443x = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f6442w = obj2;
        this.f6444y |= Integer.MIN_VALUE;
        return this.f6443x.f(null, this);
    }
}

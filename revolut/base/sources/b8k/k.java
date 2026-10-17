package b8k;

/* JADX INFO: loaded from: classes11.dex */
public final class k extends gim.c {
    public xi0.b u;
    public l v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f13284w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ l f13285x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f13286y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, gim.c cVar) {
        super(cVar);
        this.f13285x = lVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f13284w = obj2;
        this.f13286y |= Integer.MIN_VALUE;
        return this.f13285x.b3(null, this);
    }
}

package m1a;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends gim.c {
    public v61.h u;
    public v61.i v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f201296w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ d f201297x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f201298y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, gim.c cVar) {
        super(cVar);
        this.f201297x = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f201296w = obj2;
        this.f201298y |= Integer.MIN_VALUE;
        return this.f201297x.a(null, null, this);
    }
}

package s8a;

/* JADX INFO: loaded from: classes5.dex */
public final class h extends gim.c {
    public final /* synthetic */ l A;
    public int B;
    public String u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f260951w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f260952x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f260953y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(l lVar, gim.c cVar) {
        super(cVar);
        this.A = lVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.z = obj2;
        this.B |= Integer.MIN_VALUE;
        return this.A.a(null, this);
    }
}

package qq3;

/* JADX INFO: loaded from: classes21.dex */
public final class d extends gim.c {
    public final /* synthetic */ g A;
    public int B;
    public String u;
    public g v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f248464w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f248465x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f248466y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(g gVar, gim.c cVar) {
        super(cVar);
        this.A = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.z = obj2;
        this.B |= Integer.MIN_VALUE;
        return this.A.c(this, null, null);
    }
}

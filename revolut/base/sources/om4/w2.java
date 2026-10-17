package om4;

/* JADX INFO: loaded from: classes22.dex */
public final class w2 extends gim.c {
    public String u;
    public long v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f226732w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ x2 f226733x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f226734y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w2(x2 x2Var, gim.c cVar) {
        super(cVar);
        this.f226733x = x2Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f226732w = obj2;
        this.f226734y |= Integer.MIN_VALUE;
        return this.f226733x.P(null, 0L, null, null, null, this);
    }
}

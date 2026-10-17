package om4;

/* JADX INFO: loaded from: classes22.dex */
public final class b1 extends gim.c {
    public String u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f226524w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ r1 f226525x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f226526y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(r1 r1Var, gim.c cVar) {
        super(cVar);
        this.f226525x = r1Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f226524w = obj2;
        this.f226526y |= Integer.MIN_VALUE;
        return this.f226525x.d(null, null, this);
    }
}

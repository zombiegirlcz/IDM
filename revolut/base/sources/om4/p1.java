package om4;

/* JADX INFO: loaded from: classes22.dex */
public final class p1 extends gim.c {
    public String u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f226659w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ r1 f226660x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f226661y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(r1 r1Var, gim.c cVar) {
        super(cVar);
        this.f226660x = r1Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f226659w = obj2;
        this.f226661y |= Integer.MIN_VALUE;
        return this.f226660x.r(null, null, null, null, this);
    }
}

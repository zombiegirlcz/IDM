package om4;

/* JADX INFO: loaded from: classes22.dex */
public final class r3 extends gim.c {
    public ll4.c u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ s3 f226684w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f226685x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r3(s3 s3Var, gim.c cVar) {
        super(cVar);
        this.f226684w = s3Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f226685x |= Integer.MIN_VALUE;
        return this.f226684w.w(null, this);
    }
}

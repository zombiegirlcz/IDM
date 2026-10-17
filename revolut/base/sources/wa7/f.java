package wa7;

/* JADX INFO: loaded from: classes21.dex */
public final class f extends gim.c {
    public final /* synthetic */ m A;
    public int B;
    public String u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f295835w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public hlm.a f295836x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f295837y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(m mVar, gim.c cVar) {
        super(cVar);
        this.A = mVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.z = obj2;
        this.B |= Integer.MIN_VALUE;
        return this.A.g(null, null, null, this);
    }
}

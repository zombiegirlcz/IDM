package sa6;

/* JADX INFO: loaded from: classes3.dex */
public final class c0 extends gim.c {
    public final /* synthetic */ j0 A;
    public int B;
    public String u;
    public ba6.b0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ba6.u f261305w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public ba6.t f261306x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f261307y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(j0 j0Var, gim.c cVar) {
        super(cVar);
        this.A = j0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.z = obj2;
        this.B |= Integer.MIN_VALUE;
        return this.A.d(null, null, false, null, this);
    }
}

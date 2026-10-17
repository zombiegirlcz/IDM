package nfj;

/* JADX INFO: loaded from: classes11.dex */
public final class n2 extends gim.c {
    public final /* synthetic */ s2 A;
    public int B;
    public String u;
    public hlm.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f215000w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f215001x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f215002y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2(s2 s2Var, gim.c cVar) {
        super(cVar);
        this.A = s2Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.z = obj2;
        this.B |= Integer.MIN_VALUE;
        return s2.d(this.A, null, false, this);
    }
}

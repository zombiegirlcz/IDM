package nfj;

/* JADX INFO: loaded from: classes11.dex */
public final class m2 extends gim.c {
    public final /* synthetic */ s2 A;
    public int B;
    public String u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public hlm.a f214992w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f214993x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f214994y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2(s2 s2Var, gim.c cVar) {
        super(cVar);
        this.A = s2Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.z = obj2;
        this.B |= Integer.MIN_VALUE;
        return s2.c(this.A, null, null, this);
    }
}

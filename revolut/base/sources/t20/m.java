package t20;

/* JADX INFO: loaded from: classes19.dex */
public final class m extends gim.c {
    public final /* synthetic */ n A;
    public int B;
    public String u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public hlm.a f267398w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f267399x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f267400y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(n nVar, gim.c cVar) {
        super(cVar);
        this.A = nVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.z = obj2;
        this.B |= Integer.MIN_VALUE;
        return n.a(this.A, null, null, this);
    }
}

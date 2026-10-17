package t20;

/* JADX INFO: loaded from: classes.dex */
public final class g extends gim.c {
    public final /* synthetic */ n A;
    public int B;
    public String u;
    public hlm.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f267390w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f267391x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f267392y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(n nVar, gim.c cVar) {
        super(cVar);
        this.A = nVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.z = obj2;
        this.B |= Integer.MIN_VALUE;
        return this.A.c(this);
    }
}

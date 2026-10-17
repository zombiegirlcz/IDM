package ce4;

/* JADX INFO: loaded from: classes22.dex */
public final class d extends gim.c {
    public String u;
    public n v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f23348w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f23349x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ n f23350y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(n nVar, gim.c cVar) {
        super(cVar);
        this.f23350y = nVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f23349x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f23350y.d(null, this);
    }
}

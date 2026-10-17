package ce4;

/* JADX INFO: loaded from: classes22.dex */
public final class e extends gim.c {
    public String u;
    public n v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f23351w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ n f23352x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f23353y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(n nVar, gim.c cVar) {
        super(cVar);
        this.f23352x = nVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f23351w = obj2;
        this.f23353y |= Integer.MIN_VALUE;
        return this.f23352x.b(null, this);
    }
}

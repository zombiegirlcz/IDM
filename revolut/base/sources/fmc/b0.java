package fmc;

/* JADX INFO: loaded from: classes6.dex */
public final class b0 extends gim.c {
    public String u;
    public c0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f136326w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f136327x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ c0 f136328y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(c0 c0Var, gim.c cVar) {
        super(cVar);
        this.f136328y = c0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f136327x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f136328y.b(this);
    }
}

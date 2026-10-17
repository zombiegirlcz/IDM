package kye;

/* JADX INFO: loaded from: classes8.dex */
public final class i1 extends gim.c {
    public e71.b u;
    public dj0.d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f190742w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ k3 f190743x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f190744y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(k3 k3Var, gim.c cVar) {
        super(cVar);
        this.f190743x = k3Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f190742w = obj2;
        this.f190744y |= Integer.MIN_VALUE;
        return this.f190743x.R2(null, null, this);
    }
}

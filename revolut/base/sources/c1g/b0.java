package c1g;

/* JADX INFO: loaded from: classes9.dex */
public final class b0 extends gim.c {
    public int A;
    public hyf.c u;
    public s2g.q v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public rtl.y f20470w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public ihm.f f20471x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f20472y;
    public final /* synthetic */ c0 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(c0 c0Var, gim.c cVar) {
        super(cVar);
        this.z = c0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f20472y = obj2;
        this.A |= Integer.MIN_VALUE;
        return this.z.a(null, null, null, null, this);
    }
}

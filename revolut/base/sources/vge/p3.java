package vge;

/* JADX INFO: loaded from: classes8.dex */
public final class p3 extends gim.c {
    public hlm.a u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f288973w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f288974x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ t3 f288975y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p3(t3 t3Var, gim.c cVar) {
        super(cVar);
        this.f288975y = t3Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f288974x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f288975y.p(this);
    }
}

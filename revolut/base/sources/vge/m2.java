package vge;

/* JADX INFO: loaded from: classes8.dex */
public final class m2 extends gim.c {
    public hlm.a u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f288951w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ t2 f288952x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f288953y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2(t2 t2Var, gim.c cVar) {
        super(cVar);
        this.f288952x = t2Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f288951w = obj2;
        this.f288953y |= Integer.MIN_VALUE;
        return this.f288952x.j(this);
    }
}

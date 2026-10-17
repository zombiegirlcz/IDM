package mf4;

/* JADX INFO: loaded from: classes22.dex */
public final class t extends gim.c {
    public cv3.d0 u;
    public sx3.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f204885w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f204886x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ a0 f204887y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(a0 a0Var, gim.c cVar) {
        super(cVar);
        this.f204887y = a0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f204886x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f204887y.s(this);
    }
}

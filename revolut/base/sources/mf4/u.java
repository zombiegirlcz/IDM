package mf4;

/* JADX INFO: loaded from: classes22.dex */
public final class u extends gim.c {
    public sx3.a u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f204888w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ a0 f204889x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f204890y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(a0 a0Var, gim.c cVar) {
        super(cVar);
        this.f204889x = a0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f204888w = obj2;
        this.f204890y |= Integer.MIN_VALUE;
        return this.f204889x.t(this);
    }
}

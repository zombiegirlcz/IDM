package gsh;

/* JADX INFO: loaded from: classes10.dex */
public final class r extends gim.c {
    public hlm.a u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f146511w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ a0 f146512x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f146513y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(a0 a0Var, gim.c cVar) {
        super(cVar);
        this.f146512x = a0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f146511w = obj2;
        this.f146513y |= Integer.MIN_VALUE;
        return this.f146512x.b(this);
    }
}

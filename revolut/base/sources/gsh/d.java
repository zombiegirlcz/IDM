package gsh;

/* JADX INFO: loaded from: classes10.dex */
public final class d extends gim.c {
    public int A;
    public boolean B;
    public /* synthetic */ Object C;
    public final /* synthetic */ n D;
    public int E;
    public dsh.i u;
    public n v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public hlm.a f146468w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f146469x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f146470y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(n nVar, gim.c cVar) {
        super(cVar);
        this.D = nVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.C = obj2;
        this.E |= Integer.MIN_VALUE;
        return this.D.c(null, this);
    }
}

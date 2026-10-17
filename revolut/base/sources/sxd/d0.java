package sxd;

/* JADX INFO: loaded from: classes7.dex */
public final class d0 extends gim.c {
    public xi0.b u;
    public dj0.d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f266419w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f266420x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ e0 f266421y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(e0 e0Var, gim.c cVar) {
        super(cVar);
        this.f266421y = e0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f266420x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f266421y.a(null, false, null, this);
    }
}

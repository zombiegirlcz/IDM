package az0;

/* JADX INFO: loaded from: classes20.dex */
public final class q0 extends gim.c {
    public int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f11342w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ r0 f11343x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f11344y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(r0 r0Var, gim.c cVar) {
        super(cVar);
        this.f11343x = r0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f11342w = obj2;
        this.f11344y |= Integer.MIN_VALUE;
        return this.f11343x.h(null, null, null, this);
    }
}

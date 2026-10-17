package ami;

/* JADX INFO: loaded from: classes10.dex */
public final class d extends gim.c {
    public zli.b u;
    public wli.q v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public lg0.a f6439w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f6440x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ f f6441y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f fVar, gim.c cVar) {
        super(cVar);
        this.f6441y = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f6440x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f6441y.e(null, null, null, this);
    }
}

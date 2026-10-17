package ls1;

/* JADX INFO: loaded from: classes20.dex */
public final class d extends gim.c {
    public int A;
    public h u;
    public hlm.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f199586w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f199587x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f199588y;
    public final /* synthetic */ h z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(h hVar, gim.c cVar) {
        super(cVar);
        this.z = hVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f199588y = obj2;
        this.A |= Integer.MIN_VALUE;
        return this.z.j(this);
    }
}

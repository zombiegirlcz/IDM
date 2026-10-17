package dfj;

/* JADX INFO: loaded from: classes11.dex */
public final class f1 extends gim.c {
    public wi0.b u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ r10.d f113961w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f113962x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(r10.d dVar, gim.c cVar) {
        super(cVar);
        this.f113961w = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f113962x |= Integer.MIN_VALUE;
        return this.f113961w.O(null, this);
    }
}

package g5c;

/* JADX INFO: loaded from: classes6.dex */
public final class e extends gim.c {
    public boolean u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ f f140742w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f140743x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, gim.c cVar) {
        super(cVar);
        this.f140742w = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f140743x |= Integer.MIN_VALUE;
        return this.f140742w.d(false, this);
    }
}

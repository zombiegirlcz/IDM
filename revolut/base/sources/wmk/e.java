package wmk;

/* JADX INFO: loaded from: classes11.dex */
public final class e extends gim.c {
    public hha.d u;
    public hha.d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f298686w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ f f298687x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f298688y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, gim.c cVar) {
        super(cVar);
        this.f298687x = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f298686w = obj2;
        this.f298688y |= Integer.MIN_VALUE;
        return this.f298687x.Z2(null, null, this);
    }
}

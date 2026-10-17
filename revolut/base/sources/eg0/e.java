package eg0;

/* JADX INFO: loaded from: classes19.dex */
public final class e extends gim.c {
    public zf0.c u;
    public h v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f125512w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f125513x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ h f125514y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(h hVar, gim.c cVar) {
        super(cVar);
        this.f125514y = hVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f125513x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f125514y.c(null, this);
    }
}

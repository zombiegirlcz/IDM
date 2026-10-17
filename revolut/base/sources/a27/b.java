package a27;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends gim.c {
    public cs6.c u;
    public y17.h v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f696w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ k f697x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f698y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(k kVar, gim.c cVar) {
        super(cVar);
        this.f697x = kVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f696w = obj2;
        this.f698y |= Integer.MIN_VALUE;
        return this.f697x.a(null, null, this);
    }
}

package i97;

/* JADX INFO: loaded from: classes21.dex */
public final class i extends gim.c {
    public a97.c u;
    public a97.c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f159595w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ l f159596x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f159597y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(l lVar, gim.c cVar) {
        super(cVar);
        this.f159596x = lVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f159595w = obj2;
        this.f159597y |= Integer.MIN_VALUE;
        return l.c(this.f159596x, null, this);
    }
}

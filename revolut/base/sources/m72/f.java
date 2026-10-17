package m72;

/* JADX INFO: loaded from: classes20.dex */
public final class f extends gim.c {
    public boolean u;
    public h02.d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f203286w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ k f203287x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f203288y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(k kVar, gim.c cVar) {
        super(cVar);
        this.f203287x = kVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f203286w = obj2;
        this.f203288y |= Integer.MIN_VALUE;
        return this.f203287x.c(false, this);
    }
}

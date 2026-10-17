package bwi;

/* JADX INFO: loaded from: classes10.dex */
public final class b extends gim.c {
    public jf0.c u;
    public Boolean v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f19353w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ d f19354x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f19355y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, gim.c cVar) {
        super(cVar);
        this.f19354x = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f19353w = obj2;
        this.f19355y |= Integer.MIN_VALUE;
        return this.f19354x.e(null, this);
    }
}

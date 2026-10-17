package qe4;

/* JADX INFO: loaded from: classes22.dex */
public final class g extends gim.c {
    public String u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f245061w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ l f245062x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f245063y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(l lVar, gim.c cVar) {
        super(cVar);
        this.f245062x = lVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f245061w = obj2;
        this.f245063y |= Integer.MIN_VALUE;
        return this.f245062x.Z2(null, null, this);
    }
}

package e40;

/* JADX INFO: loaded from: classes19.dex */
public final class j extends gim.c {
    public r40.l u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ k f122353w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f122354x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, gim.c cVar) {
        super(cVar);
        this.f122353w = kVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f122354x |= Integer.MIN_VALUE;
        return this.f122353w.c(null, this);
    }
}

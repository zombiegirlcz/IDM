package k50;

/* JADX INFO: loaded from: classes19.dex */
public final class j extends gim.c {
    public String u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f181112w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ m f181113x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f181114y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(m mVar, gim.c cVar) {
        super(cVar);
        this.f181113x = mVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f181112w = obj2;
        this.f181114y |= Integer.MIN_VALUE;
        return this.f181113x.Z2(null, this);
    }
}

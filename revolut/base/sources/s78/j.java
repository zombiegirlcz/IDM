package s78;

/* JADX INFO: loaded from: classes4.dex */
public final class j extends gim.c {
    public String u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f260578w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ m f260579x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f260580y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(m mVar, gim.c cVar) {
        super(cVar);
        this.f260579x = mVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f260578w = obj2;
        this.f260580y |= Integer.MIN_VALUE;
        return m.a(this.f260579x, null, null, null, null, this);
    }
}

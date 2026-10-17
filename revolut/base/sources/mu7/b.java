package mu7;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends gim.c {
    public String u;
    public boolean v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f208992w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ c f208993x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f208994y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, gim.c cVar2) {
        super(cVar2);
        this.f208993x = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f208992w = obj2;
        this.f208994y |= Integer.MIN_VALUE;
        return this.f208993x.b(this, null, false);
    }
}

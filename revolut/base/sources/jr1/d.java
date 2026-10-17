package jr1;

/* JADX INFO: loaded from: classes20.dex */
public final class d extends gim.c {
    public String u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f177924w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ e f177925x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f177926y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, gim.c cVar) {
        super(cVar);
        this.f177925x = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f177924w = obj2;
        this.f177926y |= Integer.MIN_VALUE;
        return this.f177925x.d(null, null, 0, this);
    }
}

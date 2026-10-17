package m5k;

/* JADX INFO: loaded from: classes11.dex */
public final class c extends gim.c {
    public xi0.b u;
    public xi0.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f202955w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ d f202956x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f202957y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, gim.c cVar) {
        super(cVar);
        this.f202956x = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f202955w = obj2;
        this.f202957y |= Integer.MIN_VALUE;
        return this.f202956x.a(null, null, this);
    }
}

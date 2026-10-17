package f28;

/* JADX INFO: loaded from: classes4.dex */
public final class l extends gim.c {
    public String u;
    public t v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f131471w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ t f131472x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f131473y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(t tVar, gim.c cVar) {
        super(cVar);
        this.f131472x = tVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f131471w = obj2;
        this.f131473y |= Integer.MIN_VALUE;
        return this.f131472x.f(null, null, null, null, this);
    }
}

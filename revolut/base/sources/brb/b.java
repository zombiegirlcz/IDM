package brb;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends gim.c {
    public hlm.a u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f17974w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ e f17975x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f17976y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(e eVar, gim.c cVar) {
        super(cVar);
        this.f17975x = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f17974w = obj2;
        this.f17976y |= Integer.MIN_VALUE;
        return this.f17975x.c(this);
    }
}

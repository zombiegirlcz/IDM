package brb;

/* JADX INFO: loaded from: classes6.dex */
public final class d extends gim.c {
    public String u;
    public hlm.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f17978w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f17979x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ e f17980y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, gim.c cVar) {
        super(cVar);
        this.f17980y = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f17979x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f17980y.d(null, this);
    }
}

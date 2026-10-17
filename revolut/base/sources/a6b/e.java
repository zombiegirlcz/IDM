package a6b;

/* JADX INFO: loaded from: classes6.dex */
public final class e extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ g f1590w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f1591x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g gVar, gim.c cVar) {
        super(cVar);
        this.f1590w = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f1591x |= Integer.MIN_VALUE;
        return this.f1590w.g(null, null, this);
    }
}

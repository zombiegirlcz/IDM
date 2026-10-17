package m1a;

/* JADX INFO: loaded from: classes5.dex */
public final class c extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d f201299w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f201300x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, gim.c cVar) {
        super(cVar);
        this.f201299w = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f201300x |= Integer.MIN_VALUE;
        return this.f201299w.b(null, this);
    }
}

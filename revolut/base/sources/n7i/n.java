package n7i;

/* JADX INFO: loaded from: classes10.dex */
public final class n extends gim.c {
    public j8l.a u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ o f213131w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f213132x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(o oVar, gim.c cVar) {
        super(cVar);
        this.f213131w = oVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f213132x |= Integer.MIN_VALUE;
        return this.f213131w.a(null, this);
    }
}

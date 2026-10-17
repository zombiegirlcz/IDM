package u1m;

/* JADX INFO: loaded from: classes12.dex */
public final class w extends gim.c {
    public x u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ x f276505w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f276506x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(x xVar, gim.c cVar) {
        super(cVar);
        this.f276505w = xVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f276506x |= Integer.MIN_VALUE;
        return this.f276505w.c(this);
    }
}

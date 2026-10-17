package yy9;

/* JADX INFO: loaded from: classes5.dex */
public final class e extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ f f317880w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f317881x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, gim.c cVar) {
        super(cVar);
        this.f317880w = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f317881x |= Integer.MIN_VALUE;
        return this.f317880w.a(null, this);
    }
}

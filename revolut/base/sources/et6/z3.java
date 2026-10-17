package et6;

/* JADX INFO: loaded from: classes3.dex */
public final class z3 extends gim.c {
    public fs6.h u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ zjh.j f129393w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f129394x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z3(zjh.j jVar, gim.c cVar) {
        super(cVar);
        this.f129393w = jVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f129394x |= Integer.MIN_VALUE;
        return this.f129393w.x(null, this);
    }
}

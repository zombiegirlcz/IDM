package knd;

/* JADX INFO: loaded from: classes7.dex */
public final class s0 extends gim.c {
    public yld.d u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ kge.d f186129w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f186130x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(kge.d dVar, gim.c cVar) {
        super(cVar);
        this.f186129w = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f186130x |= Integer.MIN_VALUE;
        return this.f186129w.y(null, this);
    }
}

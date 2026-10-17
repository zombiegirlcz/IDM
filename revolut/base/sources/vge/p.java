package vge;

/* JADX INFO: loaded from: classes8.dex */
public final class p extends gim.c {
    public md6.a u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ x f288967w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f288968x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(x xVar, gim.c cVar) {
        super(cVar);
        this.f288967w = xVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f288968x |= Integer.MIN_VALUE;
        return x.a(this.f288967w, null, null, this);
    }
}

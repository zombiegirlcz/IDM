package bk3;

/* JADX INFO: loaded from: classes21.dex */
public final class b extends gim.c {
    public jf0.c u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c f16242w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f16243x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, gim.c cVar2) {
        super(cVar2);
        this.f16242w = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f16243x |= Integer.MIN_VALUE;
        return this.f16242w.e(null, this);
    }
}

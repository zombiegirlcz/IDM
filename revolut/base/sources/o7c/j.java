package o7c;

/* JADX INFO: loaded from: classes6.dex */
public final class j extends gim.c {
    public jf0.c u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ k f222761w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f222762x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, gim.c cVar) {
        super(cVar);
        this.f222761w = kVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f222762x |= Integer.MIN_VALUE;
        return this.f222761w.e(null, this);
    }
}

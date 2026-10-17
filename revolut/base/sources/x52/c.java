package x52;

/* JADX INFO: loaded from: classes20.dex */
public final class c extends gim.c {
    public jf0.c u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d f302902w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f302903x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, gim.c cVar) {
        super(cVar);
        this.f302902w = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f302903x |= Integer.MIN_VALUE;
        return this.f302902w.e(null, this);
    }
}

package jwg;

/* JADX INFO: loaded from: classes9.dex */
public final class e extends gim.c {
    public mwg.b u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ h f179001w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f179002x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(h hVar, gim.c cVar) {
        super(cVar);
        this.f179001w = hVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f179002x |= Integer.MIN_VALUE;
        return this.f179001w.c(null, this);
    }
}

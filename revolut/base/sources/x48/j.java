package x48;

/* JADX INFO: loaded from: classes4.dex */
public final class j extends gim.c {
    public v13.d u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ k f302814w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f302815x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, gim.c cVar) {
        super(cVar);
        this.f302814w = kVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f302815x |= Integer.MIN_VALUE;
        return this.f302814w.f(null, this);
    }
}

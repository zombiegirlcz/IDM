package hw3;

/* JADX INFO: loaded from: classes22.dex */
public final class j extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ k f156075w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f156076x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, gim.c cVar) {
        super(cVar);
        this.f156075w = kVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f156076x |= Integer.MIN_VALUE;
        return this.f156075w.a(null, null, this);
    }
}

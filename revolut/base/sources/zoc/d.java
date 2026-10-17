package zoc;

/* JADX INFO: loaded from: classes6.dex */
public final class d extends gim.c {
    public gim.i u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e f323962w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f323963x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, gim.c cVar) {
        super(cVar);
        this.f323962w = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f323963x |= Integer.MIN_VALUE;
        return this.f323962w.d(null, null, this);
    }
}

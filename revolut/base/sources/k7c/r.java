package k7c;

/* JADX INFO: loaded from: classes6.dex */
public final class r extends gim.c {
    public u6c.c u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ z f181995w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f181996x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(z zVar, gim.c cVar) {
        super(cVar);
        this.f181995w = zVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f181996x |= Integer.MIN_VALUE;
        return z.a(this.f181995w, null, null, this);
    }
}

package k3c;

/* JADX INFO: loaded from: classes6.dex */
public final class m extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ p f180673w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f180674x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(p pVar, gim.c cVar) {
        super(cVar);
        this.f180673w = pVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f180674x |= Integer.MIN_VALUE;
        return this.f180673w.d(null, this);
    }
}

package pe0;

/* JADX INFO: loaded from: classes19.dex */
public final class n extends gim.c {
    public f u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ q f235302w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f235303x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(q qVar, gim.c cVar) {
        super(cVar);
        this.f235302w = qVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f235303x |= Integer.MIN_VALUE;
        return q.b(this.f235302w, null, this);
    }
}

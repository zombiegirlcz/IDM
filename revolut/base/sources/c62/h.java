package c62;

/* JADX INFO: loaded from: classes20.dex */
public final class h extends gim.c {
    public f u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ i f21590w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f21591x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, gim.c cVar) {
        super(cVar);
        this.f21590w = iVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f21591x |= Integer.MIN_VALUE;
        return this.f21590w.a(null, null, this);
    }
}

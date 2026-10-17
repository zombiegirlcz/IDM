package nli;

/* JADX INFO: loaded from: classes10.dex */
public final class d extends gim.c {
    public Exception u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e f217143w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f217144x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, gim.c cVar) {
        super(cVar);
        this.f217143w = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f217144x |= Integer.MIN_VALUE;
        return this.f217143w.b(null, this);
    }
}

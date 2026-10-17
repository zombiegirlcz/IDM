package t38;

/* JADX INFO: loaded from: classes4.dex */
public final class j extends gim.c {
    public j60.a u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ p f267687w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f267688x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(p pVar, gim.c cVar) {
        super(cVar);
        this.f267687w = pVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f267688x |= Integer.MIN_VALUE;
        return this.f267687w.e3(this);
    }
}

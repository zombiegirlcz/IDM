package skd;

/* JADX INFO: loaded from: classes7.dex */
public final class c extends gim.c {
    public tkd.e u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ i f263821w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f263822x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(i iVar, gim.c cVar) {
        super(cVar);
        this.f263821w = iVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f263822x |= Integer.MIN_VALUE;
        return this.f263821w.f(null, null, null, this);
    }
}

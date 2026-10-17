package skd;

/* JADX INFO: loaded from: classes7.dex */
public final class d extends gim.c {
    public tkd.e u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ i f263823w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f263824x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(i iVar, gim.c cVar) {
        super(cVar);
        this.f263823w = iVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f263824x |= Integer.MIN_VALUE;
        return this.f263823w.g(null, null, null, this);
    }
}

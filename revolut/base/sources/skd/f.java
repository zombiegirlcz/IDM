package skd;

/* JADX INFO: loaded from: classes7.dex */
public final class f extends gim.c {
    public tkd.e u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ i f263827w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f263828x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(i iVar, gim.c cVar) {
        super(cVar);
        this.f263827w = iVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f263828x |= Integer.MIN_VALUE;
        return this.f263827w.i(null, null, null, this);
    }
}

package skd;

/* JADX INFO: loaded from: classes7.dex */
public final class e extends gim.c {
    public tkd.e u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ i f263825w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f263826x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(i iVar, gim.c cVar) {
        super(cVar);
        this.f263825w = iVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f263826x |= Integer.MIN_VALUE;
        return this.f263825w.h(null, null, null, this);
    }
}

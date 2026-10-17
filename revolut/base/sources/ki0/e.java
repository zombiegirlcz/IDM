package ki0;

/* JADX INFO: loaded from: classes19.dex */
public final class e extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ kgm.c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f184164w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(kgm.c cVar, gim.c cVar2) {
        super(cVar2);
        this.v = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f184164w |= Integer.MIN_VALUE;
        return this.v.b(this);
    }
}

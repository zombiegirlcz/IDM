package nhe;

/* JADX INFO: loaded from: classes8.dex */
public final class l extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ s v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f215429w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(s sVar, gim.c cVar) {
        super(cVar);
        this.v = sVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f215429w |= Integer.MIN_VALUE;
        return this.v.d3(null, this);
    }
}

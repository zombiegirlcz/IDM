package z6l;

/* JADX INFO: loaded from: classes12.dex */
public final class j extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ s v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f319819w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(s sVar, gim.c cVar) {
        super(cVar);
        this.v = sVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f319819w |= Integer.MIN_VALUE;
        return this.v.n(this);
    }
}

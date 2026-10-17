package z6l;

/* JADX INFO: loaded from: classes12.dex */
public final class k extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ s v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f319820w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(s sVar, gim.c cVar) {
        super(cVar);
        this.v = sVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f319820w |= Integer.MIN_VALUE;
        return this.v.o(null, this);
    }
}

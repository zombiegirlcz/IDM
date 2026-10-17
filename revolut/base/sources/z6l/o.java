package z6l;

/* JADX INFO: loaded from: classes12.dex */
public final class o extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ s v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f319825w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(s sVar, gim.c cVar) {
        super(cVar);
        this.v = sVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f319825w |= Integer.MIN_VALUE;
        return this.v.B(null, this);
    }
}

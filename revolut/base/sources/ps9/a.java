package ps9;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f239429w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, gim.c cVar2) {
        super(cVar2);
        this.v = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f239429w |= Integer.MIN_VALUE;
        return this.v.a(null, this);
    }
}

package k7c;

/* JADX INFO: loaded from: classes6.dex */
public final class v extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ z v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f182010w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(z zVar, gim.c cVar) {
        super(cVar);
        this.v = zVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f182010w |= Integer.MIN_VALUE;
        return this.v.i(null, this);
    }
}

package qa9;

/* JADX INFO: loaded from: classes5.dex */
public final class t extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ w v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f244003w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(w wVar, gim.c cVar) {
        super(cVar);
        this.v = wVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f244003w |= Integer.MIN_VALUE;
        return this.v.b(null, null, this);
    }
}

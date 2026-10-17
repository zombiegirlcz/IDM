package pgk;

/* JADX INFO: loaded from: classes11.dex */
public final class h extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ k v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f235989w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(k kVar, gim.c cVar) {
        super(cVar);
        this.v = kVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f235989w |= Integer.MIN_VALUE;
        return this.v.e(null, this);
    }
}

package r93;

/* JADX INFO: loaded from: classes21.dex */
public final class e extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ k v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f252502w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(k kVar, gim.c cVar) {
        super(cVar);
        this.v = kVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f252502w |= Integer.MIN_VALUE;
        return this.v.e3(null, this);
    }
}

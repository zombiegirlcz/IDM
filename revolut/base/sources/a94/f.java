package a94;

/* JADX INFO: loaded from: classes22.dex */
public final class f extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ k v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f2312w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(k kVar, gim.c cVar) {
        super(cVar);
        this.v = kVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f2312w |= Integer.MIN_VALUE;
        return k.Z2(this.v, this);
    }
}

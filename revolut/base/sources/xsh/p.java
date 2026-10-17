package xsh;

/* JADX INFO: loaded from: classes10.dex */
public final class p extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ r f308511w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f308512x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(r rVar, gim.c cVar) {
        super(cVar);
        this.f308511w = rVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f308512x |= Integer.MIN_VALUE;
        return r.z2(this.f308511w, null, this);
    }
}

package om4;

/* JADX INFO: loaded from: classes22.dex */
public final class u extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ w f226704w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f226705x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(w wVar, gim.c cVar) {
        super(cVar);
        this.f226704w = wVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f226705x |= Integer.MIN_VALUE;
        return this.f226704w.d(null, this);
    }
}

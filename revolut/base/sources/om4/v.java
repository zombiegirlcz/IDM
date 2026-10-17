package om4;

/* JADX INFO: loaded from: classes22.dex */
public final class v extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ w f226716w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f226717x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(w wVar, gim.c cVar) {
        super(cVar);
        this.f226716w = wVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f226717x |= Integer.MIN_VALUE;
        return this.f226716w.e(null, this);
    }
}

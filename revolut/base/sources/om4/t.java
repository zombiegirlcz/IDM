package om4;

/* JADX INFO: loaded from: classes22.dex */
public final class t extends gim.c {
    public String u;
    public Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f226696w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ w f226697x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f226698y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(w wVar, gim.c cVar) {
        super(cVar);
        this.f226697x = wVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f226696w = obj2;
        this.f226698y |= Integer.MIN_VALUE;
        return this.f226697x.c(null, this, null);
    }
}

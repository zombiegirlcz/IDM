package k3c;

/* JADX INFO: loaded from: classes6.dex */
public final class n extends gim.c {
    public String u;
    public long v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f180675w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ p f180676x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f180677y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(p pVar, gim.c cVar) {
        super(cVar);
        this.f180676x = pVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f180675w = obj2;
        this.f180677y |= Integer.MIN_VALUE;
        return this.f180676x.e(null, 0L, this);
    }
}

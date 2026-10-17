package v4j;

/* JADX INFO: loaded from: classes10.dex */
public final class a extends gim.c {
    public String u;
    public f5j.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f286098w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ rul.e f286099x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f286100y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(rul.e eVar, gim.c cVar) {
        super(cVar);
        this.f286099x = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f286098w = obj2;
        this.f286100y |= Integer.MIN_VALUE;
        return this.f286099x.c(null, null, this);
    }
}

package p0d;

/* JADX INFO: loaded from: classes7.dex */
public final class c extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e f231504w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f231505x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, gim.c cVar) {
        super(cVar);
        this.f231504w = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f231505x |= Integer.MIN_VALUE;
        return this.f231504w.a(null, null, this);
    }
}

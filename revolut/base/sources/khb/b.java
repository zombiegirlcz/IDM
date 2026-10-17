package khb;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends gim.c {
    public fo3.c u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e f184085w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f184086x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(e eVar, gim.c cVar) {
        super(cVar);
        this.f184085w = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f184086x |= Integer.MIN_VALUE;
        return this.f184085w.a(null, this);
    }
}

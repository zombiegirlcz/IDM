package xlb;

/* JADX INFO: loaded from: classes6.dex */
public final class x extends gim.c {
    public ael.s u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ y f307008w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f307009x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(y yVar, gim.c cVar) {
        super(cVar);
        this.f307008w = yVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f307009x |= Integer.MIN_VALUE;
        return this.f307008w.b(null, this);
    }
}

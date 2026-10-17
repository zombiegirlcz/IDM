package zbb;

/* JADX INFO: loaded from: classes6.dex */
public final class h extends gim.c {
    public xi0.b u;
    public f v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f320873w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ i f320874x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f320875y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, gim.c cVar) {
        super(cVar);
        this.f320874x = iVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f320873w = obj2;
        this.f320875y |= Integer.MIN_VALUE;
        return this.f320874x.b(null, null, this);
    }
}

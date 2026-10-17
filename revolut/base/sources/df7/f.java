package df7;

/* JADX INFO: loaded from: classes22.dex */
public final class f extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ o7.d f113805w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f113806x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(o7.d dVar, gim.c cVar) {
        super(cVar);
        this.f113805w = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f113806x |= Integer.MIN_VALUE;
        return this.f113805w.j(null, this);
    }
}

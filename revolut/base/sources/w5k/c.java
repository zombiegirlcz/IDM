package w5k;

/* JADX INFO: loaded from: classes11.dex */
public final class c extends gim.c {
    public jf0.c u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d f295345w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f295346x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, gim.c cVar) {
        super(cVar);
        this.f295345w = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f295346x |= Integer.MIN_VALUE;
        return this.f295345w.e(null, this);
    }
}

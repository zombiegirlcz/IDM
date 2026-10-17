package c9k;

/* JADX INFO: loaded from: classes11.dex */
public final class g extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ l f22490w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f22491x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(l lVar, gim.c cVar) {
        super(cVar);
        this.f22490w = lVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f22491x |= Integer.MIN_VALUE;
        return this.f22490w.d(this);
    }
}

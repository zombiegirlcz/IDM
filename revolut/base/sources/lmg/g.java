package lmg;

/* JADX INFO: loaded from: classes9.dex */
public final class g extends gim.c {
    public int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f197046w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ m f197047x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f197048y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(m mVar, gim.c cVar) {
        super(cVar);
        this.f197047x = mVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f197046w = obj2;
        this.f197048y |= Integer.MIN_VALUE;
        return this.f197047x.c(this);
    }
}

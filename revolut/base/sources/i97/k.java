package i97;

/* JADX INFO: loaded from: classes21.dex */
public final class k extends gim.c {
    public String u;
    public Class v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f159601w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ l f159602x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f159603y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, gim.c cVar) {
        super(cVar);
        this.f159602x = lVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f159601w = obj2;
        this.f159603y |= Integer.MIN_VALUE;
        return this.f159602x.g(this, null, null);
    }
}

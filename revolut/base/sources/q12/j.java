package q12;

/* JADX INFO: loaded from: classes20.dex */
public final class j extends gim.c {
    public m02.b u;
    public x02.c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f241329w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ l f241330x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f241331y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(l lVar, gim.c cVar) {
        super(cVar);
        this.f241330x = lVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f241329w = obj2;
        this.f241331y |= Integer.MIN_VALUE;
        return this.f241330x.b(null, null, this);
    }
}

package ui9;

/* JADX INFO: loaded from: classes5.dex */
public final class i extends gim.c {
    public wi9.g u;
    public cs3.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f280335w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ l f280336x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f280337y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(l lVar, gim.c cVar) {
        super(cVar);
        this.f280336x = lVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f280335w = obj2;
        this.f280337y |= Integer.MIN_VALUE;
        return this.f280336x.g(null, this);
    }
}

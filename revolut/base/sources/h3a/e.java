package h3a;

/* JADX INFO: loaded from: classes5.dex */
public final class e extends gim.c {
    public zm3.a u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ l f149050w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f149051x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(l lVar, gim.c cVar) {
        super(cVar);
        this.f149050w = lVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f149051x |= Integer.MIN_VALUE;
        return this.f149050w.e(null, this);
    }
}

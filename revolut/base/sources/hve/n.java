package hve;

/* JADX INFO: loaded from: classes8.dex */
public final class n extends gim.c {
    public boolean u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ o f155846w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f155847x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(o oVar, gim.c cVar) {
        super(cVar);
        this.f155846w = oVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f155847x |= Integer.MIN_VALUE;
        return this.f155846w.k(null, false, null, this);
    }
}

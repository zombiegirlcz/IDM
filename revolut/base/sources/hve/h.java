package hve;

/* JADX INFO: loaded from: classes8.dex */
public final class h extends gim.c {
    public String u;
    public com.revolut.domain.models.topup.methods.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f155832w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ o f155833x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f155834y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(o oVar, gim.c cVar) {
        super(cVar);
        this.f155833x = oVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f155832w = obj2;
        this.f155834y |= Integer.MIN_VALUE;
        return o.b(this.f155833x, null, null, null, this);
    }
}

package iid;

/* JADX INFO: loaded from: classes7.dex */
public final class f extends gim.c {
    public boolean u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.shops.impl.flow.session.c f161607w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f161608x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.revolut.feature.shops.impl.flow.session.c cVar, gim.c cVar2) {
        super(cVar2);
        this.f161607w = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f161608x |= Integer.MIN_VALUE;
        return this.f161607w.J2(null, false, this);
    }
}

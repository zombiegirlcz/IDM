package wjd;

/* JADX INFO: loaded from: classes7.dex */
public final class q extends gim.c {
    public rl0.d u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.sign_in_methods.impl.ui.sign_in_methods.a f298061w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f298062x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(com.revolut.feature.sign_in_methods.impl.ui.sign_in_methods.a aVar, gim.c cVar) {
        super(cVar);
        this.f298061w = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f298062x |= Integer.MIN_VALUE;
        return com.revolut.feature.sign_in_methods.impl.ui.sign_in_methods.a.J2(this.f298061w, this);
    }
}

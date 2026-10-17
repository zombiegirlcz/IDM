package wjd;

/* JADX INFO: loaded from: classes7.dex */
public final class p extends gim.c {
    public boolean u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.sign_in_methods.impl.ui.sign_in_methods.a f298059w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f298060x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(com.revolut.feature.sign_in_methods.impl.ui.sign_in_methods.a aVar, gim.c cVar) {
        super(cVar);
        this.f298059w = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f298060x |= Integer.MIN_VALUE;
        return com.revolut.feature.sign_in_methods.impl.ui.sign_in_methods.a.I2(this.f298059w, false, this);
    }
}

package hfb;

/* JADX INFO: loaded from: classes6.dex */
public final class g extends gim.c {
    public boolean u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.retail.reverywhere.impl.onboarding.a f151792w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f151793x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.revolut.feature.retail.reverywhere.impl.onboarding.a aVar, gim.c cVar) {
        super(cVar);
        this.f151792w = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f151793x |= Integer.MIN_VALUE;
        return this.f151792w.M2(false, this);
    }
}

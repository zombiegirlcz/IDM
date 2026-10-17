package oi8;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends gim.c {
    public com.revolut.feature.junior_onboarding.impl.ui.post_onboarding.a u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.junior_onboarding.impl.ui.post_onboarding.a f225461w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f225462x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.revolut.feature.junior_onboarding.impl.ui.post_onboarding.a aVar, gim.c cVar) {
        super(cVar);
        this.f225461w = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f225462x |= Integer.MIN_VALUE;
        return this.f225461w.K2(this);
    }
}

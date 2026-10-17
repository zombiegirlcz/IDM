package di8;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.junior_onboarding.impl.ui.onboarding.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f114951w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.revolut.feature.junior_onboarding.impl.ui.onboarding.b bVar, gim.c cVar) {
        super(cVar);
        this.v = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f114951w |= Integer.MIN_VALUE;
        return com.revolut.feature.junior_onboarding.impl.ui.onboarding.b.I2(this.v, this);
    }
}

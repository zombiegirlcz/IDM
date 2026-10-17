package qg4;

/* JADX INFO: loaded from: classes22.dex */
public final class c extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.credit.application.plugins.impl.ui.post_retail_onboarding.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f245647w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.revolut.feature.credit.application.plugins.impl.ui.post_retail_onboarding.a aVar, gim.c cVar) {
        super(cVar);
        this.v = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f245647w |= Integer.MIN_VALUE;
        return com.revolut.feature.credit.application.plugins.impl.ui.post_retail_onboarding.a.I2(this.v, this);
    }
}

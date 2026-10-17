package pb9;

import com.revolut.feature.onboarding.impl.onboarding.product_lifecycle.OnboardingProductLifecycleFlowContract$Step;

/* JADX INFO: loaded from: classes5.dex */
public final class j extends gim.c {
    public OnboardingProductLifecycleFlowContract$Step u;
    public boolean v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f234668w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ k f234669x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f234670y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, gim.c cVar) {
        super(cVar);
        this.f234669x = kVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f234668w = obj2;
        this.f234670y |= Integer.MIN_VALUE;
        return this.f234669x.I2(null, false, this);
    }
}

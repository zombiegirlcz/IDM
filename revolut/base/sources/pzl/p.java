package pzl;

import com.revolut.utils.job.workers.OnboardingDynamicFeaturesWorker;

/* JADX INFO: loaded from: classes12.dex */
public final class p extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ OnboardingDynamicFeaturesWorker v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f241034w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(OnboardingDynamicFeaturesWorker onboardingDynamicFeaturesWorker, gim.c cVar) {
        super(cVar);
        this.v = onboardingDynamicFeaturesWorker;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f241034w |= Integer.MIN_VALUE;
        OnboardingDynamicFeaturesWorker.Companion aVar = OnboardingDynamicFeaturesWorker.INSTANCE;
        return this.v.a(null, this);
    }
}

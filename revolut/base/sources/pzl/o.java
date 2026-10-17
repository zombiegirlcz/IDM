package pzl;

import com.revolut.utils.job.workers.OnboardingDynamicFeaturesWorker;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes12.dex */
public final class o extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ OnboardingDynamicFeaturesWorker v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f241033w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(OnboardingDynamicFeaturesWorker onboardingDynamicFeaturesWorker, Continuation continuation) {
        super(continuation);
        this.v = onboardingDynamicFeaturesWorker;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f241033w |= Integer.MIN_VALUE;
        return this.v.doWork(this);
    }
}

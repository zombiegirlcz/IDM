package pzl;

import com.revolut.utils.job.workers.CardSceneDynamicFeaturesWorker;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes12.dex */
public final class f extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ CardSceneDynamicFeaturesWorker v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f241021w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(CardSceneDynamicFeaturesWorker cardSceneDynamicFeaturesWorker, Continuation continuation) {
        super(continuation);
        this.v = cardSceneDynamicFeaturesWorker;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f241021w |= Integer.MIN_VALUE;
        return this.v.doWork(this);
    }
}

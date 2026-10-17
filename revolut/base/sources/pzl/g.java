package pzl;

import com.revolut.utils.job.workers.CardSceneDynamicFeaturesWorker;

/* JADX INFO: loaded from: classes12.dex */
public final class g extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ CardSceneDynamicFeaturesWorker v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f241022w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(CardSceneDynamicFeaturesWorker cardSceneDynamicFeaturesWorker, gim.c cVar) {
        super(cVar);
        this.v = cardSceneDynamicFeaturesWorker;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f241022w |= Integer.MIN_VALUE;
        return this.v.a(this);
    }
}

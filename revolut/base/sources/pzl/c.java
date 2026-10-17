package pzl;

import com.revolut.utils.job.workers.ApmMultibancoDynamicFeaturesWorker;

/* JADX INFO: loaded from: classes12.dex */
public final class c extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ ApmMultibancoDynamicFeaturesWorker v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f241019w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ApmMultibancoDynamicFeaturesWorker apmMultibancoDynamicFeaturesWorker, gim.c cVar) {
        super(cVar);
        this.v = apmMultibancoDynamicFeaturesWorker;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f241019w |= Integer.MIN_VALUE;
        return this.v.a(this);
    }
}

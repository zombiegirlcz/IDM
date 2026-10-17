package pzl;

import com.revolut.utils.job.workers.CreditDynamicFeaturesWorker;

/* JADX INFO: loaded from: classes12.dex */
public final class m extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ CreditDynamicFeaturesWorker v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f241030w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(CreditDynamicFeaturesWorker creditDynamicFeaturesWorker, gim.c cVar) {
        super(cVar);
        this.v = creditDynamicFeaturesWorker;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f241030w |= Integer.MIN_VALUE;
        return this.v.a(this);
    }
}

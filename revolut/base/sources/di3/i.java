package di3;

import com.revolut.feature.checkout.models.PreorderPlanResult;

/* JADX INFO: loaded from: classes21.dex */
public final class i extends gim.c {
    public PreorderPlanResult u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ k f114886w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f114887x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(k kVar, gim.c cVar) {
        super(cVar);
        this.f114886w = kVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f114887x |= Integer.MIN_VALUE;
        return this.f114886w.f(null, null, null, this);
    }
}

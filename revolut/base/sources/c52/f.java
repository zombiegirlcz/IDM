package c52;

import com.revolut.feature.apm.core.models.transfers.money_requests.ApmAcceptMoneyRequest;

/* JADX INFO: loaded from: classes20.dex */
public final class f extends gim.c {
    public ApmAcceptMoneyRequest u;
    public k71.c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f21369w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ r f21370x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f21371y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(r rVar, gim.c cVar) {
        super(cVar);
        this.f21370x = rVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f21369w = obj2;
        this.f21371y |= Integer.MIN_VALUE;
        return r.Z2(this.f21370x, null, null, this);
    }
}

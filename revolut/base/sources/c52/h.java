package c52;

import com.revolut.feature.apm.core.models.transfers.money_requests.ApmMoneyRequestInfo;

/* JADX INFO: loaded from: classes20.dex */
public final class h extends gim.c {
    public ApmMoneyRequestInfo u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ r f21375w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f21376x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(r rVar, gim.c cVar) {
        super(cVar);
        this.f21375w = rVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f21376x |= Integer.MIN_VALUE;
        return r.c3(this.f21375w, null, this);
    }
}

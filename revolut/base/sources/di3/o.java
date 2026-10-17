package di3;

import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.model.account.AccountId;
import com.revolut.retail.core.navigation.NaviCommand;
import h93.f0;

/* JADX INFO: loaded from: classes21.dex */
public final class o extends gim.c {
    public final /* synthetic */ w A;
    public int B;
    public f0 u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public AccountId f114894w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public AnalyticsProduct f114895x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public NaviCommand f114896y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(w wVar, gim.c cVar) {
        super(cVar);
        this.A = wVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.z = obj2;
        this.B |= Integer.MIN_VALUE;
        return this.A.c(null, null, null, null, null, this);
    }
}

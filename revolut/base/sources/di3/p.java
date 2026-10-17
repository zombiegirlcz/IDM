package di3;

import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.model.account.AccountId;
import com.revolut.feature.checkout.models.PreorderResult;
import com.revolut.retail.core.navigation.NaviCommand;

/* JADX INFO: loaded from: classes21.dex */
public final class p extends gim.c {
    public int A;
    public AccountId u;
    public AnalyticsProduct v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public NaviCommand f114897w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public PreorderResult f114898x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f114899y;
    public final /* synthetic */ w z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(w wVar, gim.c cVar) {
        super(cVar);
        this.z = wVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f114899y = obj2;
        this.A |= Integer.MIN_VALUE;
        return this.z.e(null, null, null, null, this);
    }
}

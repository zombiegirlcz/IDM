package wh3;

import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature.checkout.models.CheckoutParams;
import com.revolut.retail.core.navigation.NaviCommand;

/* JADX INFO: loaded from: classes21.dex */
public final class m extends gim.c {
    public CheckoutParams.CardOrder u;
    public NaviCommand v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public AnalyticsProduct f297388w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f297389x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ n f297390y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(n nVar, gim.c cVar) {
        super(cVar);
        this.f297390y = nVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f297389x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f297390y.Z2(null, null, null, this);
    }
}

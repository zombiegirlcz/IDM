package ntk;

import com.revolut.retail.feature.stockdetails.api.navigation.AssetDetailsDestination;

/* JADX INFO: loaded from: classes12.dex */
public final class g extends gim.c {
    public AssetDetailsDestination u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.stockdetails.impl.ui.flows.asset_details.a f219150w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f219151x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.revolut.retail.feature.stockdetails.impl.ui.flows.asset_details.a aVar, gim.c cVar) {
        super(cVar);
        this.f219150w = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f219151x |= Integer.MIN_VALUE;
        return this.f219150w.J2(null, this);
    }
}

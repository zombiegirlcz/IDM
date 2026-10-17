package ntk;

import com.revolut.retail.feature.stockdetails.api.navigation.AssetDetailsDestination;

/* JADX INFO: loaded from: classes12.dex */
public final class j extends gim.c {
    public AssetDetailsDestination u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f219156w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.stockdetails.impl.ui.flows.asset_details.a f219157x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f219158y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.revolut.retail.feature.stockdetails.impl.ui.flows.asset_details.a aVar, gim.c cVar) {
        super(cVar);
        this.f219157x = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f219156w = obj2;
        this.f219158y |= Integer.MIN_VALUE;
        return this.f219157x.L2(null, null, null, this);
    }
}

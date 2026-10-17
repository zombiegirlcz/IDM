package ntk;

import com.revolut.retail.feature.stockdetails.api.navigation.AssetDetailsDestination;
import nel.n;

/* JADX INFO: loaded from: classes12.dex */
public final class k extends gim.c {
    public AssetDetailsDestination u;
    public n v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public com.revolut.retail.feature.stockdetails.impl.ui.flows.asset_details.a f219159w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f219160x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.stockdetails.impl.ui.flows.asset_details.a f219161y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.revolut.retail.feature.stockdetails.impl.ui.flows.asset_details.a aVar, gim.c cVar) {
        super(cVar);
        this.f219161y = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f219160x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f219161y.M2(null, null, this);
    }
}

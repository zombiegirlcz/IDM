package ntk;

import com.revolut.retail.feature.stockdetails.api.navigation.AssetDetailsDestination;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes12.dex */
public final class h extends gim.c {
    public AssetDetailsDestination u;
    public Function0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f219152w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.stockdetails.impl.ui.flows.asset_details.a f219153x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f219154y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.revolut.retail.feature.stockdetails.impl.ui.flows.asset_details.a aVar, gim.c cVar) {
        super(cVar);
        this.f219153x = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f219152w = obj2;
        this.f219154y |= Integer.MIN_VALUE;
        return this.f219153x.K2(null, null, null, this);
    }
}

package yrd;

import com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.common.SmartEstimationAccess;
import com.revolut.retail.feature.api.custom_assets.models.CustomAsset;
import com.revolut.retail.feature.api.custom_assets.models.CustomAssetCategoryDefinition;

/* JADX INFO: loaded from: classes7.dex */
public final class h extends gim.c {
    public final /* synthetic */ com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.flow.f A;
    public int B;
    public CustomAsset u;
    public CustomAssetCategoryDefinition v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public xi0.b f316279w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public SmartEstimationAccess f316280x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f316281y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.flow.f fVar, gim.c cVar) {
        super(cVar);
        this.A = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.z = obj2;
        this.B |= Integer.MIN_VALUE;
        return com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.flow.f.I2(this.A, null, null, null, false, null, this);
    }
}

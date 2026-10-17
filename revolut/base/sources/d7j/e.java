package d7j;

import com.revolut.retail.feature.commodity.order_flow.api.navigation.CommodityOrderFlowConfig;

/* JADX INFO: loaded from: classes10.dex */
public final class e extends gim.c {
    public CommodityOrderFlowConfig u;
    public wd6.h v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public xi0.b f111988w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f111989x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ f f111990y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, gim.c cVar) {
        super(cVar);
        this.f111990y = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f111989x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f111990y.d(null, null, this);
    }
}

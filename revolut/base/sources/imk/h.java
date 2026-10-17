package imk;

import com.revolut.data.model.Data;

/* JADX INFO: loaded from: classes11.dex */
public final class h extends gim.c {
    public final /* synthetic */ com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_hub_v2.screen.a A;
    public int B;
    public hha.d u;
    public Data v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public kmk.a f162512w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Data f162513x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f162514y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_hub_v2.screen.a aVar, gim.c cVar) {
        super(cVar);
        this.A = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.z = obj2;
        this.B |= Integer.MIN_VALUE;
        return this.A.c(null, null, 0, null, this);
    }
}

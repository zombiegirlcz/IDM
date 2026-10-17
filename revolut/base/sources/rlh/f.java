package rlh;

import com.revolut.feature.trading_orders.api.navigation.trading_asset_details.RecurringBuyAssetDetailsDestination;
import com.revolut.retail.feature.commodity.asset_details.api.navigation.CommodityAssetDetailsDestination;
import com.revolut.retail.feature.commodity.asset_details.api.navigation.DisplayConfig;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes10.dex */
public final class f extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ s v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ j f255053w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(s sVar, j jVar, Continuation continuation) {
        super(1, continuation);
        this.v = sVar;
        this.f255053w = jVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new f(this.v, this.f255053w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((f) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            s sVar = this.v;
            boolean z = sVar instanceof p;
            j jVar = this.f255053w;
            if (z) {
                return jVar.C1(new RecurringBuyAssetDetailsDestination(((p) sVar).f255068a));
            }
            if (!(sVar instanceof q)) {
                if (sVar instanceof r) {
                    return jVar.C1(new RecurringBuyAssetDetailsDestination(((r) sVar).f255071a));
                }
                if (!(sVar instanceof o)) {
                    throw new NoWhenBranchMatchedException();
                }
                xi0.a aVar2 = xi0.b.Companion;
                String str = ((o) sVar).f255067a;
                aVar2.getClass();
                return jVar.C1(new CommodityAssetDetailsDestination(xi0.a.a(str), DisplayConfig.RecurringBuy.f99777a));
            }
            String str2 = ((q) sVar).f255069a;
            rgf.m mVar = new rgf.m(jVar, sVar, 9);
            rgf.b bVar = new rgf.b(jVar, sVar, 8);
            this.u = 1;
            if (j.I2(jVar, str2, mVar, bVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return Unit.f186387a;
    }
}

package anh;

import com.revolut.feature.instruments.trend.collections.api.model.InstrumentsTrendCollectionId;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountType;
import ip0.v7;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class q implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7796a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f7797b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ vmh.g f7798c;

    public /* synthetic */ q(s sVar, vmh.g gVar, int i) {
        this.f7796a = i;
        this.f7797b = sVar;
        this.f7798c = gVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f7796a;
        vmh.g gVar = this.f7798c;
        s sVar = this.f7797b;
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        switch (i) {
            case 0:
                if (!zBooleanValue) {
                    return new go.g(zi0.c.P(e.f7785a, false, null, 3), 2);
                }
                ybl.k kVar = sVar.f7801b;
                TradingAccountType[] elements = {TradingAccountType.Gia.f105270a, TradingAccountType.Taa.f105275a};
                Intrinsics.checkNotNullParameter(elements, "elements");
                return boh.f.e(v7.y("RecommendedWidgetProvider", "observeEligibleWidgetState", vkm.q.q(ybl.k.f(kVar, kotlin.collections.d.y0(elements), 4))), new q(sVar, gVar, 1));
            default:
                if (!zBooleanValue) {
                    return new go.g(zi0.c.P(f.f7786a, false, null, 3), 2);
                }
                r10.q qVar = sVar.f7800a;
                knh.b bVar = new knh.b(InstrumentsTrendCollectionId.RecommendedBuy.f74905a, knh.a.STOCKS);
                vmh.f fVar = gVar.f290586b;
                if (fVar != null) {
                    d8l.d.x(fVar);
                }
                return nim.a.v(qVar.W(bVar), new anf.p(9));
        }
    }
}

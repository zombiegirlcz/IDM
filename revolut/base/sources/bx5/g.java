package bx5;

import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.feature.cryptocommodity_invest.impl.ui.activities.collections.buy.screen.amount.v2.CryptoCommodityBuyCollectionAmountScreenV2;
import com.revolut.feature.cryptocommodity_invest.impl.ui.activities.collections.buy.screen.select.CryptoCommodityBuyCollectionSelectCryptoScreen;
import com.revolut.feature.cryptocommodity_invest.impl.ui.activities.collections.buy.screen.select.CryptoCommodityBuyCollectionSelectCryptoScreenContract$InputData;
import com.revolut.kompot.common.ModalDestination;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import zw5.n;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class g extends kotlin.jvm.internal.a implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CellDetailsActionDelegate.Model model = (CellDetailsActionDelegate.Model) obj2;
        zw5.e eVar = (zw5.e) this.receiver;
        KProperty[] kPropertyArr = CryptoCommodityBuyCollectionAmountScreenV2.g0;
        n nVar = (n) eVar;
        nVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        String str = model.f51781a;
        if (!Intrinsics.f(str, "COLLECTION_BUY_INVEST_IN_LIST_ID")) {
            throw new IllegalStateException(a10.b.s("Click on cell action with listId ", str, " not supported"));
        }
        Object obj4 = model.f51787l;
        Intrinsics.i(obj4, "null cannot be cast to non-null type com.revolut.feature.cryptocommodity_invest.impl.ui.activities.collections.buy.screen.amount.CryptoCommodityBuyCollectionAmountScreenContract.SelectedCurrenciesParcel");
        List list = ((zw5.f) obj4).f325732a;
        List list2 = ((zw5.a) nVar.t2()).d;
        if (list2 == null) {
            list2 = list;
        }
        nVar.Y1(new CryptoCommodityBuyCollectionSelectCryptoScreen(new CryptoCommodityBuyCollectionSelectCryptoScreenContract$InputData(list, list2)), ModalDestination.Style.POPUP.f98311a, new zw5.h(nVar, 1));
        return Unit.f186387a;
    }
}

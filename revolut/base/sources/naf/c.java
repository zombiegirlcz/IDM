package naf;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.trading.transfer.investments.api.domain.model.TransferInInstrument;
import com.revolut.feature.trading.transfer.investments.api.domain.model.TransferInSelectedAsset;
import com.revolut.feature.trading.transfer.investments.api.domain.model.TransferRequestPosition;
import com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_asset_selection.screens.buy_in_price.BuyInPriceScreen;
import com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_price_update.screens.assets_price_update.AssetsPriceUpdateScreen;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes8.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ AssetsPriceUpdateScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(AssetsPriceUpdateScreen assetsPriceUpdateScreen, Continuation continuation) {
        super(2, continuation);
        this.v = assetsPriceUpdateScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        TransferInSelectedAsset transferInSelectedAsset;
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        g gVar = (g) this.v.P.getValue();
        Intrinsics.h(model);
        k kVar = (k) gVar;
        kVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.u;
        if (obj3 instanceof f) {
            TransferRequestPosition transferRequestPosition = ((f) obj3).f213892a;
            ej0.b bVar = transferRequestPosition.e;
            if (bVar != null) {
                transferInSelectedAsset = new TransferInSelectedAsset(new TransferInInstrument(transferRequestPosition.f91525a, transferRequestPosition.f91526b, transferRequestPosition.f91527c, bVar.f126704b), transferRequestPosition.d, bVar);
            } else {
                transferInSelectedAsset = null;
            }
            if (transferInSelectedAsset == null) {
                r6.b.D("Buy In price not present but asset is editable.");
            } else {
                kVar.f2(new BuyInPriceScreen(transferInSelectedAsset.f91510a, bVar, false), ModalDestination.Style.POPUP.f98311a, new n45.b(transferRequestPosition, kVar, 26));
            }
        }
        return Unit.f186387a;
    }
}

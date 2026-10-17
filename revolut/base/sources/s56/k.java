package s56;

import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.feature.defi.asset_details.api.model.DeFiAssetDetails;
import com.revolut.feature.defi.remittances.impl.ui.send.amount.DeFiSendAmountScreen;
import com.revolut.feature.defi.remittances.impl.ui.send.amount.DeFiSendAmountScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes3.dex */
public final class k extends gim.i implements Function2 {
    public final /* synthetic */ DeFiSendAmountScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(DeFiSendAmountScreen deFiSendAmountScreen, Continuation continuation) {
        super(2, continuation);
        this.u = deFiSendAmountScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new k(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((k) create((CellDetailsDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        com.revolut.feature.defi.remittances.impl.ui.send.amount.b bVar = (com.revolut.feature.defi.remittances.impl.ui.send.amount.b) this.u.d();
        cli.y yVar = bVar.z;
        DeFiAssetDetails deFiAssetDetails = ((o) ((j2) yVar.f22677a).getValue()).f259974g;
        if (deFiAssetDetails != null) {
            oki.h.v2(bVar.A, new DeFiSendAmountScreenContract$ModalStep.ChainPicker(deFiAssetDetails.f71667c, ((o) ((j2) yVar.f22677a).getValue()).e), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        } else {
            zhm.h0 h0Var = zhm.h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, "DeFiSendAmountScreenModel", "Trying to open network picker before loading asset out", null, h0Var);
        }
        return Unit.f186387a;
    }
}

package m9j;

import cli.y;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.feature.crypto.asset_details.impl.ui.screens.holding.CryptoHoldingScreen;
import com.revolut.retail.feature.crypto.asset_details.impl.ui.screens.holding.CryptoHoldingScreenContract$ModalStep;
import com.revolut.retail.feature.crypto.asset_details.impl.ui.screens.holding.CryptoHoldingScreenContract$Parcel$BalanceBreakdown;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes11.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CryptoHoldingScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(CryptoHoldingScreen cryptoHoldingScreen, Continuation continuation) {
        super(2, continuation);
        this.v = cryptoHoldingScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((CellDetailsDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CellDetailsDelegate.Model model = (CellDetailsDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        k kVarD = this.v.d();
        Object obj3 = model.o;
        com.revolut.retail.feature.crypto.asset_details.impl.ui.screens.holding.a aVar2 = (com.revolut.retail.feature.crypto.asset_details.impl.ui.screens.holding.a) kVarD;
        com.revolut.kompot.navigable.vc.modal.a aVar3 = aVar2.D;
        y yVar = aVar2.C;
        if (Intrinsics.f(obj3, CryptoHoldingScreenContract$Parcel$BalanceBreakdown.f100008a)) {
            j2 j2Var = (j2) yVar.f22677a;
            j2 j2Var2 = (j2) yVar.f22677a;
            boolean z = ((h) j2Var.getValue()).f203805h;
            ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
            if (z) {
                oki.h.v2(aVar3, new CryptoHoldingScreenContract$ModalStep.BalanceBreakdown(((h) j2Var2.getValue()).f203801a.f306286a), bottom_dialog);
            } else {
                oki.h.v2(aVar3, new CryptoHoldingScreenContract$ModalStep.RevXOrdersBreakdown(((h) j2Var2.getValue()).f203801a.f306286a), bottom_dialog);
            }
        } else if (obj3 instanceof oc5.e) {
            aVar2.J2((oc5.e) obj3);
        }
        return Unit.f186387a;
    }
}

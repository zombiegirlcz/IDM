package baf;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_create.screens.account_information.AccountInformationScreen;
import com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_create.screens.account_information.AccountInformationScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class e extends kotlin.jvm.internal.a implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        InputTextDelegate.Model model = (InputTextDelegate.Model) obj2;
        l lVar = (l) this.receiver;
        KProperty[] kPropertyArr = AccountInformationScreen.U;
        com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_create.screens.account_information.a aVar = (com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_create.screens.account_information.a) lVar;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        if (Intrinsics.f(model.P, h.f14051a)) {
            oki.h.v2(aVar.f91597q, AccountInformationScreenContract$ModalStep.BrokerCountryChooser.f91592a, ModalDestination.Style.POPUP.f98311a);
        }
        return Unit.f186387a;
    }
}

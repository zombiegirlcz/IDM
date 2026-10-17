package baf;

import cli.y;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_create.screens.account_information.AccountInformationScreen;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class f extends kotlin.jvm.internal.a implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        InputChecklistDelegate.Model model = (InputChecklistDelegate.Model) obj2;
        l lVar = (l) this.receiver;
        KProperty[] kPropertyArr = AccountInformationScreen.U;
        com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_create.screens.account_information.a aVar = (com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_create.screens.account_information.a) lVar;
        y yVar = aVar.f91596p;
        Intrinsics.checkNotNullParameter(model, "model");
        if (Intrinsics.f(model.i, g.f14050a)) {
            aVar.H2(yVar, new b96.a(16));
            aVar.I2(yVar);
        }
        return Unit.f186387a;
    }
}

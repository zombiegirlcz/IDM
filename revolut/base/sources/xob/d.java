package xob;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.feature.retail.savings.impl.ui.details.SavingsDetailsScreen;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class d extends kotlin.jvm.internal.a implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        LargeActionButtonDelegate.Model model = (LargeActionButtonDelegate.Model) obj2;
        n nVar = (n) this.receiver;
        KProperty[] kPropertyArr = SavingsDetailsScreen.Z;
        com.revolut.feature.retail.savings.impl.ui.details.a aVar = (com.revolut.feature.retail.savings.impl.ui.details.a) nVar;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj4 = model.i;
        String str = model.f52613a;
        if (obj4 instanceof jjb.g) {
            ((tkb.c) aVar.f83374y).b3((jjb.g) obj4);
        } else if (Intrinsics.f(str, "ID_SAVINGS_INTEREST_GOT_IT_BUTTON")) {
            j60.a.v(aVar.f83369r, false, null, 3);
        } else if (Intrinsics.f(str, "CAPITAL_AT_RISK_SECONDARY_BUTTON_LIST_ID")) {
            aVar.l2(new w(aVar, null), new yi5.b(26));
        }
        return Unit.f186387a;
    }
}

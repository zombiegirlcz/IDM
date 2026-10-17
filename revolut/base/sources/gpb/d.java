package gpb;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.feature.retail.savings.impl.ui.info.interest_fees.InterestAndFeesScreen;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class d extends kotlin.jvm.internal.a implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        LargeActionButtonDelegate.Model model = (LargeActionButtonDelegate.Model) obj2;
        h hVar = (h) this.receiver;
        KProperty[] kPropertyArr = InterestAndFeesScreen.W;
        o oVar = (o) hVar;
        oVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        if (Intrinsics.f(model.f52613a, "ID_SAVINGS_INTEREST_GOT_IT_BUTTON")) {
            j60.a.v(oVar.o, false, null, 3);
        }
        return Unit.f186387a;
    }
}

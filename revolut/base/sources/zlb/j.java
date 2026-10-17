package zlb;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.option_selection.SavingsOptionSelectionController;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import n68.t;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class j extends kotlin.jvm.internal.a implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        RowDelegate.Model model = (RowDelegate.Model) obj2;
        c cVar = (c) this.receiver;
        KProperty[] kPropertyArr = SavingsOptionSelectionController.T;
        o oVar = (o) cVar;
        oVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        oVar.H2(oVar.f323225s, new t(model, 2));
        return Unit.f186387a;
    }
}

package aqb;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.vf;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class c extends kotlin.jvm.internal.a implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        RowDelegate.Model model = (RowDelegate.Model) obj2;
        com.revolut.feature.retail.savings.impl.ui.widgets.savings.transfer.a aVar = (com.revolut.feature.retail.savings.impl.ui.widgets.savings.transfer.a) ((j) this.receiver);
        aVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        if (Intrinsics.f(model.f53228a, "SHOW_WITHDRAW_LIST_ID")) {
            RowDelegate.Model.c cVar = model.k;
            vf vfVar = cVar instanceof vf ? (vf) cVar : null;
            if (vfVar == null) {
                throw new IllegalStateException("Required value was null.");
            }
            aVar.x2(new an4.f(vfVar, 25));
        }
        return Unit.f186387a;
    }
}

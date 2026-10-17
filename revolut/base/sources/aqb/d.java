package aqb;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import zhm.h0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class d extends kotlin.jvm.internal.a implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        LargeActionButtonDelegate.Model model = (LargeActionButtonDelegate.Model) obj2;
        com.revolut.feature.retail.savings.impl.ui.widgets.savings.transfer.a aVar = (com.revolut.feature.retail.savings.impl.ui.widgets.savings.transfer.a) ((j) this.receiver);
        aVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        String str = model.f52613a;
        if (Intrinsics.f(str, "CUSTOMISE_DONE_BUTTON_LIST_ID")) {
            aVar.z2();
        } else if (Intrinsics.f(str, "SELECT_SAVINGS_DONE_BUTTON_LIST_ID")) {
            aVar.x2(new s(1));
        } else {
            IllegalStateException illegalStateException = new IllegalStateException(j6.a.q("Unexpected LargeActionButton click, modelListId=", model.f52613a));
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
        }
        return Unit.f186387a;
    }
}

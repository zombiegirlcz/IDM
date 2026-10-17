package lb0;

import com.revolut.core.backend_flow.impl.ui.form_screen.FormController;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.feature.backend_flow.domain.models.Action;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class o extends kotlin.jvm.internal.a implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        ListSubheaderDelegate.Model clickData = (ListSubheaderDelegate.Model) obj2;
        q qVar = (q) this.receiver;
        int i = FormController.D0;
        com.revolut.core.backend_flow.impl.ui.form_screen.a aVar = (com.revolut.core.backend_flow.impl.ui.form_screen.a) qVar;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(clickData, "clickData");
        Object obj4 = clickData.f52715m;
        Action action = obj4 instanceof Action ? (Action) obj4 : null;
        if (action != null) {
            aVar.K2(action);
        } else {
            IllegalStateException illegalStateException = new IllegalStateException("Action is not provided");
            zhm.h0 h0Var = zhm.h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
        }
        return Unit.f186387a;
    }
}

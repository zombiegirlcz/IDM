package xob;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.vf;
import com.revolut.feature.retail.savings.impl.ui.details.SavingsDetailsScreen;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import zhm.h0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class c extends kotlin.jvm.internal.a implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        RowDelegate.Model model = (RowDelegate.Model) obj2;
        n nVar = (n) this.receiver;
        KProperty[] kPropertyArr = SavingsDetailsScreen.Z;
        com.revolut.feature.retail.savings.impl.ui.details.a aVar = (com.revolut.feature.retail.savings.impl.ui.details.a) nVar;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        RowDelegate.Model.c cVar = model.k;
        if ((cVar instanceof vf ? (vf) cVar : null) == null) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Switch is null for onSwitchClick");
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var);
        } else if (Intrinsics.f(model.f53228a, "ID_LOCK_WITHDRAWAL")) {
            aVar.n2(new mt8.b(aVar, !r0.f54880a, null, 18), new whi.b(6));
        }
        return Unit.f186387a;
    }
}

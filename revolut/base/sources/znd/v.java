package znd;

import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.models.popup.PopupMenuItem;
import com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.details.AnalyticsDetailsController;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class v extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ AnalyticsDetailsController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(AnalyticsDetailsController analyticsDetailsController, Continuation continuation) {
        super(2, continuation);
        this.v = analyticsDetailsController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        v vVar = new v(this.v, continuation);
        vVar.u = obj2;
        return vVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((v) create((ListSubheaderDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ListSubheaderDelegate.Model model = (ListSubheaderDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        Object obj3 = model.f52715m;
        List list = obj3 instanceof List ? (List) obj3 : null;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj4 : list) {
                if (obj4 instanceof PopupMenuItem) {
                    arrayList.add(obj4);
                }
            }
            rp0.l0 l0Var = this.v.c0;
            if (l0Var == null) {
                Intrinsics.r("popupMenuDialogDisplayer");
                throw null;
            }
            rp0.l0.f(l0Var, "FILTERS_DROPDOWN_ID", zi0.c.d(arrayList), mw0.o.BELOW, null, 8);
        }
        return Unit.f186387a;
    }
}

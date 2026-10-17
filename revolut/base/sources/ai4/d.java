package ai4;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.feature.credit.application.plugins.impl.ui.singleselectordetails.SingleSelectorInputDetailsScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.singleselectordetails.SingleSelectorInputDetailsScreenContract$BottomSheet;
import com.revolut.feature.credit.application.plugins.impl.ui.singleselectordetails.SingleSelectorInputDetailsScreenContract$SelectedValue;
import com.revolut.kompot.common.ModalDestination;
import dx4.f3;
import dx4.g3;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ SingleSelectorInputDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(SingleSelectorInputDetailsScreen singleSelectorInputDetailsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = singleSelectorInputDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        i iVarE3 = this.v.d();
        Intrinsics.h(model);
        l lVar = (l) iVarE3;
        lVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.u;
        if (obj3 instanceof g3) {
            g3 g3Var = (g3) obj3;
            SingleSelectorInputDetailsScreenContract$SelectedValue singleSelectorInputDetailsScreenContract$SelectedValue = new SingleSelectorInputDetailsScreenContract$SelectedValue(g3Var.f120605a, g3Var.f120606b);
            f3 f3Var = g3Var.e;
            if (f3Var != null) {
                oki.h.v2(lVar.f5192p, new SingleSelectorInputDetailsScreenContract$BottomSheet(new TextClause(f3Var.f120592a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause(f3Var.f120593b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause(f3Var.f120594c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), singleSelectorInputDetailsScreenContract$SelectedValue), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
            } else {
                lVar.C2(new g(singleSelectorInputDetailsScreenContract$SelectedValue));
            }
        }
        return Unit.f186387a;
    }
}

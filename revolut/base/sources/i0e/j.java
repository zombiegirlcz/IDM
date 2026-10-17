package i0e;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.statements.R$string;
import com.revolut.feature.statements.api.models.StatementPeriodType;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class j extends kotlin.jvm.internal.a implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        a0 a0Var;
        InputTextDelegate.Model model = (InputTextDelegate.Model) obj2;
        q qVar = (q) ((g) this.receiver);
        qVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        String str = model.f52580a;
        Object obj4 = model.P;
        int iHashCode = str.hashCode();
        if (iHashCode != -769741326) {
            if (iHashCode != -400551899) {
                if (iHashCode == 2036880481 && str.equals("CUSTOM_VALUES_FROM_ITEM_ID")) {
                    a0Var = obj4 instanceof a0 ? (a0) obj4 : null;
                    if (a0Var != null) {
                        qVar.b3(a0Var, true);
                    }
                }
            } else if (str.equals("PERIOD_CHOOSER_ITEM_ID")) {
                d state = obj4 instanceof d ? (d) obj4 : null;
                if (state != null && state.f157362b.size() >= 2) {
                    j60.a aVar = qVar.o;
                    ((r) qVar.f157380l).getClass();
                    Intrinsics.checkNotNullParameter(state, "state");
                    SingleChoiceDelegate.Model[] elements = {r.a(StatementPeriodType.ALL_TIME, state), r.a(StatementPeriodType.MONTH, state), r.a(StatementPeriodType.TAX_YEAR, state), r.a(StatementPeriodType.CALENDAR_YEAR, state), r.a(StatementPeriodType.CUSTOM, state)};
                    Intrinsics.checkNotNullParameter(elements, "elements");
                    List listL = kotlin.collections.d.L(elements);
                    yp0.b.k(listL, 0, 0, 0, 0, 31);
                    aVar.x(new rp0.y(listL, new rp0.t(new TextLocalisedClause(R$string.common_word_period, null, null, 14), null, null, 30), rp0.l.WINDOW, null, null, null, 1016));
                }
            }
        } else if (str.equals("CUSTOM_VALUES_TO_ITEM_ID")) {
            a0Var = obj4 instanceof a0 ? (a0) obj4 : null;
            if (a0Var != null) {
                qVar.b3(a0Var, false);
            }
        }
        return Unit.f186387a;
    }
}

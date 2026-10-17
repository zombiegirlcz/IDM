package xl7;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.insurance_car.impl.R$string;
import com.youTransactor.uCube.rpc.Constants;
import ip0.z;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
public abstract class f {
    public static final ActionsView.Item a(boolean z, Boolean bool) {
        int i;
        String strValueOf = String.valueOf(z);
        if (z) {
            i = R$string.car_insurance_common_yes;
        } else {
            if (z) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$string.car_insurance_common_no;
        }
        return new ActionsView.Item(strValueOf, Intrinsics.f(bool, Boolean.valueOf(z)) ? mx0.d.ACCENT : mx0.d.SEMIACCENT, false, null, null, new TextLocalisedClause(i, null, null, 14), null, null, null, null, false, null, null, Boolean.valueOf(z), null, 24476);
    }

    public static List b(Clause title, Clause clause, Object question, Boolean bool, tf tfVar, int i) {
        Clause clause2 = (i & 2) != 0 ? null : clause;
        tf tfVar2 = (i & 16) != 0 ? null : tfVar;
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(question, "question");
        return v.k(new RowDelegate.Model("QUESTION_" + question, null, title, null, 0, clause2, null, null, 0, tfVar2, false, null, false, null, null, null, null, null, null, question, null, 0, R$attr.uikit_dp0, 0, 0, 499119066), new z(question.toString(), v.k(a(true, bool), a(false, bool)), null, mx0.l.SCROLLABLE, R$attr.uikit_dp8, 0, question, Constants.EMVTag.TAG_9C_TRANSACTION_TYPE));
    }
}

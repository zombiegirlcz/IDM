package bhj;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.feature.esim.impl.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class f implements c {
    @Override // bhj.c
    public final a c(d state, String str, l71.d dVar) {
        Intrinsics.checkNotNullParameter(state, "state");
        int i = e.f15306a[state.ordinal()];
        if (i == 1) {
            return new a(new TextLocalisedClause(R$string.esim_checkout_success_mobile_plan_not_ready_subtitle, null, null, 14), new TextLocalisedClause(R$string.esim_checkout_success_plan_added_title, null, null, 14), new TextLocalisedClause(R.string.common_action_continue, null, null, 14));
        }
        if (i == 2) {
            return new a(new TextLocalisedClause(R$string.esim_checkout_success_mobile_plan_ready_subtitle, null, null, 14), new TextLocalisedClause(R$string.esim_checkout_success_plan_added_title, null, null, 14), new TextLocalisedClause(R$string.esim_checkout_success_install_esim_button, null, null, 14));
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return new a(new TextLocalisedClause(R$string.esim_checkout_success_mobile_plan_ready_subtitle, null, null, 14), new TextLocalisedClause(R$string.esim_checkout_success_plan_added_title, null, null, 14), new TextLocalisedClause(R.string.common_action_continue, null, null, 14));
    }
}

package up2;

import aw0.o9;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.bank_account_switching.api.R$string;
import com.revolut.feature.bank_account_switching.impl.ui.switch_out.review.domain.SwitchOutReview;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import nii.v;
import nii.y0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class u {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static y0 a(SwitchOutReview switchOutReview) {
        Intrinsics.checkNotNullParameter(switchOutReview, "switchOutReview");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.account_switch_decline_question, zhm.u.c(new TextClause(switchOutReview.f64068a.d.f63972a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
        m70.a.c(t0.f186434a);
        return new y0("ID_REJECT_DIALOG_CONFIRMATION", new v(textLocalisedClause, new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, new TextLocalisedClause(R$string.account_switch_decline_accept, null, null, 14), new TextLocalisedClause(R$string.account_switch_decline_decline, null, null, 14), null, null, null, false, null, 4032), false, 4);
    }
}

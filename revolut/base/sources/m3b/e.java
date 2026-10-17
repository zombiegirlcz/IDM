package m3b;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.retail.cfd.impl.R$string;
import com.revolut.feature.retail.cfd.impl.screens.common.ExpiryDate;
import java.time.ZonedDateTime;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class e implements c {
    public final Clause a(ExpiryDate expiryDate) {
        Clause textClause;
        Intrinsics.checkNotNullParameter(expiryDate, "expiryDate");
        int i = d.f202319a[expiryDate.f82206a.ordinal()];
        if (i != 1 && i != 2 && i != 3 && i != 4) {
            if (i == 5) {
                return new TextLocalisedClause(R$string.wealth_margin_cfd_expiry_dialog_never, null, new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), 10);
            }
            throw new NoWhenBranchMatchedException();
        }
        ZonedDateTime zonedDateTime = expiryDate.f82207b;
        if (zonedDateTime != null) {
            textClause = new TimeClause(zonedDateTime.toInstant().toEpochMilli(), TimeClause.Format.DateLong.f57962b, new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), zonedDateTime.getZone());
        } else {
            textClause = new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        }
        return textClause;
    }
}

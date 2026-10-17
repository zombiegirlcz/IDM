package s12;

import aw0.o9;
import ch.qos.logback.core.CoreConstants;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.models.p0;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.core.api.R$string;
import java.util.List;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes20.dex */
public final class m implements a12.q {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public final Clause a(long j2, long j3, boolean z) {
        TextLocalisedClause textLocalisedClause;
        Float fValueOf = Float.valueOf(16.0f);
        if (j3 < CoreConstants.MILLIS_IN_ONE_HOUR) {
            long j5 = j3 / 1000;
            textLocalisedClause = new TextLocalisedClause(R$string.apm_transfer_expiry_expires_in, u.c(new TextClause((j5 / 60) + ":" + d0.b0(String.valueOf(j5 % 60), 2, '0'), (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
        } else {
            textLocalisedClause = j3 < CoreConstants.MILLIS_IN_ONE_DAY ? new TextLocalisedClause(R$string.apm_transfer_expiry_expires_in, u.c(new TimeClause(j3, new TimeClause.Format.Duration(new TimeClause.Format.Duration.DurationStyle.Textual(p0.MINUTES)), null, null, 12)), null, 12) : new TextLocalisedClause(R$string.apm_transfer_expiry_expires_on, u.c(new TimeClause(j2, new TimeClause.Format.DayAndMonth(0), null, null, 12)), null, 12);
        }
        return !z ? textLocalisedClause : new CompositeClause(v.k(new ImageClause(R$drawable.uikit_icn_24_time, Integer.valueOf(R$attr.uikit_colorGreyTone50), fValueOf, fValueOf, 16), textLocalisedClause), new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
    }
}

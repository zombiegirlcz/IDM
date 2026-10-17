package pui;

import aw0.o9;
import aw0.v4;
import com.revolut.core.ui_kit.delegates.hg;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.retail.feature.airport.security_fast_track.impl.R$string;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import org.jetbrains.annotations.NotNull;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
public final class c {

    @NotNull
    public static final b Companion = new b();

    public static CompositeClause a(OffsetDateTime offsetDateTime, Custom custom, Custom custom2) {
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.asft_checkout_top_block_free_cancellation_title, null, custom, 10);
        int i = R$string.asft_checkout_top_block_free_cancellation_value;
        LocalDateTime localDateTime = offsetDateTime.toLocalDateTime();
        Intrinsics.checkNotNullExpressionValue(localDateTime, "toLocalDateTime(...)");
        List listK = v.k(textLocalisedClause, new TextLocalisedClause(i, u.c(new TimeClause(oi0.d.R(localDateTime), new TimeClause.Format.Pretty(0), null, null, 12)), custom2, 8));
        m70.a.t(t0.f186434a);
        return new CompositeClause(listK, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
    }

    public static hg b(List list) {
        v4 v4Var = new v4(86.0f);
        int i = R$attr.uikit_dp8;
        return new hg("list_id_pass_details_date_and_time", list, 2, v4Var, null, null, false, false, null, null, i, i, 0, 0, 26608);
    }
}

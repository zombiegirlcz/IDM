package ni2;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.wero.api.R$string;
import java.time.ZonedDateTime;
import java.util.List;
import jh2.n;
import kotlin.collections.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes21.dex */
public final class a {

    @NotNull
    public static final C1206a Companion = new C1206a();

    /* JADX INFO: renamed from: ni2.a$a, reason: collision with other inner class name */
    public static final class C1206a {
        private C1206a() {
        }
    }

    public static TextLocalisedClause a(n request) {
        Intrinsics.checkNotNullParameter(request, "request");
        ZonedDateTime zonedDateTime = request.e;
        if (zonedDateTime != null) {
            return new TextLocalisedClause(R$string.wero_qr_link_details_date_valid, u.c(new TimeClause(zonedDateTime.toInstant().toEpochMilli(), new TimeClause.Format.DayAndMonth(0), null, null, 12)), null, 12);
        }
        return null;
    }

    public static RowDelegate.Model b(n request) {
        Intrinsics.checkNotNullParameter(request, "request");
        String str = request.d;
        Clause textClause = str != null ? new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : new TextLocalisedClause(R$string.wero_qr_link_details_generic_title, null, null, 14);
        MoneyClause moneyClause = new MoneyClause(request.f174131b, new MoneyClause.Format.Shorts(false, 63), null, null, 12);
        TextLocalisedClause textLocalisedClauseA = a(request);
        int i = com.revolut.feature.apm.core.api.R$string.apm_placeholder_separator_dot;
        Clause[] elements = {moneyClause, textLocalisedClauseA};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return new RowDelegate.Model(j6.a.q("WeroRequestLinkMapper_ROW_", request.f174130a), new RowDelegate.Model.MainImage.Image40(LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_link, R$attr.uikit_colorAccentNeutral, R$attr.uikit_colorAccentNeutral_10), null, null, false, null, false, 60), textClause, null, 0, new TextLocalisedClause(i, d.L(elements), null, 12), null, null, 0, null, false, null, false, null, null, null, null, null, null, request, null, 0, 0, 0, 0, 532676568);
    }
}

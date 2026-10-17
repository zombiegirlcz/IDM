package dhi;

import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature_workflow_reminder_impl.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
public final class h implements n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final o c(j jVar) {
        c domainState = (c) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        LayeredImage.Companion companion = LayeredImage.INSTANCE;
        List listK = v.k(new RowDelegate.Model("LIST_TIMER_OPTIONS_ONE_HOUR_ID", new RowDelegate.Model.MainImage.Image40(companion.i(R$drawable.uikit_icn_24_time, R$attr.uikit_colorForeground, R$attr.uikit_colorGreyTone5), null, null, false, null, false, 62), new TextLocalisedClause(R$string.fincrime_reminder_in_one_hour, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870904), new RowDelegate.Model("LIST_TIMER_OPTIONS_LATER_TODAY_ID", new RowDelegate.Model.MainImage.Image40(companion.i(R$drawable.uikit_icn_24_calendar_date, R$attr.uikit_colorForeground, R$attr.uikit_colorGreyTone5), null, null, false, null, false, 62), new TextLocalisedClause(R$string.fincrime_reminder_later_today, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870904), new RowDelegate.Model("LIST_TIMER_OPTIONS_TOMORROW_ID", new RowDelegate.Model.MainImage.Image40(companion.i(R$drawable.uikit_icn_24_calendar_next_event, R$attr.uikit_colorForeground, R$attr.uikit_colorGreyTone5), null, null, false, null, false, 62), new TextLocalisedClause(R$string.fincrime_common_tomorrow_title, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870904));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        return new g(listK);
    }
}

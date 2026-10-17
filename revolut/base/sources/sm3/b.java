package sm3;

import ch.qos.logback.core.net.SyslogConstants;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.FixedTabsDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.FixedTabs;
import com.revolut.feature.contacts.impl.R$string;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static FixedTabsDelegate.Model a(lm3.a domainState) {
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        if (domainState.f196864a.size() <= 1) {
            return null;
        }
        String str = "ITEM_ID_TAB_EMAIL";
        List listK = v.k(new FixedTabs.Item("ITEM_ID_TAB_PHONE", new TextLocalisedClause(R$string.contact_new_form_phone, null, null, 14), (AnalyticsContext) null, 12), new FixedTabs.Item("ITEM_ID_TAB_EMAIL", new TextLocalisedClause(R$string.contact_new_form_email, null, null, 14), (AnalyticsContext) null, 12));
        int i = c.f264342a[domainState.f196865b.ordinal()];
        if (i == 1) {
            str = "ITEM_ID_TAB_PHONE";
        } else if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return new FixedTabsDelegate.Model("ITEM_ID_TABS", listK, str, false, null, SyslogConstants.LOG_CLOCK);
    }
}

package tzd;

import ch.qos.logback.core.net.SyslogConstants;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.FixedTabsDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.FixedTabs;
import java.util.ArrayList;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.w;

/* JADX INFO: loaded from: classes7.dex */
public final class j implements cli.n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        g domainState = (g) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        boolean z = domainState.f275927b != null;
        EnumEntries<h> enumEntriesA = h.a();
        ArrayList arrayList = new ArrayList(w.t(enumEntriesA, 10));
        for (h hVar : enumEntriesA) {
            arrayList.add(new FixedTabs.Item(hVar.name(), new TextLocalisedClause(hVar.c(), null, null, 14), (AnalyticsContext) null, 12));
        }
        return new i(ue0.e.J(new FixedTabsDelegate.Model("TABS_ITEM_ID", arrayList, domainState.f275928c.name(), false, null, SyslogConstants.LOG_CLOCK), domainState.f275926a.a()), z);
    }
}

package k0e;

import aw0.o9;
import ch.qos.logback.core.net.SyslogConstants;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.FixedTabsDelegate;
import com.revolut.core.ui_kit.delegates.SmallActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit.views.FixedTabs;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.statements.R$plurals;
import com.revolut.feature.statements.R$string;
import com.revolut.feature.statements.api.navigation.SavingsAccountsStatementFeatureConfig$SavingsAccountInfo;
import com.revolut.revolut.feature_fourthline_impl.R;
import ip0.ck0;
import ip0.yj0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s0;
import ms0.h4;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
public final class p implements f {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        s0 s0Var = new s0(4);
        List list = domainState.f180025b;
        Clause textClause = list.size() == 1 ? new TextClause(((SavingsAccountsStatementFeatureConfig$SavingsAccountInfo) d0.b0(list)).f88262b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : list.size() > 1 ? new TextLocalisedQuantityClause(R$plurals.statement_filter_title, Integer.valueOf(list.size()), (List) null, (Style) null, 28) : new TextLocalisedClause(R$string.common_word_custom, null, null, 14);
        h4 h4Var = h4.SEMIBLACK;
        ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_24_filter, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground), (List) null, (ImageTransformations) null, (Clause) null, 246);
        int i = R$attr.uikit_dp16;
        int i2 = R$attr.uikit_dp0;
        s0Var.a(new SmallActionButtonDelegate.Model("SMALL_ACTION_ITEM_ID", h4Var, resourceImage, null, textClause, null, null, null, null, i2, i2, i, 0, 18392));
        s0Var.a(new FixedTabsDelegate.Model("TABS_ITEM_ID", v.k(new FixedTabs.Item("TAB_ID_PDF", new TextLocalisedClause(R.string.statements_pdf, null, null, 14), (AnalyticsContext) null, 12), new FixedTabs.Item("TAB_ID_EXCEL", new TextLocalisedClause(R$string.statement_format_csv, null, null, 14), (AnalyticsContext) null, 12)), domainState.f180024a, false, null, SyslogConstants.LOG_CLOCK));
        s0Var.b(domainState.f180026c.a().toArray(new koi.j[0]));
        TextLocalisedClause textLocalisedClause = (TextLocalisedClause) iii.c.f(domainState.f180027g, new jyk.d0(21), new jul.c(26), new jb8.b(25));
        s0Var.a(textLocalisedClause != null ? new TextDelegate.Model("BOTTOM_NOTE_ITEM_ID", textLocalisedClause, false, new ck0(yj0.CENTER_HORIZONTAL), null, null, 0, 0, 0, 0, 2036) : null);
        ArrayList arrayList = s0Var.f186433a;
        return new j(v.m(arrayList.toArray(new koi.j[arrayList.size()])), (domainState.d == null || domainState.f180025b.isEmpty()) ? false : true, domainState.f ? new i(new TextLocalisedClause(com.revolut.feature.vaults.R$string.vaults_statement_settings_joint_title, null, null, 14)) : (h) iii.c.f(domainState.e, new jyk.d0(20), new jul.c(25), new jb8.b(24)));
    }
}

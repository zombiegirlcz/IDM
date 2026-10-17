package e7i;

import aw0.m6;
import aw0.n6;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.FixedTabs;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.TextNavBarMenuItem;
import com.revolut.feature_move_money.impl.R$string;
import ip0.b9;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import tx0.r4;
import zhm.f0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes10.dex */
public final class t implements cli.n {

    @NotNull
    public static final r Companion = new r();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f123349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f123350b;

    public t(a actionFooterMapper, c itemsMapper, d menuItemsMapper) {
        TextLocalisedClause textLocalisedClause;
        Intrinsics.checkNotNullParameter(actionFooterMapper, "actionFooterMapper");
        Intrinsics.checkNotNullParameter(itemsMapper, "itemsMapper");
        Intrinsics.checkNotNullParameter(menuItemsMapper, "menuItemsMapper");
        this.f123349a = itemsMapper;
        EnumEntries<ibd.j> enumEntriesA = ibd.j.a();
        ArrayList arrayList = new ArrayList(w.t(enumEntriesA, 10));
        for (ibd.j jVar : enumEntriesA) {
            String strName = jVar.name();
            int i = s.f123348a[jVar.ordinal()];
            if (i == 1) {
                textLocalisedClause = new TextLocalisedClause(R$string.move_money_automation_set_automation_limit_monthly_title, null, null, 14);
            } else if (i == 2) {
                textLocalisedClause = new TextLocalisedClause(R$string.move_money_automation_set_automation_limit_weekly_title, null, null, 14);
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                textLocalisedClause = new TextLocalisedClause(R$string.move_money_automation_set_automation_limit_daily_title, null, null, 14);
            }
            arrayList.add(new FixedTabs.Item(strName, textLocalisedClause, (AnalyticsContext) null, 12));
        }
        this.f123350b = arrayList;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        List listC;
        j domainState = (j) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        long j2 = domainState.f123338a;
        xi0.b currency = domainState.f123339b;
        Intrinsics.checkNotNullParameter(currency, "currency");
        List listC2 = u.c(new CenteredAmountDelegate.Model("limit_amount", null, new bw0.h(this.f123349a.f123334a.d(j2, currency.f306286a), cp5.d.J(currency), null, j2 > 0, null, null, false, false, null, null, null, null, 32724), null, null, null, b9.MATCH_PARENT, null, null, null, null, null, null, 8122));
        aw0.e eVar = new aw0.e(false, null, null, m6.c(n6.Companion, new TextLocalisedClause(R$string.move_money_automation_set_automation_limit_button, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, domainState.f123338a > 0, null, null, null, 988), null, null, 55);
        String strName = domainState.f123340c.name();
        boolean z = domainState.d;
        if (z) {
            listC = u.c(new TextNavBarMenuItem("MENU_ITEM_REMOVE_LIST_ID", new TextLocalisedClause(R$string.move_money_automation_set_automation_remove, null, null, 14), r4.TEXT, null, 8));
        } else {
            if (z) {
                throw new NoWhenBranchMatchedException();
            }
            listC = f0.f322471a;
        }
        return new o(listC2, eVar, this.f123350b, strName, listC);
    }
}

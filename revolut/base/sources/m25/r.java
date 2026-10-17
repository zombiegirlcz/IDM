package m25;

import com.revolut.core.ui_kit.models.NavBarProductIntro$StoryV2;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.tab.accounts.api.model.AccountWidgetItemModel;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;
import zhm.y0;

/* JADX INFO: loaded from: classes22.dex */
public final class r {
    public r(kla.a productIntroToggleResolver) {
        Intrinsics.checkNotNullParameter(productIntroToggleResolver, "productIntroToggleResolver");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final AccountWidgetItemModel.EmptyStateStories a(ArrayList actionIds, wi0.b countryCode) {
        NavBarProductIntro$StoryV2 navBarProductIntro$StoryV2;
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(actionIds, "actionIds");
        ArrayList arrayList = new ArrayList();
        Iterator it8 = actionIds.iterator();
        while (true) {
            NavBarProductIntro$StoryV2 navBarProductIntro$StoryV22 = null;
            if (!it8.hasNext()) {
                if (arrayList.isEmpty()) {
                    return AccountWidgetItemModel.EmptyStateStories.NotApplicable.f89489a;
                }
                wi0.b.Companion.getClass();
                boolean zF = Intrinsics.f(countryCode, wi0.b.A);
                NavBarProductIntro$StoryV2.HighlightedItems.SmallAction smallAction = NavBarProductIntro$StoryV2.HighlightedItems.SmallAction.f57877a;
                if (zF || Intrinsics.f(countryCode, wi0.b.p0)) {
                    arrayList = d0.F0(new NavBarProductIntro$StoryV2(new TextLocalisedClause(R$string.home_currency_account_product_intro_v2_account_switcher_title, null, null, 14), null, smallAction), arrayList);
                } else if (Intrinsics.f(countryCode, wi0.b.Y1)) {
                    arrayList = d0.F0(new NavBarProductIntro$StoryV2(new TextLocalisedClause(R$string.home_currency_account_product_intro_v2_account_switcher_balances_title, null, null, 14), null, smallAction), arrayList);
                }
                return new AccountWidgetItemModel.EmptyStateStories.V2(arrayList, null);
            }
            String str = (String) it8.next();
            switch (str.hashCode()) {
                case -1352841650:
                    if (str.equals("id_action_cc_pay")) {
                        navBarProductIntro$StoryV2 = new NavBarProductIntro$StoryV2(new TextLocalisedClause(R$string.credit_credit_card_intro_v2_repay_title, null, null, 14), null, new NavBarProductIntro$StoryV2.HighlightedItems.Actions(y0.b(str)));
                        navBarProductIntro$StoryV22 = navBarProductIntro$StoryV2;
                    }
                    break;
                case 85070185:
                    if (str.equals("id_action_cc_instalment")) {
                        navBarProductIntro$StoryV2 = new NavBarProductIntro$StoryV2(new TextLocalisedClause(R$string.credit_credit_card_intro_v2_instalments_title, null, null, 14), null, new NavBarProductIntro$StoryV2.HighlightedItems.Actions(y0.b(str)));
                        navBarProductIntro$StoryV22 = navBarProductIntro$StoryV2;
                    }
                    break;
                case 595936488:
                    if (str.equals("id_action_cc_details")) {
                        navBarProductIntro$StoryV2 = new NavBarProductIntro$StoryV2(new TextLocalisedClause(R$string.credit_credit_card_intro_v2_move_money_title, null, null, 14), null, new NavBarProductIntro$StoryV2.HighlightedItems.Actions(y0.b(str)));
                        navBarProductIntro$StoryV22 = navBarProductIntro$StoryV2;
                    }
                    break;
                case 1352231573:
                    if (str.equals("id_action_cc_statement")) {
                        navBarProductIntro$StoryV2 = new NavBarProductIntro$StoryV2(new TextLocalisedClause(R$string.credit_credit_card_intro_v2_statement_title, null, null, 14), null, new NavBarProductIntro$StoryV2.HighlightedItems.Actions(y0.b(str)));
                        navBarProductIntro$StoryV22 = navBarProductIntro$StoryV2;
                    }
                    break;
                case 1689613475:
                    if (str.equals("HOME_ACTION_INFO_ID")) {
                        navBarProductIntro$StoryV2 = new NavBarProductIntro$StoryV2(new TextLocalisedClause(R$string.credit_credit_card_intro_v2_details_title, null, null, 14), null, new NavBarProductIntro$StoryV2.HighlightedItems.Actions(y0.b(str)));
                        navBarProductIntro$StoryV22 = navBarProductIntro$StoryV2;
                    }
                    break;
            }
            if (navBarProductIntro$StoryV22 != null) {
                arrayList.add(navBarProductIntro$StoryV22);
            }
        }
    }
}

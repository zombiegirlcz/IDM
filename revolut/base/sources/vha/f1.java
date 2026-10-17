package vha;

import com.revolut.core.ui_kit.models.NavBarProductIntro$StoryV2;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.pro.accounts.impl.R$string;
import com.revolut.feature.tab.accounts.api.model.AccountWidgetItemModel;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class f1 {

    @NotNull
    public static final e1 Companion = new e1();

    public f1(kla.a productIntroToggleResolver) {
        Intrinsics.checkNotNullParameter(productIntroToggleResolver, "productIntroToggleResolver");
    }

    public final AccountWidgetItemModel.EmptyStateStories.V2 a(ArrayList arrayList) {
        NavBarProductIntro$StoryV2 navBarProductIntro$StoryV2;
        ArrayList arrayListS = t61.a.s("availableActionIds", arrayList);
        Iterator it8 = arrayList.iterator();
        while (true) {
            NavBarProductIntro$StoryV2 navBarProductIntro$StoryV22 = null;
            if (!it8.hasNext()) {
                return new AccountWidgetItemModel.EmptyStateStories.V2(arrayListS, null);
            }
            String str = (String) it8.next();
            int iHashCode = str.hashCode();
            if (iHashCode != -1009378879) {
                if (iHashCode != -634535769) {
                    if (iHashCode == 1040852703 && str.equals("HOME_ACTION_MOVE_MONEY_ID")) {
                        navBarProductIntro$StoryV2 = new NavBarProductIntro$StoryV2(new TextLocalisedClause(R$string.freelancer_home_empty_state_v2_move_title, null, null, 14), null, new NavBarProductIntro$StoryV2.HighlightedItems.Actions(zhm.y0.b("HOME_ACTION_MOVE_MONEY_ID")));
                        navBarProductIntro$StoryV22 = navBarProductIntro$StoryV2;
                    }
                } else if (str.equals("ACTION_ID_ADD_MONEY")) {
                    navBarProductIntro$StoryV2 = new NavBarProductIntro$StoryV2(new TextLocalisedClause(R$string.freelancer_home_empty_state_v2_add_money_title, null, null, 14), null, new NavBarProductIntro$StoryV2.HighlightedItems.Actions(zhm.y0.b("ACTION_ID_ADD_MONEY")));
                    navBarProductIntro$StoryV22 = navBarProductIntro$StoryV2;
                }
            } else if (str.equals("ACTION_ID_NEW_SALE")) {
                navBarProductIntro$StoryV2 = new NavBarProductIntro$StoryV2(new TextLocalisedClause(R$string.freelancer_home_empty_state_v2_new_sale_title, null, null, 14), null, new NavBarProductIntro$StoryV2.HighlightedItems.Actions(zhm.y0.b("ACTION_ID_NEW_SALE")));
                navBarProductIntro$StoryV22 = navBarProductIntro$StoryV2;
            }
            if (navBarProductIntro$StoryV22 != null) {
                arrayListS.add(navBarProductIntro$StoryV22);
            }
        }
    }
}

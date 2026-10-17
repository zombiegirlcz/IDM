package u38;

import com.revolut.core.ui_kit.models.NavBarProductIntro$StoryV2;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.joint.impl.R$string;
import com.revolut.feature.tab.accounts.api.model.AccountWidgetItemModel;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.y0;

/* JADX INFO: loaded from: classes4.dex */
public final class g {

    @NotNull
    public static final f Companion = new f();

    public g(kla.a productIntroToggleResolver) {
        Intrinsics.checkNotNullParameter(productIntroToggleResolver, "productIntroToggleResolver");
    }

    public final AccountWidgetItemModel.EmptyStateStories a(ArrayList arrayList) {
        NavBarProductIntro$StoryV2 navBarProductIntro$StoryV2;
        ArrayList arrayListS = t61.a.s("widgetActions", arrayList);
        Iterator it8 = arrayList.iterator();
        while (true) {
            NavBarProductIntro$StoryV2 navBarProductIntro$StoryV22 = null;
            if (!it8.hasNext()) {
                break;
            }
            String str = (String) it8.next();
            int iHashCode = str.hashCode();
            if (iHashCode != 1040852703) {
                if (iHashCode != 1085941409) {
                    if (iHashCode == 2133449139 && str.equals("ADD_MONEY_ACTION")) {
                        navBarProductIntro$StoryV2 = new NavBarProductIntro$StoryV2(new TextLocalisedClause(R$string.joint_home_currency_account_product_intro_v2_add_money_title, null, null, 14), null, new NavBarProductIntro$StoryV2.HighlightedItems.Actions(y0.b("ADD_MONEY_ACTION")));
                        navBarProductIntro$StoryV22 = navBarProductIntro$StoryV2;
                    }
                } else if (str.equals("HOME_ACTION_DETAILS_ID")) {
                    navBarProductIntro$StoryV2 = new NavBarProductIntro$StoryV2(new TextLocalisedClause(R$string.joint_home_currency_account_product_intro_v2_details_title, null, null, 14), null, new NavBarProductIntro$StoryV2.HighlightedItems.Actions(y0.b("HOME_ACTION_DETAILS_ID")));
                    navBarProductIntro$StoryV22 = navBarProductIntro$StoryV2;
                }
            } else if (str.equals("HOME_ACTION_MOVE_MONEY_ID")) {
                navBarProductIntro$StoryV2 = new NavBarProductIntro$StoryV2(new TextLocalisedClause(R$string.joint_home_currency_account_product_intro_v2_move_title, null, null, 14), null, new NavBarProductIntro$StoryV2.HighlightedItems.Actions(y0.b("HOME_ACTION_MOVE_MONEY_ID")));
                navBarProductIntro$StoryV22 = navBarProductIntro$StoryV2;
            }
            if (navBarProductIntro$StoryV22 != null) {
                arrayListS.add(navBarProductIntro$StoryV22);
            }
        }
        return !arrayListS.isEmpty() ? new AccountWidgetItemModel.EmptyStateStories.V2(arrayListS, null) : AccountWidgetItemModel.EmptyStateStories.NotApplicable.f89489a;
    }
}

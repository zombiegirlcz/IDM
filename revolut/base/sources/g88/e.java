package g88;

import com.revolut.core.ui_kit.models.NavBarProductIntro$StoryV2;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.junior.accounts.impl.R$string;
import com.revolut.feature.tab.accounts.api.model.AccountWidgetItemModel;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sf8.m;
import zhm.y0;

/* JADX INFO: loaded from: classes4.dex */
public final class e {

    @NotNull
    public static final d Companion = new d();

    public e(kla.a productIntroToggleResolver) {
        Intrinsics.checkNotNullParameter(productIntroToggleResolver, "productIntroToggleResolver");
    }

    public final AccountWidgetItemModel.EmptyStateStories a(ArrayList actionIds, m accountInfo) {
        NavBarProductIntro$StoryV2 navBarProductIntro$StoryV2;
        Intrinsics.checkNotNullParameter(actionIds, "actionIds");
        Intrinsics.checkNotNullParameter(accountInfo, "accountInfo");
        ArrayList arrayList = new ArrayList();
        Iterator it8 = actionIds.iterator();
        while (true) {
            NavBarProductIntro$StoryV2 navBarProductIntro$StoryV22 = null;
            if (!it8.hasNext()) {
                break;
            }
            String str = (String) it8.next();
            int iHashCode = str.hashCode();
            if (iHashCode != -498670905) {
                if (iHashCode != 1451163966) {
                    if (iHashCode == 1490156630 && str.equals("ID_MOVE_MONEY")) {
                        navBarProductIntro$StoryV2 = new NavBarProductIntro$StoryV2(new TextLocalisedClause(R$string.junior_home_intro_v2_move_title, null, null, 14), null, new NavBarProductIntro$StoryV2.HighlightedItems.Actions(y0.b(str)));
                        navBarProductIntro$StoryV22 = navBarProductIntro$StoryV2;
                    }
                } else if (str.equals("ID_ADD_MONEY")) {
                    navBarProductIntro$StoryV2 = new NavBarProductIntro$StoryV2(new TextLocalisedClause(R$string.junior_home_intro_v2_add_money_title, null, null, 14), null, new NavBarProductIntro$StoryV2.HighlightedItems.Actions(y0.b(str)));
                    navBarProductIntro$StoryV22 = navBarProductIntro$StoryV2;
                }
            } else if (str.equals("ID_SETTINGS")) {
                navBarProductIntro$StoryV2 = new NavBarProductIntro$StoryV2(new TextLocalisedClause(R$string.junior_home_intro_v2_settings_title, null, null, 14), null, new NavBarProductIntro$StoryV2.HighlightedItems.Actions(y0.b(str)));
                navBarProductIntro$StoryV22 = navBarProductIntro$StoryV2;
            }
            if (navBarProductIntro$StoryV22 != null) {
                arrayList.add(navBarProductIntro$StoryV22);
            }
        }
        return !arrayList.isEmpty() ? new AccountWidgetItemModel.EmptyStateStories.V2(arrayList, null) : AccountWidgetItemModel.EmptyStateStories.NotApplicable.f89489a;
    }
}

package jle;

import aw0.e8;
import aw0.i8;
import aw0.x7;
import com.revolut.core.ui_kit.models.NavBarProductIntro$StoryV2;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.video.models.UrlVideo;
import com.revolut.feature.tab.invest.impl.R$string;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.y0;

/* JADX INFO: loaded from: classes8.dex */
public final class d implements a {

    @NotNull
    public static final b Companion = new b();

    static {
        new UrlVideo("https://assets.revolut.com/mobile/retail/product_intros/invest/build_wealth.mp4", (String) null, false, (oz0.b) null, false, (oz0.c) null, 126);
        new UrlVideo("https://assets.revolut.com/mobile/retail/product_intros/invest/portfolio.mp4", (String) null, false, (oz0.b) null, false, (oz0.c) null, 126);
        new UrlVideo("https://assets.revolut.com/mobile/retail/product_intros/invest/automate.mp4", (String) null, false, (oz0.b) null, false, (oz0.c) null, 126);
        new UrlVideo("https://assets.revolut.com/mobile/retail/product_intros/invest/commission.mp4", (String) null, false, (oz0.b) null, false, (oz0.c) null, 126);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final i8 a(ArrayList actionIds, boolean z) {
        NavBarProductIntro$StoryV2 navBarProductIntro$StoryV2;
        Intrinsics.checkNotNullParameter(actionIds, "actionIds");
        if (!z) {
            return new e8(true);
        }
        ArrayList arrayList = new ArrayList();
        Iterator it8 = actionIds.iterator();
        while (it8.hasNext()) {
            String str = (String) it8.next();
            NavBarProductIntro$StoryV2 navBarProductIntro$StoryV22 = null;
            switch (str.hashCode()) {
                case 1149195839:
                    if (str.equals("INVEST_TRADE_ACTION_ID")) {
                        navBarProductIntro$StoryV2 = new NavBarProductIntro$StoryV2(new TextLocalisedClause(R$string.wealth_invest_home_intro_v2_trade, null, null, 14), null, new NavBarProductIntro$StoryV2.HighlightedItems.Actions(y0.b(str)));
                        navBarProductIntro$StoryV22 = navBarProductIntro$StoryV2;
                    }
                    break;
                case 1355574401:
                    if (str.equals("INVEST_MOVE_MONEY_ACTION_ID")) {
                        navBarProductIntro$StoryV2 = new NavBarProductIntro$StoryV2(new TextLocalisedClause(R$string.wealth_action_move_money, null, null, 14), null, new NavBarProductIntro$StoryV2.HighlightedItems.Actions(y0.b(str)));
                        navBarProductIntro$StoryV22 = navBarProductIntro$StoryV2;
                    }
                    break;
                case 1365075933:
                    if (str.equals("INVEST_ADD_MONEY_ACTION_ID")) {
                        navBarProductIntro$StoryV2 = new NavBarProductIntro$StoryV2(new TextLocalisedClause(R$string.wealth_invest_home_intro_v2_add_money, null, null, 14), null, new NavBarProductIntro$StoryV2.HighlightedItems.Actions(y0.b(str)));
                        navBarProductIntro$StoryV22 = navBarProductIntro$StoryV2;
                    }
                    break;
                case 1968698713:
                    if (str.equals("INVEST_WITHDRAW_ACTION_ID")) {
                        navBarProductIntro$StoryV2 = new NavBarProductIntro$StoryV2(new TextLocalisedClause(R$string.wealth_invest_home_intro_v2_withdraw, null, null, 14), null, new NavBarProductIntro$StoryV2.HighlightedItems.Actions(y0.b(str)));
                        navBarProductIntro$StoryV22 = navBarProductIntro$StoryV2;
                    }
                    break;
            }
            if (navBarProductIntro$StoryV22 != null) {
                arrayList.add(navBarProductIntro$StoryV22);
            }
        }
        return !arrayList.isEmpty() ? new x7(ola.c.INVEST, arrayList) : new e8(true);
    }
}

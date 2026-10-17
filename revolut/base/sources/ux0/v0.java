package ux0;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.NavBarCenterViewModel;
import com.revolut.core.ui_kit.models.NavBarProductIntro$StoryV2;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes20.dex */
public final class v0 {
    private v0() {
    }

    public static Clause a(tx0.r rVar, tx0.q qVar) {
        NavBarCenterViewModel navBarCenterViewModel;
        NavBarCenterViewModel.Button button;
        if (qVar instanceof tx0.o) {
            return ((tx0.o) qVar).f275211a;
        }
        if (!(qVar instanceof tx0.p)) {
            throw new NoWhenBranchMatchedException();
        }
        tx0.g gVar = rVar instanceof tx0.g ? (tx0.g) rVar : null;
        if (gVar == null || (navBarCenterViewModel = gVar.f275128b) == null || (button = navBarCenterViewModel.d) == null) {
            return null;
        }
        return button.f57847a;
    }

    public static ArrayList b(List list, tx0.r rVar, tx0.q qVar) {
        n mVar;
        List<NavBarProductIntro$StoryV2> list2 = list;
        ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
        for (NavBarProductIntro$StoryV2 navBarProductIntro$StoryV2 : list2) {
            NavBarProductIntro$StoryV2.HighlightedItems highlightedItems = navBarProductIntro$StoryV2.f57875c;
            if (highlightedItems instanceof NavBarProductIntro$StoryV2.HighlightedItems.Actions) {
                mVar = new k(((NavBarProductIntro$StoryV2.HighlightedItems.Actions) highlightedItems).f57876a);
            } else if (highlightedItems instanceof NavBarProductIntro$StoryV2.HighlightedItems.SmallAction) {
                mVar = new l(rVar, qVar);
            } else {
                if (!(highlightedItems instanceof NavBarProductIntro$StoryV2.HighlightedItems.ViewFinderTarget)) {
                    throw new NoWhenBranchMatchedException();
                }
                mVar = new m(((NavBarProductIntro$StoryV2.HighlightedItems.ViewFinderTarget) highlightedItems).f57878a);
            }
            arrayList.add(new o(navBarProductIntro$StoryV2.f57873a, navBarProductIntro$StoryV2.f57874b, mVar));
        }
        return arrayList;
    }
}

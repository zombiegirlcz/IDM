package g2g;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.DotDividerClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.TextNavBarMenuItem;
import com.revolut.data.model.Data;
import com.revolut.feature.travel.experiences.api.R$string;
import com.revolut.feature.travel.experiences.api.models.experience.TravelExperienceFiltersSelection;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.f0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
public final class r implements jki.p {

    @NotNull
    public static final p Companion = new p();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f140063a;

    public r(c durationFilterClauseMapper) {
        Intrinsics.checkNotNullParameter(durationFilterClauseMapper, "durationFilterClauseMapper");
        this.f140063a = durationFilterClauseMapper;
    }

    public static CompositeClause b(int i, int i2) {
        return new CompositeClause(v.k(new TextLocalisedClause(i, null, null, 14), new TextClause(String.valueOf(i2), (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), new DotDividerClause((Integer) null), null, null, 12);
    }

    public static List c(ArrayList arrayList, i2g.a aVar, boolean z) {
        if (arrayList.size() <= 3 || z) {
            return arrayList;
        }
        return i2b.a.p(d0.V0(arrayList, 3), new LargeActionButtonDelegate.Model("SEE_ALL_ITEM_ID_" + aVar, LargeActionButton.ButtonStyle.o, null, new TextLocalisedClause(R$string.experiences_common_action_view_all, null, null, 14), false, null, null, aVar, null, 744));
    }

    @Override // jki.p
    public final jki.m a(jki.i iVar) {
        l domainState = (l) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Data data = domainState.f140056a;
        TravelExperienceFiltersSelection travelExperienceFiltersSelection = domainState.f140057b;
        return new o((List) iii.c.f(data, new g1k.k(this, 21), new g0c.h(this, 24), new fyg.b(this, travelExperienceFiltersSelection, 6)), pyd.c.G(domainState.f140056a), !c8g.c.k(travelExperienceFiltersSelection) ? u.c(new TextNavBarMenuItem("RESET_ACTION_ID", new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_reset, null, null, 14), null, null, 12)) : f0.f322471a);
    }
}

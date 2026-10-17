package s2g;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.travel.experiences.api.R$string;
import com.revolut.feature.travel.experiences.api.models.options.TravelExperiencesOptionV2;
import com.revolut.feature.travel.experiences.api.models.selection.TravelExperienceVisitorsSelection;
import ip0.gz;
import ip0.zj;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import ms0.e4;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class z implements jki.p {

    @NotNull
    public static final x Companion = new x();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b1g.c f259340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f259341b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l80.e f259342c;
    public final h1g.h d;

    public z(b1g.c dateFormatter, a filtersMapper, l80.e dateProvider, h1g.h stateHolder) {
        Intrinsics.checkNotNullParameter(dateFormatter, "dateFormatter");
        Intrinsics.checkNotNullParameter(filtersMapper, "filtersMapper");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(stateHolder, "stateHolder");
        this.f259340a = dateFormatter;
        this.f259341b = filtersMapper;
        this.f259342c = dateProvider;
        this.d = stateHolder;
    }

    public static CellDetailsDelegate.Model b(int i, Clause clause, String str) {
        Float fValueOf = Float.valueOf(16.0f);
        List listK = zhm.v.k(new ImageClause(i, (Integer) null, fValueOf, fValueOf, 18), clause);
        t0 t0Var = t0.f186434a;
        m70.a.t(t0Var);
        Intrinsics.checkNotNullParameter(t0Var, "<this>");
        Intrinsics.checkNotNullParameter(t0Var, "<this>");
        CompositeClause compositeClause = new CompositeClause(listK, new TextClause("   ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), null, 8);
        Intrinsics.checkNotNullParameter(t0Var, "<this>");
        TextClause textClause = new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        int i2 = R$attr.uikit_dp4;
        return new CellDetailsDelegate.Model(str, compositeClause, textClause, 0, null, null, null, null, null, false, i2, i2, 26616);
    }

    public static List c() {
        FullScreenStateDelegate.Model model = new FullScreenStateDelegate.Model("OPTIONS_EMPTY_ITEM_ID", new TextLocalisedClause(R$string.experiences_options_empty_state_title, null, null, 14), new TextLocalisedClause(R$string.experiences_options_empty_state_description, null, null, 14), new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D086", null, null, null, 30)), zj.REGULAR, new TextLocalisedClause(R$string.experiences_options_empty_state_action_title, null, null, 14), false, null, null, false, 0, 0, 32704);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return zhm.u.c(model);
    }

    public static ArrayList d() {
        ArrayList arrayList = new ArrayList(2);
        for (int i = 0; i < 2; i++) {
            gz gzVar = new gz(a0.d.n("OPTIONS_LOADING_ITEM_ID", i));
            yp0.b.l(gzVar, 0, 0, 0, 0, null, false, 63);
            arrayList.add(gzVar);
        }
        return arrayList;
    }

    public static String e(TravelExperiencesOptionV2 travelExperiencesOptionV2) {
        myf.v vVar;
        String str = travelExperiencesOptionV2.f92869a.f92859a;
        LocalDate localDate = travelExperiencesOptionV2.f92870b;
        TravelExperiencesOptionV2.Language language = travelExperiencesOptionV2.f92871c;
        String strName = null;
        String str2 = language != null ? language.f92872a : null;
        if (language != null && (vVar = language.f92874c) != null) {
            strName = vVar.name();
        }
        StringBuilder sb6 = new StringBuilder();
        sb6.append(str);
        sb6.append("_");
        sb6.append(localDate);
        sb6.append("_");
        sb6.append(str2);
        return v0.a.i(sb6, "_", strName);
    }

    @Override // jki.p
    public final jki.m a(jki.i iVar) {
        ActionsView.Item item;
        j domainState = (j) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List list = (List) iii.c.g(domainState.f259312b, new s1c.a(this, 16), new s20.c(this, 4), new rbe.c(this, domainState, 22));
        pyf.c dateFilter = domainState.f259313c;
        pyf.d visitorsFilter = domainState.d;
        ((c) this.f259341b).getClass();
        Intrinsics.checkNotNullParameter(dateFilter, "dateFilter");
        Intrinsics.checkNotNullParameter(visitorsFilter, "visitorsFilter");
        pyf.e eVar = (pyf.e) dateFilter.f22677a;
        int[] iArr = b.f259309a;
        int i = iArr[eVar.ordinal()];
        ActionsView.Item item2 = null;
        if (i == 1) {
            item = new ActionsView.Item("QUICK_FILTER_DATE_ITEM_ID", mx0.d.ACCENT, false, e4.EnabledClickable, null, a1g.f.c(dateFilter.f240824b), new ResourceImage(R$drawable.uikit_icn_24_calendar, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, false, null, null, null, null, 24468);
        } else if (i == 2) {
            item = new ActionsView.Item("QUICK_FILTER_DATE_ITEM_ID", mx0.d.WHITE_OR_BLACK, false, e4.DisabledClickable, null, new TextLocalisedClause(R$string.experiences_options_settings_dates, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_calendar, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, false, null, null, null, null, 24468);
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            item = null;
        }
        pyf.e eVar2 = (pyf.e) visitorsFilter.f22677a;
        TravelExperienceVisitorsSelection travelExperienceVisitorsSelection = visitorsFilter.f240825b;
        int i2 = iArr[eVar2.ordinal()];
        if (i2 == 1) {
            item2 = new ActionsView.Item("QUICK_FILTER_VISITORS_ITEM_ID", mx0.d.ACCENT, false, e4.EnabledClickable, null, a1g.f.h(travelExperienceVisitorsSelection), new ResourceImage(R$drawable.uikit_icn_24_people, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, false, null, null, null, null, 24468);
        } else if (i2 == 2) {
            item2 = new ActionsView.Item("QUICK_FILTER_VISITORS_ITEM_ID", mx0.d.WHITE_OR_BLACK, false, e4.DisabledClickable, null, a1g.f.h(travelExperienceVisitorsSelection), new ResourceImage(R$drawable.uikit_icn_24_people, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, false, null, null, null, null, 24468);
        } else if (i2 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        ActionsView.Item[] elements = {item, item2};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return new p(list, kotlin.collections.d.L(elements));
    }
}

package vb3;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.a9;
import com.revolut.core.ui_kit.delegates.b9;
import com.revolut.core.ui_kit.delegates.d9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.cash_topup.api.models.CashTopUpLocationInfo;
import com.revolut.feature.cash_topup.api.models.LockedStatus;
import com.revolut.feature.cash_topup.impl.R$string;
import ip0.ww;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import org.jetbrains.annotations.NotNull;
import zhm.a0;
import zhm.d0;
import zhm.f0;

/* JADX INFO: loaded from: classes21.dex */
public final class v implements jki.p {

    @NotNull
    private static final t Companion = new t();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ub3.g f287397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f287398b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f287399c;

    public v(ub3.g distanceMapper, ub3.h imageMapper, ub3.j statusMapper, p mapMapper, b scheduleMapper) {
        Intrinsics.checkNotNullParameter(distanceMapper, "distanceMapper");
        Intrinsics.checkNotNullParameter(imageMapper, "imageMapper");
        Intrinsics.checkNotNullParameter(statusMapper, "statusMapper");
        Intrinsics.checkNotNullParameter(mapMapper, "mapMapper");
        Intrinsics.checkNotNullParameter(scheduleMapper, "scheduleMapper");
        this.f287397a = distanceMapper;
        this.f287398b = mapMapper;
        this.f287399c = scheduleMapper;
    }

    public static ActionsView.Item b() {
        return new ActionsView.Item("navigate", mx0.d.SEMIACCENT, false, null, null, new TextLocalisedClause(R$string.topup_cash_map_navigate, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_arrow_navigation, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), null, null, null, false, null, null, null, null, 32668);
    }

    @Override // jki.p
    public final jki.m a(jki.i iVar) {
        Iterable iterableC;
        Collection collectionC;
        g domainState = (g) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        CashTopUpLocationInfo location = domainState.f287381a;
        f fVar = domainState.f287382b;
        if (fVar != f.SELECT_LOCATION) {
            LockedStatus lockedStatus = location.f65597m;
            if ((lockedStatus instanceof LockedStatus.Unlocked) || (lockedStatus instanceof LockedStatus.NotApplicable)) {
                iterableC = zhm.u.c(b());
            } else {
                if (!(lockedStatus instanceof LockedStatus.Locked)) {
                    throw new NoWhenBranchMatchedException();
                }
                iterableC = f0.f322471a;
            }
        } else {
            iterableC = null;
        }
        if (iterableC == null) {
            iterableC = f0.f322471a;
        }
        int i = fVar == null ? -1 : u.f287396a[fVar.ordinal()];
        if (i == -1) {
            collectionC = f0.f322471a;
        } else if (i == 1) {
            collectionC = zhm.u.c(new ActionsView.Item("ACTION_ID_DEPOSIT_CASH", mx0.d.ACCENT, false, null, null, new TextLocalisedClause(R$string.topup_cash_common_action_deposit_cash, null, null, 14), null, null, null, null, false, null, null, null, null, 32668));
        } else if (i == 2) {
            collectionC = zhm.u.c(new ActionsView.Item("ACTION_ID_SHOW_BARCODE", mx0.d.ACCENT, false, null, null, new TextLocalisedClause(R$string.topup_cash_common_action_show_barcode, null, null, 14), null, null, null, null, false, null, null, null, null, 32668));
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            collectionC = zhm.u.c(new ActionsView.Item("ACTION_ID_SELECT_LOCATION", mx0.d.SEMIACCENT, false, null, null, new TextLocalisedClause(R$string.topup_cash_map_select_location, null, null, 14), null, null, null, null, false, null, null, null, null, 32668));
        }
        TextClause textClause = new TextClause(location.f65590a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        TextLocalisedClause textLocalisedClauseA = this.f287397a.a(location.f65595j);
        Image imageA = ub3.h.a(location);
        ArrayList arrayListE0 = d0.E0(iterableC, collectionC);
        ArrayList arrayList = new ArrayList();
        Intrinsics.checkNotNullParameter(location, "location");
        d9 d9Var = new d9("map", new a9(location.d, location.e), false, new b9(zhm.u.c(this.f287398b.f287391a.d(location, false, yv0.e.DP_24))), new ww(null, new TextClause(v0.a.i(p.a.t(location.f65591b, ", ", location.f65593g, ", ", location.i), " ", location.f65594h), (Style) new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), (Integer) null, false, (o9) null, (List) null, 124), null), null, null, false, 4064);
        yp0.b.l(d9Var, 0, 0, 0, 0, null, false, 63);
        arrayList.add(d9Var);
        Intrinsics.checkNotNullParameter(location, "location");
        List list = (List) location.o.get(((l80.f) this.f287399c.f287380a).e().getDayOfWeek());
        CellDetailsDelegate.Model model = (list == null || list.isEmpty()) ? null : new CellDetailsDelegate.Model("LIST_ID_SCHEDULE", new TextLocalisedClause(R$string.topup_cash_location_details_schedule, null, null, 14), new TextClause(d0.k0(list, m70.a.o(t0.f186434a), null, null, 0, new v80.a(14), 30), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), 0, null, null, null, null, null, false, 0, 0, 32760);
        TextLocalisedClause textLocalisedClauseA2 = ub3.j.a(location);
        CellDetailsDelegate.Model model2 = textLocalisedClauseA2 != null ? new CellDetailsDelegate.Model("status", new TextLocalisedClause(R$string.topup_cash_location_details_status, null, null, 14), textLocalisedClauseA2, 0, null, null, null, null, null, false, 0, 0, 32760) : null;
        dj0.d dVar = location.f65596l;
        CellDetailsDelegate.Model model3 = dVar != null ? new CellDetailsDelegate.Model("fees", new TextLocalisedClause(R$string.topup_cash_location_details_fees, null, null, 14), new TextLocalisedClause(R$string.topup_cash_location_details_fees_description, zhm.u.c(new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12), 0, null, null, null, null, null, false, 0, 0, 32760) : null;
        String strL = m70.a.l(location.f65592c);
        Object[] elements = {model, model2, model3, strL != null ? new CellDetailsActionDelegate.Model("contact_number", new TextLocalisedClause(R$string.topup_cash_location_details_contact_number, null, null, 14), 0, new ResourceImage(R$drawable.uikit_icn_24_call, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), new TextClause(strL, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, false, false, null, null, "call", 0, 0, 0, 0, 4192228) : null};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        yp0.b.k(listL, 0, 0, 0, 0, 31);
        a0.x(listL, arrayList);
        return new n(textClause, textLocalisedClauseA, arrayListE0, imageA, arrayList);
    }
}

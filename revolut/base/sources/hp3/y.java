package hp3;

import aw0.o9;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.FixedTabs;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.IconNavBarMenuItem;
import com.revolut.core.ui_kit.views.navbar.NavBarMenuItemBadge;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.corporate_events.impl.R$string;
import ip0.pb0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import z0h.q1;
import zhm.d0;
import zhm.f0;

/* JADX INFO: loaded from: classes21.dex */
public final class y implements cli.n {

    @NotNull
    public static final w Companion = new w();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j8b.h f154440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q1 f154441b;

    public y(j8b.h eventToWidgetMapper, q1 wealthDisclaimersMapper) {
        Intrinsics.checkNotNullParameter(eventToWidgetMapper, "eventToWidgetMapper");
        Intrinsics.checkNotNullParameter(wealthDisclaimersMapper, "wealthDisclaimersMapper");
        this.f154440a = eventToWidgetMapper;
        this.f154441b = wealthDisclaimersMapper;
    }

    public static ArrayList b() {
        IntRange intRange = new IntRange(1, 2, 1);
        ArrayList arrayList = new ArrayList(zhm.w.t(intRange, 10));
        vim.f it8 = intRange.iterator();
        while (it8.f289625c) {
            it8.nextInt();
            IntRange intRange2 = new IntRange(1, 6, 1);
            ArrayList arrayList2 = new ArrayList(zhm.w.t(intRange2, 10));
            vim.f it9 = intRange2.iterator();
            while (it9.f289625c) {
                arrayList2.add(new pb0(a0.d.n("LOADING_STATE_ID_", it9.nextInt())));
            }
            yp0.b.k(arrayList2, 0, 0, 0, 0, 31);
            arrayList.add(arrayList2);
        }
        return zhm.w.u(arrayList);
    }

    public final ArrayList a(m mVar) {
        List listB;
        List listC = mVar.f154419l != null ? zhm.u.c(new LargeActionButtonDelegate.Model("SEE_ALL_EVENTS_BUTTON_ID", LargeActionButton.ButtonStyle.o, null, new TextLocalisedClause(R$string.feature_corporate_events_see_all_events_button_title, null, null, 14), false, null, null, null, null, 1000)) : null;
        Data data = mVar.o;
        if (data == null || (listB = ((aah.m) this.f154441b).b(data)) == null) {
            listB = f0.f322471a;
        }
        List[] elements = {listC, listB};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return zhm.w.u(kotlin.collections.d.L(elements));
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        Integer numValueOf;
        Integer numValueOf2;
        Clause textClause;
        String strE;
        m domainState = (m) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List list = domainState.f154416g;
        Data data = domainState.f154420m;
        kp3.b bVar = domainState.i;
        kp3.b bVar2 = domainState.f154417h;
        int i = 0;
        List list2 = list.isEmpty() ? f0.f322471a : (List) iii.c.f(((l) d0.b0(list)).f154412c, new r(this, 3), new hkb.e(20), new v(list, this, domainState.f != null, domainState.k, domainState));
        if (bVar2 != null) {
            Iterator it8 = list2.iterator();
            int i2 = 0;
            while (true) {
                if (!it8.hasNext()) {
                    i2 = -1;
                    break;
                }
                koi.j jVar2 = (koi.j) it8.next();
                qv0.p pVar = jVar2 instanceof qv0.p ? (qv0.p) jVar2 : null;
                if (Intrinsics.f(pVar != null ? pVar.getF55191g() : null, bVar2)) {
                    break;
                }
                i2++;
            }
            numValueOf = Integer.valueOf(i2);
        } else {
            numValueOf = null;
        }
        Integer num = (numValueOf == null || numValueOf.intValue() == -1) ? null : numValueOf;
        if (bVar != null) {
            Iterator it9 = list2.iterator();
            while (true) {
                if (!it9.hasNext()) {
                    i = -1;
                    break;
                }
                koi.j jVar3 = (koi.j) it9.next();
                qv0.p pVar2 = jVar3 instanceof qv0.p ? (qv0.p) jVar3 : null;
                if (Intrinsics.f(pVar2 != null ? pVar2.getF55191g() : null, bVar)) {
                    break;
                }
                i++;
            }
            numValueOf2 = Integer.valueOf(i);
        } else {
            numValueOf2 = null;
        }
        Integer num2 = (numValueOf2 == null || numValueOf2.intValue() == -1) ? null : numValueOf2;
        if (data.getLoading()) {
            textClause = new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        } else {
            nel.n nVar = (nel.n) data.getContent();
            if (nVar == null) {
                textClause = new TextLocalisedClause(R$string.feature_corporate_events_screen_title, null, null, 14);
            } else {
                int i3 = R$string.feature_corporate_events_screen_title_symbol;
                if (x.f154439a[nVar.f214597c.ordinal()] == 1) {
                    strE = ifk.b.e(nVar);
                    if (strE == null) {
                        strE = nVar.d;
                    }
                } else {
                    strE = nVar.e;
                }
                textClause = new TextLocalisedClause(i3, zhm.u.c(strE), null, 12);
            }
        }
        Clause clause = textClause;
        IconNavBarMenuItem.Companion companion = IconNavBarMenuItem.INSTANCE;
        IconNavBarMenuItem iconNavBarMenuItemA = IconNavBarMenuItem.Companion.a(companion, "SEARCH_MENU_ITEM_ID", new ResourceImage(R$drawable.uikit_icn_24_search, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, 124);
        if (!domainState.f154421n) {
            iconNavBarMenuItemA = null;
        }
        ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_24_filter, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, new TextLocalisedClause(R$string.feature_corporate_events_menu_type_filter, null, null, 14), 126);
        NavBarMenuItemBadge navBarMenuItemBadge = domainState.e ? NavBarMenuItemBadge.Dot.f59308a : null;
        if (navBarMenuItemBadge == null) {
            navBarMenuItemBadge = NavBarMenuItemBadge.None.f59309a;
        }
        IconNavBarMenuItem[] elements = {iconNavBarMenuItemA, IconNavBarMenuItem.Companion.a(companion, "FILTER_MENU_ITEM_ID", resourceImage, null, navBarMenuItemBadge, null, 116), IconNavBarMenuItem.Companion.a(companion, "CALENDAR_MENU_ITEM_ID", new ResourceImage(R$drawable.uikit_icn_24_calendar_date, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, 124)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return new o(clause, kotlin.collections.d.L(elements), list2, zhm.v.k(new FixedTabs.Item("MY_EVENTS_TAB_ID", new TextLocalisedClause(R$string.feature_corporate_events_tab_my_events, null, null, 14), (AnalyticsContext) null, 12), new FixedTabs.Item("ALL_EVENTS_TAB_ID", new TextLocalisedClause(R$string.feature_corporate_events_tab_all_events, null, null, 14), (AnalyticsContext) null, 12)), domainState.d, num, num2, domainState.f154418j, domainState.f154421n);
    }
}

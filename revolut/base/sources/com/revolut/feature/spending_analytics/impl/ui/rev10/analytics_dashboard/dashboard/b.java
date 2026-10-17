package com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.dashboard;

import aw0.o9;
import cli.n;
import cli.y;
import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.DotDividerClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.popup.PopupMenuItem;
import com.revolut.core.ui_kit.utils.ListItemTarget;
import com.revolut.core.ui_kit_core.displayers.image.StylableContactImage$ContactStyle;
import com.revolut.core.ui_kit_core.displayers.image.models.ContactImage;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UserAvatarImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UserNamePlaceholder;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.spending_analytics.api.AnalyticsFeatureApi$Toggles;
import com.revolut.feature.spending_analytics.api.R$string;
import com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.dashboard.AnalyticsDashboardContract$AccountSelectorPopupAction;
import com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.dashboard.AnalyticsDashboardContract$ModalStep;
import com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.dashboard.AnalyticsDashboardContract$PeriodPopupAction;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.common.R$id;
import com.revolut.retail.feature.api.AnalyticsAccount;
import com.revolut.retail.feature.api.AnalyticsAccountsSelection;
import dod.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import lzi.i;
import mw0.m;
import mw0.o;
import oki.h;
import org.bouncycastle.asn1.BERTags;
import rp0.l0;
import skm.e0;
import snd.f;
import snd.p;
import uib.c;
import und.e;
import vkm.j2;
import vkm.q;
import vkm.z1;
import wli.x;
import wnd.d;
import xnd.g;
import xnd.n0;
import zhm.d0;
import zhm.f0;
import zhm.u;
import zhm.v;
import zhm.w;
import zod.j;
import zod.k;
import zod.l;

/* JADX INFO: loaded from: classes7.dex */
public final class b extends h implements f {
    public final com.revolut.kompot.navigable.vc.modal.a A;
    public final z1 B;
    public final e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final gte.a f87538p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final CoroutineScope f87539q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final x f87540r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final AnalyticsDashboardContract$InputData f87541s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final g f87542t;
    public final l0 u;
    public final wnd.e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final wnd.b f87543w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final d f87544x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final e5d.a f87545y;
    public final y z;

    public b(n stateMapper, e analyticsDashboardDelegate, gte.a featureToggleInteractor, CoroutineScope coroutineScope, x deeplinkHandler, AnalyticsDashboardContract$InputData inputData, g periodPopupProvider, l0 popupMenuDialogDisplayer, wnd.e contextMenuMapper, wnd.b budgetPickerMapper, d accountSelectorPopupMapper, e5d.a airTipWidgetExtension) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(analyticsDashboardDelegate, "analyticsDashboardDelegate");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(periodPopupProvider, "periodPopupProvider");
        Intrinsics.checkNotNullParameter(popupMenuDialogDisplayer, "popupMenuDialogDisplayer");
        Intrinsics.checkNotNullParameter(contextMenuMapper, "contextMenuMapper");
        Intrinsics.checkNotNullParameter(budgetPickerMapper, "budgetPickerMapper");
        Intrinsics.checkNotNullParameter(accountSelectorPopupMapper, "accountSelectorPopupMapper");
        Intrinsics.checkNotNullParameter(airTipWidgetExtension, "airTipWidgetExtension");
        this.o = analyticsDashboardDelegate;
        this.f87538p = featureToggleInteractor;
        this.f87539q = coroutineScope;
        this.f87540r = deeplinkHandler;
        this.f87541s = inputData;
        this.f87542t = periodPopupProvider;
        this.u = popupMenuDialogDisplayer;
        this.v = contextMenuMapper;
        this.f87543w = budgetPickerMapper;
        this.f87544x = accountSelectorPopupMapper;
        this.f87545y = airTipWidgetExtension;
        this.z = mra.d.b(this, new snd.b(new Data(null, null, true, 3, null), f0.f322471a), stateMapper, null, false, 12);
        this.A = hx7.e.a(this, new scl.h(this, 20));
        z1 z1VarB = q.b(0, 2, ukm.f.DROP_OLDEST);
        z1VarB.k(Unit.f186387a);
        this.B = z1VarB;
    }

    public final void I2() throws Throwable {
        AnalyticsAccountsSelection.Spending spendingJ;
        PopupMenuItem.NestedParent nestedParent;
        String str;
        AnalyticsFeatureApi$Toggles.AnalyticsRevamp analyticsRevamp = AnalyticsFeatureApi$Toggles.AnalyticsRevamp.f87388c;
        if (!((jte.d) this.f87538p).c(analyticsRevamp)) {
            l1().M0(b.a.f116531b);
            return;
        }
        snd.a aVar = (snd.a) ((snd.b) ((j2) this.z.f22677a).getValue()).f264521a.getContent();
        if (aVar == null) {
            return;
        }
        ListItemTarget listItemTarget = new ListItemTarget(R$id.recyclerView, "ACCOUNT_DROPDOWN_ID", com.revolut.core.ui_kit.R$id.internal_action_subheader_start_button);
        ynd.a accountSelectorData = (ynd.a) aVar.f264516b.getContent();
        if (accountSelectorData == null) {
            accountSelectorData = new ynd.a(f0.f322471a);
        }
        AnalyticsAccountsSelection currentSelection = aVar.f264515a;
        AnalyticsDashboardContract$DashboardUserData analyticsDashboardContract$DashboardUserData = (AnalyticsDashboardContract$DashboardUserData) aVar.i.getContent();
        d dVar = this.f87544x;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(accountSelectorData, "accountSelectorData");
        Intrinsics.checkNotNullParameter(currentSelection, "currentSelection");
        List list = accountSelectorData.f315441a;
        c cVar = accountSelectorData.f315442b;
        aim.e eVarB = u.b();
        eVarB.add(new PopupMenuItem.Cell("analytics_dashboard_account_selector_filters", new TextLocalisedClause(R$string.analytics_account_picker_filters, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_filter, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, null, null, AnalyticsDashboardContract$AccountSelectorPopupAction.Filters.f87514a, null, 760));
        jte.d dVar2 = (jte.d) dVar.d;
        if (dVar2.c(analyticsRevamp) && dVar2.c(AnalyticsFeatureApi$Toggles.PrivateBankTotalWealth.f87397c)) {
            AnalyticsAccountsSelection.TotalWealth.Companion companion = AnalyticsAccountsSelection.TotalWealth.INSTANCE;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it8 = list.iterator();
            while (it8.hasNext()) {
                linkedHashSet.add(((ynd.h) it8.next()).getAccount());
            }
            companion.getClass();
            AnalyticsAccountsSelection.TotalWealth totalWealthA = AnalyticsAccountsSelection.TotalWealth.Companion.a(linkedHashSet);
            eVarB.add(PopupMenuItem.Companion.a(PopupMenuItem.INSTANCE, "analytics_dashboard_account_selector_total_wealth", new TextLocalisedClause(R$string.analytics_account_picker_total_wealth, null, null, 14), totalWealthA.equals(currentSelection), d.a(R$drawable.uikit_icn_24_wealth), new AnalyticsDashboardContract$AccountSelectorPopupAction.Select(totalWealthA), null, null, BERTags.FLAGS));
        }
        aim.e eVarB2 = u.b();
        List list2 = list;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list2) {
            if (((ynd.h) obj2).getAccount() instanceof AnalyticsAccount.Personal.All) {
                arrayList.add(obj2);
            }
        }
        eVarB2.addAll(arrayList);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj3 : list2) {
            if (((ynd.h) obj3).getAccount() instanceof AnalyticsAccount.Personal.CurrencyPocket) {
                arrayList2.add(obj3);
            }
        }
        eVarB2.addAll(arrayList2);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj4 : list2) {
            if (((ynd.h) obj4).getAccount() instanceof AnalyticsAccount.Personal.Subaccount) {
                arrayList3.add(obj4);
            }
        }
        eVarB2.addAll(arrayList3);
        ArrayList arrayList4 = new ArrayList();
        for (Object obj5 : list2) {
            if (((ynd.h) obj5).getAccount() instanceof AnalyticsAccount.Personal.CreditCard) {
                arrayList4.add(obj5);
            }
        }
        eVarB2.addAll(arrayList4);
        aim.e eVarA = u.a(eVarB2);
        aim.e eVarB3 = u.b();
        ArrayList arrayList5 = new ArrayList();
        for (Object obj6 : list2) {
            if (((ynd.h) obj6).getAccount() instanceof AnalyticsAccount.Savings.PersonalAll) {
                arrayList5.add(obj6);
            }
        }
        eVarB3.addAll(arrayList5);
        ArrayList arrayList6 = new ArrayList();
        for (Object obj7 : list2) {
            if (((ynd.h) obj7).getAccount() instanceof AnalyticsAccount.Savings.PersonalIndividual) {
                arrayList6.add(obj7);
            }
        }
        eVarB3.addAll(arrayList6);
        aim.e eVarA2 = u.a(eVarB3);
        PopupMenuItem.NestedParent nestedParentD = dVar.d("analytics_dashboard_account_selector_personal", new TextLocalisedClause(R$string.analytics_account_picker_personal, null, null, 14), new UserAvatarImage((analyticsDashboardContract$DashboardUserData == null || (str = analyticsDashboardContract$DashboardUserData.f87522a) == null) ? null : new UserNamePlaceholder.Default(str, UserNamePlaceholder.PlaceholderSize.Default.f60052a), null, null, 6), d0.E0(eVarA2, eVarA), dVar.e(eVarA, eVarA2, currentSelection, cVar), currentSelection);
        if (nestedParentD != null) {
            eVarB.add(nestedParentD);
        }
        aim.e eVarB4 = u.b();
        ArrayList arrayList7 = new ArrayList();
        for (Object obj8 : list2) {
            if (((ynd.h) obj8).getAccount() instanceof AnalyticsAccount.Joint.All) {
                arrayList7.add(obj8);
            }
        }
        eVarB4.addAll(arrayList7);
        ArrayList arrayList8 = new ArrayList();
        for (Object obj9 : list2) {
            if (((ynd.h) obj9).getAccount() instanceof AnalyticsAccount.Joint.CurrencyPocket) {
                arrayList8.add(obj9);
            }
        }
        eVarB4.addAll(arrayList8);
        ArrayList arrayList9 = new ArrayList();
        for (Object obj10 : list2) {
            if (((ynd.h) obj10).getAccount() instanceof AnalyticsAccount.Joint.Subaccount) {
                arrayList9.add(obj10);
            }
        }
        eVarB4.addAll(arrayList9);
        aim.e eVarA3 = u.a(eVarB4);
        aim.e eVarB5 = u.b();
        ArrayList arrayList10 = new ArrayList();
        for (Object obj11 : list2) {
            if (((ynd.h) obj11).getAccount() instanceof AnalyticsAccount.Savings.JointAll) {
                arrayList10.add(obj11);
            }
        }
        eVarB5.addAll(arrayList10);
        ArrayList arrayList11 = new ArrayList();
        for (Object obj12 : list2) {
            if (((ynd.h) obj12).getAccount() instanceof AnalyticsAccount.Savings.JointIndividual) {
                arrayList11.add(obj12);
            }
        }
        eVarB5.addAll(arrayList11);
        aim.e eVarA4 = u.a(eVarB5);
        PopupMenuItem.NestedParent nestedParentD2 = dVar.d("analytics_dashboard_account_selector_joint", new TextLocalisedClause(R$string.analytics_account_picker_joint, null, null, 14), LayeredImage.INSTANCE.j(R$drawable.uikit_icn_24_joint, new Color.Solid(R$attr.uikit_colorOnAccent), new Color.Solid(R$attr.uikit_colorPurple)), d0.E0(eVarA4, eVarA3), dVar.e(eVarA3, eVarA4, currentSelection, cVar), currentSelection);
        if (nestedParentD2 != null) {
            eVarB.add(nestedParentD2);
        }
        aim.e eVarB6 = u.b();
        ArrayList arrayList12 = new ArrayList();
        for (Object obj13 : list2) {
            if (((ynd.h) obj13).getAccount() instanceof AnalyticsAccount.Pro.All) {
                arrayList12.add(obj13);
            }
        }
        eVarB6.addAll(arrayList12);
        ArrayList arrayList13 = new ArrayList();
        for (Object obj14 : list2) {
            if (((ynd.h) obj14).getAccount() instanceof AnalyticsAccount.Pro.CurrencyPocket) {
                arrayList13.add(obj14);
            }
        }
        eVarB6.addAll(arrayList13);
        aim.e eVarA5 = u.a(eVarB6);
        PopupMenuItem.NestedParent nestedParentD3 = dVar.d("analytics_dashboard_account_selector_pro", new TextLocalisedClause(R$string.analytics_account_picker_pro, null, null, 14), LayeredImage.INSTANCE.j(R$drawable.uikit_icn_24_services, new Color.Solid(R$attr.uikit_colorOnAccent), new Color.Solid(R$attr.uikit_colorDeepGrey)), eVarA5, dVar.e(eVarA5, f0.f322471a, currentSelection, c.SAVINGS), currentSelection);
        if (nestedParentD3 != null) {
            eVarB.add(nestedParentD3);
        }
        ArrayList arrayList14 = new ArrayList();
        for (Object obj15 : list2) {
            if (obj15 instanceof ynd.b) {
                arrayList14.add(obj15);
            }
        }
        ArrayList<AnalyticsAccount.Junior.All> arrayList15 = new ArrayList();
        Iterator it9 = arrayList14.iterator();
        while (it9.hasNext()) {
            AnalyticsAccount analyticsAccount = ((ynd.b) it9.next()).f315443a;
            AnalyticsAccount.Junior.All all2 = analyticsAccount instanceof AnalyticsAccount.Junior.All ? (AnalyticsAccount.Junior.All) analyticsAccount : null;
            if (all2 != null) {
                arrayList15.add(all2);
            }
        }
        ArrayList arrayList16 = new ArrayList();
        for (AnalyticsAccount.Junior.All all3 : arrayList15) {
            aim.e eVarB7 = u.b();
            ArrayList arrayList17 = new ArrayList();
            for (Object obj16 : list2) {
                if (Intrinsics.f(((ynd.h) obj16).getAccount(), all3)) {
                    arrayList17.add(obj16);
                }
            }
            eVarB7.addAll(arrayList17);
            ArrayList arrayList18 = new ArrayList();
            for (Object obj17 : list2) {
                if (((ynd.h) obj17).getAccount() instanceof AnalyticsAccount.Junior.CurrencyPocket) {
                    arrayList18.add(obj17);
                }
            }
            ArrayList arrayList19 = new ArrayList();
            for (Object obj18 : arrayList18) {
                AnalyticsAccount account = ((ynd.h) obj18).getAccount();
                Intrinsics.i(account, "null cannot be cast to non-null type com.revolut.retail.feature.api.AnalyticsAccount.Junior.CurrencyPocket");
                if (Intrinsics.f(((AnalyticsAccount.Junior.CurrencyPocket) account).f99186a, all3.f99184a)) {
                    arrayList19.add(obj18);
                }
            }
            eVarB7.addAll(arrayList19);
            aim.e eVarA6 = u.a(eVarB7);
            aim.e eVarB8 = u.b();
            ArrayList arrayList20 = new ArrayList();
            for (Object obj19 : list2) {
                if (((ynd.h) obj19).getAccount() instanceof AnalyticsAccount.Savings.JuniorSaving) {
                    arrayList20.add(obj19);
                }
            }
            ArrayList arrayList21 = new ArrayList();
            Iterator it10 = arrayList20.iterator();
            while (it10.hasNext()) {
                Object next = it10.next();
                AnalyticsAccount account2 = ((ynd.h) next).getAccount();
                Iterator it11 = it10;
                Intrinsics.i(account2, "null cannot be cast to non-null type com.revolut.retail.feature.api.AnalyticsAccount.Savings.JuniorSaving");
                if (Intrinsics.f(((AnalyticsAccount.Savings.JuniorSaving) account2).f99202b, all3.f99184a)) {
                    arrayList21.add(next);
                }
                it10 = it11;
            }
            eVarB8.addAll(arrayList21);
            aim.e eVarA7 = u.a(eVarB8);
            PopupMenuItem.NestedParent nestedParentD4 = dVar.d(j6.a.q("analytics_dashboard_account_selector_junior_", all3.f99184a), new TextClause(all3.f99185b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new ContactImage(all3.getF99186a(), (String) null, (String) null, (String) null, (String) null, all3.getF99187b(), (String) null, false, (StylableContactImage$ContactStyle) rf8.a.f253707a, (ImageTransformations) null, (TextLocalisedClause) null, 3550), d0.E0(eVarA7, eVarA6), dVar.e(eVarA6, eVarA7, currentSelection, cVar), currentSelection);
            if (nestedParentD4 != null) {
                arrayList16.add(nestedParentD4);
            }
        }
        Iterator it12 = arrayList16.iterator();
        while (it12.hasNext()) {
            eVarB.add((PopupMenuItem) it12.next());
        }
        ArrayList arrayList22 = new ArrayList();
        for (Object obj20 : list2) {
            if (obj20 instanceof ynd.e) {
                arrayList22.add(obj20);
            }
        }
        if (arrayList22.isEmpty() || (spendingJ = d.j(arrayList22)) == null) {
            nestedParent = null;
        } else {
            aim.e eVarB9 = u.b();
            eVarB9.add(PopupMenuItem.Companion.a(PopupMenuItem.INSTANCE, "analytics_dashboard_account_selector_linked_all", new TextLocalisedClause(R$string.analytics_account_picker_all_accounts, null, null, 14), spendingJ.equals(currentSelection), d.b(), new AnalyticsDashboardContract$AccountSelectorPopupAction.Select(spendingJ), null, null, BERTags.FLAGS));
            ArrayList arrayList23 = new ArrayList(w.t(arrayList22, 10));
            Iterator it13 = arrayList22.iterator();
            while (it13.hasNext()) {
                arrayList23.add(dVar.f((ynd.e) it13.next(), currentSelection));
            }
            eVarB9.addAll(arrayList23);
            nestedParent = new PopupMenuItem.NestedParent("analytics_dashboard_account_selector_linked", new TextLocalisedClause(R$string.analytics_account_picker_linked, null, null, 14), d.b(), u.a(eVarB9), null, null, dVar.g(arrayList22, currentSelection, spendingJ), 48);
        }
        if (nestedParent != null) {
            eVarB.add(nestedParent);
        }
        this.u.c(listItemTarget, zi0.c.d(u.a(eVarB)), o.BELOW_START, m.f209296a);
    }

    public final void J2() {
        Data data;
        snd.d dVar;
        i selectedType;
        if (!((jte.d) this.f87538p).c(AnalyticsFeatureApi$Toggles.AnalyticsRevamp.f87388c)) {
            l1().M0(b.g.f116537b);
            return;
        }
        snd.a aVar = (snd.a) ((snd.b) ((j2) this.z.f22677a).getValue()).f264521a.getContent();
        if (aVar == null || (data = aVar.f264517c) == null || (dVar = (snd.d) data.getContent()) == null || (selectedType = dVar.f264525a.f200980a) == null) {
            return;
        }
        this.f87542t.getClass();
        Intrinsics.checkNotNullParameter(selectedType, "selectedType");
        this.u.e("ACCOUNT_DROPDOWN_ID", zi0.c.c(v.k(v.k(g.a("analytics_dashboard_period_popup_weekly", R$string.analytics_dashboard_period_weekly, i.WEEKLY, selectedType), g.a("analytics_dashboard_period_popup_monthly", R$string.analytics_dashboard_period_monthly, i.MONTHLY, selectedType), g.a("analytics_dashboard_period_popup_yearly", R$string.analytics_dashboard_period_yearly, i.YEARLY, selectedType)), u.c(new PopupMenuItem.Cell("analytics_dashboard_period_popup_preferences", new TextLocalisedClause(R$string.analytics_dashboard_analytics_period_menu_preferences_title, null, null, 14), null, null, null, null, null, null, AnalyticsDashboardContract$PeriodPopupAction.Preferences.f87526a, null, 764))), null, null), o.BELOW, null);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.A;
    }

    public final void K2(Object obj2) {
        aii.m mVar;
        aii.m cVar;
        aii.m dVar;
        int i;
        CompositeClause compositeClause;
        char c2;
        Data data;
        if (obj2 instanceof zod.n) {
            zod.n nVar = (zod.n) obj2;
            if (nVar instanceof k) {
                k kVar = (k) nVar;
                cVar = new dod.g(yld.d.SPENDING, kVar.f324001a, kVar.f324002b);
            } else if (nVar instanceof zod.h) {
                zod.h hVar = (zod.h) nVar;
                cVar = new dod.g(yld.d.INCOME, hVar.f323993a, hVar.f323994b);
            } else if (nVar instanceof zod.f) {
                zod.f fVar = (zod.f) nVar;
                cVar = new dod.g(yld.d.CASHFLOW, fVar.f323983a, fVar.f323984b);
            } else if (nVar instanceof zod.i) {
                zod.i iVar = (zod.i) nVar;
                cVar = new dod.g(yld.d.NET_BALANCE, iVar.f323996a, iVar.f323997b);
            } else if (nVar instanceof zod.g) {
                zod.g gVar = (zod.g) nVar;
                cVar = new dod.g(yld.d.EARNINGS, gVar.f323988a, gVar.f323989b);
            } else if (nVar instanceof j) {
                j jVar = (j) nVar;
                cVar = new dod.g(yld.d.SALES, jVar.f323999a, jVar.f324000b);
            } else if (nVar instanceof l) {
                l lVar = (l) nVar;
                cVar = new dod.h(lVar.f324005a, lVar.f324006b);
            } else if (nVar instanceof zod.e) {
                ynd.i iVar2 = ((zod.e) nVar).f323982a;
                qzi.h hVar2 = iVar2.f315455a;
                AccountId accountId = iVar2.f315456b;
                cVar = hVar2 != null ? new dod.d(accountId) : new dod.l(accountId);
            } else {
                if (!(nVar instanceof zod.m)) {
                    throw new NoWhenBranchMatchedException();
                }
                cVar = b.h.f116538b;
            }
        } else {
            if (obj2 instanceof p) {
                p pVar = (p) obj2;
                boolean z = true;
                if (pVar instanceof snd.h) {
                    ArrayList arrayList = ((snd.h) pVar).f264536a;
                    int size = arrayList.size();
                    cVar = size != 0 ? size != 1 ? new dod.e(arrayList) : new dod.l((AccountId) d0.K0(arrayList)) : null;
                } else {
                    if (pVar instanceof snd.i) {
                        n0 budgetTools = ((snd.i) pVar).f264537a;
                        if (budgetTools.f307429c) {
                            snd.a aVar = (snd.a) ((snd.b) ((j2) this.z.f22677a).getValue()).f264521a.getContent();
                            AnalyticsDashboardContract$DashboardUserData analyticsDashboardContract$DashboardUserData = (aVar == null || (data = aVar.i) == null) ? null : (AnalyticsDashboardContract$DashboardUserData) data.getContent();
                            this.f87543w.getClass();
                            Intrinsics.checkNotNullParameter(budgetTools, "budgetTools");
                            ArrayList<xnd.l0> arrayList2 = budgetTools.f307428b;
                            char c3 = '\n';
                            ArrayList arrayList3 = new ArrayList(w.t(arrayList2, 10));
                            for (xnd.l0 l0Var : arrayList2) {
                                AccountId accountId2 = l0Var.f307419a;
                                lzi.m mVar2 = l0Var.f307420b;
                                boolean z3 = mVar2 != null ? z : false;
                                if (mVar2 == null) {
                                    c2 = c3;
                                    compositeClause = null;
                                } else {
                                    lzi.h hVar3 = l0Var.f307421c;
                                    if (hVar3 instanceof lzi.g) {
                                        i = R$string.analytics_dashboard_section_tools_budget_active_weekly;
                                    } else if ((hVar3 instanceof lzi.c) || (hVar3 instanceof lzi.e)) {
                                        i = R$string.analytics_dashboard_section_tools_budget_active_monthly;
                                    } else {
                                        if (hVar3 != null) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        c2 = c3;
                                        compositeClause = null;
                                    }
                                    c2 = '\n';
                                    compositeClause = new CompositeClause(v.k(new TextLocalisedClause(R$string.analytics_dashboard_section_tools_active, null, new Custom(new Custom.Color.Solid(R$attr.uikit_colorStatusSuccess), false, false, 254), 10), new TextLocalisedClause(i, u.c(otd.f.d(mVar2.f200988b)), null, 12)), new DotDividerClause((Integer) null), null, null, 12);
                                }
                                arrayList3.add(new AnalyticsDashboardContract$BudgetPickerAccount(accountId2, z3, compositeClause));
                                c3 = c2;
                                z = true;
                            }
                            mVar = null;
                            h.v2(this.A, new AnalyticsDashboardContract$ModalStep.BudgetAccountPicker(arrayList3, analyticsDashboardContract$DashboardUserData), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                        } else {
                            mVar = null;
                            xnd.l0 l0Var2 = (xnd.l0) d0.M0(budgetTools.f307427a);
                            if (l0Var2 != null) {
                                AccountId accountId3 = l0Var2.f307419a;
                                dVar = l0Var2.f307420b != null ? new dod.d(accountId3) : new dod.l(accountId3);
                            }
                        }
                    } else if (pVar instanceof snd.j) {
                        dVar = b.e.f116535b;
                    } else if (pVar instanceof snd.m) {
                        snd.m mVar3 = (snd.m) pVar;
                        cVar = new dod.j(mVar3.f264545a, mVar3.f264546b, mVar3.f264547c);
                    } else if (pVar instanceof snd.n) {
                        snd.n nVar2 = (snd.n) pVar;
                        cVar = new dod.k(nVar2.f264548a, nVar2.f264549b, nVar2.f264550c);
                    } else if (pVar instanceof snd.l) {
                        cVar = new dod.i(((snd.l) pVar).f264544a);
                    } else if (pVar instanceof snd.g) {
                        cVar = new dod.c(((snd.g) pVar).f264533a);
                    } else if (pVar instanceof snd.k) {
                        dVar = b.f.f116536b;
                    } else {
                        if (!(pVar instanceof snd.o)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        dVar = b.C0691b.f116532b;
                    }
                    cVar = dVar;
                }
            } else {
                mVar = null;
            }
            cVar = mVar;
        }
        if (cVar != null) {
            l1().M0(cVar);
        }
    }

    @Override // yji.l
    public final void P1() {
        e0.n(this.f87539q.getF74819h());
    }

    @Override // yji.l
    public final void T1(long j2) {
        Continuation continuation = null;
        yji.l.b1(this, q.Q(this.B, new s9b.n(continuation, this, 6)), null, new snd.e0(this, continuation, 0), 3);
        yji.l.b1(this, this.f87545y.Z2(), null, new snd.e0(this, continuation, 1), 3);
        yji.l.b1(this, rd0.e.b(this.u.f256113c), null, new snd.e0(this, continuation, 2), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.z;
    }
}

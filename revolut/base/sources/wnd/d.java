package wnd;

import aw0.o9;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit.models.popup.PopupMenuItem;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.StylableContactImage$ContactStyle;
import com.revolut.core.ui_kit_core.displayers.image.models.ContactImage;
import com.revolut.core.ui_kit_core.displayers.image.models.CurrencyImage;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.spending_analytics.api.R$plurals;
import com.revolut.feature.spending_analytics.api.R$string;
import com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.dashboard.AnalyticsDashboardContract$AccountSelectorPopupAction;
import com.revolut.retail.feature.api.AnalyticsAccount;
import com.revolut.retail.feature.api.AnalyticsAccountsSelection;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import mw0.p;
import org.jetbrains.annotations.NotNull;
import rnd.i;
import wp5.y;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes7.dex */
public final class d {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final je6.h f298820a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g6e.b f298821b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f298822c;
    public final gte.a d;

    public d(je6.h externalInstitutionLogoMapper, g6e.b subaccountBackgroundInteractor, i analyticsAccountMetadataProvider, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(externalInstitutionLogoMapper, "externalInstitutionLogoMapper");
        Intrinsics.checkNotNullParameter(subaccountBackgroundInteractor, "subaccountBackgroundInteractor");
        Intrinsics.checkNotNullParameter(analyticsAccountMetadataProvider, "analyticsAccountMetadataProvider");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f298820a = externalInstitutionLogoMapper;
        this.f298821b = subaccountBackgroundInteractor;
        this.f298822c = analyticsAccountMetadataProvider;
        this.d = featureToggleInteractor;
    }

    public static LayeredImage a(int i) {
        LayeredImage.Companion companion = LayeredImage.INSTANCE;
        int i2 = R$attr.uikit_colorAccentNeutral;
        return y.h(new Color.Solid(i2), 0.1f, companion, i, new Color.Solid(i2));
    }

    public static LayeredImage b() {
        return LayeredImage.INSTANCE.j(R$drawable.uikit_icn_24_link, new Color.Solid(R$attr.uikit_colorOnAccent), new Color.Solid(R$attr.uikit_colorCyan));
    }

    public static Clause h(ynd.h hVar) {
        if (hVar instanceof ynd.b) {
            AnalyticsAccount analyticsAccount = ((ynd.b) hVar).f315443a;
            return ((analyticsAccount instanceof AnalyticsAccount.Savings.PersonalAll) || (analyticsAccount instanceof AnalyticsAccount.Savings.JointAll)) ? new TextLocalisedClause(R$string.analytics_account_picker_all_savings, null, null, 14) : new TextLocalisedClause(R$string.analytics_account_picker_all_accounts, null, null, 14);
        }
        if (hVar instanceof ynd.d) {
            return new CurrencyClause(((ynd.d) hVar).f315446b, null, null, 6);
        }
        if (hVar instanceof ynd.g) {
            return new TextClause(((ynd.g) hVar).f315453b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        }
        if (hVar instanceof ynd.f) {
            return new TextClause(((ynd.f) hVar).f315451b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        }
        if (hVar instanceof ynd.c) {
            return new TextLocalisedClause(R$string.analytics_account_picker_credit_card, null, null, 14);
        }
        if (hVar instanceof ynd.e) {
            return new TextClause(((ynd.e) hVar).f315448b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static AnalyticsAccountsSelection.Spending j(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return null;
        }
        AnalyticsAccountsSelection.Spending.Companion companion = AnalyticsAccountsSelection.Spending.INSTANCE;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            linkedHashSet.add(((ynd.e) it8.next()).f315447a);
        }
        companion.getClass();
        return AnalyticsAccountsSelection.Spending.Companion.a(linkedHashSet);
    }

    public final Image c(ynd.h hVar) {
        if (hVar instanceof ynd.b) {
            AnalyticsAccount analyticsAccount = ((ynd.b) hVar).f315443a;
            if (!(analyticsAccount instanceof AnalyticsAccount.Personal.All) && !(analyticsAccount instanceof AnalyticsAccount.Joint.All)) {
                if (analyticsAccount instanceof AnalyticsAccount.Pro.All) {
                    return LayeredImage.INSTANCE.j(R$drawable.uikit_icn_24_services, new Color.Solid(R$attr.uikit_colorOnAccent), new Color.Solid(R$attr.uikit_colorDeepGrey));
                }
                if (analyticsAccount instanceof AnalyticsAccount.Junior.All) {
                    AnalyticsAccount.Junior junior = (AnalyticsAccount.Junior) analyticsAccount;
                    return new ContactImage(junior.getF99186a(), (String) null, (String) null, (String) null, (String) null, junior.getF99187b(), (String) null, false, (StylableContactImage$ContactStyle) rf8.a.f253707a, (ImageTransformations) null, (TextLocalisedClause) null, 3550);
                }
                if ((analyticsAccount instanceof AnalyticsAccount.Savings.PersonalAll) || (analyticsAccount instanceof AnalyticsAccount.Savings.JointAll)) {
                    return a(R$drawable.uikit_icn_24_vaults_generic);
                }
                return null;
            }
            return a(R$drawable.uikit_icn_24_coins);
        }
        if (hVar instanceof ynd.d) {
            return new CurrencyImage(((ynd.d) hVar).f315446b.f306286a, (ImageTransformations) null, (TextLocalisedClause) null, 14);
        }
        if (hVar instanceof ynd.g) {
            return ((s6e.d) this.f298821b).c(((ynd.g) hVar).f315454c);
        }
        if (hVar instanceof ynd.f) {
            return nib.a.a();
        }
        if (hVar instanceof ynd.c) {
            return LayeredImage.INSTANCE.j(R$drawable.uikit_icn_24_credit_card, new Color.Solid(R$attr.uikit_colorWhite), new Color.Solid(R$attr.uikit_colorTeal));
        }
        if (!(hVar instanceof ynd.e)) {
            throw new NoWhenBranchMatchedException();
        }
        return ((di6.a) this.f298820a).c(((ynd.e) hVar).f315447a.f99190b);
    }

    public final PopupMenuItem.NestedParent d(String str, Clause clause, Image image, AbstractList abstractList, List list, AnalyticsAccountsSelection analyticsAccountsSelection) {
        if (abstractList.isEmpty()) {
            return null;
        }
        return new PopupMenuItem.NestedParent(str, clause, image, list, null, null, g(abstractList, analyticsAccountsSelection, null));
    }

    public final List e(aim.e eVar, List list, AnalyticsAccountsSelection analyticsAccountsSelection, uib.c cVar) {
        p[] elements = {i(eVar, analyticsAccountsSelection, new TextLocalisedClause(R$string.analytics_account_picker_accounts, null, null, 14)), i(list, analyticsAccountsSelection, new TextLocalisedClause(oc.c.r(cVar), null, null, 14))};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return kotlin.collections.d.L(elements);
    }

    public final PopupMenuItem.Cell f(ynd.h hVar, AnalyticsAccountsSelection analyticsAccountsSelection) {
        String str;
        String str2;
        String strQ;
        String str3;
        AnalyticsAccountsSelection.Companion companion = AnalyticsAccountsSelection.INSTANCE;
        AnalyticsAccount account = hVar.getAccount();
        companion.getClass();
        AnalyticsAccountsSelection analyticsAccountsSelectionA = AnalyticsAccountsSelection.Companion.a(account);
        PopupMenuItem.Companion companion2 = PopupMenuItem.INSTANCE;
        AnalyticsAccount account2 = hVar.getAccount();
        if (account2 instanceof AnalyticsAccount.Personal.All) {
            strQ = "analytics_dashboard_account_selector_entry_personal_all";
        } else {
            if (account2 instanceof AnalyticsAccount.Personal.Subaccount) {
                str = ((AnalyticsAccount.Personal.Subaccount) account2).f99195a;
                str2 = "analytics_dashboard_account_selector_entry_personal_subaccount_";
            } else if (account2 instanceof AnalyticsAccount.Personal.CurrencyPocket) {
                str = ((AnalyticsAccount.Personal.CurrencyPocket) account2).f99194a;
                str2 = "analytics_dashboard_account_selector_entry_personal_currency_";
            } else if (account2 instanceof AnalyticsAccount.Personal.CreditCard) {
                str = ((AnalyticsAccount.Personal.CreditCard) account2).f99193a;
                str2 = "analytics_dashboard_account_selector_entry_credit_card_";
            } else if (account2 instanceof AnalyticsAccount.Joint.All) {
                str = ((AnalyticsAccount.Joint.All) account2).f99179a.f51412a;
                str2 = "analytics_dashboard_account_selector_entry_joint_all_";
            } else if (account2 instanceof AnalyticsAccount.Joint.Subaccount) {
                str = ((AnalyticsAccount.Joint.Subaccount) account2).f99183b;
                str2 = "analytics_dashboard_account_selector_entry_joint_subaccount_";
            } else if (account2 instanceof AnalyticsAccount.Joint.CurrencyPocket) {
                str = ((AnalyticsAccount.Joint.CurrencyPocket) account2).f99181b;
                str2 = "analytics_dashboard_account_selector_entry_joint_currency_";
            } else if (account2 instanceof AnalyticsAccount.Savings.PersonalIndividual) {
                str = ((AnalyticsAccount.Savings.PersonalIndividual) account2).f99204a;
                str2 = "analytics_dashboard_account_selector_entry_personal_savings_";
            } else if (account2 instanceof AnalyticsAccount.Savings.PersonalAll) {
                strQ = "analytics_dashboard_account_selector_entry_personal_savings_all";
            } else if (account2 instanceof AnalyticsAccount.Savings.JuniorSaving) {
                str = ((AnalyticsAccount.Savings.JuniorSaving) account2).f99201a;
                str2 = "analytics_dashboard_account_selector_entry_junior_savings_";
            } else if (account2 instanceof AnalyticsAccount.Savings.JointIndividual) {
                str = ((AnalyticsAccount.Savings.JointIndividual) account2).f99200b;
                str2 = "analytics_dashboard_account_selector_entry_joint_savings_";
            } else if (account2 instanceof AnalyticsAccount.Savings.JointAll) {
                str = ((AnalyticsAccount.Savings.JointAll) account2).f99198a.f51412a;
                str2 = "analytics_dashboard_account_selector_entry_joint_savings_all_";
            } else if (account2 instanceof AnalyticsAccount.Junior.All) {
                str = ((AnalyticsAccount.Junior.All) account2).f99184a;
                str2 = "analytics_dashboard_account_selector_entry_junior_all_";
            } else if (account2 instanceof AnalyticsAccount.Junior.CurrencyPocket) {
                str = ((AnalyticsAccount.Junior.CurrencyPocket) account2).f99188c;
                str2 = "analytics_dashboard_account_selector_entry_junior_currency_";
            } else if (account2 instanceof AnalyticsAccount.Pro.All) {
                strQ = "analytics_dashboard_account_selector_entry_pro_all";
            } else if (account2 instanceof AnalyticsAccount.Pro.CurrencyPocket) {
                str = ((AnalyticsAccount.Pro.CurrencyPocket) account2).f99197a;
                str2 = "analytics_dashboard_account_selector_entry_pro_currency_";
            } else {
                if (!(account2 instanceof AnalyticsAccount.Linked)) {
                    throw new NoWhenBranchMatchedException();
                }
                str = ((AnalyticsAccount.Linked) account2).f99189a;
                str2 = "analytics_dashboard_account_selector_entry_linked_";
            }
            strQ = j6.a.q(str2, str);
        }
        return PopupMenuItem.Companion.a(companion2, strQ, h(hVar), analyticsAccountsSelectionA.equals(analyticsAccountsSelection), c(hVar), new AnalyticsDashboardContract$AccountSelectorPopupAction.Select(analyticsAccountsSelectionA), null, (!(hVar instanceof ynd.e) || (str3 = ((ynd.e) hVar).f315449c) == null) ? null : new TextClause(str3, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), 160);
    }

    public final Clause g(List list, AnalyticsAccountsSelection analyticsAccountsSelection, AnalyticsAccountsSelection.Spending spending) {
        Object next;
        if (Intrinsics.f(spending, analyticsAccountsSelection)) {
            return new TextLocalisedClause(R$string.analytics_account_picker_all_accounts, null, null, 14);
        }
        List list2 = list;
        Iterator it8 = list2.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            AnalyticsAccountsSelection.Companion companion = AnalyticsAccountsSelection.INSTANCE;
            AnalyticsAccount account = ((ynd.h) next).getAccount();
            companion.getClass();
            if (AnalyticsAccountsSelection.Companion.a(account).equals(analyticsAccountsSelection)) {
                break;
            }
        }
        ynd.h hVar = (ynd.h) next;
        if (hVar != null) {
            return h(hVar);
        }
        Set f99208a = analyticsAccountsSelection.getF99208a();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj2 : f99208a) {
            AnalyticsAccount analyticsAccount = (AnalyticsAccount) obj2;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator it9 = list2.iterator();
                while (true) {
                    if (!it9.hasNext()) {
                        break;
                    }
                    if (Intrinsics.f(((ynd.h) it9.next()).getAccount(), analyticsAccount)) {
                        linkedHashSet.add(obj2);
                        break;
                    }
                }
            }
        }
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        Iterator it10 = list2.iterator();
        while (it10.hasNext()) {
            arrayList.add(((ynd.h) it10.next()).getAccount());
        }
        int iA = this.f298822c.a(linkedHashSet, arrayList);
        Integer numValueOf = iA > 0 ? Integer.valueOf(iA) : null;
        if (numValueOf != null) {
            return new TextLocalisedQuantityClause(R$plurals.analytics_account_picker_subtitle_accounts, numValueOf, u.c(numValueOf), (Style) null, 24);
        }
        return null;
    }

    public final p i(List list, AnalyticsAccountsSelection analyticsAccountsSelection, TextLocalisedClause textLocalisedClause) {
        if (list.isEmpty()) {
            list = null;
        }
        if (list == null) {
            return null;
        }
        List list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        Iterator it8 = list2.iterator();
        while (it8.hasNext()) {
            arrayList.add(f((ynd.h) it8.next(), analyticsAccountsSelection));
        }
        return new p(textLocalisedClause, arrayList);
    }
}

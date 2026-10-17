package g25;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.NavBarWithContainerBackground;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.badge.CircleBadgeModel;
import com.revolut.core.ui_kit.models.badge.CircleIconBadge;
import com.revolut.core.ui_kit.models.badge.DangerCircleBadge;
import com.revolut.core.ui_kit.models.badge.InactiveCircleBadge;
import com.revolut.core.ui_kit.models.badge.SuccessCircleBadge;
import com.revolut.core.ui_kit.models.badge.WarningCircleBadge;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.credit.tiles.api.models.ResumeCreditApplication;
import com.revolut.feature.tab.accounts.api.model.AccountListItemModel;
import com.revolut.feature.tab.accounts.api.model.AccountWidgetItemActionsMode;
import com.revolut.feature.tab.accounts.api.model.AccountWidgetItemModel;
import com.revolut.feature.tab.accounts.api.model.ProductAccount;
import com.revolut.feature.tab.accounts.api.model.ProductAccountMetadata;
import com.revolut.feature.tab.accounts.api.model.ProductAccountSubtitle;
import com.revolut.feature.tab.accounts.api.model.ProductAccountValue;
import com.revolut.feature.tab.accounts.api.model.ProductAccountWidgetAction;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import ft3.j1;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class p {

    @NotNull
    public static final m Companion = new m();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f139903a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final aq3.a f139904b;

    public p(l creditApplicationAccountIconProvider, aq3.a creditApplicationChecklistAvailabilityProvider) {
        Intrinsics.checkNotNullParameter(creditApplicationAccountIconProvider, "creditApplicationAccountIconProvider");
        Intrinsics.checkNotNullParameter(creditApplicationChecklistAvailabilityProvider, "creditApplicationChecklistAvailabilityProvider");
        this.f139903a = creditApplicationAccountIconProvider;
        this.f139904b = creditApplicationChecklistAvailabilityProvider;
    }

    public static CircleIconBadge a(bb5.a aVar) {
        switch (n.f139899a[aVar.ordinal()]) {
            case 1:
                return new WarningCircleBadge(dw0.a.Awaiting);
            case 2:
                return new InactiveCircleBadge(dw0.a.Awaiting);
            case 3:
                return new DangerCircleBadge(dw0.a.Error);
            case 4:
                return new InactiveCircleBadge(dw0.a.Pending);
            case 5:
                return new SuccessCircleBadge(dw0.a.Checked);
            case 6:
                return null;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final ProductAccount.PendingItem b(x15.e eVar) {
        ProductAccountId productAccountIdA = com.revolut.feature.credit.models.a.a(eVar.f302252a.f14163a, eVar.a());
        int i = R$string.account_switcher_onboarding_tile_title;
        bb5.c cVar = eVar.f302252a;
        return new ProductAccount.PendingItem(productAccountIdA, j.a(this.f139903a, cVar.f14164b), new TextLocalisedClause(i, zhm.u.c(new TextClause(cVar.f14165c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), new TextLocalisedClause(R$string.account_switcher_onboarding_tile_subtitle, zhm.u.c(new TextClause(cVar.d, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), a(cVar.f), new ResumeCreditApplication(eVar.a()), true);
    }

    public final AccountListItemModel c(bb5.c cVar) {
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.account_switcher_onboarding_tile_title, zhm.u.c(new TextClause(cVar.f14165c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
        int i = R$string.account_switcher_onboarding_tile_subtitle;
        String str = cVar.d;
        bb5.a aVar = cVar.f;
        return new AccountListItemModel((Image) j.a(this.f139903a, cVar.f14164b), (Clause) textLocalisedClause, (Clause) new TextLocalisedClause(i, zhm.u.c(new TextClause(str, (Style) new Custom(Integer.valueOf(n.f139899a[aVar.ordinal()] == 5 ? R$attr.uikit_colorStatusSuccess : R$attr.uikit_colorWhite_60), false, null, false, null, 254), (Integer) null, false, (o9) null, (List) null, 124)), null, 12), (List) null, (CircleBadgeModel) a(aVar), false, false, false, 232);
    }

    public final ProductAccount d(x15.e model) {
        Intrinsics.checkNotNullParameter(model, "model");
        bb5.c cVar = model.f302252a;
        return ((wr3.b) this.f139904b).a(cVar.f14164b) ? (cVar.f == bb5.a.TERMINATED && cVar.f14164b != j1.CREDIT_CARD) ? b(model) : f(model, false) : cVar.f14166g ? e(model) : b(model);
    }

    public final ProductAccount.ValueItem.Main e(x15.e eVar) {
        bb5.c cVar = eVar.f302252a;
        bb5.b bVar = cVar.i;
        if (bVar == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        ou3.g gVar = eVar.f302253b;
        if (gVar == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        ou3.k kVar = gVar.f229789a;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.account_switcher_onboarding_tile_accessory_title, zhm.u.c(new TextClause(bVar.f14161a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
        String str = bVar.f14162b;
        ProductAccountValue.Text value = new ProductAccountValue.Text(4, textLocalisedClause, str != null ? new TextLocalisedClause(R$string.account_switcher_onboarding_tile_accessory_subtitle, zhm.u.c(new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12) : null);
        String str2 = kVar.f229798a;
        String str3 = kVar.f229799b;
        Intrinsics.checkNotNullParameter(value, "value");
        ProductAccountId productAccountIdA = com.revolut.feature.credit.models.a.a(cVar.f14163a, eVar.a());
        AccountListItemModel accountListItemModelC = c(cVar);
        ProductAccountMetadata productAccountMetadata = new ProductAccountMetadata(null, true);
        TextLocalisedClause textLocalisedClause2 = str2 != null ? new TextLocalisedClause(R$string.application_dashboard_title, zhm.u.c(new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12) : null;
        ProductAccountSubtitle.Text text = str3 != null ? new ProductAccountSubtitle.Text(new TextLocalisedClause(R$string.application_dashboard_subtitle, zhm.u.c(new TextClause(str3, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), null) : null;
        ArrayList arrayList = kVar.f229800c;
        ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
        int i = 0;
        for (Object obj2 : arrayList) {
            int i2 = i + 1;
            if (i < 0) {
                zhm.v.s();
                throw null;
            }
            ou3.j jVar = (ou3.j) obj2;
            String strN = a0.d.n("credit-application-dashboard-header-action-", i);
            Image imageT1 = jVar.f229796b.T1();
            TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.application_dashboard_action_title, zhm.u.c(new TextClause(jVar.f229795a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
            ou3.f fVar = jVar.f229797c;
            arrayList2.add(new ProductAccountWidgetAction(300, null, textLocalisedClause3, imageT1, fVar, strN, null, null, false, fVar != null));
            i = i2;
        }
        return new ProductAccount.ValueItem.Main(productAccountIdA, (ProductAccountValue) value, accountListItemModelC, new AccountWidgetItemModel((List) arrayList2, (NavBarWithContainerBackground) null, (AccountWidgetItemModel.EmptyStateStories) AccountWidgetItemModel.EmptyStateStories.NotApplicable.f89489a, (Clause) textLocalisedClause2, false, (ProductAccountSubtitle) text, 50), productAccountMetadata, (AccountListItemModel) null, false, true, 352);
    }

    public final ProductAccount.ValueItem.Main f(x15.e eVar, boolean z) {
        o oVar;
        Clause textClause;
        bb5.c cVar = eVar.f302252a;
        dj0.d dVar = cVar.e;
        vu3.p pVar = eVar.f302254c;
        vu3.s sVar = pVar != null ? pVar.f292237c : null;
        if (sVar == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        String str = sVar.f292243b;
        if (dVar != null) {
            oVar = new o(new ProductAccountValue.Balance(dVar, (TextLocalisedClause) null, 6), sVar.f292242a, str);
        } else {
            if (z) {
                textClause = new TextLocalisedClause(R$string.account_switcher_onboarding_tile_accessory_title, zhm.u.c(new TextClause(sVar.f292242a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
            } else {
                m70.a.c(t0.f186434a);
                textClause = new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            }
            oVar = new o(new ProductAccountValue.Text(6, textClause, (TextLocalisedClause) null), null, str);
        }
        ProductAccountId productAccountIdA = com.revolut.feature.credit.models.a.a(cVar.f14163a, eVar.a());
        AccountListItemModel accountListItemModelC = c(cVar);
        ProductAccountMetadata productAccountMetadata = new ProductAccountMetadata(null, true);
        String str2 = oVar.f139901b;
        TextLocalisedClause textLocalisedClause = str2 != null ? new TextLocalisedClause(R$string.application_dashboard_title, zhm.u.c(new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12) : null;
        String str3 = oVar.f139902c;
        return new ProductAccount.ValueItem.Main(productAccountIdA, oVar.f139900a, accountListItemModelC, new AccountWidgetItemModel(new AccountWidgetItemActionsMode.SingleAction(new ProductAccountWidgetAction(300, null, new TextLocalisedClause(R$string.application_dashboard_action_title, zhm.u.c(new TextClause(sVar.f292244c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), null, new ResumeCreditApplication(eVar.a()), "action.resume", null, null, false, true)), textLocalisedClause, str3 != null ? new ProductAccountSubtitle.Text(new TextLocalisedClause(R$string.application_dashboard_subtitle, zhm.u.c(new TextClause(str3, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), null) : null), productAccountMetadata, (AccountListItemModel) null, false, true, 352);
    }
}

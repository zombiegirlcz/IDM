package xnb;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.retail.savings.api.R$string;
import com.revolut.feature.shared.savings.models.product.OnboardingConfig;
import com.revolut.feature.shared.savings.models.product.SavingsProduct;
import com.revolut.feature.shared.savings.models.product.SavingsProductData;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes6.dex */
public final class q implements a {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ijb.a f307362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dcd.b f307363b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ou5.b f307364c;
    public final ang.f d;

    public q(ijb.a savingsProductInteractor, dcd.b savingsInterestRateFormatter, ou5.b juniorProfilesDataInteractor, ang.f userInteractor) {
        Intrinsics.checkNotNullParameter(savingsProductInteractor, "savingsProductInteractor");
        Intrinsics.checkNotNullParameter(savingsInterestRateFormatter, "savingsInterestRateFormatter");
        Intrinsics.checkNotNullParameter(juniorProfilesDataInteractor, "juniorProfilesDataInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        this.f307362a = savingsProductInteractor;
        this.f307363b = savingsInterestRateFormatter;
        this.f307364c = juniorProfilesDataInteractor;
        this.d = userInteractor;
    }

    public static final List a(q qVar, SavingsProductData savingsProductData, wi0.b bVar) {
        qVar.getClass();
        c cVar = c.IAS;
        qv0.i[] elements = {qVar.c(cVar, savingsProductData == null ? f0.f322471a : u.c(savingsProductData), bVar), b(cVar, savingsProductData == null ? f0.f322471a : u.c(savingsProductData)), d(cVar, null)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        yp0.b.k(listL, 0, 0, 0, 0, 31);
        return listL;
    }

    public static RowDelegate.Model b(c cVar, List list) {
        Pair pair;
        Pair pair2;
        Object next;
        int i = d.f307343a[cVar.ordinal()];
        if (i == 1) {
            pair = new Pair(new TextLocalisedClause(R$string.savings_home_discover_cells_access_ias_title, null, null, 14), new TextLocalisedClause(R$string.savings_home_discover_cells_access_ias_subtitle, null, null, 14));
        } else {
            if (i != 2) {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                Iterator it8 = list.iterator();
                while (true) {
                    if (!it8.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it8.next();
                    if (vc.o.m((SavingsProductData) next)) {
                        break;
                    }
                }
                SavingsProductData savingsProductData = (SavingsProductData) next;
                pair2 = new Pair(savingsProductData != null ? new TextClause(savingsProductData.f86683a.f86627q, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : new TextLocalisedClause(oc.c.r(uib.c.FLEXIBLE_ACCOUNTS), null, null, 14), new TextLocalisedClause(R$string.savings_home_discover_cells_access_multitype_subtitle, null, null, 14));
                return new RowDelegate.Model("ACCESS_ITEM", new RowDelegate.Model.MainImage.Image40(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D135", null, null, null, 30), null, null, false, null, false, 62), (Clause) pair2.f186385a, null, 0, (TextLocalisedClause) pair2.f186386b, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824);
            }
            pair = new Pair(new TextLocalisedClause(R$string.savings_home_discover_cells_access_mmf_title, null, null, 14), new TextLocalisedClause(R$string.savings_home_discover_cells_access_mmf_subtitle, null, null, 14));
        }
        pair2 = pair;
        return new RowDelegate.Model("ACCESS_ITEM", new RowDelegate.Model.MainImage.Image40(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D135", null, null, null, 30), null, null, false, null, false, 62), (Clause) pair2.f186385a, null, 0, (TextLocalisedClause) pair2.f186386b, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824);
    }

    public static RowDelegate.Model d(c cVar, OnboardingConfig onboardingConfig) {
        Pair pair;
        Pair pair2;
        OnboardingConfig.DiscoverItems discoverItems;
        OnboardingConfig.DiscoverItems.Protection protection;
        if (onboardingConfig == null || (discoverItems = onboardingConfig.f86515c) == null || (protection = discoverItems.f86516a) == null) {
            int i = d.f307343a[cVar.ordinal()];
            if (i == 1) {
                pair = new Pair(new TextLocalisedClause(R$string.savings_home_discover_cells_protection_ias_title, null, null, 14), new TextLocalisedClause(R$string.savings_home_discover_cells_protection_ias_subtitle, null, null, 14));
            } else if (i == 2) {
                pair = new Pair(new TextLocalisedClause(R$string.savings_home_discover_cells_protection_mmf_title, null, null, 14), new TextLocalisedClause(R$string.savings_home_discover_cells_protection_mmf_subtitle, null, null, 14));
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                pair = new Pair(new TextLocalisedClause(R$string.savings_home_discover_cells_protection_multitypes_title, null, null, 14), new TextLocalisedClause(R$string.savings_home_discover_cells_protection_multitypes_subtitle, null, null, 14));
            }
            pair2 = pair;
        } else {
            pair2 = new Pair(new TextClause(protection.f86517a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause(protection.f86518b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
        }
        return new RowDelegate.Model("PROTECTION_ITEM", new RowDelegate.Model.MainImage.Image40(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D054", null, null, null, 30), null, null, false, null, false, 62), (Clause) pair2.f186385a, null, 0, (Clause) pair2.f186386b, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00eb A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.revolut.core.ui_kit.delegates.RowDelegate.Model c(xnb.c r36, java.util.List r37, wi0.b r38) {
        /*
            Method dump skipped, instruction units count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xnb.q.c(xnb.c, java.util.List, wi0.b):com.revolut.core.ui_kit.delegates.RowDelegate$Model");
    }

    public final TextLocalisedClause e(SavingsProductData savingsProductData, wi0.b bVar) {
        int i;
        SavingsProduct savingsProduct = savingsProductData.f86683a;
        wi0.b.Companion.getClass();
        wi0.b bVar2 = wi0.b.f297771r;
        if (Intrinsics.f(bVar, bVar2) && savingsProduct.f86628r == ncd.h.PERSONAL) {
            return new TextLocalisedClause(R$string.savings_home_discover_subtitle_ias, null, null, 14);
        }
        if (Intrinsics.f(bVar, bVar2) && savingsProduct.f86628r == ncd.h.PERSONAL_JOINT) {
            return new TextLocalisedClause(R$string.savings_home_discover_subtitle_ias_joint, null, null, 14);
        }
        if (Intrinsics.f(bVar, bVar2) && savingsProduct.f86628r == ncd.h.YOUTH) {
            return new TextLocalisedClause(R$string.savings_home_discover_subtitle_ias, null, null, 14);
        }
        int i2 = d.f307344b[savingsProduct.f86628r.ordinal()];
        if (i2 == 1 || i2 == 2) {
            i = opg.a.f(savingsProductData) ? R$string.savings_home_discover_cells_rates_ias_daily_title : R$string.savings_home_discover_cells_rates_ias_monthly_title;
        } else {
            if (i2 != 3 && i2 != 4 && i2 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            i = opg.a.f(savingsProductData) ? R$string.savings_home_discover_cells_rates_title_daily : R$string.savings_home_discover_cells_rates_title_monthly;
        }
        return new TextLocalisedClause(i, u.c(pbd.a.b(this.f307363b, savingsProductData)), null, 12);
    }

    public final Flow f() {
        return vkm.q.q(nim.a.v(this.d.j(w4l.j.f294644c), new xlj.h(9)));
    }
}

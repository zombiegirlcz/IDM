package end;

import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.CurrencyImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.spending_analytics.api.R$string;
import com.revolut.feature.spending_analytics.api.models.income_sorter.IncomeSorterDestinationInfo;
import com.revolut.shared.feature.wealth.ui_kit.models.image.InstrumentImage;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes7.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nmc.d f127815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gte.a f127816b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ufl.b f127817c;

    public f(nmc.d roboPortfolioUiMapper, gte.a featureToggleInteractor, ufl.b wealthHoldingsClauseFactory) {
        Intrinsics.checkNotNullParameter(roboPortfolioUiMapper, "roboPortfolioUiMapper");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(wealthHoldingsClauseFactory, "wealthHoldingsClauseFactory");
        this.f127815a = roboPortfolioUiMapper;
        this.f127816b = featureToggleInteractor;
        this.f127817c = wealthHoldingsClauseFactory;
    }

    public static Image a(IncomeSorterDestinationInfo.Investment investment) {
        if (investment instanceof IncomeSorterDestinationInfo.Investment.CashHolding) {
            return new CurrencyImage(((IncomeSorterDestinationInfo.Investment.CashHolding) investment).f87465a.f306286a, (ImageTransformations) null, (TextLocalisedClause) null, 14);
        }
        if (investment instanceof IncomeSorterDestinationInfo.Investment.Instrument) {
            return new InstrumentImage(((IncomeSorterDestinationInfo.Investment.Instrument) investment).f87470a, 24, Integer.valueOf(R$drawable.uikit_icn_circle_background), Integer.valueOf(R$attr.uikit_colorGrey10));
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.revolut.core.ui_kit.models.TextLocalisedClause b(java.util.List r4) {
        /*
            r0 = 0
            if (r4 == 0) goto L29
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Iterator r4 = r4.iterator()
        L9:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L1f
            java.lang.Object r1 = r4.next()
            r2 = r1
            com.revolut.feature.spending_analytics.api.models.income_sorter.IncomeSorterDestinationInfo$Investment r2 = (com.revolut.feature.spending_analytics.api.models.income_sorter.IncomeSorterDestinationInfo.Investment) r2
            com.revolut.feature.spending_analytics.api.models.income_sorter.a r2 = r2.getK()
            com.revolut.feature.spending_analytics.api.models.income_sorter.a r3 = com.revolut.feature.spending_analytics.api.models.income_sorter.a.GIA
            if (r2 != r3) goto L9
            goto L20
        L1f:
            r1 = r0
        L20:
            com.revolut.feature.spending_analytics.api.models.income_sorter.IncomeSorterDestinationInfo$Investment r1 = (com.revolut.feature.spending_analytics.api.models.income_sorter.IncomeSorterDestinationInfo.Investment) r1
            if (r1 == 0) goto L29
            hel.b r4 = r1.getF87476l()
            goto L2a
        L29:
            r4 = r0
        L2a:
            if (r4 != 0) goto L2e
            r4 = -1
            goto L36
        L2e:
            int[] r1 = end.e.f127814b
            int r4 = r4.ordinal()
            r4 = r1[r4]
        L36:
            switch(r4) {
                case -1: goto L45;
                case 0: goto L39;
                case 1: goto L42;
                case 2: goto L3f;
                case 3: goto L45;
                case 4: goto L45;
                case 5: goto L45;
                case 6: goto L45;
                case 7: goto L45;
                default: goto L39;
            }
        L39:
            kotlin.NoWhenBranchMatchedException r4 = new kotlin.NoWhenBranchMatchedException
            r4.<init>()
            throw r4
        L3f:
            int r4 = com.revolut.feature.spending_analytics.api.R$string.analytics_income_sorter_home_distribute_invest_gia_uk
            goto L47
        L42:
            int r4 = com.revolut.feature.spending_analytics.api.R$string.analytics_income_sorter_home_distribute_invest_stocks
            goto L47
        L45:
            int r4 = com.revolut.feature.spending_analytics.api.R$string.analytics_income_sorter_home_distribute_invest_gia
        L47:
            com.revolut.core.ui_kit.models.TextLocalisedClause r1 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            r2 = 14
            r1.<init>(r4, r0, r0, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: end.f.b(java.util.List):com.revolut.core.ui_kit.models.TextLocalisedClause");
    }

    public static TextLocalisedClause c(com.revolut.feature.spending_analytics.api.models.income_sorter.a investmentType, List list, String str) {
        Object next;
        String f87478n;
        Intrinsics.checkNotNullParameter(investmentType, "investmentType");
        int i = e.f127813a[investmentType.ordinal()];
        if (i == 1) {
            return b(list);
        }
        if (i == 2) {
            return new TextLocalisedClause(R$string.analytics_income_sorter_destinations_isa_title, null, null, 14);
        }
        if (i == 3) {
            return new TextLocalisedClause(R$string.analytics_income_sorter_destinations_personal_jisa_title, null, null, 14);
        }
        if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        if (list != null) {
            Iterator it8 = list.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    next = null;
                    break;
                }
                next = it8.next();
                if (Intrinsics.f(((IncomeSorterDestinationInfo.Investment) next).getF87475j(), str)) {
                    break;
                }
            }
            IncomeSorterDestinationInfo.Investment investment = (IncomeSorterDestinationInfo.Investment) next;
            if (investment != null && (f87478n = investment.getF87478n()) != null) {
                return new TextLocalisedClause(R$string.analytics_income_sorter_destinations_custodian_jisa_title, u.c(f87478n), null, 12);
            }
        }
        return new TextLocalisedClause(R$string.analytics_income_sorter_destinations_jisa_title, null, null, 14);
    }

    public static MoneyClause d(dj0.d dVar, dj0.d dVar2, zld.a aVar) {
        if (Intrinsics.f(dVar2.f115083b, dVar.f115083b)) {
            return null;
        }
        return new MoneyClause(dVar2, new MoneyClause.Format.Defaults(null, null, false, false, 15), aVar == zld.a.PENDING ? new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254) : null, null, 8);
    }
}

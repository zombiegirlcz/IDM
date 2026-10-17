package tyg;

import com.revolut.feature.wealth.analytics.WealthAnalyticsApi$Toggles;
import com.revolut.feature.wealth.analytics.widgetised.navigation.WidgetisedAnalyticsType;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;
import zhm.f0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f275581a;

    public j(gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f275581a = featureToggleInteractor;
    }

    public final List a(WidgetisedAnalyticsType analyticsType) {
        Intrinsics.checkNotNullParameter(analyticsType, "analyticsType");
        if ((analyticsType instanceof WidgetisedAnalyticsType.Isa) || (analyticsType instanceof WidgetisedAnalyticsType.Pea) || (analyticsType instanceof WidgetisedAnalyticsType.Jisa) || (analyticsType instanceof WidgetisedAnalyticsType.Commodities) || (analyticsType instanceof WidgetisedAnalyticsType.Crypto)) {
            return u.c(vyg.a.ASSET);
        }
        if (analyticsType instanceof WidgetisedAnalyticsType.Robo) {
            return f0.f322471a;
        }
        if ((analyticsType instanceof WidgetisedAnalyticsType.Brokerage) || (analyticsType instanceof WidgetisedAnalyticsType.JointBrokerage)) {
            return v.k(vyg.a.ASSET, vyg.a.SECTOR);
        }
        if ((analyticsType instanceof WidgetisedAnalyticsType.AllInvestAccounts) || (analyticsType instanceof WidgetisedAnalyticsType.AllInvestments)) {
            return v.k(vyg.a.ASSET, vyg.a.PRODUCT, vyg.a.SECTOR);
        }
        if (analyticsType instanceof WidgetisedAnalyticsType.Cfd) {
            return v.k(vyg.a.ASSET, vyg.a.POSITIONS);
        }
        throw new NoWhenBranchMatchedException();
    }

    public final List b(WidgetisedAnalyticsType analyticsType) {
        Intrinsics.checkNotNullParameter(analyticsType, "analyticsType");
        if ((analyticsType instanceof WidgetisedAnalyticsType.Crypto) || (analyticsType instanceof WidgetisedAnalyticsType.Brokerage) || (analyticsType instanceof WidgetisedAnalyticsType.JointBrokerage) || (analyticsType instanceof WidgetisedAnalyticsType.Isa) || (analyticsType instanceof WidgetisedAnalyticsType.Jisa) || (analyticsType instanceof WidgetisedAnalyticsType.Pea) || (analyticsType instanceof WidgetisedAnalyticsType.Commodities) || (analyticsType instanceof WidgetisedAnalyticsType.Robo) || (analyticsType instanceof WidgetisedAnalyticsType.Cfd)) {
            throw new IllegalStateException(analyticsType + " is not a combined product");
        }
        if (!(analyticsType instanceof WidgetisedAnalyticsType.AllInvestAccounts)) {
            if (!(analyticsType instanceof WidgetisedAnalyticsType.AllInvestments)) {
                throw new NoWhenBranchMatchedException();
            }
            return d0.F0(iwg.a.CRYPTO, b(WidgetisedAnalyticsType.AllInvestAccounts.f95142a));
        }
        iwg.a aVar = iwg.a.ROBO;
        iwg.a aVar2 = iwg.a.SECURITY;
        iwg.a aVar3 = iwg.a.COMMODITY;
        iwg.a aVar4 = iwg.a.CFD;
        if (!((jte.d) this.f275581a).c(WealthAnalyticsApi$Toggles.CfdsAnalytics.f94966c)) {
            aVar4 = null;
        }
        iwg.a[] elements = {aVar, aVar2, aVar3, aVar4};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return kotlin.collections.d.L(elements);
    }

    public final iwg.a c(WidgetisedAnalyticsType analyticsType) {
        Intrinsics.checkNotNullParameter(analyticsType, "analyticsType");
        if (analyticsType instanceof WidgetisedAnalyticsType.Crypto) {
            return iwg.a.CRYPTO;
        }
        if ((analyticsType instanceof WidgetisedAnalyticsType.Brokerage) || (analyticsType instanceof WidgetisedAnalyticsType.JointBrokerage)) {
            return iwg.a.SECURITY;
        }
        if (analyticsType instanceof WidgetisedAnalyticsType.Isa) {
            return iwg.a.ISA;
        }
        if (analyticsType instanceof WidgetisedAnalyticsType.Jisa) {
            return iwg.a.JISA;
        }
        if (analyticsType instanceof WidgetisedAnalyticsType.Pea) {
            return iwg.a.PEA;
        }
        if (analyticsType instanceof WidgetisedAnalyticsType.Commodities) {
            return iwg.a.COMMODITY;
        }
        if (analyticsType instanceof WidgetisedAnalyticsType.Robo) {
            return iwg.a.ROBO;
        }
        if (analyticsType instanceof WidgetisedAnalyticsType.Cfd) {
            return iwg.a.CFD;
        }
        if (!(analyticsType instanceof WidgetisedAnalyticsType.AllInvestAccounts) && !(analyticsType instanceof WidgetisedAnalyticsType.AllInvestments)) {
            throw new NoWhenBranchMatchedException();
        }
        throw new IllegalStateException(analyticsType + " has more than one product");
    }

    public final iwg.b d(WidgetisedAnalyticsType analyticsType) {
        Intrinsics.checkNotNullParameter(analyticsType, "analyticsType");
        boolean z = analyticsType instanceof WidgetisedAnalyticsType.Crypto;
        gte.a aVar = this.f275581a;
        if (z) {
            iwg.c cVar = iwg.c.TIME_WEIGHTED;
            iwg.c cVar2 = iwg.c.MONEY_WEIGHTED;
            jte.d dVar = (jte.d) aVar;
            if (!dVar.c(WealthAnalyticsApi$Toggles.MoneyWeightedPerformance.f94968c)) {
                cVar2 = null;
            }
            iwg.c[] elements = {cVar, cVar2, dVar.c(WealthAnalyticsApi$Toggles.SimpleReturnCalculation.f94970c) ? iwg.c.SIMPLE : null};
            Intrinsics.checkNotNullParameter(elements, "elements");
            return new iwg.b(kotlin.collections.d.L(elements), cVar);
        }
        if ((analyticsType instanceof WidgetisedAnalyticsType.Brokerage) || (analyticsType instanceof WidgetisedAnalyticsType.JointBrokerage) || (analyticsType instanceof WidgetisedAnalyticsType.Isa) || (analyticsType instanceof WidgetisedAnalyticsType.Jisa) || (analyticsType instanceof WidgetisedAnalyticsType.Pea) || (analyticsType instanceof WidgetisedAnalyticsType.Commodities) || (analyticsType instanceof WidgetisedAnalyticsType.Cfd)) {
            iwg.c cVar3 = iwg.c.TIME_WEIGHTED;
            iwg.c[] elements2 = {cVar3, iwg.c.MONEY_WEIGHTED, ((jte.d) aVar).c(WealthAnalyticsApi$Toggles.SimpleReturnCalculation.f94970c) ? iwg.c.SIMPLE : null};
            Intrinsics.checkNotNullParameter(elements2, "elements");
            return new iwg.b(kotlin.collections.d.L(elements2), cVar3);
        }
        if (analyticsType instanceof WidgetisedAnalyticsType.Robo) {
            return new iwg.b(f0.f322471a, iwg.c.TIME_WEIGHTED);
        }
        if (!(analyticsType instanceof WidgetisedAnalyticsType.AllInvestments) && !(analyticsType instanceof WidgetisedAnalyticsType.AllInvestAccounts)) {
            throw new NoWhenBranchMatchedException();
        }
        if (((jte.d) aVar).c(WealthAnalyticsApi$Toggles.MoneyWeightedCombinedPerformance.f94967c)) {
            iwg.c cVar4 = iwg.c.TIME_WEIGHTED;
            return new iwg.b(v.k(cVar4, iwg.c.MONEY_WEIGHTED), cVar4);
        }
        iwg.c cVar5 = iwg.c.TIME_WEIGHTED;
        return new iwg.b(u.c(cVar5), cVar5);
    }

    public final List e(WidgetisedAnalyticsType analyticsType) {
        Intrinsics.checkNotNullParameter(analyticsType, "analyticsType");
        if ((analyticsType instanceof WidgetisedAnalyticsType.AllInvestments) || (analyticsType instanceof WidgetisedAnalyticsType.AllInvestAccounts) || (analyticsType instanceof WidgetisedAnalyticsType.Crypto) || (analyticsType instanceof WidgetisedAnalyticsType.Brokerage) || (analyticsType instanceof WidgetisedAnalyticsType.JointBrokerage) || (analyticsType instanceof WidgetisedAnalyticsType.Isa) || (analyticsType instanceof WidgetisedAnalyticsType.Jisa) || (analyticsType instanceof WidgetisedAnalyticsType.Pea) || (analyticsType instanceof WidgetisedAnalyticsType.Commodities)) {
            return u.c(fzg.f.BY_ASSET);
        }
        if (analyticsType instanceof WidgetisedAnalyticsType.Cfd) {
            return v.k(fzg.f.BY_ASSET, fzg.f.BY_POSITIONS);
        }
        if (analyticsType instanceof WidgetisedAnalyticsType.Robo) {
            return f0.f322471a;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final boolean f(WidgetisedAnalyticsType analyticsType) {
        Intrinsics.checkNotNullParameter(analyticsType, "analyticsType");
        if (analyticsType instanceof WidgetisedAnalyticsType.Robo) {
            return false;
        }
        if ((analyticsType instanceof WidgetisedAnalyticsType.Crypto) || (analyticsType instanceof WidgetisedAnalyticsType.Brokerage) || (analyticsType instanceof WidgetisedAnalyticsType.JointBrokerage) || (analyticsType instanceof WidgetisedAnalyticsType.Isa) || (analyticsType instanceof WidgetisedAnalyticsType.Jisa) || (analyticsType instanceof WidgetisedAnalyticsType.Pea) || (analyticsType instanceof WidgetisedAnalyticsType.Commodities) || (analyticsType instanceof WidgetisedAnalyticsType.Cfd) || (analyticsType instanceof WidgetisedAnalyticsType.AllInvestments) || (analyticsType instanceof WidgetisedAnalyticsType.AllInvestAccounts)) {
            return true;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final boolean g(WidgetisedAnalyticsType analyticsType) {
        Intrinsics.checkNotNullParameter(analyticsType, "analyticsType");
        if ((analyticsType instanceof WidgetisedAnalyticsType.Crypto) || (analyticsType instanceof WidgetisedAnalyticsType.Brokerage) || (analyticsType instanceof WidgetisedAnalyticsType.JointBrokerage) || (analyticsType instanceof WidgetisedAnalyticsType.Isa) || (analyticsType instanceof WidgetisedAnalyticsType.Jisa) || (analyticsType instanceof WidgetisedAnalyticsType.Pea) || (analyticsType instanceof WidgetisedAnalyticsType.Commodities) || (analyticsType instanceof WidgetisedAnalyticsType.Cfd) || (analyticsType instanceof WidgetisedAnalyticsType.Robo)) {
            return false;
        }
        if ((analyticsType instanceof WidgetisedAnalyticsType.AllInvestAccounts) || (analyticsType instanceof WidgetisedAnalyticsType.AllInvestments)) {
            return true;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final boolean h(WidgetisedAnalyticsType analyticsType) {
        Intrinsics.checkNotNullParameter(analyticsType, "analyticsType");
        if ((analyticsType instanceof WidgetisedAnalyticsType.Crypto) || (analyticsType instanceof WidgetisedAnalyticsType.Brokerage) || (analyticsType instanceof WidgetisedAnalyticsType.JointBrokerage) || (analyticsType instanceof WidgetisedAnalyticsType.Isa) || (analyticsType instanceof WidgetisedAnalyticsType.Jisa) || (analyticsType instanceof WidgetisedAnalyticsType.Pea) || (analyticsType instanceof WidgetisedAnalyticsType.Commodities) || (analyticsType instanceof WidgetisedAnalyticsType.Cfd) || (analyticsType instanceof WidgetisedAnalyticsType.AllInvestments) || (analyticsType instanceof WidgetisedAnalyticsType.AllInvestAccounts)) {
            return true;
        }
        if (analyticsType instanceof WidgetisedAnalyticsType.Robo) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }
}

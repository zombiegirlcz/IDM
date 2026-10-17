package end;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.DotDividerClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.CurrencyImage;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.spending_analytics.api.R$string;
import com.revolut.feature.spending_analytics.api.models.income_sorter.IncomeSorterDestinationInfo;
import com.revolut.feature.subaccount.api.models.Subaccount;
import com.revolut.feature.wealth.models.robo.RoboPortfolioInfo;
import com.revolut.feature.wealth.ui.api.WealthUiApi$Toggles;
import hx7.q;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import m3j.l;
import n61.j;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
public final class d implements dmd.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dcd.b f127810a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f127811b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final nmc.d f127812c;
    public final dl3.f d;
    public final l e;
    public final f f;

    public d(dcd.b savingsInterestRateFormatter, g pocketDescriptionMapper, nmc.d roboPortfolioUiMapper, dl3.f contactsMapper, l beneficiaryDetailsViewMapper, f investmentsDestinationUiMapper) {
        Intrinsics.checkNotNullParameter(savingsInterestRateFormatter, "savingsInterestRateFormatter");
        Intrinsics.checkNotNullParameter(pocketDescriptionMapper, "pocketDescriptionMapper");
        Intrinsics.checkNotNullParameter(roboPortfolioUiMapper, "roboPortfolioUiMapper");
        Intrinsics.checkNotNullParameter(contactsMapper, "contactsMapper");
        Intrinsics.checkNotNullParameter(beneficiaryDetailsViewMapper, "beneficiaryDetailsViewMapper");
        Intrinsics.checkNotNullParameter(investmentsDestinationUiMapper, "investmentsDestinationUiMapper");
        this.f127810a = savingsInterestRateFormatter;
        this.f127811b = pocketDescriptionMapper;
        this.f127812c = roboPortfolioUiMapper;
        this.d = contactsMapper;
        this.e = beneficiaryDetailsViewMapper;
        this.f = investmentsDestinationUiMapper;
    }

    public static CompositeClause d(Clause clause) {
        return new CompositeClause(v.k(new TextLocalisedClause(R$string.analytics_income_sorter_home_distribute_joint, null, null, 14), clause), new DotDividerClause((Integer) null), null, null, 12);
    }

    public final Image b(IncomeSorterDestinationInfo destinationInfo) {
        Intrinsics.checkNotNullParameter(destinationInfo, "destinationInfo");
        if (destinationInfo instanceof IncomeSorterDestinationInfo.JointPocket) {
            return new CurrencyImage(((IncomeSorterDestinationInfo.JointPocket) destinationInfo).f87479a.f163147c, (ImageTransformations) null, (TextLocalisedClause) null, 14);
        }
        if (destinationInfo instanceof IncomeSorterDestinationInfo.SubaccountPocket) {
            return ((IncomeSorterDestinationInfo.SubaccountPocket) destinationInfo).f87493b;
        }
        if (destinationInfo instanceof IncomeSorterDestinationInfo.Savings) {
            return ((IncomeSorterDestinationInfo.Savings) destinationInfo).f87489a.f86461b;
        }
        if (destinationInfo instanceof IncomeSorterDestinationInfo.RoboPortfolio) {
            return LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_invest, R$attr.uikit_colorWhite, R$attr.uikit_colorLightBlue);
        }
        if (destinationInfo instanceof IncomeSorterDestinationInfo.Investment) {
            IncomeSorterDestinationInfo.Investment investment = (IncomeSorterDestinationInfo.Investment) destinationInfo;
            Intrinsics.checkNotNullParameter(investment, "investment");
            return f.a(investment);
        }
        if (destinationInfo instanceof IncomeSorterDestinationInfo.PersonalCurrencyPocket) {
            return new CurrencyImage(((IncomeSorterDestinationInfo.PersonalCurrencyPocket) destinationInfo).f87484a.f163147c, (ImageTransformations) null, (TextLocalisedClause) null, 14);
        }
        if (destinationInfo instanceof IncomeSorterDestinationInfo.PeerToPeerTransfer) {
            return ((xl3.d) this.d).h(((IncomeSorterDestinationInfo.PeerToPeerTransfer) destinationInfo).f87481a);
        }
        if (destinationInfo instanceof IncomeSorterDestinationInfo.BankTransfer) {
            return this.e.a(((IncomeSorterDestinationInfo.BankTransfer) destinationInfo).f87456a);
        }
        if (destinationInfo instanceof IncomeSorterDestinationInfo.Crypto) {
            return new CurrencyImage(((IncomeSorterDestinationInfo.Crypto) destinationInfo).getF87462a().f306286a, (ImageTransformations) null, (TextLocalisedClause) null, 14);
        }
        throw new NoWhenBranchMatchedException();
    }

    public final Clause c(IncomeSorterDestinationInfo destinationInfo, dmd.d jointStyle, dmd.c investmentStyle) {
        int i;
        CurrencyClause.Format.Ticker ticker;
        TextClause textClause;
        f fVar = this.f;
        gte.a aVar = fVar.f127816b;
        Intrinsics.checkNotNullParameter(destinationInfo, "destinationInfo");
        Intrinsics.checkNotNullParameter(jointStyle, "jointStyle");
        Intrinsics.checkNotNullParameter(investmentStyle, "investmentStyle");
        if (destinationInfo instanceof IncomeSorterDestinationInfo.JointPocket) {
            int i2 = c.f127809a[jointStyle.ordinal()];
            if (i2 == 1) {
                xi0.a aVar2 = xi0.b.Companion;
                String str = ((IncomeSorterDestinationInfo.JointPocket) destinationInfo).f87479a.f163147c;
                aVar2.getClass();
                return new CurrencyClause(xi0.a.a(str), null, null, 6);
            }
            if (i2 == 2) {
                return new TextLocalisedClause(R$string.analytics_income_sorter_home_distribute_joint, null, null, 14);
            }
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            xi0.a aVar3 = xi0.b.Companion;
            String str2 = ((IncomeSorterDestinationInfo.JointPocket) destinationInfo).f87479a.f163147c;
            aVar3.getClass();
            return d(new CurrencyClause(xi0.a.a(str2), null, null, 6));
        }
        if (destinationInfo instanceof IncomeSorterDestinationInfo.SubaccountPocket) {
            IncomeSorterDestinationInfo.SubaccountPocket subaccountPocket = (IncomeSorterDestinationInfo.SubaccountPocket) destinationInfo;
            Subaccount subaccount = subaccountPocket.f87492a;
            TextClause textClause2 = new TextClause(subaccount.getName(), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            if (jointStyle == dmd.d.ACCOUNT_WITH_CURRENCY) {
                Intrinsics.checkNotNullParameter(subaccountPocket, "<this>");
                if (subaccount instanceof Subaccount.Joint) {
                    return d(textClause2);
                }
            }
            return textClause2;
        }
        if (destinationInfo instanceof IncomeSorterDestinationInfo.Savings) {
            IncomeSorterDestinationInfo.Savings savings = (IncomeSorterDestinationInfo.Savings) destinationInfo;
            TextClause textClause3 = new TextClause(savings.f87489a.f86460a.f234885h.f234859a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            return (jointStyle == dmd.d.ACCOUNT_WITH_CURRENCY && tpd.a.b(savings)) ? d(textClause3) : textClause3;
        }
        if (destinationInfo instanceof IncomeSorterDestinationInfo.RoboPortfolio) {
            IncomeSorterDestinationInfo.RoboPortfolio roboPortfolio = (IncomeSorterDestinationInfo.RoboPortfolio) destinationInfo;
            RoboPortfolioInfo roboPortfolioInfo = roboPortfolio.f87486a;
            nmc.d dVar = fVar.f127815a;
            Intrinsics.checkNotNullParameter(roboPortfolio, "roboPortfolio");
            Intrinsics.checkNotNullParameter(investmentStyle, "investmentStyle");
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(((jte.d) aVar).c(WealthUiApi$Toggles.RoboStrategies.f95863c) ? R$string.analytics_income_sorter_home_distribute_invest_strategies : R$string.analytics_income_sorter_home_distribute_invest_robo, null, null, 14);
            return !((jte.d) aVar).c(WealthUiApi$Toggles.InvestIncomeSorterV2.f95859c) ? textLocalisedClause : investmentStyle == dmd.c.WITHOUT_ACCOUNT ? dVar.c(roboPortfolioInfo) : v1.c.f(v.k(textLocalisedClause, dVar.c(roboPortfolioInfo)), null);
        }
        if (!(destinationInfo instanceof IncomeSorterDestinationInfo.Investment)) {
            if (destinationInfo instanceof IncomeSorterDestinationInfo.PersonalCurrencyPocket) {
                xi0.a aVar4 = xi0.b.Companion;
                String str3 = ((IncomeSorterDestinationInfo.PersonalCurrencyPocket) destinationInfo).f87484a.f163147c;
                aVar4.getClass();
                return new CurrencyClause(xi0.a.a(str3), null, null, 6);
            }
            if (destinationInfo instanceof IncomeSorterDestinationInfo.PeerToPeerTransfer) {
                return new TextClause(q.v(((IncomeSorterDestinationInfo.PeerToPeerTransfer) destinationInfo).f87481a), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            }
            if (destinationInfo instanceof IncomeSorterDestinationInfo.BankTransfer) {
                return new TextClause(j.c(((IncomeSorterDestinationInfo.BankTransfer) destinationInfo).f87456a), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            }
            if (destinationInfo instanceof IncomeSorterDestinationInfo.Crypto) {
                return new CurrencyClause(((IncomeSorterDestinationInfo.Crypto) destinationInfo).getF87462a(), null, null, 6);
            }
            throw new NoWhenBranchMatchedException();
        }
        IncomeSorterDestinationInfo.Investment investment = (IncomeSorterDestinationInfo.Investment) destinationInfo;
        Intrinsics.checkNotNullParameter(investment, "investment");
        Intrinsics.checkNotNullParameter(investmentStyle, "investmentStyle");
        if (!(investment instanceof IncomeSorterDestinationInfo.Investment.CashHolding)) {
            if (investment instanceof IncomeSorterDestinationInfo.Investment.Instrument) {
                return new TextClause(((IncomeSorterDestinationInfo.Investment.Instrument) investment).f87471b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            }
            throw new NoWhenBranchMatchedException();
        }
        IncomeSorterDestinationInfo.Investment.CashHolding cashHolding = (IncomeSorterDestinationInfo.Investment.CashHolding) investment;
        xi0.b bVar = cashHolding.f87465a;
        com.revolut.feature.spending_analytics.api.models.income_sorter.a aVar5 = cashHolding.f;
        String str4 = cashHolding.i;
        int[] iArr = e.f127813a;
        int i3 = iArr[aVar5.ordinal()];
        CurrencyClause.Format.Ticker ticker2 = CurrencyClause.Format.Ticker.f57756a;
        CurrencyClause.Format.DisplayName displayName = CurrencyClause.Format.DisplayName.f57755a;
        if (i3 == 1) {
            TextLocalisedClause textLocalisedClauseB = f.b(u.c(cashHolding));
            return !cashHolding.d ? textLocalisedClauseB : (((jte.d) aVar).c(WealthUiApi$Toggles.InvestIncomeSorterV2.f95859c) && investmentStyle == dmd.c.WITHOUT_ACCOUNT) ? new CurrencyClause(bVar, displayName, null, 4) : v1.c.f(v.k(textLocalisedClauseB, new CurrencyClause(bVar, ticker2, null, 4)), null);
        }
        if (i3 != 2 && i3 != 3 && i3 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        if (((jte.d) aVar).c(WealthUiApi$Toggles.InvestIncomeSorterV2.f95859c) && investmentStyle == dmd.c.WITHOUT_ACCOUNT) {
            return new CurrencyClause(bVar, displayName, null, 4);
        }
        int i5 = iArr[aVar5.ordinal()];
        if (i5 == 2) {
            i = R$string.wealth_invest_income_sorter_home_distribute_invest_isa;
        } else if (i5 == 3) {
            i = R$string.wealth_invest_income_sorter_home_distribute_invest_personal_jisa;
        } else {
            if (i5 != 4) {
                throw new IllegalStateException(("Unsupported investment type: " + aVar5).toString());
            }
            i = str4 != null ? R$string.wealth_invest_income_sorter_home_distribute_invest_custodian_jisa : R$string.wealth_invest_income_sorter_home_distribute_invest_personal_jisa;
        }
        if (aVar5 != com.revolut.feature.spending_analytics.api.models.income_sorter.a.CUSTODIAN_JISA || str4 == null) {
            ticker = ticker2;
            textClause = null;
        } else {
            ticker = ticker2;
            textClause = new TextClause(str4, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        }
        Object[] elements = {textClause, new CurrencyClause(bVar, ticker, null, 4)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return new TextLocalisedClause(i, kotlin.collections.d.L(elements), null, 12);
    }
}

package yoc;

import aw0.k7;
import aw0.o9;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.models.q0;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.CurrencyImage;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.PairedImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.robo.api.ui.providers.models.RoboTransaction;
import com.revolut.feature.wealth.models.robo.RoboPortfolioInfo;
import com.revolut.feature.wealth.ui.api.WealthUiApi$Toggles;
import com.revolut.retail.wealth.resources.R$string;
import com.youTransactor.uCube.rpc.Constants;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
public final class m {

    @NotNull
    public static final k Companion = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nmc.d f315651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gte.a f315652b;

    public m(nmc.d roboPortfolioUiMapper, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(roboPortfolioUiMapper, "roboPortfolioUiMapper");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f315651a = roboPortfolioUiMapper;
        this.f315652b = featureToggleInteractor;
    }

    public static LayeredImage a(int i, int i2) {
        LayeredImage.Companion companion = LayeredImage.INSTANCE;
        int i3 = R$attr.uikit_colorWidgetBackground;
        return LayeredImage.Companion.f(companion, i, i2, i3, Integer.valueOf(i3), 3.0f, BitmapDescriptorFactory.HUE_RED, null, 96);
    }

    public static CompositeClause h(TimeClause timeClause, int i) {
        return yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), v.k(timeClause, new ImageClause(i, Integer.valueOf(R$attr.uikit_colorGreyTone20), (Float) null, (Float) null, 28)));
    }

    public final Clause b(RoboPortfolioInfo roboPortfolioInfo) {
        boolean zC = ((jte.d) this.f315652b).c(WealthUiApi$Toggles.RoboStrategies.f95863c);
        nmc.d dVar = this.f315651a;
        return zC ? dVar.c(roboPortfolioInfo) : new TextLocalisedClause(R$string.wealth_robo_home_transactions_portfolio, u.c(dVar.c(roboPortfolioInfo)), null, 12);
    }

    public final Image c(RoboTransaction transaction, RoboPortfolioInfo portfolio) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        Intrinsics.checkNotNullParameter(portfolio, "portfolio");
        Image imageB = this.f315651a.b(portfolio);
        xi0.b bVar = portfolio.f;
        if (transaction instanceof RoboTransaction.Dividend) {
            return imageB;
        }
        if (transaction instanceof RoboTransaction.Fee) {
            return ((jte.d) this.f315652b).c(WealthUiApi$Toggles.RoboStrategies.f95863c) ? LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_fees, R$attr.uikit_colorWhite, R$attr.uikit_colorLightGreen) : imageB;
        }
        if ((transaction instanceof RoboTransaction.OneOffContribution) || (transaction instanceof RoboTransaction.RecurringDeposit)) {
            return new PairedImage(new CurrencyImage(bVar.f306286a, (ImageTransformations) null, (TextLocalisedClause) null, 14), imageB, R$attr.uikit_colorWidgetBackground, null);
        }
        if (transaction instanceof RoboTransaction.Withdrawal) {
            return new PairedImage(imageB, new CurrencyImage(bVar.f306286a, (ImageTransformations) null, (TextLocalisedClause) null, 14), R$attr.uikit_colorWidgetBackground, null);
        }
        if (transaction instanceof RoboTransaction.Refund) {
            return LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_fees, R$attr.uikit_colorWhite, R$attr.uikit_colorDeepGrey);
        }
        throw new NoWhenBranchMatchedException();
    }

    public final LayeredImage d(RoboTransaction transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        int i = l.f315650b[transaction.getF85078a().ordinal()];
        if (i == 1) {
            return null;
        }
        if (i == 2) {
            return a(R$drawable.uikit_icn_16_status_clock_arrows, R$attr.uikit_colorAccent);
        }
        if (i == 3) {
            return a(R$drawable.uikit_icn_16_cross_small, R$attr.uikit_colorRed);
        }
        if (i == 4) {
            return a(R$drawable.uikit_icn_16_canceled, R$attr.uikit_colorDeepGrey);
        }
        throw new NoWhenBranchMatchedException();
    }

    public final Clause e(RoboTransaction transaction, glc.k dateTimeFormat) {
        q0 q0Var;
        Clause clauseH;
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        Intrinsics.checkNotNullParameter(dateTimeFormat, "dateTimeFormat");
        long f85080c = transaction.getF85080c();
        int i = l.f315649a[dateTimeFormat.ordinal()];
        if (i == 1) {
            q0Var = q0.DATETIME;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            q0Var = q0.ONLY_TIME;
        }
        TimeClause timeClause = new TimeClause(f85080c, new TimeClause.Format.Pretty(q0Var), null, null, 12);
        if (transaction instanceof RoboTransaction.OneOffContribution) {
            RoboTransaction.OneOffContribution oneOffContribution = (RoboTransaction.OneOffContribution) transaction;
            if (oneOffContribution.e) {
                clauseH = h(timeClause, R$drawable.uikit_icn_20_spare_change);
            } else {
                clauseH = timeClause;
                if (oneOffContribution.f) {
                    clauseH = h(timeClause, R$drawable.uikit_icn_20_income_sorter);
                }
            }
        } else {
            clauseH = timeClause;
            if (!(transaction instanceof RoboTransaction.Withdrawal)) {
                clauseH = timeClause;
                if (!(transaction instanceof RoboTransaction.Refund)) {
                    clauseH = timeClause;
                    if (!(transaction instanceof RoboTransaction.Fee)) {
                        if (transaction instanceof RoboTransaction.Dividend) {
                            clauseH = h(timeClause, R$drawable.uikit_icn_20_dividend);
                        } else {
                            if (!(transaction instanceof RoboTransaction.RecurringDeposit)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            clauseH = h(timeClause, R$drawable.uikit_icn_20_reccuring);
                        }
                    }
                }
            }
        }
        return clauseH;
    }

    public final Clause f(RoboTransaction transaction, RoboPortfolioInfo portfolio) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        Intrinsics.checkNotNullParameter(portfolio, "portfolio");
        if (transaction instanceof RoboTransaction.Dividend) {
            return new TextLocalisedClause(R$string.wealth_robo_home_transactions_dividend_title, u.c(b(portfolio)), null, 12);
        }
        if (transaction instanceof RoboTransaction.Fee) {
            return new TextLocalisedClause(R$string.wealth_robo_home_transactions_fee_title, u.c(b(portfolio)), null, 12);
        }
        if ((transaction instanceof RoboTransaction.OneOffContribution) || (transaction instanceof RoboTransaction.RecurringDeposit)) {
            return new CompositeClause(v.k(new TextLocalisedClause(R$string.wealth_robo_home_transactions_transfer_title_main_account, null, null, 14), new TextClause(" → ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), b(portfolio)), null, null, null, 14);
        }
        if (transaction instanceof RoboTransaction.Withdrawal) {
            return new CompositeClause(v.k(b(portfolio), new TextClause(" → ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(R$string.wealth_robo_home_transactions_transfer_title_main_account, null, null, 14)), null, null, null, 14);
        }
        if (transaction instanceof RoboTransaction.Refund) {
            return new TextLocalisedClause(((jte.d) this.f315652b).c(WealthUiApi$Toggles.RoboStrategies.f95863c) ? R$string.wealth_strategies_home_transactions_refund_title : R$string.wealth_robo_home_transactions_refund_title, u.c(b(portfolio)), null, 12);
        }
        throw new NoWhenBranchMatchedException();
    }

    public final MoneyClause g(RoboTransaction transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        dj0.d f85079b = transaction.getF85079b();
        MoneyClause.Format.Defaults defaults = new MoneyClause.Format.Defaults(k7.ALWAYS, null, false, false, 14);
        Integer numValueOf = ((transaction instanceof RoboTransaction.Dividend) || (transaction instanceof RoboTransaction.OneOffContribution) || (transaction instanceof RoboTransaction.RecurringDeposit)) ? Integer.valueOf(R$attr.uikit_colorStatusSuccess) : null;
        ilc.c f85078a = transaction.getF85078a();
        return new MoneyClause(f85079b, defaults, new Custom(numValueOf, f85078a == ilc.c.FAILED || f85078a == ilc.c.CANCELLED, null, false, null, Constants.TAG_FC_SPEED_MODE), null, 8);
    }
}

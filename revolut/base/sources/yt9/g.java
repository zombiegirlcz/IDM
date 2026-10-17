package yt9;

import afa.s;
import al4.n;
import aw0.k7;
import aw0.o9;
import com.revolut.core.model.account.AccountId;
import com.revolut.core.model.money.ScaleMode;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.CurrencyImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.feature.payments.api.mapper.PaymentPocketInfo;
import com.revolut.feature.transfer.core.models.CountryProfile;
import com.revolut.feature.transfer.core.models.DeFiBalanceSource;
import com.revolut.feature.transfer.core.models.FundingSource;
import com.revolut.feature.transfer.core.models.PocketSource;
import com.revolut.feature.transfer.core.models.SavingsAccount;
import com.revolut.feature.transfer.core.models.WealthPortfolio;
import com.revolut.retail.feature.balance.picker.api.R$string;
import efm.r;
import io3.i;
import io3.l;
import java.util.List;
import je6.h;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlinx.coroutines.flow.Flow;
import om4.x2;
import pcd.j;
import pcd.l0;
import vkm.q;
import ypg.p;
import zhm.h0;

/* JADX INFO: loaded from: classes5.dex */
public final class g implements vo9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f316684a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ppg.b f316685b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ppg.a f316686c;
    public final c91.a d;
    public final h e;
    public final cm4.a f;

    public g(n creditCardInteractor, ppg.b vaultsInteractor, ppg.a customisedVaultInteractor, c91.a accountNameProvider, h externalInstitutionLogoMapper, a paymentPocketCountryProfileCodeMapper, cm4.a creditCardBaseMapper) {
        Intrinsics.checkNotNullParameter(creditCardInteractor, "creditCardInteractor");
        Intrinsics.checkNotNullParameter(vaultsInteractor, "vaultsInteractor");
        Intrinsics.checkNotNullParameter(customisedVaultInteractor, "customisedVaultInteractor");
        Intrinsics.checkNotNullParameter(accountNameProvider, "accountNameProvider");
        Intrinsics.checkNotNullParameter(externalInstitutionLogoMapper, "externalInstitutionLogoMapper");
        Intrinsics.checkNotNullParameter(paymentPocketCountryProfileCodeMapper, "paymentPocketCountryProfileCodeMapper");
        Intrinsics.checkNotNullParameter(creditCardBaseMapper, "creditCardBaseMapper");
        this.f316684a = creditCardInteractor;
        this.f316685b = vaultsInteractor;
        this.f316686c = customisedVaultInteractor;
        this.d = accountNameProvider;
        this.e = externalInstitutionLogoMapper;
        this.f = creditCardBaseMapper;
    }

    public final Clause c(Clause clause, CountryProfile countryProfile) {
        TextClause textClause = (countryProfile == null || countryProfile.f92233c) ? null : new TextClause(countryProfile.f92232b.f297794a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        if (textClause == null) {
            return clause;
        }
        Clause[] elements = {clause, textClause};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        m70.a.a(t0.f186434a);
        return new CompositeClause(listL, new TextClause(" · ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final PaymentPocketInfo d(xi0.b currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        return new PaymentPocketInfo(new CurrencyClause(currency, CurrencyClause.Format.Ticker.f57756a, 0 == true ? 1 : 0, 4), null, new CurrencyImage(currency.f306286a, (ImageTransformations) null, (TextLocalisedClause) (0 == true ? 1 : 0), 14));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final PaymentPocketInfo e(DeFiBalanceSource deFiBalanceSource) {
        Image imageA = e36.a.a(deFiBalanceSource.f92237g, deFiBalanceSource.e);
        k7 k7Var = null;
        ScaleMode scaleMode = null;
        boolean z = false;
        return new PaymentPocketInfo(new TextLocalisedClause(R$string.crypto_defi_send_amount_input_wallet_name, null, null, 14), c(new MoneyClause(deFiBalanceSource.getF92243g(), new MoneyClause.Format.Defaults(k7Var, scaleMode, z, false, 15), 0 == true ? 1 : 0, 0 == true ? 1 : 0, 12), deFiBalanceSource.i), imageA);
    }

    public final PaymentPocketInfo f(FundingSource transferFundingSource, AccountId accountId) {
        Intrinsics.checkNotNullParameter(transferFundingSource, "transferFundingSource");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        if (transferFundingSource instanceof PocketSource) {
            PocketSource pocketSource = (PocketSource) transferFundingSource;
            return h(pocketSource.d, accountId, pocketSource.f);
        }
        if (transferFundingSource instanceof SavingsAccount) {
            SavingsAccount savingsAccount = (SavingsAccount) transferFundingSource;
            return j(savingsAccount.f92244h, savingsAccount.i, savingsAccount.f92243g, savingsAccount.f92246l);
        }
        if (transferFundingSource instanceof WealthPortfolio) {
            xi0.b bVar = transferFundingSource.f92241b;
            WealthPortfolio wealthPortfolio = (WealthPortfolio) transferFundingSource;
            return k(bVar, wealthPortfolio.f, wealthPortfolio.f92264h);
        }
        if (transferFundingSource instanceof DeFiBalanceSource) {
            return e((DeFiBalanceSource) transferFundingSource);
        }
        throw new NoWhenBranchMatchedException();
    }

    public final Flow g(FundingSource transferFundingSource, AccountId accountId) {
        Intrinsics.checkNotNullParameter(transferFundingSource, "transferFundingSource");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        if (transferFundingSource instanceof PocketSource) {
            PocketSource pocketSource = (PocketSource) transferFundingSource;
            return i(pocketSource.d, accountId, pocketSource.f);
        }
        if (transferFundingSource instanceof SavingsAccount) {
            SavingsAccount savingsAccount = (SavingsAccount) transferFundingSource;
            return new go.g(j(savingsAccount.f92244h, savingsAccount.i, savingsAccount.f92243g, savingsAccount.f92246l), 2);
        }
        if (transferFundingSource instanceof WealthPortfolio) {
            xi0.b bVar = transferFundingSource.f92241b;
            WealthPortfolio wealthPortfolio = (WealthPortfolio) transferFundingSource;
            return new go.g(k(bVar, wealthPortfolio.f, wealthPortfolio.f92264h), 2);
        }
        if (transferFundingSource instanceof DeFiBalanceSource) {
            return new go.g(e((DeFiBalanceSource) transferFundingSource), 2);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final PaymentPocketInfo h(io3.d pocket, AccountId accountId, CountryProfile countryProfile) {
        Intrinsics.checkNotNullParameter(pocket, "pocket");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        i iVar = pocket.f163149h;
        String str = pocket.f163147c;
        int i = 14;
        ImageTransformations imageTransformations = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        Object[] objArr6 = 0;
        Object[] objArr7 = 0;
        if (iVar == i.EXTERNAL) {
            Image imageB = ((di6.a) this.e).b(pocket.f163156r);
            if (imageB == null) {
                imageB = new CurrencyImage(str, imageTransformations, (TextLocalisedClause) (objArr7 == true ? 1 : 0), i);
            }
            String str2 = pocket.f163154p;
            if (str2 == null) {
                str2 = pocket.d;
            }
            TextClause textClause = new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            xi0.b.Companion.getClass();
            return new PaymentPocketInfo(textClause, c(new CurrencyClause(xi0.a.a(str), objArr6 == true ? 1 : 0, objArr5 == true ? 1 : 0, 6), countryProfile), imageB);
        }
        if (cp5.d.z(z92.f.l(pocket)) && pocket.e == l.CURRENT) {
            k7 k7Var = null;
            ScaleMode scaleMode = null;
            boolean z = false;
            return new PaymentPocketInfo(c(new MoneyClause(io3.h.e(pocket), new MoneyClause.Format.Defaults(k7Var, scaleMode, z, false, 15), 0 == true ? 1 : 0, 0 == true ? 1 : 0, 12), countryProfile), null, new CurrencyImage(str, (ImageTransformations) (objArr4 == true ? 1 : 0), (TextLocalisedClause) (objArr3 == true ? 1 : 0), i));
        }
        CurrencyImage currencyImage = new CurrencyImage(str, (ImageTransformations) (objArr2 == true ? 1 : 0), (TextLocalisedClause) (objArr == true ? 1 : 0), i);
        k7 k7Var2 = null;
        ScaleMode scaleMode2 = null;
        boolean z3 = false;
        return new PaymentPocketInfo(((d91.b) this.d).b(accountId, pocket), c(new MoneyClause(io3.h.e(pocket), new MoneyClause.Format.Defaults(k7Var2, scaleMode2, z3, false, 15), 0 == true ? 1 : 0, 0 == true ? 1 : 0, 12), countryProfile), currencyImage);
    }

    public final Flow i(io3.d pocket, AccountId accountId, CountryProfile countryProfile) {
        pcd.i fVar;
        Intrinsics.checkNotNullParameter(pocket, "pocket");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        int i = b.f316677a[pocket.e.ordinal()];
        if (i == 1) {
            Flow flowB = ((x2) this.f316684a).B(pocket.f163145a, w4l.i.f294643c);
            h0 h0Var = h0.f322473a;
            return rd0.e.e(new wc7.e(q.q(new vvh.e(mo3.a.g(rd0.e.n(flowB, h0Var), null, new ypg.h(14), 1), 17)), 13, this, countryProfile), h0Var, new e(this, pocket, countryProfile, null));
        }
        if (i != 2) {
            return new go.g(h(pocket, accountId, countryProfile), 2);
        }
        if (accountId instanceof AccountId.Joint) {
            fVar = new pcd.f(l0.REGULAR, j.c.f234866a);
        } else {
            if (!(accountId instanceof AccountId.Personal)) {
                throw new NoWhenBranchMatchedException();
            }
            fVar = pcd.g.f234858b;
        }
        r rVarSwitchMap = ((p) this.f316685b).f(w4l.h.f294642c, fVar).map(new ypg.l(new s(pocket, 20), 23)).switchMap(new ypg.l(new yo7.p(this, 23), 24));
        Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "switchMap(...)");
        return rd0.e.e(new yi5.f(rd0.e.b(rVarSwitchMap), this, pocket, countryProfile, 2), h0.f322473a, new x4k.c(this, pocket, accountId, countryProfile, (Continuation) null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final PaymentPocketInfo j(Image icon, String name, dj0.d balance, CountryProfile countryProfile) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(balance, "balance");
        ScaleMode scaleMode = null;
        boolean z = false;
        return new PaymentPocketInfo(new TextClause(name, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), c(new MoneyClause(balance, new MoneyClause.Format.Defaults(null, scaleMode, z, false, 15), 0 == true ? 1 : 0, null, 12), countryProfile), icon);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final PaymentPocketInfo k(xi0.b currency, Long l2, CountryProfile countryProfile) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Clause clauseC = null;
        CurrencyImage currencyImage = new CurrencyImage(currency.f306286a, (ImageTransformations) (0 == true ? 1 : 0), (TextLocalisedClause) (0 == true ? 1 : 0), 14);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.payments_balance_picker_section_investment_title, null, null, 14);
        if (l2 != null) {
            Object[] objArr = 0 == true ? 1 : 0;
            Object[] objArr2 = 0 == true ? 1 : 0;
            clauseC = c(new MoneyClause(new dj0.d(l2.longValue(), currency), new MoneyClause.Format.Defaults(null, null, false, false, 15), objArr, objArr2, 12), countryProfile);
        }
        return new PaymentPocketInfo(textLocalisedClause, clauseC, currencyImage);
    }
}

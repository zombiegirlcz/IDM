package g4h;

import cli.j;
import cli.k;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.HtmlLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.wealth.assetdetails.ui.impl.R$string;
import com.revolut.feature.wealth.assetdetails.ui.impl.high_risk.InstrumentHighRiskWarningControllerContract$InputData;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final class f implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InstrumentHighRiskWarningControllerContract$InputData f140529a;

    public f(InstrumentHighRiskWarningControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f140529a = inputData;
    }

    @Override // cli.n
    public final o c(j jVar) {
        TextLocalisedClause textLocalisedClause;
        TextLocalisedClause textLocalisedClause2;
        TextLocalisedClause textLocalisedClause3;
        List listK;
        k domainState = (k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        j3h.c cVar = this.f140529a.f95411a;
        int[] iArr = e.f140528a;
        int i = iArr[cVar.ordinal()];
        if (i == 1) {
            textLocalisedClause = new TextLocalisedClause(R$string.etns_crypto_exposure_info_header_title, null, null, 14);
        } else if (i == 2) {
            textLocalisedClause = new TextLocalisedClause(R$string.wealth_private_equity_fca_disclaimer_retail_header_title, null, null, 14);
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause = new TextLocalisedClause(R$string.wealth_private_equity_fca_disclaimer_private_bank_header_title, null, null, 14);
        }
        int i2 = iArr[cVar.ordinal()];
        if (i2 == 1) {
            textLocalisedClause2 = null;
        } else if (i2 == 2) {
            textLocalisedClause2 = new TextLocalisedClause(R$string.wealth_private_equity_fca_disclaimer_retail_header_description, null, null, 14);
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause2 = new TextLocalisedClause(R$string.wealth_private_equity_fca_disclaimer_private_bank_header_description, null, null, 14);
        }
        int i3 = iArr[cVar.ordinal()];
        if (i3 == 1) {
            textLocalisedClause3 = new TextLocalisedClause(R$string.etns_crypto_exposure_info_header_subtitle, null, null, 14);
        } else if (i3 == 2) {
            textLocalisedClause3 = new TextLocalisedClause(R$string.wealth_private_equity_fca_disclaimer_retail_header_subtitle, null, null, 14);
        } else {
            if (i3 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause3 = new TextLocalisedClause(R$string.wealth_private_equity_fca_disclaimer_private_bank_header_subtitle, null, null, 14);
        }
        int i5 = iArr[cVar.ordinal()];
        if (i5 == 1) {
            listK = v.k(new Pair(new TextLocalisedClause(R$string.etns_crypto_exposure_info_high_risk_title, null, null, 14), new TextLocalisedClause(R$string.etns_crypto_exposure_info_high_risk_description, null, null, 14)), new Pair(new TextLocalisedClause(R$string.etns_crypto_exposure_info_high_volatility_title, null, null, 14), new TextLocalisedClause(R$string.etns_crypto_exposure_info_high_volatility_description, null, null, 14)), new Pair(new TextLocalisedClause(R$string.etns_crypto_exposure_info_no_protection_title, null, null, 14), new TextLocalisedClause(R$string.etns_crypto_exposure_info_no_protection_description, null, null, 14)), new Pair(new TextLocalisedClause(R$string.etns_crypto_exposure_info_different_risks_title, null, null, 14), new TextLocalisedClause(R$string.etns_crypto_exposure_info_different_risks_description, null, null, 14)), new Pair(new TextLocalisedClause(R$string.etns_crypto_exposure_info_risk_of_technical_failures_title, null, null, 14), new TextLocalisedClause(R$string.etns_crypto_exposure_info_risk_of_technical_failures_description, null, null, 14)), new Pair(new TextLocalisedClause(R$string.etns_crypto_exposure_info_different_investments_title, null, null, 14), new TextLocalisedClause(R$string.etns_crypto_exposure_info_different_investments_description, null, null, 14)));
        } else if (i5 == 2) {
            listK = v.k(new Pair(new TextLocalisedClause(R$string.wealth_private_equity_fca_disclaimer_retail_info_investment_risk_title, null, null, 14), new TextLocalisedClause(R$string.wealth_private_equity_fca_disclaimer_retail_info_investment_risk_description, null, null, 14)), new Pair(new TextLocalisedClause(R$string.wealth_private_equity_fca_disclaimer_retail_info_liquidity_risk_title, null, null, 14), new TextLocalisedClause(R$string.wealth_private_equity_fca_disclaimer_retail_info_liquidity_risk_description, null, null, 14)), new Pair(new TextLocalisedClause(R$string.wealth_private_equity_fca_disclaimer_retail_info_long_term_returns_title, null, null, 14), new TextLocalisedClause(R$string.wealth_private_equity_fca_disclaimer_retail_info_long_term_returns_description, null, null, 14)), new Pair(new TextLocalisedClause(R$string.wealth_private_equity_fca_disclaimer_retail_info_diversification_title, null, null, 14), new TextLocalisedClause(R$string.wealth_private_equity_fca_disclaimer_retail_info_diversification_description, null, null, 14)), new Pair(new TextLocalisedClause(R$string.wealth_private_equity_fca_disclaimer_retail_info_protection_limit_title, null, null, 14), new HtmlLocalisedClause(R$string.wealth_private_equity_fca_disclaimer_retail_info_protection_limit_description, (List) null, (Integer) null, (Object) null, 30)));
        } else {
            if (i5 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            listK = v.k(new Pair(new TextLocalisedClause(R$string.wealth_private_equity_fca_disclaimer_private_bank_info_investment_risk_title, null, null, 14), new TextLocalisedClause(R$string.wealth_private_equity_fca_disclaimer_private_bank_info_investment_risk_description, null, null, 14)), new Pair(new TextLocalisedClause(R$string.wealth_private_equity_fca_disclaimer_private_bank_info_protection_limit_title, null, null, 14), new HtmlLocalisedClause(R$string.wealth_private_equity_fca_disclaimer_private_bank_info_protection_limit_description, (List) null, (Integer) null, (Object) null, 30)), new Pair(new TextLocalisedClause(R$string.wealth_private_equity_fca_disclaimer_private_bank_info_liquidity_risk_title, null, null, 14), new TextLocalisedClause(R$string.wealth_private_equity_fca_disclaimer_private_bank_info_liquidity_risk_description, null, null, 14)), new Pair(new TextLocalisedClause(R$string.wealth_private_equity_fca_disclaimer_private_bank_info_complexity_risk_title, null, null, 14), new TextLocalisedClause(R$string.wealth_private_equity_fca_disclaimer_private_bank_info_complexity_risk_description, null, null, 14)), new Pair(new TextLocalisedClause(R$string.wealth_private_equity_fca_disclaimer_private_bank_info_diversification_title, null, null, 14), new HtmlLocalisedClause(R$string.wealth_private_equity_fca_disclaimer_private_bank_info_diversification_description, (List) null, (Integer) null, (Object) null, 30)), new Pair(new TextLocalisedClause(R$string.wealth_private_equity_fca_disclaimer_private_bank_info_learn_more_title, null, null, 14), new HtmlLocalisedClause(R$string.wealth_private_equity_fca_disclaimer_private_bank_info_learn_more_description, (List) null, (Integer) null, (Object) null, 30)));
        }
        List list = listK;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        int i6 = 0;
        for (Object obj2 : list) {
            int i21 = i6 + 1;
            if (i6 < 0) {
                v.s();
                throw null;
            }
            Pair pair = (Pair) obj2;
            RowDelegate.Model model = new RowDelegate.Model(a0.d.n("DISCLAIMER_LIST_ID_", i6), null, (Clause) pair.f186385a, null, 0, (Clause) pair.f186386b, null, null, Integer.MAX_VALUE, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868570);
            yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
            arrayList.add(model);
            i6 = i21;
        }
        return new c(textLocalisedClause, textLocalisedClause2, textLocalisedClause3, arrayList);
    }
}

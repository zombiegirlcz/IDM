package ej6;

import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.domain.models.openbanking.OpenBankingPayment;
import com.revolut.domain.models.openbanking.PaymentConsentType;
import com.revolut.feature.external_accounts.impl.R$string;
import com.revolut.feature.external_accounts.impl.ui.apptoapp.screen.payment.OpenBankingAuthPaymentScreenContract$InputData;
import com.revolut.feature_move_money.api.model.AccountWrapper;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class h0 implements cli.n {

    @NotNull
    public static final g0 Companion = new g0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OpenBankingAuthPaymentScreenContract$InputData f126742a;

    public h0(OpenBankingAuthPaymentScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f126742a = inputData;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        l domainState = (l) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        ei6.d dVar = domainState.f126743a;
        i0 i0Var = domainState.f126746g;
        si6.d dVar2 = domainState.f126744b;
        if (dVar == null || dVar2 == null) {
            return new w(iii.c.c(5), null, false, false, null, null);
        }
        AccountWrapper accountWrapper = domainState.f126745c;
        OpenBankingPayment openBankingPayment = this.f126742a.f72530b;
        si6.c cVarA = dVar2.a(dVar, new ei6.c(openBankingPayment, accountWrapper, domainState.d, i0Var == i0.INSUFFICIENT_FUNDS));
        boolean z = (!zhm.v.k(PaymentConsentType.DOMESTIC_RECURRING_ORDER, PaymentConsentType.DOMESTIC_SCHEDULED_PAYMENT, PaymentConsentType.INTERNATIONAL_RECURRING_ORDER, PaymentConsentType.INTERNATIONAL_SCHEDULED_PAYMENT).contains(openBankingPayment.f60385a) || accountWrapper == null || Intrinsics.f(openBankingPayment.f60387c, accountWrapper.getCurrency())) ? false : true;
        List list = cVarA.f263524b;
        Iterable iterable = domainState.e;
        if (iterable == null) {
            iterable = zhm.f0.f322471a;
        }
        ArrayList arrayListE0 = zhm.d0.E0(iterable, list);
        TextLocalisedClause textLocalisedClause = cVarA.f263523a;
        boolean z3 = accountWrapper != null && i0Var == i0.AVAILABLE;
        boolean z4 = accountWrapper != null;
        TextLocalisedClause textLocalisedClause2 = z ? new TextLocalisedClause(R$string.open_banking_consent_flow_transfer_exchange_warning_full_text, zhm.u.c(new TextLocalisedClause(R$string.open_banking_consent_flow_transfer_exchange_warning_highlighted_text, null, new Click(30, (Integer) null, (Object) null, "FEES_AND_RATE_CLICK_ID", false), 10)), null, 12) : null;
        sh5.c cVar = domainState.f;
        return new w(arrayListE0, textLocalisedClause, z3, z4, textLocalisedClause2, cVar != null ? cVar.f263435a : null);
    }
}

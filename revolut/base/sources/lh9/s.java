package lh9;

import aw0.n6;
import aw0.o9;
import com.google.android.gms.location.GeofenceStatusCodes;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.feature.pay_bills_taxes.api.R$string;
import com.revolut.feature.pay_bills_taxes.impl.ui_payment.helpers.models.PaymentData;
import ip0.b9;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes5.dex */
public final class s implements cli.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yof.d f195194a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w80.b f195195b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final of9.b f195196c;
    public final q12.g d;

    public s(yof.d transferAmountMapper, u80.o moneyPrefixFormatter, w80.b amountFormatter, of9.b billFieldMapper, q12.g quoteMapper) {
        Intrinsics.checkNotNullParameter(transferAmountMapper, "transferAmountMapper");
        Intrinsics.checkNotNullParameter(moneyPrefixFormatter, "moneyPrefixFormatter");
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        Intrinsics.checkNotNullParameter(billFieldMapper, "billFieldMapper");
        Intrinsics.checkNotNullParameter(quoteMapper, "quoteMapper");
        this.f195194a = transferAmountMapper;
        this.f195195b = amountFormatter;
        this.f195196c = billFieldMapper;
        this.d = quoteMapper;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        i domainState = (i) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        aim.e eVarB = u.b();
        dj0.d dVar = domainState.f195180a;
        eVarB.add(new CenteredAmountDelegate.Model("ITEM_FORM_AMOUNT_ID", null, new bw0.h(this.f195195b.e(dVar), u80.o.b(new u80.g(dVar, u80.e.UNSIGNED, u80.b.SYMBOL, 8)).toString(), true, null, Boolean.TRUE, null, null, false, 16340), null, ((ppf.c) this.f195194a).d(), null, b9.WRAP_CONTENT, null, null, null, null, null, null, 8106));
        eVarB.addAll(this.f195196c.a(domainState.d));
        j jVar2 = domainState.f195182c;
        if (jVar2 != null) {
            PaymentData paymentData = domainState.f195181b;
            eVarB.addAll(this.d.a(jVar2.f195183a, paymentData.getF72729b(), paymentData.d()));
        }
        aim.e eVarA = u.a(eVarB);
        String str = domainState.e;
        return new o(eVarA, new aw0.e(true, str != null ? new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, null, new n6(new TextLocalisedClause(R$string.pay_bills_taxes_common_submit, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, "FORM_REVIEW_CTA_BUTTON_TAG", false, null, null, GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION), null, null, 52));
    }
}

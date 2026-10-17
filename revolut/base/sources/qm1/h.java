package qm1;

import com.revolut.core.error.data.model.ServerError;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.apm.bills.core.api.exceptions.InvalidPaymentDateOnBillSearchException;
import com.revolut.feature.pay_bills_taxes.api.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import kotlin.jvm.internal.Intrinsics;
import nii.l0;
import nii.y0;
import nii.z;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class h {

    @NotNull
    public static final g Companion = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sf0.h f247753a;

    public h(sf0.h serverErrorParser) {
        Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
        this.f247753a = serverErrorParser;
    }

    public static y0 a() {
        return new y0(null, new z(new TextLocalisedClause(R.string.common_error_something_went_wrong, null, null, 14), new TextLocalisedClause(R.string.error_generic, null, null, 14), null, null, null, null, false, null, null, null, null, null, null, 32764), false, 5);
    }

    public final y0 b(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        ServerError serverErrorA = this.f247753a.a(throwable);
        if (throwable instanceof InvalidPaymentDateOnBillSearchException) {
            return new y0(null, new z(new TextLocalisedClause(R$string.pay_bills_taxes_country_br_search_error_invalid_payment_date_title, null, null, 14), new TextLocalisedClause(R$string.pay_bills_taxes_country_br_search_error_invalid_payment_date_description, null, null, 14), null, null, null, null, false, null, null, null, null, null, null, 32764), false, 5);
        }
        if (serverErrorA == null) {
            return a();
        }
        switch (serverErrorA.f51362a) {
            case 57402:
                return new y0(null, new z(new TextLocalisedClause(R$string.pay_bills_taxes_country_br_refresh_search_error_not_found_title, null, null, 14), new TextLocalisedClause(R$string.pay_bills_taxes_country_br_refresh_search_error_not_found_description, null, null, 14), null, null, null, null, false, null, null, null, null, null, null, 32764), false, 5);
            case 57403:
                return new y0(null, new l0(new TextLocalisedClause(R$string.pay_bills_taxes_country_br_search_error_already_paid_title, null, null, 14), null, null, null, null, null, false, null, 1022), false, 5);
            case 57405:
                return new y0(null, new z(new TextLocalisedClause(R$string.pay_bills_taxes_country_br_search_error_invalid_for_payment_title, null, null, 14), new TextLocalisedClause(R$string.pay_bills_taxes_country_br_search_error_invalid_for_payment_description, null, null, 14), null, null, null, null, false, null, null, null, null, null, null, 32764), false, 5);
            case 57431:
                return new y0(null, new l0(new TextLocalisedClause(R$string.pay_bills_taxes_country_br_search_error_not_ready_for_payment_title, null, null, 14), new TextLocalisedClause(R$string.pay_bills_taxes_country_br_search_error_not_ready_for_payment_description, null, null, 14), null, null, null, null, false, null, 1020), false, 5);
            default:
                return a();
        }
    }
}

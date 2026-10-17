package mn1;

import com.revolut.core.error.data.model.ServerError;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.pay_bills_taxes.api.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class r {

    @NotNull
    public static final q Companion = new q();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sf0.h f207349a;

    public r(sf0.h serverErrorParser) {
        Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
        this.f207349a = serverErrorParser;
    }

    public final nii.z a(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        ServerError serverErrorA = this.f207349a.a(throwable);
        Integer numValueOf = serverErrorA != null ? Integer.valueOf(serverErrorA.f51362a) : null;
        return (numValueOf != null && numValueOf.intValue() == 57406) ? new nii.z(new TextLocalisedClause(R$string.pay_bills_taxes_country_br_review_error_dialog_invalid_date_title, null, null, 14), new TextLocalisedClause(R$string.pay_bills_taxes_country_br_review_error_dialog_invalid_date_description, null, null, 14), new TextLocalisedClause(R.string.common_action_try_again, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32756) : new nii.z(new TextLocalisedClause(R.string.common_error_something_went_wrong, null, null, 14), new TextLocalisedClause(R.string.error_generic, null, null, 14), null, null, null, null, false, null, null, null, null, null, null, 32764);
    }
}

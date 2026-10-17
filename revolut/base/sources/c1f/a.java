package c1f;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.error.data.model.ServerError;
import com.revolut.core.error.data.model.ServerErrorException;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.topup_screen.api.topup_dialogs.CardPaymentsTopUpDialogs$TopUpErrorDialogPayloadFinish;
import com.revolut.feature.topup_screen.api.topup_dialogs.CardPaymentsTopUpDialogs$TopUpRollingLimitErrorPayload;
import com.revolut.feature.topup_screen.impl.R$string;
import grl.k9;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import nii.g0;
import nii.w;
import nii.y0;
import nii.z;
import ofm.q;
import retrofit2.HttpException;
import sf0.h;
import zhm.u;

/* JADX INFO: loaded from: classes8.dex */
public final class a implements zte.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f20462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v60.e f20463b;

    public a(h serverErrorParser, v60.e serverErrorsProvider) {
        Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
        Intrinsics.checkNotNullParameter(serverErrorsProvider, "serverErrorsProvider");
        this.f20462a = serverErrorParser;
        this.f20463b = serverErrorsProvider;
    }

    public static g0 d() {
        return new g0(new TextLocalisedClause(R$string.top_up_pending_title, null, null, 14), null, null, null, null, null, CardPaymentsTopUpDialogs$TopUpErrorDialogPayloadFinish.f90552a, null, false, null, false, null, 16318);
    }

    public final w a(ServerError serverError) {
        Intrinsics.checkNotNullParameter(serverError, "serverError");
        int i = serverError.f51362a;
        if (i == 1017) {
            return d();
        }
        v60.c cVarB = ((ao0.a) this.f20463b).b(Integer.valueOf(i));
        TextLocalisedClause textLocalisedClauseO = cVarB != null ? q.O(cVarB) : null;
        if (textLocalisedClauseO == null) {
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(j6.a.l(i, "error.topup.", ".title"), (List) null, (Clause) new TextLocalisedClause(R$string.error_top_up_generic_title, null, null, 14), false, 22);
            TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(j6.a.l(i, "error.topup.", ".message"), (List) null, (Clause) null, false, 30);
            k9 k9Var = k9.Topup;
            Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
            return new z(textLocalisedClause, textLocalisedClause2, null, null, null, null, false, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, null, null, null, null, 32252);
        }
        if (i != 100011) {
            k9 k9Var2 = k9.Topup;
            Parcelable.Creator<AnalyticsProduct.Retail> creator2 = AnalyticsProduct.Retail.CREATOR;
            return new z(textLocalisedClauseO, null, null, null, null, null, false, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var2, "value", k9Var2), null, null, null, null, null, 32254);
        }
        TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.topup_card_rolling_limit_exceeded_error_description, u.c(new TextLocalisedClause(R$string.topup_card_rolling_limit_exceeded_error_description_learn_more_link, null, new Click(30, (Integer) null, (Object) null, "ROLLING_CARD_TOP_UP_LIMIT_LEARN_MORE_ID", false), 10)), null, 12);
        k9 value = k9.Topup;
        Parcelable.Creator<AnalyticsProduct.Retail> creator3 = AnalyticsProduct.Retail.CREATOR;
        Intrinsics.checkNotNullParameter(value, "value");
        return new z(textLocalisedClauseO, textLocalisedClause3, new TextLocalisedClause(R$string.topup_card_rolling_limit_exceeded_error_add_with_bank_transfer, null, null, 14), null, null, CardPaymentsTopUpDialogs$TopUpRollingLimitErrorPayload.f90553a, false, new AnalyticsProduct.Retail(value), null, null, null, null, null, 32116);
    }

    public final y0 b(Throwable error) {
        int i;
        Intrinsics.checkNotNullParameter(error, "error");
        ServerError serverErrorC = error instanceof HttpException ? this.f20462a.c((HttpException) error) : error instanceof ServerErrorException ? ((ServerErrorException) error).f : null;
        if (serverErrorC == null || (i = serverErrorC.f51362a) == 1026 || i == 9038) {
            return null;
        }
        return new y0(null, a(serverErrorC), false, 5);
    }

    public final y0 c(dj0.d topUpAmount, dj0.d feeAmount) {
        Intrinsics.checkNotNullParameter(topUpAmount, "topUpAmount");
        Intrinsics.checkNotNullParameter(feeAmount, "feeAmount");
        return new y0(null, new g0(new TextLocalisedClause(R$string.xpay_fee_dialog_success_title, u.c(new MoneyClause(topUpAmount, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12), new TextLocalisedClause(R$string.xpay_fee_dialog_success_subtitle, u.c(new MoneyClause(feeAmount, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12), null, null, null, null, null, null, false, null, false, null, 16380), false, 5);
    }

    public final y0 e() {
        return new y0(null, d(), false, 5);
    }
}

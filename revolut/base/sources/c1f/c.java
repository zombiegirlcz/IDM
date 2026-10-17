package c1f;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.error.data.model.ServerError;
import com.revolut.core.error.data.model.ServerErrorException;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.topup_screen.impl.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import grl.k9;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import nii.l0;
import nii.m0;
import nii.y0;
import nii.z;
import ofm.q;
import retrofit2.HttpException;
import sf0.h;
import zhm.h0;

/* JADX INFO: loaded from: classes8.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f20464a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v60.e f20465b;

    public c(h serverErrorParser, v60.e serverErrorsProvider) {
        Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
        Intrinsics.checkNotNullParameter(serverErrorsProvider, "serverErrorsProvider");
        this.f20464a = serverErrorParser;
        this.f20465b = serverErrorsProvider;
    }

    public final y0 a(Throwable error) {
        m0 zVar;
        Intrinsics.checkNotNullParameter(error, "error");
        ServerError serverErrorC = error instanceof HttpException ? this.f20464a.c((HttpException) error) : error instanceof ServerErrorException ? ((ServerErrorException) error).f : null;
        if (serverErrorC != null) {
            int i = serverErrorC.f51362a;
            v60.c cVarB = ((ao0.a) this.f20465b).b(Integer.valueOf(i));
            TextLocalisedClause textLocalisedClauseO = cVarB != null ? q.O(cVarB) : null;
            if (textLocalisedClauseO != null) {
                k9 k9Var = k9.Topup;
                Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
                zVar = new z(textLocalisedClauseO, null, null, null, null, null, false, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, null, null, null, null, 32254);
            } else if (i == 4050) {
                zVar = new z(new TextLocalisedClause(R$string.topup_transaction_error_generic_subtitle, null, null, 14), new TextLocalisedClause(com.revolut.core.strings_provider.R$string.error_api_4050, null, null, 14), null, null, null, null, false, null, null, null, null, null, null, 32764);
            } else if (i == 4051) {
                zVar = new z(new TextLocalisedClause(R$string.topup_transaction_error_generic_subtitle, null, null, 14), new TextLocalisedClause(com.revolut.core.strings_provider.R$string.error_api_4051, null, null, 14), null, null, null, null, false, null, null, null, null, null, null, 32764);
            } else if (i == 4058) {
                zVar = new z(new TextLocalisedClause(com.revolut.core.strings_provider.R$string.error_api_4058, null, null, 14), null, null, null, null, null, false, null, null, null, null, null, null, 32766);
            } else if (i == 10020) {
                zVar = new l0(new TextLocalisedClause(R.string.error_generic, null, null, 14), new TextLocalisedClause(R$string.top_up_payment_limit_status_redirect_description_10020, null, null, 14), null, new TextLocalisedClause(R$string.top_up_payment_limit_status_redirect_primary_action_10020, null, null, 14), new TextLocalisedClause(R$string.top_up_payment_limit_status_redirect_secondary_action, null, null, 14), null, false, null, 996);
            } else if (i == 10025) {
                zVar = new z(new TextLocalisedClause(R$string.top_up_payment_limit_status_redirect_title_googlepay_10025, null, null, 14), new TextLocalisedClause(R$string.top_up_payment_limit_status_redirect_description_10025, null, null, 14), new TextLocalisedClause(R$string.topup_error_action_try_another_method, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32756);
            } else if (i == 18002) {
                zVar = new z(new TextLocalisedClause(R$string.open_banking_topup_plaid_consent_expire_title, null, null, 14), new TextLocalisedClause(R$string.open_banking_topup_plaid_consent_expire_description, null, null, 14), new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_done, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32756);
            } else if (i == 10031) {
                zVar = new z(new TextLocalisedClause(R$string.top_up_payment_limit_status_redirect_title_10031, null, null, 14), new TextLocalisedClause(R$string.top_up_payment_limit_status_redirect_description_10031, null, null, 14), new TextLocalisedClause(R$string.topup_error_action_verify_identity, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32756);
            } else if (i != 10032) {
                IllegalStateException illegalStateException = new IllegalStateException(j6.a.q("Unexpected error for open-banking top-up ", j6.a.m(i, "code=", ", message=", serverErrorC.f51363b)));
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                zVar = new z(new TextLocalisedClause(R.string.error_generic, null, null, 14), null, null, null, null, null, false, null, null, null, null, null, null, 32766);
            } else {
                zVar = new z(new TextLocalisedClause(R$string.top_up_payment_limit_status_redirect_title_10032, null, null, 14), new TextLocalisedClause(R$string.top_up_payment_limit_status_redirect_description_10032, null, null, 14), new TextLocalisedClause(R$string.topup_error_action_try_another_method, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32756);
            }
        } else {
            IllegalStateException illegalStateException2 = new IllegalStateException(j6.a.q("Unexpected error for open-banking top-up ", a0.d.s("type=", error.getClass().getSimpleName(), ", message=", error.getMessage())));
            h0 h0Var2 = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalStateException2, h0Var2);
            zVar = new z(new TextLocalisedClause(R.string.error_generic, null, null, 14), null, null, null, null, null, false, null, null, null, null, null, null, 32766);
        }
        return new y0(null, zVar, false, 5);
    }
}

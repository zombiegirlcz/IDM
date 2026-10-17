package clb;

import aii.i;
import aii.j;
import com.revolut.core.error.data.model.ServerErrorException;
import com.revolut.core.network.exceptions.HandledNetworkException;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.retail.savings.api.R$string;
import com.revolut.feature.retail.savings.api.error.SavingsErrorHandlingApi$FailStartTradingOnboardingException;
import com.revolut.feature.retail.savings.api.error.SavingsErrorHandlingApi$FailToAddMoneyException;
import com.revolut.feature.retail.savings.api.error.SavingsErrorHandlingApi$FailToLoadDataException;
import com.revolut.feature.retail.savings.api.error.SavingsErrorHandlingApi$FailToOpenDocumentException;
import com.revolut.feature.retail.savings.api.error.SavingsErrorHandlingApi$SavingsProductUnavailableException;
import com.revolut.feature.retail.savings.api.error.SavingsErrorHandlingApi$SavingsUnavailableException;
import com.revolut.feature.retail.savings.api.error.SavingsErrorHandlingApi$TermsFailToAcceptException;
import com.revolut.feature.retail.savings.api.error.SavingsErrorHandlingApi$TermsNotFoundException;
import com.revolut.feature.retail.savings.api.error.SavingsErrorHandlingApi$TradingOnboardingFailException;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import nii.y0;
import nii.z;
import rd0.d;
import retrofit2.HttpException;
import rv6.e;
import vkm.v1;
import yji.n;
import zhm.h0;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends n {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final a f24969l;

    public c(a errorConfigProvider) {
        Intrinsics.checkNotNullParameter(errorConfigProvider, "errorConfigProvider");
        this.f24969l = errorConfigProvider;
    }

    public final Flow Z2(Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        int i = 2;
        if ((error instanceof ServerErrorException) || (error instanceof HandledNetworkException) || (error instanceof HttpException)) {
            return r2().M0(new i(error, (aii.a) null, 6)) instanceof j ? new v1(new a35.j(2, 11, null)) : Z2(new Exception(error));
        }
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
        d.a(rd0.c.ERROR, "Non api error occur", null, error, h0Var);
        this.f24969l.getClass();
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(error, "error");
        return new byc.i((e) L2(new y0(null, new z(new TextLocalisedClause(error instanceof SavingsErrorHandlingApi$SavingsProductUnavailableException ? R$string.savings_error_account_unavailable : error instanceof SavingsErrorHandlingApi$FailStartTradingOnboardingException ? R$string.savings_error_trading_progress_check_failed : error instanceof SavingsErrorHandlingApi$TermsNotFoundException ? R$string.savings_error_terms_not_found : error instanceof SavingsErrorHandlingApi$TermsFailToAcceptException ? R$string.savings_error_terms_acceptance_failed : error instanceof SavingsErrorHandlingApi$TradingOnboardingFailException ? com.revolut.feature.vaults.R$string.mmf_account_creation_refused_title : error instanceof SavingsErrorHandlingApi$FailToOpenDocumentException ? R$string.savings_error_document_open_failed : error instanceof SavingsErrorHandlingApi$SavingsUnavailableException ? R$string.savings_error_account_creation_failed : error instanceof SavingsErrorHandlingApi$FailToLoadDataException ? R$string.savings_common_load_error : error instanceof SavingsErrorHandlingApi$FailToAddMoneyException ? R$string.savings_common_topup_error : com.revolut.feature.vaults.R$string.vaults_common_error_state_title, null, null, 14), null, null, null, null, null, false, null, null, null, null, null, null, 32766), false, 5)), i);
    }
}

package o9a;

import com.revolut.core.error.data.model.ServerErrorException;
import com.revolut.core.network.exceptions.HandledNetworkException;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.pix.impl.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import nii.m0;
import zhm.h0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class v implements nii.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f223173a;

    public /* synthetic */ v(int i) {
        this.f223173a = i;
    }

    @Override // nii.p1
    public final m0 a(Object obj2) {
        switch (this.f223173a) {
            case 0:
                return e0.a();
            case 1:
                return new nii.z(new TextLocalisedClause(R$string.pix_authorisation_request_down_payment_payment_failed_modal_title, null, null, 14), new TextLocalisedClause(R$string.pix_authorisation_request_down_payment_payment_failed_modal_description, null, null, 14), new TextLocalisedClause(R$string.pix_authorisation_request_down_payment_payment_failed_modal_try_again, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32756);
            case 2:
                return new nii.z(new TextLocalisedClause(R.string.common_error_something_went_wrong, null, null, 14), null, null, null, null, null, false, null, null, null, null, null, null, 32766);
            case 3:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return new nii.z(new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_common_error_title, null, null, 14), null, null, null, null, null, false, null, null, null, null, null, null, 32766);
            case 4:
                return new nii.z(new TextLocalisedClause(com.revolut.feature.kyc.api.R$string.common_error_something_went_wrong, null, null, 14), null, new TextLocalisedClause(com.revolut.feature.kyc.api.R$string.common_action_try_again, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32758);
            case 5:
                return frg.a.a();
            case 6:
                Throwable throwable = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, throwable, h0Var);
                return null;
            case 7:
                Throwable throwable2 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(throwable2, "throwable");
                h0 h0Var2 = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, throwable2, h0Var2);
                return null;
            case 8:
                return new nii.z(new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_error_title, null, null, 14), new TextLocalisedClause(com.revolut.retail.common.ui.R$string.error_generic, null, null, 14), null, null, null, null, false, null, null, null, null, null, null, 32764);
            case 9:
                return new nii.z(new TextLocalisedClause(R.string.error_generic, null, null, 14), null, null, null, null, null, false, null, null, null, null, null, null, 32766);
            case 10:
                return pw5.a.e();
            case 11:
                Throwable it8 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                if ((it8 instanceof ServerErrorException) || (it8 instanceof HandledNetworkException)) {
                    return null;
                }
                return new nii.z(new TextLocalisedClause(com.revolut.feature.vaults.R$string.vaults_common_error_state_title, null, null, 14), null, null, null, null, null, false, null, null, null, null, null, null, 32766);
            case 12:
                return com.revolut.feature.transport.impl.ui.activation.flow.a.J2((Throwable) obj2);
            case 13:
                Throwable it9 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                if ((it9 instanceof ServerErrorException) || (it9 instanceof HandledNetworkException)) {
                    return null;
                }
                return new nii.z(new TextLocalisedClause(com.revolut.feature.vaults.R$string.vaults_common_error_state_title, null, null, 14), null, null, null, null, null, false, null, null, null, null, null, null, 32766);
            case 14:
                return new nii.z(new TextLocalisedClause(com.revolut.kompot.common.R$string.common_error_state_title, null, null, 14), new TextLocalisedClause(com.revolut.kompot.common.R$string.common_error_state_description, null, null, 14), null, null, null, null, false, null, null, null, null, null, null, 32764);
            case 15:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return new nii.z(new TextLocalisedClause(R.string.common_error_something_went_wrong, null, null, 14), null, null, null, null, null, false, null, null, null, null, null, null, 32766);
            case 16:
                return new nii.z(new TextLocalisedClause(com.revolut.feature.defi.accounts.impl.R$string.defi_accounts_creation_status_error_title, null, null, 14), null, null, null, null, null, false, null, null, null, null, null, null, 32766);
            case 17:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return new nii.z(new TextLocalisedClause(com.revolut.retail.common.ui.R$string.general_error_common, null, null, 14), null, null, null, null, null, false, null, null, null, null, null, null, 32766);
            case 18:
                return new nii.z(new TextLocalisedClause(com.revolut.kompot.common.R$string.common_error_state_title, null, null, 14), null, new TextLocalisedClause(com.revolut.kompot.common.R$string.common_error_state_action, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32758);
            case 19:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return new nii.z(new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_application_offer_document_loading_error_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_application_offer_document_loading_error_description, null, null, 14), null, null, null, null, false, null, null, null, null, null, null, 32764);
            default:
                return new nii.z(new TextLocalisedClause(com.revolut.kompot.common.R$string.common_error_state_title, null, null, 14), new TextLocalisedClause(com.revolut.kompot.common.R$string.common_error_state_description, null, null, 14), null, null, null, null, false, null, null, null, null, null, null, 32764);
        }
    }

    public /* synthetic */ v(Object obj2, int i) {
        this.f223173a = i;
    }
}

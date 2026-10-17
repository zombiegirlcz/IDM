package i4b;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.feature.pix.api.model.AliasDeletionResult;
import com.revolut.feature.pix.api.model.AliasRegistrationResult;
import com.revolut.feature.pix.api.model.PixKey;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import com.revolut.retail.common.ui.R$string;
import kotlin.Function;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import nii.t1;
import nii.u1;
import nii.v1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class e0 implements t1, kotlin.jvm.internal.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f158327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f158328b;

    public /* synthetic */ e0(Object obj2, int i) {
        this.f158327a = i;
        this.f158328b = obj2;
    }

    @Override // nii.p1
    public final nii.m0 a(Object obj2) {
        TextLocalisedClause textLocalisedClause;
        nii.m0 zVar;
        int i;
        switch (this.f158327a) {
            case 0:
                k4l.p p0 = (k4l.p) obj2;
                Intrinsics.checkNotNullParameter(p0, "p0");
                g0 g0Var = (g0) this.f158328b;
                if (p0 instanceof k4l.l) {
                    return new nii.z(ofm.q.l(p0), null, new TextLocalisedClause(R$string.common_action_got_it, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32758);
                }
                if (p0 instanceof k4l.m) {
                    return new nii.j0(g0Var.f158335q.e != null ? new TextLocalisedClause(com.revolut.feature.retail.cfd.impl.R$string.wealth_margin_cfd_position_details_close_alert, null, null, 14) : ofm.q.l(p0), (Clause) null, (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (nii.h0) null, (ResourceImage) null, 4094);
                }
                if ((p0 instanceof k4l.n) || (p0 instanceof k4l.o)) {
                    return new nii.j0(ofm.q.l(p0), (Clause) null, (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (nii.h0) null, (ResourceImage) null, 4094);
                }
                throw new NoWhenBranchMatchedException();
            case 1:
                lr6.i0 refundTransactionPaymentMethod = (lr6.i0) obj2;
                Intrinsics.checkNotNullParameter(refundTransactionPaymentMethod, "p0");
                ((q27.b) this.f158328b).getClass();
                Intrinsics.checkNotNullParameter(refundTransactionPaymentMethod, "refundTransactionPaymentMethod");
                TextLocalisedClause textLocalisedClause2 = null;
                TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_refund_completion_success_title, null, null, 14);
                switch (q27.a.f241543a[refundTransactionPaymentMethod.ordinal()]) {
                    case 1:
                        textLocalisedClause = new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_refund_completion_success_subtitle_instant, null, null, 14);
                        break;
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        textLocalisedClause = new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_refund_completion_success_subtitle_delayed, null, null, 14);
                        break;
                    case 7:
                    case 8:
                    case 9:
                        return new nii.j0((Clause) textLocalisedClause3, (Clause) textLocalisedClause2, (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (nii.h0) null, (ResourceImage) null, 4092);
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                textLocalisedClause2 = textLocalisedClause;
                return new nii.j0((Clause) textLocalisedClause3, (Clause) textLocalisedClause2, (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (nii.h0) null, (ResourceImage) null, 4092);
            case 2:
                AliasDeletionResult result = (AliasDeletionResult) obj2;
                Intrinsics.checkNotNullParameter(result, "p0");
                ((w8a.i) this.f158328b).getClass();
                Intrinsics.checkNotNullParameter(result, "result");
                return Intrinsics.f(result, AliasDeletionResult.Success.f80382a) ? new nii.j0((Clause) new TextLocalisedClause(com.revolut.feature.pix.impl.R$string.pix_delete_status_success_title, null, null, 14), (Clause) null, (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) new v1(new TextLocalisedClause(com.revolut.feature.pix.impl.R$string.pix_delete_status_success_button_create_key, null, null, 14), null), false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (nii.h0) null, (ResourceImage) null, 4078) : Intrinsics.f(result, AliasDeletionResult.Pending.f80381a) ? new nii.g0(new TextLocalisedClause(com.revolut.feature.pix.impl.R$string.pix_alias_deletion_pending_title, null, null, 14), null, null, null, null, null, null, null, false, null, false, null, 16382) : w8a.i.a();
            default:
                AliasRegistrationResult result2 = (AliasRegistrationResult) obj2;
                Intrinsics.checkNotNullParameter(result2, "p0");
                ((d9a.c) this.f158328b).getClass();
                Intrinsics.checkNotNullParameter(result2, "result");
                if (Intrinsics.f(result2, AliasRegistrationResult.Pending.f80384a)) {
                    zVar = new nii.g0(new TextLocalisedClause(com.revolut.feature.pix.impl.R$string.pix_alias_registration_pending_title, null, null, 14), null, null, null, null, null, null, null, false, null, false, null, 16382);
                } else if (result2 instanceof AliasRegistrationResult.Success) {
                    AliasRegistrationResult.Success success = (AliasRegistrationResult.Success) result2;
                    PixKey pixKey = success.f80387a;
                    if (pixKey instanceof PixKey.Email) {
                        i = com.revolut.feature.pix.impl.R$string.pix_key_email;
                    } else if (pixKey instanceof PixKey.PhoneNumber) {
                        i = com.revolut.feature.pix.impl.R$string.pix_key_phone;
                    } else if (pixKey instanceof PixKey.Random) {
                        i = com.revolut.feature.pix.impl.R$string.pix_key_random;
                    } else {
                        if (!(pixKey instanceof PixKey.Document)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i = com.revolut.feature.pix.impl.R$string.pix_key_document;
                    }
                    zVar = new nii.j0((Clause) new TextLocalisedClause(com.revolut.feature.pix.impl.R$string.pix_alias_registration_success_title, zhm.u.c(new TextLocalisedClause(i, null, null, 14)), null, 12), (Clause) new TextLocalisedClause(com.revolut.feature.pix.impl.R$string.pix_alias_registration_success_subtitle, null, null, 14), (StatusDialogDescriptionProgress) null, (Parcelable) success, (u1) new v1(new TextLocalisedClause(com.revolut.feature.pix.impl.R$string.pix_alias_registration_action_copy, null, null, 14), null), false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (nii.h0) null, (ResourceImage) null, 4068);
                } else {
                    if (!(result2 instanceof AliasRegistrationResult.Failed)) {
                        if (result2 instanceof AliasRegistrationResult.PortabilityRequired) {
                            return null;
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    int i2 = d9a.b.f112357a[((AliasRegistrationResult.Failed) result2).f80383a.ordinal()];
                    if (i2 != 1) {
                        if (i2 != 2 && i2 != 3) {
                            if (i2 == 4) {
                                return d9a.c.b();
                            }
                            throw new NoWhenBranchMatchedException();
                        }
                        return d9a.c.a();
                    }
                    zVar = new nii.z(new TextLocalisedClause(com.revolut.feature.pix.impl.R$string.pix_request_ownership_failure_claim_unsupported_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.pix.impl.R$string.pix_request_ownership_failure_claim_unsupported_description, null, null, 14), null, new TextLocalisedClause(com.revolut.feature.pix.impl.R$string.pix_alias_registration_action_got_it, null, null, 14), null, null, false, null, null, null, null, null, null, 32732);
                }
                return zVar;
        }
    }

    public final boolean equals(Object obj2) {
        switch (this.f158327a) {
            case 0:
                if ((obj2 instanceof t1) && (obj2 instanceof kotlin.jvm.internal.n)) {
                    break;
                }
                break;
            case 1:
                if ((obj2 instanceof t1) && (obj2 instanceof kotlin.jvm.internal.n)) {
                    break;
                }
                break;
            case 2:
                if ((obj2 instanceof t1) && (obj2 instanceof kotlin.jvm.internal.n)) {
                    break;
                }
                break;
            default:
                if ((obj2 instanceof t1) && (obj2 instanceof kotlin.jvm.internal.n)) {
                    break;
                }
                break;
        }
        return Intrinsics.f(getFunctionDelegate(), ((kotlin.jvm.internal.n) obj2).getFunctionDelegate());
    }

    @Override // kotlin.jvm.internal.n
    public final Function getFunctionDelegate() {
        switch (this.f158327a) {
            case 0:
                return new kotlin.jvm.internal.q(1, 0, g0.class, (g0) this.f158328b, "handleOrderResult", "handleOrderResult(Lcom/revolut/retail/trading/core/domain/orders/OrderPlacementResult;)Lcom/revolut/kompot/common/dialog/status/StatusDialogConfiguration;");
            case 1:
                return new kotlin.jvm.internal.q(1, 0, q27.b.class, (q27.b) this.f158328b, "getSuccessRefundDialogConfig", "getSuccessRefundDialogConfig(Lcom/revolut/feature/freelancer/common/models/TransactionPaymentMethod;)Lcom/revolut/kompot/common/dialog/status/StatusDialogConfiguration$Success;");
            case 2:
                return new kotlin.jvm.internal.q(1, 0, w8a.i.class, (w8a.i) this.f158328b, "provideResultConfig", "provideResultConfig(Lcom/revolut/feature/pix/api/model/AliasDeletionResult;)Lcom/revolut/kompot/common/dialog/status/StatusDialogConfiguration;");
            default:
                return new kotlin.jvm.internal.q(1, 0, d9a.c.class, (d9a.c) this.f158328b, "provideResultConfig", "provideResultConfig(Lcom/revolut/feature/pix/api/model/AliasRegistrationResult;)Lcom/revolut/kompot/common/dialog/status/StatusDialogConfiguration;");
        }
    }

    public final int hashCode() {
        switch (this.f158327a) {
        }
        return getFunctionDelegate().hashCode();
    }
}

package ijj;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.data.model.Data;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import com.revolut.retail.feature.esim.api.model.EsimSubscriptionRefund;
import com.revolut.retail.feature.esim.impl.R$string;
import com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_cancellation.EsimMobilePlanCancellationFlowContract$EsimMobilePlanCancellationType;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_cancellation.EsimMobilePlanCancellationScreenContract$InputData;
import dej.d3;
import dfj.l4;
import dfj.m4;
import dfj.n4;
import dfj.o4;
import dfj.p4;
import dfj.q4;
import f23.y;
import i6f.h0;
import java.time.Instant;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import nii.c0;
import nii.j0;
import nii.u1;
import nii.y0;
import nii.z;
import vkm.j2;

/* JADX INFO: loaded from: classes11.dex */
public final class n extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_cancellation.b f161819w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_cancellation.b bVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f161819w = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                n nVar = new n(this.f161819w, continuation, 0);
                nVar.v = obj2;
                return nVar;
            default:
                n nVar2 = new n(this.f161819w, continuation, 1);
                nVar2.v = obj2;
                return nVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((n) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((n) create((q4) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        y0 y0Var;
        int i;
        boolean z;
        EsimSubscriptionRefund esimSubscriptionRefund;
        int i2;
        int i3;
        int i5;
        switch (this.u) {
            case 0:
                Data data = (Data) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_cancellation.b bVar = this.f161819w;
                bVar.H2(bVar.f101125t, new h0(data, 27));
                return Unit.f186387a;
            default:
                q4 q4Var = (q4) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_cancellation.b bVar2 = this.f161819w;
                EsimMobilePlanCancellationScreenContract$InputData esimMobilePlanCancellationScreenContract$InputData = bVar2.o;
                mjj.f fVar = bVar2.f101122q;
                boolean z3 = q4Var instanceof n4;
                Continuation continuation = null;
                EsimMobilePlanCancellationFlowContract$EsimMobilePlanCancellationType.Withdrawal withdrawal = EsimMobilePlanCancellationFlowContract$EsimMobilePlanCancellationType.Withdrawal.f100698a;
                Object cancellationType = EsimMobilePlanCancellationFlowContract$EsimMobilePlanCancellationType.Cancellation.f100697a;
                if (z3) {
                    fVar.getClass();
                    Intrinsics.checkNotNullParameter(cancellationType, "cancellationType");
                    if (cancellationType.equals(cancellationType)) {
                        i5 = R$string.esim_mobile_plans_cancellation_status_progress_title;
                    } else {
                        if (!cancellationType.equals(withdrawal)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i5 = R$string.esim_mobile_plans_withdrawal_status_progress_title;
                    }
                    y0Var = new y0("ID_LOADING_DIALOG", new c0(new TextLocalisedClause(i5, null, null, 14), null, null, false, null, false, false, null, 1918), false, 4);
                } else {
                    if (q4Var instanceof m4) {
                        EsimMobilePlanCancellationFlowContract$EsimMobilePlanCancellationType cancellationType2 = esimMobilePlanCancellationScreenContract$InputData.f101107b;
                        z = esimMobilePlanCancellationScreenContract$InputData.f != null;
                        fVar.getClass();
                        Intrinsics.checkNotNullParameter(cancellationType2, "cancellationType");
                        if (Intrinsics.f(cancellationType2, cancellationType)) {
                            i2 = R$string.esim_mobile_plans_cancellation_success_dialog_title;
                        } else {
                            if (!Intrinsics.f(cancellationType2, withdrawal)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            i2 = R$string.esim_mobile_plans_withdrawal_success_dialog_title;
                        }
                        if (z) {
                            if (Intrinsics.f(cancellationType2, cancellationType)) {
                                i3 = R$string.esim_mobile_plans_cancellation_success_dialog_subtitle_immediately_gifted;
                            } else {
                                if (!Intrinsics.f(cancellationType2, withdrawal)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                i3 = R$string.esim_mobile_plans_withdrawal_success_dialog_description_gifted;
                            }
                        } else if (Intrinsics.f(cancellationType2, cancellationType)) {
                            i3 = R$string.esim_mobile_plans_cancellation_success_dialog_subtitle_immediately;
                        } else {
                            if (!Intrinsics.f(cancellationType2, withdrawal)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            i3 = R$string.esim_mobile_plans_withdrawal_success_dialog_description;
                        }
                        y0Var = new y0("ID_SUCCESS_DIALOG", new j0((Clause) new TextLocalisedClause(i2, null, null, 14), (Clause) new TextLocalisedClause(i3, null, null, 14), (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (nii.h0) null, (ResourceImage) null, 4092), false, 4);
                    } else if (q4Var instanceof o4) {
                        d3 d3Var = (d3) ((f) ((j2) bVar2.f101125t.f22677a).getValue()).f161807a.getContent();
                        Instant cancellationDate = (d3Var == null || (esimSubscriptionRefund = d3Var.f113524b) == null) ? null : esimSubscriptionRefund.f100501g;
                        if (cancellationDate == null) {
                            fVar.getClass();
                            y0Var = new y0("ID_SUCCESS_DIALOG", new j0((Clause) new TextLocalisedClause(R$string.esim_mobile_plans_cancellation_success_dialog_title, null, null, 14), (Clause) null, (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (nii.h0) null, (ResourceImage) null, 4094), false, 4);
                        } else {
                            z = esimMobilePlanCancellationScreenContract$InputData.f != null;
                            fVar.getClass();
                            Intrinsics.checkNotNullParameter(cancellationDate, "cancellationDate");
                            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.esim_mobile_plans_cancellation_success_dialog_title, null, null, 14);
                            int i6 = z ? R$string.esim_mobile_plans_cancellation_success_dialog_subtitle_on_date_gifted : R$string.esim_mobile_plans_cancellation_success_dialog_subtitle_on_date;
                            long epochMilli = cancellationDate.toEpochMilli();
                            TimeClause.Format.INSTANCE.getClass();
                            y0Var = new y0("ID_SUCCESS_DIALOG", new j0((Clause) textLocalisedClause, (Clause) new TextLocalisedClause(i6, zhm.u.c(new TimeClause(epochMilli, TimeClause.Format.f57959a, null, null, 12)), null, 12), (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (nii.h0) null, (ResourceImage) null, 4092), false, 4);
                        }
                    } else if (q4Var instanceof l4) {
                        EsimMobilePlanCancellationFlowContract$EsimMobilePlanCancellationType cancellationType3 = esimMobilePlanCancellationScreenContract$InputData.f101107b;
                        fVar.getClass();
                        Intrinsics.checkNotNullParameter(cancellationType3, "cancellationType");
                        if (Intrinsics.f(cancellationType3, cancellationType)) {
                            i = R$string.esim_mobile_plans_cancellation_status_error_title;
                        } else {
                            if (!Intrinsics.f(cancellationType3, withdrawal)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            i = R$string.esim_mobile_plans_withdrawal_status_error_title;
                        }
                        y0Var = new y0("ID_GENERAL_ERROR_DIALOG", new z(new TextLocalisedClause(i, null, null, 14), new TextLocalisedClause(R$string.esim_mobile_plans_cancellation_status_error_subtitle, null, null, 14), new TextLocalisedClause(R$string.esim_mobile_plans_cancellation_status_error_action_try_again, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32756), false, 4);
                    } else {
                        if (!(q4Var instanceof p4)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        fVar.getClass();
                        y0Var = new y0("ID_TOKEN_EXPIRATION_ERROR_DIALOG", new z(new TextLocalisedClause(R$string.esim_refund_status_token_expired_title, null, null, 14), new TextLocalisedClause(R$string.esim_refund_status_token_expired_subtitle, null, null, 14), new TextLocalisedClause(R$string.esim_installation_dialog_error_try_again, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32756), false, 4);
                    }
                }
                yji.l.a1(bVar2, bVar2.X1(y0Var), null, null, new y(bVar2, y0Var, continuation, 29), 3);
                return Unit.f186387a;
        }
    }
}

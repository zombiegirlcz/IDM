package chj;

import android.os.Parcelable;
import aw0.ka;
import aw0.o9;
import aw0.p9;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.rewards.impl.ui.rent_and_bills.screen.link_payment.RentAndBillsLinkPaymentStatusDialogFactory$LinkPaymentErrorDialogPayload$PaymentLinkingFailed;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import com.revolut.retail.feature.esim.impl.R$string;
import dej.b3;
import dej.j3;
import grl.k9;
import java.io.Serializable;
import java.time.Instant;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import nii.t1;
import nii.u1;
import nii.w1;
import org.joda.time.LocalDate;
import tof.a3;
import tof.n1;
import tof.o1;
import tof.z6;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class h0 implements t1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f24255b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Serializable f24256c;
    public final /* synthetic */ Serializable d;

    public /* synthetic */ h0(Object obj2, Serializable serializable, Serializable serializable2, int i) {
        this.f24254a = i;
        this.f24255b = obj2;
        this.f24256c = serializable;
        this.d = serializable2;
    }

    @Override // nii.p1
    public final nii.m0 a(Object obj2) {
        int i = this.f24254a;
        TextLocalisedClause textLocalisedClause = null;
        Serializable serializable = this.d;
        Serializable serializable2 = this.f24256c;
        Object obj3 = this.f24255b;
        switch (i) {
            case 0:
                dej.e eVar = (dej.e) serializable2;
                Instant instant = (Instant) serializable;
                pjj.b bVar = ((u0) obj3).f24311p;
                j3 subscriptionState = ((b3) obj2).f113498a.f113651b;
                bVar.getClass();
                Intrinsics.checkNotNullParameter(subscriptionState, "subscriptionState");
                int i2 = eVar == null ? -1 : pjj.a.f236788a[eVar.ordinal()];
                if (i2 == -1) {
                    IllegalStateException illegalStateException = new IllegalStateException("planChangeType is null, can't build status dialog configuration");
                    zhm.h0 h0Var = zhm.h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, "EsimMobilePlanCheckoutPlanChangeDialogsBuilder", null, illegalStateException, h0Var);
                    return null;
                }
                if (i2 == 1) {
                    return pjj.b.a(new TextLocalisedClause(R$string.esim_checkout_success_plan_added_title, null, null, 14), subscriptionState == j3.ACTIVE ? new TextLocalisedClause(R$string.esim_checkout_upgrade_plan_success_subtitle, null, null, 14) : new TextLocalisedClause(R$string.esim_checkout_upgrade_plan_pending_subtitle, null, null, 14));
                }
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                if (instant == null) {
                    return pjj.b.a(new TextLocalisedClause(R$string.esim_checkout_success_plan_added_title, null, null, 14), subscriptionState == j3.ACTIVE ? new TextLocalisedClause(R$string.esim_checkout_change_plan_success_subtitle, null, null, 14) : new TextLocalisedClause(R$string.esim_checkout_change_plan_pending_subtitle, null, null, 14));
                }
                return pjj.b.a(new TextLocalisedClause(R$string.esim_checkout_change_plan_scheduled_title, null, null, 14), new TextLocalisedClause(R$string.esim_checkout_change_plan_scheduled_subtitle, zhm.u.c(new TimeClause(instant.toEpochMilli(), new TimeClause.Format.DateMedium(0), null, null, 12)), null, 12));
            case 1:
                a3 transaction = (a3) serializable2;
                n1 p2pTransferRequest = (n1) serializable;
                ((vr8.b) ((ekf.v) obj3).f127134r).getClass();
                Intrinsics.checkNotNullParameter(transaction, "transaction");
                Intrinsics.checkNotNullParameter(p2pTransferRequest, "p2pTransferRequest");
                int i3 = com.revolut.feature.junior_transfer_request.impl.R$string.rev_u18_transfer_payment_request_success_approved_title;
                o1 o1Var = p2pTransferRequest.f272942c;
                TextClause textClause = new TextClause(com.google.android.gms.internal.mlkit_vision_face.a.o(o1Var.f272960a, " ", o1Var.f272961b), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                z6 z6Var = transaction.G;
                String strC = z6Var != null ? z6Var.c() : null;
                if (strC == null) {
                    strC = "";
                }
                return new nii.j0((Clause) new TextLocalisedClause(i3, zhm.v.k(textClause, new TextClause(strC, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new MoneyClause(transaction.k.a(), new MoneyClause.Format.Defaults(null, null, false, false, 15), new Custom(new Custom.Color.Solid(R$attr.uikit_colorAccent), false, false, 254), null, 8)), null, 12), (Clause) null, (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (nii.h0) null, (ResourceImage) null, 4094);
            case 2:
                cjc.b bVar2 = ((ljc.r) obj3).f195645s;
                egc.a categoryType = (egc.a) serializable2;
                LocalDate localDate = (LocalDate) serializable;
                bgc.c cVar = (bgc.c) obj2;
                if (!(cVar instanceof bgc.b)) {
                    if (!Intrinsics.f(cVar, bgc.a.f15174a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    bVar2.getClass();
                    Intrinsics.checkNotNullParameter(categoryType, "categoryType");
                    return new nii.z(new TextLocalisedClause(mra.d.E(categoryType, com.revolut.feature.rewards.impl.R$string.rent_and_bills_link_payment_failure_rent_title, com.revolut.feature.rewards.impl.R$string.rent_and_bills_link_payment_failure_bills_title), null, null, 14), null, new TextLocalisedClause(com.revolut.feature.rewards.impl.R$string.rent_and_bills_link_payment_failure_common_primary_button_text, null, null, 14), null, null, RentAndBillsLinkPaymentStatusDialogFactory$LinkPaymentErrorDialogPayload$PaymentLinkingFailed.f84979a, true, null, null, null, null, null, null, 32374);
                }
                double d = ((bgc.b) cVar).f15175a;
                bVar2.getClass();
                Intrinsics.checkNotNullParameter(categoryType, "categoryType");
                TextLocalisedQuantityClause textLocalisedQuantityClauseA = bkc.d.a(d, p9.ONLY_NEGATIVE);
                TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(mra.d.E(categoryType, com.revolut.feature.rewards.impl.R$string.rent_and_bills_link_payment_success_rent_title, com.revolut.feature.rewards.impl.R$string.rent_and_bills_link_payment_success_bills_title), null, null, 14);
                TextLocalisedClause textLocalisedClause3 = localDate != null ? new TextLocalisedClause(mra.d.E(categoryType, com.revolut.feature.rewards.impl.R$string.rent_and_bills_link_payment_success_rent_description, com.revolut.feature.rewards.impl.R$string.rent_and_bills_link_payment_success_bills_description), zhm.v.k(new TimeClause(localDate.toDateTimeAtStartOfDay().getMillis(), new TimeClause.Format.DayAndMonth(ka.SHORT), null, null, 12), textLocalisedQuantityClauseA), null, 12) : new TextLocalisedClause(com.revolut.feature.rewards.impl.R$string.rent_and_bills_link_payment_success_common_description, zhm.u.c(textLocalisedQuantityClauseA), null, 12);
                TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(com.revolut.feature.rewards.impl.R$string.rent_and_bills_link_payment_success_common_primary_button_text, null, null, 14);
                int i5 = cjc.a.f24634a[categoryType.ordinal()];
                if (i5 == 1) {
                    textLocalisedClause = new TextLocalisedClause(com.revolut.feature.rewards.impl.R$string.rent_and_bills_link_payment_success_bills_secondary_button_text, null, null, 14);
                } else if (i5 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                w1 w1Var = new w1(2, textLocalisedClause4, textLocalisedClause);
                k9 k9Var = k9.Premium;
                Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
                return new nii.j0((Clause) textLocalisedClause2, (Clause) textLocalisedClause3, (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) w1Var, false, (AnalyticsProduct) com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), (AnalyticsContext) null, (StatusViewContract$Duration) null, (nii.h0) null, (ResourceImage) null, 4012);
            default:
                dj0.d amount = (dj0.d) obj3;
                String creditorName = (String) serializable2;
                Long l2 = (Long) serializable;
                Intrinsics.checkNotNullParameter(amount, "amount");
                Intrinsics.checkNotNullParameter(creditorName, "creditorName");
                return new nii.j0((Clause) new TextLocalisedClause(com.revolut.feature.pix.impl.R$string.pix_authorisation_request_down_payment_payment_successful_modal_title_format, zhm.v.k(new MoneyClause(amount, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), new TextClause(creditorName, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), (Clause) (l2 != null ? new TextLocalisedClause(com.revolut.feature.pix.impl.R$string.pix_authorisation_request_down_payment_payment_successful_modal_description_format, zhm.u.c(new TimeClause(l2.longValue(), new TimeClause.Format.Pretty(com.revolut.core.ui_kit.models.q0.ONLY_DATE), null, null, 12)), null, 12) : null), (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (nii.h0) null, (ResourceImage) null, 4092);
        }
    }
}

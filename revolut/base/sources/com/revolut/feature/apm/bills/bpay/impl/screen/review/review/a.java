package com.revolut.feature.apm.bills.bpay.impl.screen.review.review;

import android.os.Parcelable;
import cli.g;
import cli.y;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.feature.apm.bills.bpay.impl.model.BPayPaymentData;
import com.revolut.feature.apm.bills.bpay.impl.screen.review.review.BPayReviewScreenContract$ModalStep;
import com.revolut.feature.transfer.core.R$string;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import com.revolut.retail.feature.transfer.schedule.models.TransferScheduleData;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import l80.e;
import mra.d;
import nii.h0;
import nii.j0;
import nii.u1;
import oc.c;
import oki.h;
import org.jetbrains.annotations.NotNull;
import qua.p;
import sbb.w;
import so1.f;
import so1.j;
import so1.k;
import so1.l;
import so1.m;
import so1.n;
import so1.q;
import so1.r;
import so1.s;
import so1.x;
import vkm.j2;
import xn1.b;
import zh9.u0;
import zhm.v;
import zjh.i;

/* JADX INFO: loaded from: classes20.dex */
public final class a extends h implements j {

    @NotNull
    public static final s Companion = new s();
    public final q12.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final b f61238p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e f61239q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final wj0.a f61240r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final i f61241s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ko1.b f61242t;
    public final co9.b u;
    public final xua.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final qpk.b f61243w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final y f61244x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f61245y;

    public a(BPayReviewScreenContract$InputData inputData, q12.a apmErrorProvider, b bPayBillRepository, e dateProvider, wj0.a idempotencyKeyHolder, i scheduleScreenProvider, ko1.b scheduledDataExtension, co9.b paymentCounterpartyInteractor, xua.a recurringPaymentInteractor, qpk.b rateDetailsFeatureConfigProvider, q stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(apmErrorProvider, "apmErrorProvider");
        Intrinsics.checkNotNullParameter(bPayBillRepository, "bPayBillRepository");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(idempotencyKeyHolder, "idempotencyKeyHolder");
        Intrinsics.checkNotNullParameter(scheduleScreenProvider, "scheduleScreenProvider");
        Intrinsics.checkNotNullParameter(scheduledDataExtension, "scheduledDataExtension");
        Intrinsics.checkNotNullParameter(paymentCounterpartyInteractor, "paymentCounterpartyInteractor");
        Intrinsics.checkNotNullParameter(recurringPaymentInteractor, "recurringPaymentInteractor");
        Intrinsics.checkNotNullParameter(rateDetailsFeatureConfigProvider, "rateDetailsFeatureConfigProvider");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = apmErrorProvider;
        this.f61238p = bPayBillRepository;
        this.f61239q = dateProvider;
        this.f61240r = idempotencyKeyHolder;
        this.f61241s = scheduleScreenProvider;
        this.f61242t = scheduledDataExtension;
        this.u = paymentCounterpartyInteractor;
        this.v = recurringPaymentInteractor;
        this.f61243w = rateDetailsFeatureConfigProvider;
        BPayPaymentData bPayPaymentData = inputData.f61233a;
        this.f61244x = d.b(this, new f(bPayPaymentData, inputData.f61234b || inputData.d != null, inputData.f61235c, inputData.d, inputData.e, inputData.f, inputData.f61236g), stateMapper, null, false, 12);
        this.f61245y = hx7.e.a(this, new scl.h(this, 22));
    }

    public static final ro1.b I2(a aVar) {
        ko1.b bVar = aVar.f61242t;
        y yVar = aVar.f61244x;
        dj0.d dVar = ((f) ((j2) yVar.f22677a).getValue()).f264673a.f61213b;
        no1.a aVar2 = no1.a.BILLER_CODE;
        j2 j2Var = (j2) yVar.f22677a;
        no1.b bVar2 = new no1.b(aVar2, ((f) j2Var.getValue()).f264673a.f61212a.f61210b);
        String str = ((f) j2Var.getValue()).f264673a.f61212a.d;
        no1.b[] elements = {bVar2, str != null ? new no1.b(no1.a.REFERENCE_NUMBER, str) : null};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        String str2 = ((f) j2Var.getValue()).f.f61215a.f163145a;
        TransferScheduleData scheduledData = ((f) j2Var.getValue()).f264675c;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(scheduledData, "scheduledData");
        long j2 = scheduledData.f104285a;
        return new ro1.b(dVar, listL, str2, j2 != 0 ? c.I(j2).format(bVar.f186203a) : null, ko1.b.a(((f) j2Var.getValue()).f264675c), ((f) j2Var.getValue()).f264673a.f61212a.f);
    }

    public static final j0 J2(a aVar) {
        int i = R$string.transfer_result_outgoing_schedule_success_title;
        y yVar = aVar.f61244x;
        return new j0((Clause) new TextLocalisedClause(i, v.k(new MoneyClause(((f) ((j2) yVar.f22677a).getValue()).f264673a.f61213b, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), ((f) ((j2) yVar.f22677a).getValue()).f264673a.f61212a.f61209a), null, 12), (Clause) null, (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4094);
    }

    @Override // yji.l
    public final void I1() {
        this.f61240r.a("IDEMPOTENCY_TAG_BPAY_PAY_BILL");
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f61245y;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void K2(n uiEvent) {
        Intrinsics.checkNotNullParameter(uiEvent, "uiEvent");
        boolean z = uiEvent instanceof k;
        Continuation continuation = null;
        y yVar = this.f61244x;
        if (!z) {
            if (!uiEvent.equals(l.f264681a)) {
                if (!uiEvent.equals(m.f264682a)) {
                    throw new NoWhenBranchMatchedException();
                }
                B2();
                return;
            }
            j2 j2Var = (j2) yVar.f22677a;
            j2 j2Var2 = (j2) yVar.f22677a;
            if (!n1l.b.d(((f) j2Var.getValue()).f264675c, ((l80.f) this.f61239q).f())) {
                l2(new x(this, continuation, 0), new yi5.b(26));
                return;
            }
            if (((f) j2Var2.getValue()).d == null) {
                l2(new x(this, continuation, 1), new yi5.b(26));
                return;
            }
            p pVar = ((f) j2Var2.getValue()).d;
            if (pVar == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            l2(new w(this, pVar, continuation, 20), new yi5.b(26));
            return;
        }
        String str = ((k) uiEvent).f264680a;
        switch (str.hashCode()) {
            case 110083771:
                if (!str.equals("ID_TRANSFER_REVIEW_SCHEDULED_END_DATE")) {
                    return;
                }
                break;
            case 268971352:
                if (str.equals("ID_EXCHANGE_RATE")) {
                    xi0.a aVar = xi0.b.Companion;
                    String str2 = ((f) ((j2) yVar.f22677a).getValue()).f.f61215a.f163147c;
                    aVar.getClass();
                    C1(u0.c(dpk.a.a(this.f61243w, xi0.a.a(str2), xi0.b.f306276m, false, false)));
                    return;
                }
                return;
            case 821085706:
                if (!str.equals("ID_TRANSFER_REVIEW_SCHEDULED_PERIOD")) {
                    return;
                }
                break;
            case 988201527:
                if (!str.equals("ID_TRANSFER_REVIEW_SCHEDULED_DATE")) {
                    return;
                }
                break;
            case 1619753652:
                if (str.equals("ID_TRANSFER_REVIEW_REFERENCE")) {
                    String str3 = ((f) ((j2) yVar.f22677a).getValue()).f264673a.f61212a.f;
                    if (str3 == null) {
                        str3 = "";
                    }
                    h.v2(this.f61245y, new BPayReviewScreenContract$ModalStep.EditLabel(str3), ModalDestination.Style.POPUP.f98311a);
                    return;
                }
                return;
            default:
                return;
        }
        f fVar = (f) ((j2) yVar.f22677a).getValue();
        yji.l.g2(this, this.f61241s.h(fVar.e, fVar.f264675c, fVar.f264673a.f61212a.e), null, new r(this, 0), 1);
    }

    @Override // cli.z
    public final g getState() {
        return this.f61244x;
    }
}

package com.revolut.retail.feature.pending_payments.impl.ui;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.error.data.model.ServerError;
import com.revolut.core.network.exceptions.HandledNetworkException;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.feature.twofa.exceptions.UserDeclinedTwoFaException;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import com.revolut.retail.feature.pending_payments.api.navigation.PendingPaymentContract$InputData;
import com.revolut.retail.feature.pending_payments.api.navigation.PendingPaymentResult$StatusDialog;
import com.revolut.retail.feature.pending_payments.impl.ui.PendingPaymentFlowContract$Step;
import cp5.d;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import nii.h0;
import nii.j0;
import nii.u1;
import nii.y0;
import nii.z;
import ofm.q;
import oki.h;
import v60.e;
import x2g.b;
import xak.c;
import yji.l;
import zhm.f0;

/* JADX INFO: loaded from: classes11.dex */
public final class a extends h implements c {
    public final xak.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final abk.c f102425p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final PendingPaymentContract$InputData f102426q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final yki.a f102427r;

    public a(xak.a dialogProvider, abk.c errorProvider, PendingPaymentContract$InputData flowInputData) {
        Intrinsics.checkNotNullParameter(dialogProvider, "dialogProvider");
        Intrinsics.checkNotNullParameter(errorProvider, "errorProvider");
        Intrinsics.checkNotNullParameter(flowInputData, "flowInputData");
        this.o = dialogProvider;
        this.f102425p = errorProvider;
        this.f102426q = flowInputData;
        b bVar = new b(this, 14);
        this.f102427r = d.a(this, PendingPaymentFlowContract$Step.Confirmation.f102424a, f0.f322471a, bVar);
    }

    public final void I2(PendingPaymentResult$StatusDialog pendingPaymentResult$StatusDialog) {
        l.a1(this, X1(new y0(null, new j0(pendingPaymentResult$StatusDialog.f102415a, pendingPaymentResult$StatusDialog.f102416b, (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, true, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) StatusViewContract$Duration.Short.f59734a, (h0) null, (ResourceImage) null, 3548), false, 5)), null, null, new wo2.l(pendingPaymentResult$StatusDialog, this, (Continuation) null, 6), 3);
    }

    @Override // yji.l
    public final boolean o1(Throwable throwable) {
        z zVar;
        v60.d bVar;
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        abk.c cVar = this.f102425p;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        if ((throwable instanceof UserDeclinedTwoFaException) || (throwable instanceof HandledNetworkException)) {
            zVar = null;
        } else {
            ServerError serverErrorA = cVar.f2976a.a(throwable);
            Integer numValueOf = serverErrorA != null ? Integer.valueOf(serverErrorA.f51362a) : null;
            e eVar = cVar.f2977b;
            if (numValueOf == null || (bVar = ((ao0.a) eVar).b(numValueOf)) == null) {
                bVar = new v60.b();
            }
            zVar = new z(q.O(bVar), null, null, null, null, null, false, null, null, null, null, null, null, 32766);
        }
        if (zVar == null) {
            return false;
        }
        l.a1(this, X1(new y0(null, zVar, false, 5)), null, null, new xak.d(this, null), 3);
        return true;
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f102427r;
    }
}

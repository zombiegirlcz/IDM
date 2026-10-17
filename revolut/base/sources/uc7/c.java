package uc7;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import com.revolut.retail.operation_status.modal_status.StatusViewConfiguration;
import com.revolut.retail.operation_status.modal_status.StatusViewDescriptionProgress;
import com.revolut.retail.operation_status.modal_status.SuccessType;
import efm.r;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import nii.b0;
import nii.c0;
import nii.e0;
import nii.g0;
import nii.h0;
import nii.j;
import nii.j0;
import nii.l0;
import nii.m0;
import nii.u0;
import nii.u1;
import nii.v;
import nii.v1;
import nii.w1;
import nii.y0;
import nii.z;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import pfm.h;
import yji.n;

/* JADX INFO: loaded from: classes21.dex */
public final class c extends n implements g3l.a {
    public static StatusDialogDescriptionProgress b3(StatusViewDescriptionProgress statusViewDescriptionProgress) {
        if (statusViewDescriptionProgress != null) {
            return new StatusDialogDescriptionProgress(statusViewDescriptionProgress.f104391a, statusViewDescriptionProgress.f104392b);
        }
        return null;
    }

    @Override // qm.a
    /* JADX INFO: renamed from: Z2, reason: merged with bridge method [inline-methods] */
    public final void D(StatusViewConfiguration payload) {
        m0 vVar;
        u1 w1Var;
        h0 h0Var;
        Intrinsics.checkNotNullParameter(payload, "payload");
        String f104385a = payload.getF104385a();
        if (payload instanceof StatusViewConfiguration.Success) {
            StatusViewConfiguration.Success success = (StatusViewConfiguration.Success) payload;
            Clause clause = success.f104380b;
            Clause clause2 = success.f104381c;
            StatusDialogDescriptionProgress statusDialogDescriptionProgressB3 = b3(success.f104384j);
            Parcelable parcelable = success.d;
            SuccessType successType = success.f104383h;
            if (successType instanceof SuccessType.Simple) {
                w1Var = u1.b.f216225a;
            } else if (successType instanceof SuccessType.OptionalAction) {
                SuccessType.OptionalAction optionalAction = (SuccessType.OptionalAction) successType;
                w1Var = new v1(optionalAction.f104393a, optionalAction.f104394b);
            } else {
                if (!(successType instanceof SuccessType.ResultAction)) {
                    throw new NoWhenBranchMatchedException();
                }
                SuccessType.ResultAction resultAction = (SuccessType.ResultAction) successType;
                w1Var = new w1(2, resultAction.f104396a, resultAction.f104397b);
            }
            boolean z = success.f104382g;
            StatusViewContract$Duration statusViewContract$Duration = success.k;
            int i = b.f279001a[success.i.ordinal()];
            if (i == 1) {
                h0Var = h0.NONE;
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                h0Var = h0.CONFETTI;
            }
            vVar = new j0(clause, clause2, statusDialogDescriptionProgressB3, parcelable, w1Var, z, (AnalyticsProduct) null, (AnalyticsContext) null, statusViewContract$Duration, h0Var, (ResourceImage) null, 2496);
        } else if (payload instanceof StatusViewConfiguration.Error) {
            StatusViewConfiguration.Error error = (StatusViewConfiguration.Error) payload;
            vVar = new z(error.f104349b, error.f104350c, error.d, error.e, null, error.f104351g, error.f104353j, null, null, null, u0.DEFAULT, null, null, 28244);
        } else if (payload instanceof StatusViewConfiguration.Pending) {
            StatusViewConfiguration.Pending pending = (StatusViewConfiguration.Pending) payload;
            vVar = new g0(pending.f104372b, pending.f104373c, b3(pending.k), pending.d, pending.e, null, pending.f104374g, pending.f104376j ? j.a.f216169a : j.b.f216170a, pending.f104377l, null, false, null, 15904);
        } else if (payload instanceof StatusViewConfiguration.Warning) {
            StatusViewConfiguration.Warning warning = (StatusViewConfiguration.Warning) payload;
            vVar = new l0(warning.f104386b, warning.f104387c, b3(warning.i), warning.d, warning.e, warning.f, warning.f104390j, null, 896);
        } else if (payload instanceof StatusViewConfiguration.NoConnection) {
            StatusViewConfiguration.NoConnection noConnection = (StatusViewConfiguration.NoConnection) payload;
            vVar = new e0(noConnection.f104368b, noConnection.f104369c, (TextLocalisedClause) null, noConnection.d, noConnection.f104370g, (AnalyticsProduct) null, 972);
        } else if (payload instanceof StatusViewConfiguration.LoadingFinite) {
            StatusViewConfiguration.LoadingFinite loadingFinite = (StatusViewConfiguration.LoadingFinite) payload;
            Clause clause3 = loadingFinite.f104357b;
            Clause clause4 = loadingFinite.f104358c;
            StatusDialogDescriptionProgress statusDialogDescriptionProgressB32 = b3(loadingFinite.f104359g);
            Parcelable parcelable2 = loadingFinite.d;
            r rVarJust = r.just(0);
            Intrinsics.checkNotNullExpressionValue(rVarJust, "just(...)");
            vVar = new b0(clause3, clause4, statusDialogDescriptionProgressB32, parcelable2, rVarJust, 0, loadingFinite.i, loadingFinite.f104360h, null, NewHope.SENDA_BYTES);
        } else if (payload instanceof StatusViewConfiguration.LoadingIndefinite) {
            StatusViewConfiguration.LoadingIndefinite loadingIndefinite = (StatusViewConfiguration.LoadingIndefinite) payload;
            vVar = new c0(loadingIndefinite.f104362b, loadingIndefinite.f104363c, loadingIndefinite.d, loadingIndefinite.f104366j, loadingIndefinite.f104364g, loadingIndefinite.f104365h, loadingIndefinite.i, null, 1796);
        } else {
            if (!(payload instanceof StatusViewConfiguration.ContextualAlert)) {
                throw new NoWhenBranchMatchedException();
            }
            StatusViewConfiguration.ContextualAlert contextualAlert = (StatusViewConfiguration.ContextualAlert) payload;
            vVar = new v(contextualAlert.f104342b, contextualAlert.f104343c, contextualAlert.d, contextualAlert.e, contextualAlert.f, contextualAlert.f104345h, b3(contextualAlert.f104344g), contextualAlert.f104346j, contextualAlert.i, contextualAlert.k, 3072);
        }
        L2(new y0(f104385a, vVar, false, 4));
    }

    @Override // qm.a
    public final efm.b c0(Object obj2) {
        StatusViewConfiguration payload = (StatusViewConfiguration) obj2;
        Intrinsics.checkNotNullParameter(payload, "payload");
        h hVar = new h(new rzc.b(this, payload, 24), 2);
        Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
        return o70.a.d(hVar);
    }
}

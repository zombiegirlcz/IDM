package com.revolut.retail.operation_status.modal_status;

import com.google.android.material.internal.ViewUtils;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import com.revolut.retail.operation_status.modal_status.StatusViewConfiguration;
import com.revolut.retail.operation_status.modal_status.SuccessType;
import efm.r;
import k3l.e;
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
import nii.y;
import nii.z;

/* JADX INFO: loaded from: classes12.dex */
public abstract class a {
    public static final m0 a(StatusViewConfiguration statusViewConfiguration) {
        u1 w1Var;
        u1 u1Var;
        h0 h0Var;
        Intrinsics.checkNotNullParameter(statusViewConfiguration, "<this>");
        boolean z = !statusViewConfiguration.getF104390j();
        if (statusViewConfiguration instanceof StatusViewConfiguration.Success) {
            StatusViewConfiguration.Success success = (StatusViewConfiguration.Success) statusViewConfiguration;
            Clause clause = success.f104380b;
            Clause clause2 = success.f104381c;
            StatusDialogDescriptionProgress statusDialogDescriptionProgressB = b(success.f104384j);
            SuccessType successType = success.f104383h;
            if (successType instanceof SuccessType.Simple) {
                u1Var = u1.b.f216225a;
            } else {
                if (successType instanceof SuccessType.OptionalAction) {
                    SuccessType.OptionalAction optionalAction = (SuccessType.OptionalAction) successType;
                    w1Var = new v1(optionalAction.f104393a, optionalAction.f104394b);
                } else {
                    if (!(successType instanceof SuccessType.ResultAction)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    SuccessType.ResultAction resultAction = (SuccessType.ResultAction) successType;
                    w1Var = new w1(2, resultAction.f104396a, resultAction.f104397b);
                }
                u1Var = w1Var;
            }
            StatusViewContract$Duration statusViewContract$Duration = success.k;
            int i = e.f180814a[success.i.ordinal()];
            if (i == 1) {
                h0Var = h0.NONE;
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                h0Var = h0.CONFETTI;
            }
            return new j0(clause, clause2, statusDialogDescriptionProgressB, success, u1Var, z, success.e, (AnalyticsContext) null, statusViewContract$Duration, h0Var, (ResourceImage) null, 2432);
        }
        if (statusViewConfiguration instanceof StatusViewConfiguration.Error) {
            StatusViewConfiguration.Error error = (StatusViewConfiguration.Error) statusViewConfiguration;
            return new z(error.f104349b, error.f104350c, error.d, error.e, error.f, error, z, error.f104352h, null, null, u0.DEFAULT, new y(error.f104354l, error.k), error.f104355m, 3092);
        }
        if (statusViewConfiguration instanceof StatusViewConfiguration.Pending) {
            StatusViewConfiguration.Pending pending = (StatusViewConfiguration.Pending) statusViewConfiguration;
            return new g0(pending.f104372b, pending.f104373c, b(pending.k), pending.d, pending.e, pending.f, statusViewConfiguration, pending.f104376j ? j.a.f216169a : j.b.f216170a, z, pending.f104375h, pending.f104378m, null, 11264);
        }
        if (statusViewConfiguration instanceof StatusViewConfiguration.Warning) {
            StatusViewConfiguration.Warning warning = (StatusViewConfiguration.Warning) statusViewConfiguration;
            return new l0(warning.f104386b, warning.f104387c, b(warning.i), warning.d, warning.e, statusViewConfiguration, z, warning.f104388g, ViewUtils.EDGE_TO_EDGE_FLAGS);
        }
        if (statusViewConfiguration instanceof StatusViewConfiguration.NoConnection) {
            StatusViewConfiguration.NoConnection noConnection = (StatusViewConfiguration.NoConnection) statusViewConfiguration;
            return new e0(noConnection.f104368b, noConnection.f104369c, (TextLocalisedClause) null, statusViewConfiguration, z, noConnection.e, 908);
        }
        if (statusViewConfiguration instanceof StatusViewConfiguration.LoadingFinite) {
            StatusViewConfiguration.LoadingFinite loadingFinite = (StatusViewConfiguration.LoadingFinite) statusViewConfiguration;
            Clause clause3 = loadingFinite.f104357b;
            Clause clause4 = loadingFinite.f104358c;
            int i2 = loadingFinite.f104359g.f104391a;
            r rVarNever = r.never();
            Intrinsics.checkNotNullExpressionValue(rVarNever, "never(...)");
            return new b0(clause3, clause4, null, loadingFinite, rVarNever, i2, z, loadingFinite.f104360h, loadingFinite.e, 1540);
        }
        if (statusViewConfiguration instanceof StatusViewConfiguration.LoadingIndefinite) {
            StatusViewConfiguration.LoadingIndefinite loadingIndefinite = (StatusViewConfiguration.LoadingIndefinite) statusViewConfiguration;
            return new c0(loadingIndefinite.f104362b, loadingIndefinite.f104363c, loadingIndefinite, z, loadingIndefinite.f104364g, loadingIndefinite.f104365h, loadingIndefinite.i, loadingIndefinite.e, 1540);
        }
        if (!(statusViewConfiguration instanceof StatusViewConfiguration.ContextualAlert)) {
            throw new NoWhenBranchMatchedException();
        }
        StatusViewConfiguration.ContextualAlert contextualAlert = (StatusViewConfiguration.ContextualAlert) statusViewConfiguration;
        return new v(contextualAlert.f104342b, contextualAlert.f104343c, contextualAlert.d, contextualAlert.e, contextualAlert.f, contextualAlert.f104345h, b(contextualAlert.f104344g), statusViewConfiguration, contextualAlert.i, contextualAlert.k, 3072);
    }

    public static final StatusDialogDescriptionProgress b(StatusViewDescriptionProgress statusViewDescriptionProgress) {
        if (statusViewDescriptionProgress == null) {
            return null;
        }
        return new StatusDialogDescriptionProgress(statusViewDescriptionProgress.f104391a, statusViewDescriptionProgress.f104392b);
    }
}

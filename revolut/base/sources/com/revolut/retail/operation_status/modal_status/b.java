package com.revolut.retail.operation_status.modal_status;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.retail.operation_status.modal_status.StatusViewConfiguration;
import efm.r;
import ix0.b2;
import j2c.o;
import js7.c;
import k3k.l;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public abstract class b {
    public static final StatusViewConfiguration a(StatusViewConfiguration statusViewConfiguration) {
        Intrinsics.checkNotNullParameter(statusViewConfiguration, "<this>");
        if (statusViewConfiguration instanceof StatusViewConfiguration.Success) {
            StatusViewConfiguration.Success success = (StatusViewConfiguration.Success) statusViewConfiguration;
            String id10 = success.f104379a;
            Clause title = success.f104380b;
            Clause clause = success.f104381c;
            Parcelable parcelable = success.d;
            AnalyticsProduct analyticsProduct = success.e;
            AnalyticsContext analyticsContext = success.f;
            SuccessType successType = success.f104383h;
            k3l.a overlayAnimation = success.i;
            StatusViewDescriptionProgress statusViewDescriptionProgress = success.f104384j;
            StatusViewContract$Duration duration = success.k;
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(successType, "successType");
            Intrinsics.checkNotNullParameter(overlayAnimation, "overlayAnimation");
            Intrinsics.checkNotNullParameter(duration, "duration");
            return new StatusViewConfiguration.Success(id10, title, clause, parcelable, analyticsProduct, analyticsContext, false, successType, overlayAnimation, statusViewDescriptionProgress, duration);
        }
        if (statusViewConfiguration instanceof StatusViewConfiguration.LoadingIndefinite) {
            return StatusViewConfiguration.LoadingIndefinite.c((StatusViewConfiguration.LoadingIndefinite) statusViewConfiguration, 511);
        }
        if (statusViewConfiguration instanceof StatusViewConfiguration.Error) {
            StatusViewConfiguration.Error error = (StatusViewConfiguration.Error) statusViewConfiguration;
            String id11 = error.f104348a;
            Clause title2 = error.f104349b;
            Clause clause2 = error.f104350c;
            Clause clause3 = error.d;
            Clause clause4 = error.e;
            Image image = error.f;
            Parcelable parcelable2 = error.f104351g;
            AnalyticsProduct analyticsProduct2 = error.f104352h;
            AnalyticsContext analyticsContext2 = error.i;
            Integer num = error.k;
            String str = error.f104354l;
            String dialogBreadcrumb = error.f104355m;
            Intrinsics.checkNotNullParameter(id11, "id");
            Intrinsics.checkNotNullParameter(title2, "title");
            Intrinsics.checkNotNullParameter(dialogBreadcrumb, "dialogBreadcrumb");
            return new StatusViewConfiguration.Error(id11, title2, clause2, clause3, clause4, image, parcelable2, analyticsProduct2, analyticsContext2, false, num, str, dialogBreadcrumb);
        }
        if (statusViewConfiguration instanceof StatusViewConfiguration.LoadingFinite) {
            StatusViewConfiguration.LoadingFinite loadingFinite = (StatusViewConfiguration.LoadingFinite) statusViewConfiguration;
            String id12 = loadingFinite.f104356a;
            Clause title3 = loadingFinite.f104357b;
            Clause clause5 = loadingFinite.f104358c;
            Parcelable parcelable3 = loadingFinite.d;
            AnalyticsProduct analyticsProduct3 = loadingFinite.e;
            AnalyticsContext analyticsContext3 = loadingFinite.f;
            StatusViewDescriptionProgress descriptionProgress = loadingFinite.f104359g;
            boolean z = loadingFinite.f104360h;
            Intrinsics.checkNotNullParameter(id12, "id");
            Intrinsics.checkNotNullParameter(title3, "title");
            Intrinsics.checkNotNullParameter(descriptionProgress, "descriptionProgress");
            return new StatusViewConfiguration.LoadingFinite(id12, title3, clause5, parcelable3, analyticsProduct3, analyticsContext3, descriptionProgress, z, false);
        }
        if (statusViewConfiguration instanceof StatusViewConfiguration.Pending) {
            StatusViewConfiguration.Pending pending = (StatusViewConfiguration.Pending) statusViewConfiguration;
            String id13 = pending.f104371a;
            Clause title4 = pending.f104372b;
            Clause clause6 = pending.f104373c;
            Clause clause7 = pending.d;
            Clause clause8 = pending.e;
            Image image2 = pending.f;
            Parcelable parcelable4 = pending.f104374g;
            AnalyticsProduct analyticsProduct4 = pending.f104375h;
            AnalyticsContext analyticsContext4 = pending.i;
            boolean z3 = pending.f104376j;
            StatusViewDescriptionProgress statusViewDescriptionProgress2 = pending.k;
            boolean z4 = pending.f104378m;
            Intrinsics.checkNotNullParameter(id13, "id");
            Intrinsics.checkNotNullParameter(title4, "title");
            return new StatusViewConfiguration.Pending(id13, title4, clause6, clause7, clause8, image2, parcelable4, analyticsProduct4, analyticsContext4, z3, statusViewDescriptionProgress2, false, z4);
        }
        if (statusViewConfiguration instanceof StatusViewConfiguration.NoConnection) {
            StatusViewConfiguration.NoConnection noConnection = (StatusViewConfiguration.NoConnection) statusViewConfiguration;
            String id14 = noConnection.f104367a;
            Clause title5 = noConnection.f104368b;
            Clause clause9 = noConnection.f104369c;
            Parcelable parcelable5 = noConnection.d;
            AnalyticsProduct analyticsProduct5 = noConnection.e;
            AnalyticsContext analyticsContext5 = noConnection.f;
            Intrinsics.checkNotNullParameter(id14, "id");
            Intrinsics.checkNotNullParameter(title5, "title");
            return new StatusViewConfiguration.NoConnection(id14, title5, clause9, parcelable5, analyticsProduct5, analyticsContext5, false);
        }
        if (statusViewConfiguration instanceof StatusViewConfiguration.Warning) {
            StatusViewConfiguration.Warning warning = (StatusViewConfiguration.Warning) statusViewConfiguration;
            String id15 = warning.f104385a;
            Clause title6 = warning.f104386b;
            Clause clause10 = warning.f104387c;
            Clause clause11 = warning.d;
            Clause clause12 = warning.e;
            Parcelable parcelable6 = warning.f;
            AnalyticsProduct analyticsProduct6 = warning.f104388g;
            AnalyticsContext analyticsContext6 = warning.f104389h;
            StatusViewDescriptionProgress statusViewDescriptionProgress3 = warning.i;
            Intrinsics.checkNotNullParameter(id15, "id");
            Intrinsics.checkNotNullParameter(title6, "title");
            return new StatusViewConfiguration.Warning(id15, title6, clause10, clause11, clause12, parcelable6, analyticsProduct6, analyticsContext6, statusViewDescriptionProgress3, false);
        }
        if (!(statusViewConfiguration instanceof StatusViewConfiguration.ContextualAlert)) {
            throw new NoWhenBranchMatchedException();
        }
        StatusViewConfiguration.ContextualAlert contextualAlert = (StatusViewConfiguration.ContextualAlert) statusViewConfiguration;
        String id16 = contextualAlert.f104341a;
        Clause title7 = contextualAlert.f104342b;
        Clause description = contextualAlert.f104343c;
        Image titleImage = contextualAlert.d;
        Clause primaryButtonText = contextualAlert.e;
        Clause secondaryButtonText = contextualAlert.f;
        StatusViewDescriptionProgress statusViewDescriptionProgress4 = contextualAlert.f104344g;
        b2 b2Var = contextualAlert.f104345h;
        Parcelable parcelable7 = contextualAlert.f104346j;
        AnalyticsProduct analyticsProduct7 = contextualAlert.k;
        AnalyticsContext analyticsContext7 = contextualAlert.f104347l;
        Intrinsics.checkNotNullParameter(id16, "id");
        Intrinsics.checkNotNullParameter(title7, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(titleImage, "titleImage");
        Intrinsics.checkNotNullParameter(primaryButtonText, "primaryButtonText");
        Intrinsics.checkNotNullParameter(secondaryButtonText, "secondaryButtonText");
        return new StatusViewConfiguration.ContextualAlert(id16, title7, description, titleImage, primaryButtonText, secondaryButtonText, statusViewDescriptionProgress4, b2Var, false, parcelable7, analyticsProduct7, analyticsContext7);
    }

    public static r b(r rVar, k3l.b statusDialogView, Function1 successConfig) {
        StatusViewConfiguration.LoadingIndefinite loadingConfig = new StatusViewConfiguration.LoadingIndefinite(254, null, "operation_status_id");
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        Intrinsics.checkNotNullParameter(statusDialogView, "statusDialogView");
        Intrinsics.checkNotNullParameter(loadingConfig, "loadingConfig");
        Intrinsics.checkNotNullParameter(successConfig, "successConfig");
        c successConfig2 = new c(1, successConfig);
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        Intrinsics.checkNotNullParameter(statusDialogView, "statusDialogView");
        Intrinsics.checkNotNullParameter(loadingConfig, "loadingConfig");
        Intrinsics.checkNotNullParameter(successConfig2, "successConfig");
        r rVarSwitchMapSingle = rVar.switchMapSingle(new l(new o(successConfig2, 24, loadingConfig, statusDialogView), 3));
        Intrinsics.checkNotNullExpressionValue(rVarSwitchMapSingle, "switchMapSingle(...)");
        return rVarSwitchMapSingle;
    }
}

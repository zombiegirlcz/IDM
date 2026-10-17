package qek;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.error.data.model.ServerError;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import com.revolut.retail.feature.pod_nominees.impl.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import nii.h0;
import nii.j0;
import nii.u1;
import nii.z;
import ofm.q;
import retrofit2.HttpException;
import sf0.h;
import v60.c;
import v60.d;
import v60.e;

/* JADX INFO: loaded from: classes11.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f245191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f245192b;

    public a(h serverErrorParser, e serverErrorsProvider, int i) {
        switch (i) {
            case 2:
                Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
                Intrinsics.checkNotNullParameter(serverErrorsProvider, "serverErrorsProvider");
                this.f245191a = serverErrorParser;
                this.f245192b = serverErrorsProvider;
                break;
            default:
                Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
                Intrinsics.checkNotNullParameter(serverErrorsProvider, "serverErrorsProvider");
                this.f245191a = serverErrorParser;
                this.f245192b = serverErrorsProvider;
                break;
        }
    }

    public static j0 a() {
        return new j0((Clause) new TextLocalisedClause(R$string.pod_nominees_add_success_title, null, null, 14), (Clause) new TextLocalisedClause(R$string.pod_nominees_add_success_subtitle, null, null, 14), (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4092);
    }

    public static j0 b() {
        return new j0((Clause) new TextLocalisedClause(R$string.pod_nominees_details_success_dialog_edit_title, null, null, 14), (Clause) null, (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4094);
    }

    public z c(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        ServerError serverErrorA = this.f245191a.a(throwable);
        d dVarB = ((ao0.a) this.f245192b).b(serverErrorA != null ? Integer.valueOf(serverErrorA.f51362a) : null);
        if (dVarB == null) {
            dVarB = new v60.b();
        }
        return new z(q.O(dVarB), null, null, null, null, null, false, null, null, null, null, null, null, 32766);
    }

    public z d(HttpException httpException) throws IOException {
        ServerError serverErrorC = this.f245191a.c(httpException);
        if (serverErrorC != null) {
            c cVarB = ((ao0.a) this.f245192b).b(Integer.valueOf(serverErrorC.f51362a));
            if (cVarB != null) {
                return new z(new TextLocalisedClause(R.string.common_error_something_went_wrong, null, null, 14), q.O(cVarB), null, null, null, null, false, null, null, null, null, null, null, 32764);
            }
        }
        return null;
    }

    public a(h serverErrorParser, e serverErrorsProvider) {
        Intrinsics.checkNotNullParameter(serverErrorsProvider, "serverErrorsProvider");
        Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
        this.f245192b = serverErrorsProvider;
        this.f245191a = serverErrorParser;
    }
}

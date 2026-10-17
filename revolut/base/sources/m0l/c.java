package m0l;

import android.os.Parcelable;
import aw0.o9;
import cli.g;
import cli.k;
import cli.y;
import cli.z;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.kompot.common.R$string;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import com.revolut.retail.feature.trading_onboarding.impl.ui.onboarding_otp_dialog.OnboardingOtpDialogScreenContract$InputData;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import nii.h0;
import nii.j0;
import nii.u1;
import nii.y0;
import oki.h;
import yji.l;

/* JADX INFO: loaded from: classes12.dex */
public final class c extends h implements z {
    public final OnboardingOtpDialogScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final a f201167p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f201168q;

    public c(OnboardingOtpDialogScreenContract$InputData inputData, a dialogMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(dialogMapper, "dialogMapper");
        this.o = inputData;
        this.f201167p = dialogMapper;
        this.f201168q = d.b(this, k.f25028a, new a54.b(20), null, false, 12);
    }

    @Override // yji.l
    public final void T1(long j2) {
        boolean z = this.o.f104236a;
        this.f201167p.getClass();
        l.a1(this, X1(new y0("onboarding-otp-dialog", z ? new j0((Clause) new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), (Clause) null, (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4094) : new nii.z(new TextLocalisedClause(R$string.common_error_state_title, null, null, 14), new TextLocalisedClause(R$string.common_error_state_description, null, null, 14), null, null, null, null, false, null, null, null, null, null, null, 32764), false, 4)), null, null, new lpl.c(this, null, 12), 3);
    }

    @Override // cli.z
    public final g getState() {
        return this.f201168q;
    }
}

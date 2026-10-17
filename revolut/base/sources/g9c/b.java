package g9c;

import android.os.Parcelable;
import aw0.o9;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.feature.revolutpay.shared.R$string;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import gec.i;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import nii.h0;
import nii.j0;
import nii.u1;
import nii.y0;
import nii.z;
import org.jetbrains.annotations.NotNull;
import rdc.d;
import u6c.k;
import zhm.u;

/* JADX INFO: loaded from: classes6.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f141530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f141531b;

    public b(d sharedDialogFactory, i summaryScreenStatusDialogFactory) {
        Intrinsics.checkNotNullParameter(sharedDialogFactory, "sharedDialogFactory");
        Intrinsics.checkNotNullParameter(summaryScreenStatusDialogFactory, "summaryScreenStatusDialogFactory");
        this.f141530a = sharedDialogFactory;
        this.f141531b = summaryScreenStatusDialogFactory;
    }

    public final y0 a() {
        return new y0("FAILURE_LOADING_DIALOG_ID", new z(new TextLocalisedClause(R$string.revolut_pay_common_error_widget_title, null, null, 14), new TextLocalisedClause(R$string.revolut_pay_accept_payment_failure_description, null, null, 14), new TextLocalisedClause(R$string.revolut_pay_common_error_widget_retry, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32756), false, 4);
    }

    public final y0 b(String str, k kVar) {
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.revolut_pay_accept_payment_failure_title, null, null, 14);
        z zVar = new z(textLocalisedClause, rdc.b.a(str, kVar), new TextLocalisedClause(R$string.revolut_pay_common_error_widget_exit, null, null, 14), null, null, null, true, null, null, null, null, null, null, 32500);
        y0 y0Var = new y0("FAILURE_PAYMENT_DIALOG_ID", zVar, false, 4);
        if (kVar != k.CUSTOMER_NAME_MISMATCH || str == null) {
            return y0Var;
        }
        return new y0(y0Var.f216243a, new z(textLocalisedClause, zVar.f216247b, new TextLocalisedClause(com.revolut.feature.revolutpay.impl.R$string.revolut_pay_accept_payment_failure_return_to_merchant, u.c(new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), null, null, null, true, null, null, null, null, null, null, 32500), false, 4);
    }

    public final y0 c(boolean z) {
        return new y0("SUCCESS_PAYMENT_DIALOG_ID", new j0((Clause) new TextLocalisedClause(R$string.revolut_pay_accept_payment_success_title, null, null, 14), (Clause) new TextLocalisedClause(z ? R$string.revolut_pay_accept_payment_success_description : R$string.revolut_pay_accept_payment_success_description_without_redirect, null, null, 14), (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) u1.b.f216225a, true, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4044), false, 4);
    }
}

package da4;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.feature.credit.core.R$string;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import nii.g0;
import nii.h0;
import nii.j0;
import nii.u1;
import nii.w;
import ny3.k;
import zhm.u;

/* JADX INFO: loaded from: classes22.dex */
public final class g {
    public static w a(k config) {
        Intrinsics.checkNotNullParameter(config, "config");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.credit_application_documents_upload_success_popup_title, u.c(config.f220643a), null, 12);
        String str = config.f220644b;
        TextLocalisedClause textLocalisedClause2 = str != null ? new TextLocalisedClause(R$string.credit_application_documents_upload_success_popup_description, u.c(str), null, 12) : null;
        int i = f.f112472a[config.f220645c.ordinal()];
        if (i == 1) {
            return new g0(textLocalisedClause, textLocalisedClause2, null, null, null, null, null, null, false, null, false, null, 16380);
        }
        if (i == 2) {
            return new j0((Clause) textLocalisedClause, (Clause) textLocalisedClause2, (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4092);
        }
        throw new NoWhenBranchMatchedException();
    }
}

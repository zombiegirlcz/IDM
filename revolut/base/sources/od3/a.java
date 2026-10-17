package od3;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.feature.cashback.impl.R$string;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import nii.u1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class a {

    @NotNull
    public static final C1244a Companion = new C1244a();

    /* JADX INFO: renamed from: od3.a$a, reason: collision with other inner class name */
    public static final class C1244a {
        private C1244a() {
        }
    }

    public static nii.y0 a() {
        return new nii.y0("ID_CASHBACK_CURRENCY_CHANGE_SUCCESS", new nii.j0((Clause) new TextLocalisedClause(R$string.cashback_change_currency_unified_success_title, null, null, 14), (Clause) null, (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (nii.h0) null, (ResourceImage) null, 4094), false, 4);
    }
}

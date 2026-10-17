package fhe;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.feature.tab.accounts.api.R$string;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import nii.h0;
import nii.j0;
import nii.u1;
import nii.w1;
import nii.y0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class a {

    @NotNull
    public static final C0795a Companion = new C0795a();

    /* JADX INFO: renamed from: fhe.a$a, reason: collision with other inner class name */
    public static final class C0795a {
        private C0795a() {
        }
    }

    public static y0 a() {
        return new y0("discover_item_hide_dialog_id", new j0((Clause) new TextLocalisedClause(R$string.home_discover_item_hide_success_title, null, null, 14), (Clause) new TextLocalisedClause(R$string.home_discover_item_hide_success_description, null, null, 14), (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) new w1(6, new TextLocalisedClause(R$string.home_discover_item_hide_success_action_title, null, null, 14), null), false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4076), false, 4);
    }
}

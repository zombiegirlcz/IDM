package skj;

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
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import com.revolut.retail.feature.esim.impl.R$string;
import java.util.List;
import nii.c0;
import nii.h0;
import nii.j0;
import nii.u1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class a {

    @NotNull
    public static final C1468a Companion = new C1468a();

    /* JADX INFO: renamed from: skj.a$a, reason: collision with other inner class name */
    public static final class C1468a {
        private C1468a() {
        }
    }

    public static c0 a() {
        return new c0(new TextLocalisedClause(R$string.esim_mobile_plan_number_transfer_confirmation_checking_title, null, null, 14), new TextLocalisedClause(R$string.esim_mobile_plan_number_transfer_confirmation_checking_subtitle, null, null, 14), null, false, null, false, false, null, 2044);
    }

    public static j0 b(pfj.a aVar) {
        if (aVar != null) {
            return new j0((Clause) new TextClause(aVar.f235599a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), (Clause) new TextClause(aVar.f235600b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) new StatusViewContract$Duration.Custom(5000L), (h0) null, (ResourceImage) null, 3580);
        }
        return null;
    }
}

package pu2;

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
import com.revolut.feature.card.terminate.impl.R$string;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import h93.f0;
import java.util.List;
import kotlin.jvm.internal.t0;
import nii.h0;
import nii.j0;
import nii.u1;
import nii.w1;
import nii.y0;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
public final class e implements d {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static y0 a(f0 f0Var) {
        int i = R$string.card_terminate_dialog_success_title;
        TextClause textClause = new TextClause(f0Var.f150114h.f13640b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        String str = f0Var.f150115j;
        if (str == null) {
            m70.a.c(t0.f186434a);
            str = "";
        }
        return new y0(null, new j0((Clause) new TextLocalisedClause(i, v.k(textClause, new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), (Clause) new TextLocalisedClause(R$string.card_terminate_dialog_success_subtitle, null, null, 14), (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) new w1(2, new TextLocalisedClause(R$string.card_terminate_dialog_success_button_title, null, null, 14), null), false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4076), false, 5);
    }
}

package q7e;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.kompot.common.R$string;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import nii.c0;
import nii.h0;
import nii.j0;
import nii.u1;
import nii.y0;
import nii.z;
import yji.l;

/* JADX INFO: loaded from: classes8.dex */
public abstract class b {
    public static y0 a() {
        TextLocalisedClause title = new TextLocalisedClause(R$string.common_error_state_title, null, null, 14);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.common_error_state_description, null, null, 14);
        Intrinsics.checkNotNullParameter(title, "title");
        return new y0(null, new z(title, textLocalisedClause, null, null, null, null, true, null, null, null, null, null, null, 32468), false, 5);
    }

    public static y0 b() {
        return new y0(null, new c0(null, null, null, true, null, false, false, null, 1900), false, 5);
    }

    public static y0 c(TextLocalisedClause title) {
        Intrinsics.checkNotNullParameter(title, "title");
        return new y0(null, new j0((Clause) title, (Clause) null, (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) u1.b.f216225a, true, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4044), false, 5);
    }

    public static final void d(l lVar, Throwable throwable) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.b(rd0.c.ERROR, null, "request failed", throwable, null, 18);
        lVar.X1(a());
    }
}

package p2c;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.common.ui.R$string;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import nii.e0;
import zhm.h0;

/* JADX INFO: loaded from: classes6.dex */
public final class z {
    public static nii.w a(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        if (tj0.a.a(throwable)) {
            return new e0((Clause) new TextLocalisedClause(R$string.error_no_internet, null, null, 14), (Clause) null, (TextLocalisedClause) null, (Parcelable) null, false, (AnalyticsProduct) null, 1022);
        }
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, "Error when updating RevPoints spare change", null, throwable, h0Var);
        return new nii.z(new TextLocalisedClause(com.revolut.feature.rev_points.api.R$string.rev_points_spare_change_generic_error, null, null, 14), null, null, null, null, null, false, null, null, null, null, null, null, 32766);
    }
}

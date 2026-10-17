package vl7;

import android.os.Parcelable;
import aw0.o9;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.feature.insurance_car.impl.R$string;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import dj0.d;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import nii.c0;
import nii.g0;
import nii.h0;
import nii.j;
import nii.j0;
import nii.l0;
import nii.u1;
import nii.w1;
import nii.y0;
import nii.z;
import rd0.c;
import ue0.e;
import xl7.n;
import yji.l;
import zhm.u;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a {
    public static y0 a(int i, Clause clause, CompositeClause compositeClause, TextLocalisedClause textLocalisedClause) {
        Clause title = (i & 1) != 0 ? new TextLocalisedClause(R$string.car_insurance_error_dialog_generic, null, null, 14) : clause;
        CompositeClause compositeClause2 = (i & 2) != 0 ? null : compositeClause;
        TextLocalisedClause textLocalisedClause2 = (i & 4) != 0 ? null : textLocalisedClause;
        Intrinsics.checkNotNullParameter(title, "title");
        return new y0(null, new z(title, compositeClause2, textLocalisedClause2, null, null, null, true, new AnalyticsProduct.Retail(zl7.a.f323191b), null, null, null, null, null, 31956), false, 5);
    }

    public static final y0 b(d dVar, Integer num) {
        CompositeClause compositeClause;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.car_insurance_error_insufficient_funds_title, null, null, 14);
        TextLocalisedClause[] elements = {num != null ? new TextLocalisedClause(num.intValue(), null, null, 14) : null, dVar != null ? new TextLocalisedClause(R$string.car_insurance_error_insufficient_funds_missing_amount, u.c(n.g(dVar, null, null, 3)), null, 12) : null};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List list = (List) e.M(kotlin.collections.d.L(elements));
        if (list != null) {
            m70.a.t(t0.f186434a);
            compositeClause = new CompositeClause(list, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
        } else {
            compositeClause = null;
        }
        return a(8, textLocalisedClause, compositeClause, new TextLocalisedClause(R$string.car_insurance_common_topup_button_title, null, null, 14));
    }

    public static final y0 c(TextLocalisedClause textLocalisedClause, TextLocalisedClause textLocalisedClause2) {
        return new y0(null, new c0(textLocalisedClause, textLocalisedClause2, null, true, null, false, false, new AnalyticsProduct.Retail(zl7.a.f323191b), 1644), false, 5);
    }

    public static y0 d(Clause title, TextLocalisedClause textLocalisedClause, TextLocalisedClause textLocalisedClause2, TextLocalisedClause textLocalisedClause3, int i) {
        TextLocalisedClause textLocalisedClause4 = (i & 2) != 0 ? null : textLocalisedClause;
        TextLocalisedClause textLocalisedClause5 = (i & 8) != 0 ? null : textLocalisedClause3;
        Intrinsics.checkNotNullParameter(title, "title");
        return new y0(null, new g0(title, textLocalisedClause4, null, textLocalisedClause2, textLocalisedClause5, null, null, j.b.f216170a, true, new AnalyticsProduct.Retail(zl7.a.f323191b), false, null, 15460), false, 5);
    }

    public static y0 e(Clause title, Clause clause, TextLocalisedClause textLocalisedClause, int i) {
        Clause clause2 = (i & 2) != 0 ? null : clause;
        TextLocalisedClause textLocalisedClause2 = (i & 4) != 0 ? null : textLocalisedClause;
        Intrinsics.checkNotNullParameter(title, "title");
        return new y0(null, new j0(title, clause2, (StatusDialogDescriptionProgress) null, (Parcelable) null, textLocalisedClause2 != null ? new w1(2, textLocalisedClause2, null) : u1.b.f216225a, true, (AnalyticsProduct) new AnalyticsProduct.Retail(zl7.a.f323191b), (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 3980), false, 5);
    }

    public static final y0 f(Clause title, TextLocalisedClause textLocalisedClause, TextLocalisedClause textLocalisedClause2, TextLocalisedClause textLocalisedClause3) {
        Intrinsics.checkNotNullParameter(title, "title");
        return new y0(null, new l0(title, textLocalisedClause, null, textLocalisedClause2, textLocalisedClause3, null, true, new AnalyticsProduct.Retail(zl7.a.f323191b), 804), false, 5);
    }

    public static final void g(l lVar, Throwable throwable) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.b(c.ERROR, null, "request failed", throwable, null, 18);
        lVar.X1(a(15, null, null, null));
    }
}

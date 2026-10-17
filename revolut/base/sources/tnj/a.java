package tnj;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.models.n0;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.retail.feature.esim.impl.R$string;
import java.time.Instant;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import yhm.j;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Lazy f272460a = j.b(new tl7.a(7));

    public static TextLocalisedClause a(Instant date) {
        Intrinsics.checkNotNullParameter(date, "date");
        long epochMilli = date.toEpochMilli();
        return new TextLocalisedClause(R$string.esim_connectivity_issues_date_time_format, v.k(new TimeClause(epochMilli, new TimeClause.Format.DateMedium(n0.HIDE_CURRENT_YEAR), null, null, 12), new TimeClause(epochMilli, TimeClause.Format.TimeDefault.f57977b, null, null, 12)), null, 12);
    }

    public static RowDelegate.Model.MainImage.Image24 b(int i) {
        ResourceImage resourceImage = new ResourceImage(i, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
        boolean z = false;
        return new RowDelegate.Model.MainImage.Image24(resourceImage, z, z, 6);
    }
}

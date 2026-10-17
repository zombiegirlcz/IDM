package u17;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.freelancer.common.models.sale.FilteringDateRange;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b {
    public b(t17.a acquiringFilterChipsMapper) {
        Intrinsics.checkNotNullParameter(acquiringFilterChipsMapper, "acquiringFilterChipsMapper");
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    public final ActionsView.Item a(FilteringDateRange filteringDateRange) {
        if (filteringDateRange == null) {
            return null;
        }
        mx0.d dVar = mx0.d.SEMIBLACK;
        Clause clause = null;
        Image image = null;
        mx0.e eVar = null;
        ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
        return new ActionsView.Item("ACQUIRING_DATE_RANGE_FILTER_CHIP", dVar, false, null, clause, t17.a.b(filteringDateRange).f267205a, resourceImage, image, eVar, null, false, null, null, null, null, 32668);
    }
}

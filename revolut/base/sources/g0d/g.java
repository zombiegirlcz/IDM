package g0d;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.selfserve.core.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import ozc.t0;

/* JADX INFO: loaded from: classes7.dex */
public final class g implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t0 f139457a;

    public g(t0 statusResourcesMapper) {
        Intrinsics.checkNotNullParameter(statusResourcesMapper, "statusResourcesMapper");
        this.f139457a = statusResourcesMapper;
    }

    public final RowDelegate.Model a() {
        RowDelegate.Model model = new RowDelegate.Model("ADD_FILE_MODEL_ID", new ResourceImage(R$drawable.uikit_icn_32_add_new, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, new TextLocalisedClause(R$string.sow_home_info_section_add_income_source_button_title, null, new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), 10), null, null, null, 0, null, false, false, null, null, null, null, null, null, null, 0, 0, 0, 0, 1073741804);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return model;
    }
}

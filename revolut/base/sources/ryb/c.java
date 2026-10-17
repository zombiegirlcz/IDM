package ryb;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.views.navbar.LabelNavBarMenuItem;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import dj0.d;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements jub.b {
    public final LabelNavBarMenuItem a(d revPointsBalance, String listId) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(revPointsBalance, "revPointsBalance");
        return new LabelNavBarMenuItem(listId, new ResourceImage(R$drawable.uikit_icn_24_rev_points, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground), (List) null, (ImageTransformations) null, (Clause) null, 246), nub.a.g(revPointsBalance, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), new nub.b(0), null, 4), null, null, 504);
    }
}

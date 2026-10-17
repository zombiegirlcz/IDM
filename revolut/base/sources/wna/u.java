package wna;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class u {
    public static RowDelegate.Model a(int i, TextLocalisedClause textLocalisedClause, Integer num, String str) {
        return new RowDelegate.Model(str, new RowDelegate.Model.MainImage.Image24(new ResourceImage(i, (Integer) null, (Integer) null, num, (List) null, (ImageTransformations) null, (Clause) null, 246), false, false, 6), textLocalisedClause, null, 0, null, null, null, 0, new tf(new yy0.j(new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone20), (List) null, (ImageTransformations) null, (Clause) null, 246))), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536869880);
    }
}

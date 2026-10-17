package jzb;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class j implements i {
    public static tf a() {
        return new tf(6, new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone20), (List) null, (ImageTransformations) null, (Clause) null, 246), false);
    }

    public static RowDelegate.Model.b b(boolean z) {
        return z ? RowDelegate.Model.b.c.f53268a : RowDelegate.Model.b.a.f53266a;
    }

    public static RowDelegate.Model.MainImage.Image40 c(int i) {
        return new RowDelegate.Model.MainImage.Image40(LayeredImage.INSTANCE.i(i, R$attr.uikit_colorForeground, R$attr.uikit_colorAccentNeutral_10), null, null, false, null, false, 60);
    }
}

package j28;

import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class c {
    private c() {
    }

    public static tf a() {
        return new tf(new yy0.j(new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone20), (List) null, (ImageTransformations) null, (Clause) null, 246)));
    }

    public static LayeredImage b(int i) {
        LayeredImage.Companion companion = LayeredImage.INSTANCE;
        int i2 = R$attr.uikit_colorAccentNeutral;
        return LayeredImage.Companion.o(companion, i, new Color.Solid(i2), new Color.ModifiedColor(new Color.Solid(i2), 0.1f));
    }
}

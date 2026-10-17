package c55;

import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes21.dex */
public final class l0 implements m35.q {
    public final LayeredImage a(b95.a aVar) {
        int i;
        LayeredImage.Companion companion = LayeredImage.INSTANCE;
        int i2 = aVar == null ? -1 : k0.f21450a[aVar.ordinal()];
        if (i2 == -1) {
            i = R$drawable.uikit_icn_24_credit;
        } else if (i2 != 1) {
            if (i2 != 2 && i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$drawable.uikit_icn_24_credit;
        } else {
            i = R$drawable.uikit_icn_24_mortgage;
        }
        return companion.j(i, new Color.Solid(R$attr.uikit_colorWhite), new Color.Solid(R$attr.uikit_colorTeal));
    }
}

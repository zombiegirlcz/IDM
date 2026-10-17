package q74;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class b {
    public static ResourceImage a(zv3.a navigationIcon) {
        int i;
        Intrinsics.checkNotNullParameter(navigationIcon, "navigationIcon");
        int i2 = a.f242738a[navigationIcon.ordinal()];
        if (i2 == 1) {
            i = R$drawable.uikit_icn_24_cross;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$drawable.uikit_icn_24_back_button_arrow;
        }
        return new ResourceImage(i, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
    }
}

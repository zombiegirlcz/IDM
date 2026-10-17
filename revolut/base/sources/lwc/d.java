package lwc;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import cuc.h;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class d {
    public static RowDelegate.Model.MainImage.Image40 a(h hVar, h hVar2) {
        return new RowDelegate.Model.MainImage.Image40(new ResourceImage(hVar == hVar2 ? R$drawable.uikit_icn_24_radiobutton_on : R$drawable.uikit_icn_24_radiobutton_off, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, false, null, false, 62);
    }
}

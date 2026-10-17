package sr7;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;

/* JADX INFO: loaded from: classes4.dex */
public abstract class j {
    public static final RowDelegate.Model.MainImage.Image40 a(int i, Image image, boolean z) {
        return new RowDelegate.Model.MainImage.Image40(LayeredImage.INSTANCE.i(i, z ? R$attr.uikit_colorAccent : R$attr.uikit_colorGreyTone50, z ? R$attr.uikit_colorAccent_10 : R$attr.uikit_colorGreyTone50_10), image, null, false, 16);
    }
}

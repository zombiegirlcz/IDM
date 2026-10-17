package ox0;

import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_resources.R$drawable;

/* JADX INFO: loaded from: classes20.dex */
public final class h {
    private h() {
    }

    public static boolean a(Image image) {
        int i;
        if (image instanceof ResourceImage) {
            i = ((ResourceImage) image).f59995a;
        } else {
            if (!(image instanceof GlyphImage)) {
                return false;
            }
            i = ((GlyphImage) image).f59925a;
        }
        return i == R$drawable.uikit_icn_24_arrow_thin_down || i == R$drawable.uikit_icn_24_arrow_down;
    }
}

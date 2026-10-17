package b01;

import android.widget.ImageView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_resources.R$drawable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class b {
    private b() {
    }

    public static ResourceImage a(ResourceImage image, ImageView to6) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(to6, "to");
        boolean zF = Intrinsics.f(to6.getTag(R$id.internal_is_nav_bar_navigation_button), Boolean.TRUE);
        int i = image.f59995a;
        return (zF && (i == R$drawable.uikit_icn_24_back || i == R$drawable.uikit_icn_24_back_button_arrow)) ? ResourceImage.a(image, R$drawable.uikit_icn_24_arrow_thin_left, null, null, 254) : image;
    }
}

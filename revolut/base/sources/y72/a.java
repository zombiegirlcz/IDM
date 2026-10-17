package y72;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.c;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes20.dex */
public final class a {

    @NotNull
    public static final C1731a Companion = new C1731a();

    /* JADX INFO: renamed from: y72.a$a, reason: collision with other inner class name */
    public static final class C1731a {
        private C1731a() {
        }
    }

    public static LayeredImage a() {
        List listC = u.c(new LayeredImage.Layer.Drawable(R$drawable.uikit_icn_24_card, Integer.valueOf(R$attr.uikit_colorForeground), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, c.CENTER_INSIDE, 60));
        Float fValueOf = Float.valueOf(64.0f);
        return new LayeredImage(listC, fValueOf, fValueOf, 8);
    }
}

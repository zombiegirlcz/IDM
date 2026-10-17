package h5k;

import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import wp5.y;

/* JADX INFO: loaded from: classes11.dex */
public final class a {
    private a() {
    }

    public static LayeredImage a(int i) {
        LayeredImage.Companion companion = LayeredImage.INSTANCE;
        int i2 = R$attr.uikit_colorAccentNeutral;
        return y.h(new Color.Solid(i2), 0.1f, companion, i, new Color.Solid(i2));
    }

    public static Image b(int i) {
        return LayeredImage.INSTANCE.i(i, R$attr.uikit_colorAccent, R$attr.uikit_colorAccent_10);
    }

    public static LayeredImage c() {
        return LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_bank, Integer.valueOf(R$attr.uikit_colorWhite), R$attr.uikit_colorColdBlue, 8.0f, Float.valueOf(24.0f), null, 32);
    }

    public static LayeredImage d() {
        return LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_logo_revolut, Integer.valueOf(R$attr.uikit_colorWhite), R$attr.uikit_colorBlack, 4.0f, null, null, 48);
    }

    public static LayeredImage e() {
        return LayeredImage.INSTANCE.d(R$drawable.uikit_icn_24_logo_revolut, R$attr.uikit_colorWhite, R$attr.uikit_colorBackground, Integer.valueOf(R$attr.uikit_colorBlack), 4.0f, 4.0f, Float.valueOf(24.0f));
    }
}

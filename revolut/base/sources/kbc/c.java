package kbc;

import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CircleTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import org.jmrtd.cbeff.ISO781611;

/* JADX INFO: loaded from: classes6.dex */
public final class c {
    public static Image a(String str) {
        return str != null ? new UrlImage(str, null, null, null, 0L, null, null, null, null, null, false, new ImageTransformations(null, new CircleTransformation((Float) null, (Integer) null, false, 15), null, null, null, null, null, ISO781611.SMT_TAG), null, null, false, false, 507902) : LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_merchant, R$attr.uikit_colorAccentNeutral, R$attr.uikit_colorAccentNeutral_10);
    }
}

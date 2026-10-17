package g25;

import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import ft3.j1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public interface j {
    static LayeredImage a(j jVar, j1 productType) {
        ((l) jVar).getClass();
        Intrinsics.checkNotNullParameter(productType, "productType");
        return LayeredImage.INSTANCE.i(l.c(productType, null), R$attr.uikit_colorWhite, R$attr.uikit_colorTeal);
    }
}

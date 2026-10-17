package cd3;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit_core.displayers.image.models.CdnImage;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_core.displayers.image.transformation.SquareTransformation;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.lds.LDSFile;

/* JADX INFO: loaded from: classes21.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    /* JADX INFO: renamed from: cd3.b$b, reason: collision with other inner class name */
    public static abstract class AbstractC0145b {
        private AbstractC0145b() {
        }
    }

    public static RowDelegate.Model.MainImage.Image40 a(dd3.a aVar, boolean z) {
        LayeredImage layeredImageF = null;
        CdnImage cdnImageC = com.revolut.core.ui_kit_core.displayers.image.models.b.c(aVar.a(), new ImageTransformations(null, SquareTransformation.f60074a, null, null, 11, null, null, LDSFile.EF_DG13_TAG), null, null, 28);
        if (z) {
            layeredImageF = LayeredImage.Companion.f(LayeredImage.INSTANCE, R$drawable.uikit_icn_16_lock_closed, R$attr.uikit_colorGreyTone50, R$attr.uikit_colorBackground, null, 4.0f, BitmapDescriptorFactory.HUE_RED, null, 104);
        }
        return new RowDelegate.Model.MainImage.Image40(cdnImageC, layeredImageF, null, false, 28);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0139  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.revolut.core.ui_kit.delegates.RowDelegate.Model b(uc3.d r40, dj0.d r41, od0.i r42, java.lang.String r43, hha.d r44, uc3.f r45) {
        /*
            Method dump skipped, instruction units count: 398
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cd3.b.b(uc3.d, dj0.d, od0.i, java.lang.String, hha.d, uc3.f):com.revolut.core.ui_kit.delegates.RowDelegate$Model");
    }
}

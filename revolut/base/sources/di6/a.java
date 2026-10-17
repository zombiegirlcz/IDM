package di6;

import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.Base64Image;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CircleTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_core.displayers.image.transformation.RoundedRectTransformation;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import je6.h;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.cbeff.ISO781611;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements h {

    @NotNull
    public static final C0681a Companion = new C0681a();

    /* JADX INFO: renamed from: di6.a$a, reason: collision with other inner class name */
    public static final class C0681a {
        private C0681a() {
        }
    }

    public final Image a(io3.b bVar, Image image) {
        if (bVar == null) {
            return null;
        }
        int i = b.f114935a[bVar.f163142a.ordinal()];
        if (i == 1) {
            return new UrlImage(bVar.f163143b, null, null, null, 0L, null, null, null, null, image, false, new ImageTransformations(null, new RoundedRectTransformation(2.0f), null, null, null, null, null, ISO781611.SMT_TAG), null, null, false, false, 506878);
        }
        if (i == 2) {
            return new Base64Image(bVar.f163143b, new ImageTransformations(null, new CircleTransformation(Float.valueOf(0.5f), Integer.valueOf(R$attr.uikit_colorGreyTone10), false, 12), null, null, null, null, null, ISO781611.SMT_TAG), 4);
        }
        throw new NoWhenBranchMatchedException();
    }

    public final Image b(io3.b bVar) {
        if (bVar != null) {
            return d(bVar);
        }
        return null;
    }

    public final Image c(io3.b bVar) {
        Image imageB = b(bVar);
        if (imageB != null) {
            return imageB;
        }
        return LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_bank, Integer.valueOf(R$attr.uikit_colorDeepGrey), R$attr.uikit_colorDeepGrey_10, 8.0f, Float.valueOf(24.0f), null, 32);
    }

    public final Image d(io3.b institutionLogo) {
        Intrinsics.checkNotNullParameter(institutionLogo, "institutionLogo");
        ImageTransformations imageTransformations = new ImageTransformations(null, new CircleTransformation(Float.valueOf(0.5f), Integer.valueOf(R$attr.uikit_colorGreyTone10), false, 12), null, null, null, null, null, ISO781611.SMT_TAG);
        int i = b.f114935a[institutionLogo.f163142a.ordinal()];
        if (i == 1) {
            return new UrlImage(institutionLogo.f163143b, null, null, null, 0L, null, null, null, null, null, false, imageTransformations, null, null, false, false, 507902);
        }
        if (i == 2) {
            return new Base64Image(institutionLogo.f163143b, imageTransformations, 4);
        }
        throw new NoWhenBranchMatchedException();
    }
}

package iz7;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CircleTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yx7.h;
import zw7.c0;
import zw7.d0;

/* JADX INFO: loaded from: classes4.dex */
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f169852a;

    public c(h imageBuilder) {
        Intrinsics.checkNotNullParameter(imageBuilder, "imageBuilder");
        this.f169852a = imageBuilder;
    }

    public final RowDelegate.Model.MainImage.Image40 a(gz7.c cVar, boolean z) {
        Image imageC;
        d0 d0Var = cVar.f147943a;
        LayeredImage layeredImageI = null;
        if (d0Var != null) {
            imageC = this.f169852a.b(d0Var, new ImageTransformations(new CircleTransformation((Float) null, (Integer) null, false, 15), true, false, (Integer) null, (Integer) null, (Integer) null, 505));
        } else {
            c0 type = c0.UNKNOWN;
            Intrinsics.checkNotNullParameter(type, "type");
            ImageTransformations imageTransformations = new ImageTransformations(new CircleTransformation((Float) null, (Integer) null, false, 15), true, false, (Integer) null, (Integer) null, (Integer) null, 505);
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(imageTransformations, "imageTransformations");
            imageC = h.c(imageTransformations);
        }
        Image image = imageC;
        if (z && !cVar.f147944b.f325835c) {
            layeredImageI = LayeredImage.INSTANCE.i(R$drawable.uikit_icn_16_exclamation_mark_sign, R$attr.uikit_colorWhite, R$attr.uikit_colorRed);
        }
        return new RowDelegate.Model.MainImage.Image40(image, layeredImageI, null, false, 28);
    }
}

package e36;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImageDrawable;
import com.revolut.core.ui_kit_core.displayers.image.models.UserAvatarImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UserNamePlaceholder;
import com.revolut.core.ui_kit_core.displayers.image.transformation.HexagonalTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import ez0.h;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.cbeff.ISO781611;

/* JADX INFO: loaded from: classes3.dex */
public final class a {
    private a() {
    }

    public static Image a(String str, String assetName) {
        Intrinsics.checkNotNullParameter(assetName, "assetName");
        if (str == null) {
            return new UserAvatarImage(new UserNamePlaceholder.Default(assetName), null, null, 6);
        }
        ImageTransformations imageTransformations = new ImageTransformations(null, HexagonalTransformation.f60062a, null, null, null, null, null, ISO781611.SMT_TAG);
        return new UrlImage(str, (String) null, (UrlImageDrawable) new UrlImageDrawable.Shimmering.Transformable(imageTransformations), 0L, 0L, (UrlImage.CustomHeaders) null, (Integer) null, (Integer) null, (h) null, (Image) null, false, false, imageTransformations, (Integer) null, (Integer) null, false, false, (Clause) null, 516090);
    }
}

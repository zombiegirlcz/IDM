package z66;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImageDrawable;
import com.revolut.core.ui_kit_core.displayers.image.models.UserAvatarImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UserNamePlaceholder;
import com.revolut.core.ui_kit_core.displayers.image.transformation.HexagonalTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.feature.defi.asset_details.api.model.DefiCurrency;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.cbeff.ISO781611;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {
    public static final RowDelegate.Model.MainImage.Image40 a(DefiCurrency defiCurrency) {
        Image userAvatarImage;
        Intrinsics.checkNotNullParameter(defiCurrency, "<this>");
        String str = defiCurrency.f;
        if (str != null) {
            ImageTransformations imageTransformations = new ImageTransformations(null, HexagonalTransformation.f60062a, null, null, null, null, null, ISO781611.SMT_TAG);
            userAvatarImage = new UrlImage(str, (String) null, (UrlImageDrawable) new UrlImageDrawable.Shimmering.Transformable(imageTransformations), 0L, 0L, (UrlImage.CustomHeaders) null, (Integer) null, (Integer) null, (ez0.h) null, (Image) null, false, false, imageTransformations, (Integer) null, (Integer) null, false, false, (Clause) null, 516090);
        } else {
            userAvatarImage = new UserAvatarImage(new UserNamePlaceholder.Default(defiCurrency.f71672b, 0), null, null, 6);
        }
        return new RowDelegate.Model.MainImage.Image40(userAvatarImage, null, null, false, null, false, 62);
    }
}

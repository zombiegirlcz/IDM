package cl7;

import com.revolut.core.ui_kit_core.displayers.image.models.CdnImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CircleTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.youTransactor.uCube.rpc.Constants;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class b {
    private b() {
    }

    public static CdnImage a(a image) {
        Intrinsics.checkNotNullParameter(image, "image");
        return new CdnImage(image.a(), "mobile/insurance/rev_10/policy", null, new ImageTransformations((CircleTransformation) null, true, false, (Integer) null, (Integer) null, (Integer) null, 507), null, null, Constants.TAG_F4);
    }
}

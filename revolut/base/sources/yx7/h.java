package yx7;

import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.CdnImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CircleTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.youTransactor.uCube.rpc.Constants;
import kotlin.jvm.internal.Intrinsics;
import zw7.d0;

/* JADX INFO: loaded from: classes4.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fx7.f f317590a;

    public h(fx7.f petInteractor) {
        Intrinsics.checkNotNullParameter(petInteractor, "petInteractor");
        this.f317590a = petInteractor;
    }

    public static CdnImage c(ImageTransformations transformations) {
        Intrinsics.checkNotNullParameter(transformations, "transformations");
        return new CdnImage("header", "mobile/pet/rev_10/policy", null, transformations, null, null, Constants.TAG_F4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Image a(d0 pet) {
        Intrinsics.checkNotNullParameter(pet, "pet");
        return b(pet, new ImageTransformations(new CircleTransformation((Float) null, (Integer) (0 == true ? 1 : 0), false, 15), true, false, (Integer) null, (Integer) null, (Integer) null, 505));
    }

    public final Image b(d0 pet, ImageTransformations imageTransformations) {
        Intrinsics.checkNotNullParameter(pet, "pet");
        Intrinsics.checkNotNullParameter(imageTransformations, "imageTransformations");
        String str = pet.f325766c;
        return str != null ? new UrlImage(this.f317590a.b(str), null, null, null, 0L, null, null, null, null, c(imageTransformations), true, imageTransformations, null, null, false, false, 502782) : c(imageTransformations);
    }
}

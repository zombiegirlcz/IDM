package vi9;

import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.decoration.AlphaDecoration;
import com.revolut.core.ui_kit_core.displayers.image.decoration.DecoratedImage;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CircleTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.cbeff.ISO781611;
import tof.k3;
import tof.l2;
import tof.l3;
import zh9.j0;

/* JADX INFO: loaded from: classes5.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fk3.b f289528a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final thf.c f289529b;

    public b(fk3.b configurationRepository, thf.c transactionCategoryResourcesMapper) {
        Intrinsics.checkNotNullParameter(configurationRepository, "configurationRepository");
        Intrinsics.checkNotNullParameter(transactionCategoryResourcesMapper, "transactionCategoryResourcesMapper");
        this.f289528a = configurationRepository;
        this.f289529b = transactionCategoryResourcesMapper;
    }

    public static UrlImage b(String str, LayeredImage layeredImage) {
        return new UrlImage(str, null, null, null, 0L, null, null, null, null, layeredImage, false, new ImageTransformations(null, new CircleTransformation((Float) null, (Integer) null, false, 15), null, null, null, null, null, ISO781611.SMT_TAG), null, null, false, false, 506878);
    }

    public final LayeredImage a(String str) {
        l2 l2VarC;
        if (str == null || (l2VarC = l3.c(str)) == null) {
            l2VarC = l2.GENERAL;
        }
        return ((wjf.e) this.f289529b).i(new k3(l2VarC), null, null);
    }

    public final Image c(j0 merchant, Float f) {
        Image imageA;
        Intrinsics.checkNotNullParameter(merchant, "merchant");
        String str = merchant.f322293a;
        String str2 = merchant.f322294b;
        String str3 = merchant.f322295c;
        if (str != null && (!kotlin.text.d0.W(str))) {
            imageA = b(str, a(str3));
        } else if (str2 == null || str2.length() <= 0) {
            imageA = a(str3);
        } else {
            String str4 = ((ik3.g) this.f289528a).f161888g.b().f123364c;
            if (str4.length() == 0) {
                str4 = "https://assets.revolut.com/merchant_icons/";
            }
            imageA = b(com.google.android.gms.internal.mlkit_vision_face.a.o(str4, str2, "@2x.png"), a(str3));
        }
        return f == null ? imageA : new DecoratedImage(imageA, zhm.u.c(new AlphaDecoration(f.floatValue())));
    }
}

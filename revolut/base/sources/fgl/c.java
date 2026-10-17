package fgl;

import android.content.Context;
import android.widget.ImageView;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CircleTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.cbeff.ISO781611;
import qz0.n;

/* JADX INFO: loaded from: classes12.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qz0.j f135095a;

    public c(qz0.j urlImagesRepository) {
        Intrinsics.checkNotNullParameter(urlImagesRepository, "urlImagesRepository");
        this.f135095a = urlImagesRepository;
    }

    public static ImageTransformations a(ImageTransformations imageTransformations) {
        return imageTransformations != null ? ImageTransformations.a(imageTransformations, new CircleTransformation((Float) null, (Integer) null, false, 15), null, null, ISO781611.SMT_TAG) : new ImageTransformations(null, new CircleTransformation((Float) null, (Integer) null, false, 15), null, null, null, null, null, ISO781611.SMT_TAG);
    }

    public static void c(ImageView to6, b imageData, yy0.b bVar, Function1 function1, Function0 function0) {
        Intrinsics.checkNotNullParameter(to6, "to");
        Intrinsics.checkNotNullParameter(imageData, "imageData");
        ImageTransformations imageTransformationsA = a(imageData.f135094c);
        Integer num = imageData.f135092a;
        if (num != null) {
            int iIntValue = num.intValue();
            if (bVar != null) {
                bVar.a(new ResourceImage(iIntValue, (Integer) null, (Integer) null, imageData.f135093b, (List) null, imageTransformationsA, (Clause) null, 182), to6, function1, function0);
            }
        }
    }

    public final void b(ImageView to6, b imageData, String url2, Function1 function1, Function0 function0) {
        Intrinsics.checkNotNullParameter(to6, "to");
        Intrinsics.checkNotNullParameter(imageData, "imageData");
        Intrinsics.checkNotNullParameter(url2, "url");
        ((n) this.f135095a).e(new UrlImage(url2, null, imageData.f135092a, imageData.f135093b, 0L, null, null, null, null, null, false, a(imageData.f135094c), null, null, false, false, 507858), to6, function1, function0);
    }

    public final void d(Context context, b imageData, String url2, int i, int i2, Function1 function1, Function0 function0) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(imageData, "imageData");
        Intrinsics.checkNotNullParameter(url2, "url");
        ((n) this.f135095a).g(context, new UrlImage(url2, null, imageData.f135092a, imageData.f135093b, 0L, null, null, null, null, null, false, a(imageData.f135094c), null, null, false, false, 507890), i, i2, function1, function0);
    }
}

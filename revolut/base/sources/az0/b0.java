package az0;

import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.widget.ImageView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.decoration.AlphaDecoration;
import com.revolut.core.ui_kit_core.displayers.image.decoration.DecoratedImage;
import com.revolut.core.ui_kit_core.displayers.image.decoration.FadedOutDecoration;
import com.revolut.core.ui_kit_core.displayers.image.decoration.GrayedOutDecoration;
import com.revolut.core.ui_kit_core.displayers.image.decoration.ImageDecoration;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class b0 extends yy0.o {
    @Override // yy0.d
    public final void a(Image image, ImageView to6, Function1 function1, Function0 function0) {
        ColorMatrix colorMatrix;
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(to6, "to");
        if (!(image instanceof DecoratedImage)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        DecoratedImage decoratedImage = (DecoratedImage) image;
        Image image2 = decoratedImage.f59808a;
        List<ImageDecoration> list = decoratedImage.f59809b;
        if (list.isEmpty()) {
            yy0.b bVar = this.f317758a;
            if (bVar != null) {
                bVar.a(image2, to6, function1, function0);
                return;
            }
            return;
        }
        ColorMatrix colorMatrix2 = new ColorMatrix();
        for (ImageDecoration imageDecoration : list) {
            if (imageDecoration instanceof AlphaDecoration) {
                colorMatrix = new ColorMatrix(new float[]{1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, ((AlphaDecoration) imageDecoration).f59807a, BitmapDescriptorFactory.HUE_RED});
            } else if (imageDecoration instanceof GrayedOutDecoration) {
                colorMatrix = new ColorMatrix();
                colorMatrix.setSaturation(BitmapDescriptorFactory.HUE_RED);
            } else {
                if (!(imageDecoration instanceof FadedOutDecoration)) {
                    throw new NoWhenBranchMatchedException();
                }
                float f = ((FadedOutDecoration) imageDecoration).f59811a;
                colorMatrix = new ColorMatrix(new float[]{1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f, BitmapDescriptorFactory.HUE_RED, 1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f, BitmapDescriptorFactory.HUE_RED, f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f, BitmapDescriptorFactory.HUE_RED});
            }
            colorMatrix2.preConcat(colorMatrix);
        }
        a31.m mVar = new a31.m(new ColorMatrixColorFilter(colorMatrix2), 27, to6, function1);
        yy0.b bVar2 = this.f317758a;
        if (bVar2 != null) {
            bVar2.a(image2, to6, mVar, function0);
        }
    }

    @Override // yy0.d
    public final void b(ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "imageView");
    }

    @Override // yy0.d
    public final boolean e(Image image) {
        Intrinsics.checkNotNullParameter(image, "image");
        return image instanceof DecoratedImage;
    }
}

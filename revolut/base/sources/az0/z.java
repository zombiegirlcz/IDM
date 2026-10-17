package az0;

import android.widget.ImageView;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.drawables.blockies.BlockiesDrawable;
import com.revolut.core.ui_kit_core.displayers.image.models.CryptoAssetImage;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class z implements yy0.d {
    @Override // yy0.d
    public final void a(Image image, ImageView to6, Function1 function1, Function0 function0) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(to6, "to");
        CryptoAssetImage cryptoAssetImage = (CryptoAssetImage) image;
        Lazy lazyB = yhm.j.b(new aqe.a(cryptoAssetImage, 23));
        ((com.bumptech.glide.j) com.bumptech.glide.b.d(to6.getContext()).u(cryptoAssetImage.f59908a).l((BlockiesDrawable) lazyB.getValue())).a(new u8.h().k((BlockiesDrawable) lazyB.getValue())).R(to6);
    }

    @Override // yy0.d
    public final void b(ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        com.bumptech.glide.n nVarD = com.bumptech.glide.b.d(imageView.getContext());
        nVarD.getClass();
        a0.d.z(imageView, nVarD);
    }

    @Override // yy0.d
    public final boolean e(Image image) {
        Intrinsics.checkNotNullParameter(image, "image");
        return image instanceof CryptoAssetImage;
    }
}

package az0;

import android.content.Context;
import android.widget.ImageView;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.UriImage;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class j1 implements yy0.d {
    @Override // yy0.d
    public final void a(Image image, ImageView to6, Function1 function1, Function0 function0) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(to6, "to");
        UriImage uriImage = image instanceof UriImage ? (UriImage) image : null;
        if (uriImage == null) {
            throw new IllegalStateException("UrlImagesDisplayDelegate displays only UriImage");
        }
        com.bumptech.glide.j jVarR = com.bumptech.glide.b.d(to6.getContext()).r(uriImage.f60014a);
        u8.h hVar = new u8.h();
        Integer num = uriImage.f60015b;
        if (num != null) {
            int iIntValue = num.intValue();
            ((u8.h) hVar.j(iIntValue)).x(iIntValue);
        }
        Context context = to6.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        te0.w.e(hVar, context, uriImage);
        com.bumptech.glide.j jVarE0 = jVarR.a(hVar).e0(n8.b.b());
        Intrinsics.checkNotNullExpressionValue(jVarE0, "transition(...)");
        v04.b.b(jVarE0, function1, function0).R(to6);
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
        return image instanceof UriImage;
    }
}

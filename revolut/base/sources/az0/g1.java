package az0;

import android.widget.ImageView;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.SmoothEdgesUrlImage;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class g1 implements yy0.d {
    @Override // yy0.d
    public final void a(Image image, ImageView to6, Function1 function1, Function0 function0) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(to6, "to");
        SmoothEdgesUrlImage smoothEdgesUrlImage = image instanceof SmoothEdgesUrlImage ? (SmoothEdgesUrlImage) image : null;
        if (smoothEdgesUrlImage == null) {
            throw new IllegalStateException("This delegate displays only SmoothEdgesUrlImage");
        }
        v8.l f1Var = new f1(to6, image, function1);
        u8.h hVar = new u8.h();
        c8.b bVar = c8.b.PREFER_ARGB_8888;
        y8.f.b(bVar);
        u8.a aVarF = ((u8.h) hVar.D(l8.p.f, bVar).D(p8.h.f233811a, bVar)).f();
        Intrinsics.checkNotNullExpressionValue(aVarF, "disallowHardwareConfig(...)");
        com.bumptech.glide.j jVarA = com.bumptech.glide.b.d(to6.getContext()).i().a0(smoothEdgesUrlImage.f60003a).a((u8.h) aVarF);
        jVarA.S(f1Var, null, jVarA, y8.f.f311599a);
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
        return image instanceof SmoothEdgesUrlImage;
    }
}

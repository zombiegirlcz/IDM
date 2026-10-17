package az0;

import android.content.Context;
import android.widget.ImageView;
import com.revolut.core.ui_kit.drawables.ShimmerImageDrawable;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.FileImage;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class d0 implements yy0.d {
    @Override // yy0.d
    public final void a(Image image, ImageView to6, Function1 function1, Function0 function0) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(to6, "to");
        FileImage fileImage = (FileImage) image;
        u8.a aVarE = com.bumptech.glide.b.d(to6.getContext()).s(fileImage.f59917a).E(new x8.e(Long.valueOf(fileImage.f59917a.lastModified())));
        com.bumptech.glide.j jVar = (com.bumptech.glide.j) aVarE;
        FileImage.Placeholder placeholder = fileImage.f59918b;
        if (placeholder != null) {
            if (placeholder instanceof FileImage.Placeholder.DrawableResource) {
                jVar.x(((FileImage.Placeholder.DrawableResource) placeholder).getF59920a());
            } else {
                if (!placeholder.equals(FileImage.Placeholder.Shimmering.f59921a)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (!(to6.getBackground() instanceof ShimmerImageDrawable)) {
                    Context context = to6.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    jVar.y(new ShimmerImageDrawable(context, fileImage.f59919c, 6));
                }
            }
        }
        Intrinsics.checkNotNullExpressionValue(aVarE, "apply(...)");
        Context context2 = to6.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        v04.b.b(te0.w.d(jVar, context2, (gz0.c) image), function1, function0).R(to6);
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
        return image instanceof FileImage;
    }
}

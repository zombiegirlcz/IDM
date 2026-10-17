package az0;

import android.content.Context;
import android.widget.ImageView;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.GifResourseImage;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class e0 implements yy0.d {
    @Override // yy0.d
    public final void a(Image image, ImageView to6, Function1 function1, Function0 function0) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(to6, "to");
        if (!(image instanceof GifResourseImage)) {
            throw new IllegalStateException("this delegate can show only gif resource images");
        }
        ArrayList arrayList = new ArrayList();
        GifResourseImage gifResourseImage = (GifResourseImage) image;
        if (gifResourseImage.f59923b != null) {
            wz0.j jVar = wz0.k.Companion;
            Context context = to6.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            int iK = kli.a.k(context, r7.intValue());
            jVar.getClass();
            arrayList.add(wz0.j.b(iK));
        }
        com.bumptech.glide.j jVarY = com.bumptech.glide.b.d(to6.getContext()).l().Y(Integer.valueOf(gifResourseImage.f59922a));
        u8.h hVar = new u8.h();
        c8.o[] oVarArr = (c8.o[]) arrayList.toArray(new c8.o[0]);
        jVarY.a(hVar.I(new c8.h((c8.o[]) Arrays.copyOf(oVarArr, oVarArr.length)), true)).R(to6);
    }

    @Override // yy0.d
    public final void b(ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        com.bumptech.glide.n nVarD = com.bumptech.glide.b.d(imageView.getContext());
        nVarD.getClass();
        a0.d.z(imageView, nVarD);
    }

    @Override // yy0.d
    public final Clause c(Image image) {
        Intrinsics.checkNotNullParameter(image, "image");
        Clause f59924c = image.getF59924c();
        if (f59924c != null) {
            return f59924c;
        }
        oy0.a aVar = oy0.a.f230869a;
        return oy0.a.f(((GifResourseImage) image).f59922a);
    }

    @Override // yy0.d
    public final boolean e(Image image) {
        Intrinsics.checkNotNullParameter(image, "image");
        return image instanceof GifResourseImage;
    }
}

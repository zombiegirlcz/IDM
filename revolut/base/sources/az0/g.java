package az0;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.widget.ImageView;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.BitmapImage;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class g implements yy0.d {
    @Override // yy0.d
    public final void a(Image image, ImageView to6, Function1 function1, Function0 function0) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(to6, "to");
        if (!(image instanceof BitmapImage)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        BitmapImage bitmapImage = (BitmapImage) image;
        gz0.b bVar = bitmapImage.f59849c.d;
        if (bVar == gz0.b.CenterInside || bVar == null) {
            to6.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        }
        Context context = to6.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        List listJ = te0.w.J((gz0.c) image, context);
        c8.o[] oVarArr = listJ != null ? (c8.o[]) te0.w.C0(listJ).toArray(new c8.o[0]) : null;
        if (oVarArr == null) {
            oVarArr = new c8.o[0];
        }
        Bitmap bitmap = bitmapImage.f59847a;
        to6.setVisibility(0);
        com.bumptech.glide.j jVarP = com.bumptech.glide.b.d(to6.getContext()).p(bitmap);
        if (bitmapImage.f59848b) {
            jVarP.e0(n8.b.b());
        }
        if (function1 != null || function0 != null) {
            jVarP.N(new qz0.e(function1, function0, 1));
        }
        u8.h hVar = new u8.h();
        hVar.L((c8.o[]) Arrays.copyOf(oVarArr, oVarArr.length));
        jVarP.a(hVar).R(to6);
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
        return image instanceof BitmapImage;
    }

    @Override // yy0.d
    public final void f(Image image, Context context, int i, int i2, v1.m mVar, a3l.b bVar) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(context, "context");
        if (mVar != null) {
            Bitmap bitmap = ((BitmapImage) image).f59847a;
            Resources resources = context.getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            mVar.invoke(new BitmapDrawable(resources, bitmap));
        }
    }
}

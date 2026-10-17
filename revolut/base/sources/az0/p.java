package az0;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.widget.ImageView;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ColorImage;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class p implements yy0.d {
    public static ColorDrawable g(ColorImage colorImage, Context context) {
        int color;
        ColorImage.Color color2 = colorImage.f59874a;
        if (color2 instanceof ColorImage.ColorAttr) {
            color = kli.a.s(((ColorImage.ColorAttr) color2).getF59876a(), context);
        } else if (color2 instanceof ColorImage.ColorInteger) {
            color = ((ColorImage.ColorInteger) color2).getF59877a();
        } else {
            if (!(color2 instanceof ColorImage.ColorResource)) {
                throw new NoWhenBranchMatchedException();
            }
            color = context.getResources().getColor(((ColorImage.ColorResource) color2).getF59878a(), context.getTheme());
        }
        return new ColorDrawable(color);
    }

    @Override // yy0.d
    public final void a(Image image, ImageView to6, Function1 function1, Function0 function0) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(to6, "to");
        Context context = to6.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ColorDrawable colorDrawableG = g((ColorImage) image, context);
        to6.setImageDrawable(colorDrawableG);
        if (function1 != null) {
            function1.invoke(colorDrawableG);
        }
    }

    @Override // yy0.d
    public final void b(ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "imageView");
    }

    @Override // yy0.d
    public final boolean e(Image image) {
        Intrinsics.checkNotNullParameter(image, "image");
        return image instanceof ColorImage;
    }

    @Override // yy0.d
    public final void f(Image image, Context context, int i, int i2, v1.m mVar, a3l.b bVar) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(context, "context");
        ColorDrawable colorDrawableG = g((ColorImage) image, context);
        colorDrawableG.setBounds(0, 0, i, i2);
        if (mVar != null) {
            mVar.invoke(colorDrawableG);
        }
    }
}

package az0;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.widget.ImageView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.decorator.models.CircleImageDecorator;
import com.revolut.core.ui_kit_core.displayers.image.delegates.ScalableLayerDrawable;
import com.revolut.core.ui_kit_resources.R$attr;
import ip0.v7;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class o extends zy0.a {
    public static ScalableLayerDrawable g(Context context, CircleImageDecorator circleImageDecorator, Drawable drawable) {
        GradientDrawable gradientDrawable;
        GradientDrawable gradientDrawableK;
        if (drawable == null) {
            return null;
        }
        int i = circleImageDecorator.f;
        float f = circleImageDecorator.d;
        int i2 = circleImageDecorator.e;
        if (i != R$attr.uikit_colorTransparent) {
            gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(kli.a.s(circleImageDecorator.f, context));
            gradientDrawable.setShape(1);
        } else {
            gradientDrawable = null;
        }
        if (i2 == R$attr.uikit_colorTransparent || f == BitmapDescriptorFactory.HUE_RED) {
            gradientDrawableK = null;
        } else {
            gradientDrawableK = v7.k(1);
            gradientDrawableK.setStroke(kli.a.k(context, f), kli.a.s(i2, context));
        }
        Drawable[] elements = {gradientDrawable, drawable, gradientDrawableK};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        Float f4 = circleImageDecorator.f59814b;
        Integer numValueOf = f4 != null ? Integer.valueOf(kli.a.k(context, f4.floatValue())) : null;
        ScalableLayerDrawable scalableLayerDrawable = new ScalableLayerDrawable((Drawable[]) listL.toArray(new Drawable[0]), numValueOf, numValueOf);
        float f5 = circleImageDecorator.f59815c;
        if (f5 == BitmapDescriptorFactory.HUE_RED) {
            return scalableLayerDrawable;
        }
        int iK = kli.a.k(context, f5);
        scalableLayerDrawable.setLayerInset(((ArrayList) listL).indexOf(drawable), iK, iK, iK, iK);
        return scalableLayerDrawable;
    }

    @Override // yy0.d
    public final void a(Image image, ImageView to6, Function1 function1, Function0 function0) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(to6, "to");
        if (!(image instanceof CircleImageDecorator)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        yy0.b bVar = this.f317758a;
        if (bVar != null) {
            bVar.a(((CircleImageDecorator) image).f59813a, to6, new a31.m(this, to6, image, function1), new a3l.b(1, function0));
        }
    }

    @Override // yy0.d
    public final void b(ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "imageView");
    }

    @Override // yy0.d
    public final boolean e(Image image) {
        Intrinsics.checkNotNullParameter(image, "image");
        return image instanceof CircleImageDecorator;
    }

    @Override // yy0.d
    public final void f(Image image, Context context, int i, int i2, v1.m mVar, a3l.b bVar) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(context, "context");
        if (!(image instanceof CircleImageDecorator)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        yy0.b bVar2 = this.f317758a;
        if (bVar2 != null) {
            bVar2.c(((CircleImageDecorator) image).f59813a, context, i, i2, new a31.m(mVar, this, context, image), new a3l.b(2, bVar));
        }
    }
}

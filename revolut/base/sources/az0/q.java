package az0;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ConfigurableResourceImage;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class q implements yy0.d {
    @Override // yy0.d
    public final void a(Image image, ImageView to6, Function1 function1, Function0 function0) {
        Integer num;
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(to6, "to");
        to6.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        ConfigurableResourceImage configurableResourceImage = (ConfigurableResourceImage) image;
        Context context = to6.getContext();
        Resources resources = to6.getResources();
        Drawable drawable = ResourcesCompat.getDrawable(resources, configurableResourceImage.f59882a, context.getTheme());
        Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
        if (drawableMutate != null && (num = configurableResourceImage.f59883b) != null) {
            DrawableCompat.setTint(drawableMutate, ResourcesCompat.getColor(resources, num.intValue(), context.getTheme()));
        }
        ImageView.ScaleType scaleType = configurableResourceImage.d;
        if (scaleType != null) {
            to6.setScaleType(scaleType);
        }
        Integer num2 = configurableResourceImage.f59886h;
        if (num2 != null) {
            to6.setBackgroundResource(num2.intValue());
        }
        Integer num3 = configurableResourceImage.i;
        if (num3 != null) {
            int iIntValue = num3.intValue();
            Drawable background = to6.getBackground();
            if (background != null) {
                DrawableCompat.setTint(background, ResourcesCompat.getColor(resources, iIntValue, context.getTheme()));
            }
        }
        to6.setImageDrawable(drawableMutate);
        to6.setAlpha(configurableResourceImage.f59884c);
        Integer num4 = configurableResourceImage.e;
        if (num4 != null) {
            int iIntValue2 = num4.intValue();
            ViewGroup.LayoutParams layoutParams = to6.getLayoutParams();
            layoutParams.height = iIntValue2;
            to6.setLayoutParams(layoutParams);
        }
        Float f = configurableResourceImage.f;
        if (f != null) {
            int iK = kli.a.k(context, f.floatValue());
            ViewGroup.LayoutParams layoutParams2 = to6.getLayoutParams();
            layoutParams2.height = iK;
            to6.setLayoutParams(layoutParams2);
        }
        Float f4 = configurableResourceImage.f59885g;
        if (f4 != null) {
            int iK2 = kli.a.k(context, f4.floatValue());
            ViewGroup.LayoutParams layoutParams3 = to6.getLayoutParams();
            layoutParams3.width = iK2;
            to6.setLayoutParams(layoutParams3);
        }
    }

    @Override // yy0.d
    public final void b(ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "imageView");
    }

    @Override // yy0.d
    public final Clause c(Image image) {
        Intrinsics.checkNotNullParameter(image, "image");
        Clause f60056c = image.getF60056c();
        if (f60056c != null) {
            return f60056c;
        }
        oy0.a aVar = oy0.a.f230869a;
        return oy0.a.f(((ConfigurableResourceImage) image).f59882a);
    }

    @Override // yy0.d
    public final boolean e(Image image) {
        Intrinsics.checkNotNullParameter(image, "image");
        return image instanceof ConfigurableResourceImage;
    }
}

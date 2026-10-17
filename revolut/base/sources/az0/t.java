package az0;

import android.content.Context;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.core.content.ContextCompat;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.CoreResourceImage;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class t implements yy0.d {
    @Override // yy0.d
    public final void a(Image image, ImageView to6, Function1 function1, Function0 function0) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(to6, "to");
        CoreResourceImage coreResourceImage = (CoreResourceImage) image;
        Context context = to6.getContext();
        int i = coreResourceImage.f59895a;
        Integer num = coreResourceImage.f59896b;
        Integer num2 = coreResourceImage.d;
        Drawable drawable = ContextCompat.getDrawable(context, i);
        Integer num3 = coreResourceImage.f59897c;
        if (num3 != null || num != null || num2 != null) {
            if (drawable == null || (drawable = drawable.mutate()) == null) {
                drawable = null;
            } else if (num != null) {
                Context context2 = to6.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                drawable.setTintList(kli.a.t(num.intValue(), context2));
            } else if (num3 != null) {
                if (num3 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                drawable.setTint(num3.intValue());
            } else if (num2 != null) {
                Context context3 = to6.getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                if (num2 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                drawable.setTint(kli.a.s(num2.intValue(), context3));
            }
        }
        to6.setImageDrawable(drawable);
        if (drawable instanceof AnimatedVectorDrawable) {
            ((AnimatedVectorDrawable) drawable).start();
        }
        if (function1 != null) {
            function1.invoke(drawable);
        }
    }

    @Override // yy0.d
    public final void b(ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "imageView");
    }

    @Override // yy0.d
    public final boolean e(Image image) {
        Intrinsics.checkNotNullParameter(image, "image");
        return image instanceof CoreResourceImage;
    }

    @Override // yy0.d
    public final void f(Image image, Context context, int i, int i2, v1.m mVar, a3l.b bVar) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(context, "context");
        CoreResourceImage coreResourceImage = (CoreResourceImage) image;
        int i3 = coreResourceImage.f59895a;
        Integer num = coreResourceImage.d;
        Integer num2 = coreResourceImage.f59896b;
        Drawable drawable = ContextCompat.getDrawable(context, i3);
        Integer num3 = coreResourceImage.f59897c;
        if (num3 != null || num2 != null || num != null) {
            if (drawable == null || (drawable = drawable.mutate()) == null) {
                drawable = null;
            } else if (num2 != null) {
                drawable.setTintList(kli.a.t(num2.intValue(), context));
            } else if (num3 != null) {
                drawable.setTint(num3.intValue());
            } else if (num != null) {
                drawable.setTint(kli.a.s(num.intValue(), context));
            }
        }
        if (mVar != null) {
            mVar.invoke(drawable);
        }
    }
}

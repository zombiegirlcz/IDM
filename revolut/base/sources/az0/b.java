package az0;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.AnimatedResourceImage;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class b implements yy0.d {
    @Override // yy0.d
    public final void a(Image image, ImageView to6, Function1 function1, Function0 function0) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(to6, "to");
        to6.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        AnimatedResourceImage animatedResourceImage = (AnimatedResourceImage) image;
        Drawable drawableCreate = AnimatedVectorDrawableCompat.create(to6.getContext(), animatedResourceImage.f59838a);
        Integer num = animatedResourceImage.f59839b;
        if (num != null) {
            if (drawableCreate == null || (drawableCreate = drawableCreate.mutate()) == null) {
                drawableCreate = null;
            } else {
                Context context = to6.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                drawableCreate.setTint(kli.a.s(num.intValue(), context));
            }
        }
        Intrinsics.i(drawableCreate, "null cannot be cast to non-null type androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat");
        AnimatedVectorDrawableCompat animatedVectorDrawableCompat = (AnimatedVectorDrawableCompat) drawableCreate;
        to6.setImageDrawable(animatedVectorDrawableCompat);
        if (ValueAnimator.areAnimatorsEnabled()) {
            if (animatedResourceImage.f59840c) {
                animatedVectorDrawableCompat.registerAnimationCallback(new a(to6, animatedVectorDrawableCompat));
            }
            animatedVectorDrawableCompat.start();
        }
        if (function1 != null) {
            function1.invoke(animatedVectorDrawableCompat);
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
        return oy0.a.f(((AnimatedResourceImage) image).f59838a);
    }

    @Override // yy0.d
    public final boolean e(Image image) {
        Intrinsics.checkNotNullParameter(image, "image");
        return image instanceof AnimatedResourceImage;
    }
}

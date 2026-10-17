package az0;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.revolut.core.ui_kit_core.displayers.image.AnimatedSlidingDrawable;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.InitialsAnimatedPlaceholder;
import com.revolut.core.ui_kit_resources.R$drawable;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class g0 implements yy0.d {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }

        public static Drawable a(Context context, String initials, int i, int i2, float f) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(initials, "initials");
            Drawable drawable = context.getDrawable(R$drawable.uikit_icn_24_camera);
            if (drawable == null) {
                return b01.c.b(context, initials, i2, i, 0, f);
            }
            Drawable drawableMutate = drawable.mutate();
            drawableMutate.setTint(i2);
            Intrinsics.checkNotNullExpressionValue(drawableMutate, "apply(...)");
            return new AnimatedSlidingDrawable(b01.c.b(context, initials, i2, 0, 0, f), drawableMutate, i, f * 1.3157895f);
        }
    }

    @Override // yy0.d
    public final void a(Image image, ImageView to6, Function1 function1, Function0 function0) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(to6, "to");
        if (!(image instanceof InitialsAnimatedPlaceholder)) {
            throw new IllegalStateException("Check failed.");
        }
        Context contextG = md6.s.g(to6);
        String str = ((InitialsAnimatedPlaceholder) image).f59934a;
        yy0.p pVar = (yy0.p) image;
        int iK = ue0.e.k(pVar, contextG, str);
        int iM = ue0.e.m(pVar, contextG);
        Companion.getClass();
        to6.setImageDrawable(a.a(contextG, str, iK, iM, 0.38f));
    }

    @Override // yy0.d
    public final void b(ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "imageView");
    }

    @Override // yy0.d
    public final boolean e(Image image) {
        Intrinsics.checkNotNullParameter(image, "image");
        return image instanceof InitialsAnimatedPlaceholder;
    }
}

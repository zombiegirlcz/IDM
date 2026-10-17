package az0;

import android.content.Context;
import android.widget.ImageView;
import com.revolut.core.ui_kit.drawables.TextDrawable;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.TextImage;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class i1 implements yy0.d {
    public static TextDrawable g(TextImage textImage, Context context) {
        sp0.o backgroundType;
        TextDrawable.Companion companion = TextDrawable.INSTANCE;
        CharSequence text = textImage.f60009a;
        float fK = kli.a.k(context, textImage.e);
        int iK = kli.a.k(context, textImage.f);
        int iC = io0.a.c(context, textImage.f60010b);
        companion.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(text, "text");
        if (iK < 0) {
            iK = 0;
        }
        TextDrawable textDrawable = new TextDrawable(context, text, iC, fK, -1.0f, iK);
        int i = h1.f11304a[textImage.f60012g.ordinal()];
        if (i == 1) {
            backgroundType = sp0.o.CIRCLE;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            backgroundType = sp0.o.INITIALS_SQUARE;
        }
        int iC2 = io0.a.c(context, textImage.f60011c);
        Intrinsics.checkNotNullParameter(backgroundType, "backgroundType");
        if (textDrawable.i != iC2 || textDrawable.f55792j != backgroundType) {
            textDrawable.i = iC2;
            textDrawable.f55792j = backgroundType;
            textDrawable.invalidateSelf();
        }
        if (true != textDrawable.e) {
            textDrawable.e = true;
            textDrawable.f = true;
            textDrawable.invalidateSelf();
        }
        int iC3 = io0.a.c(context, textImage.d);
        textDrawable.f55790g = -1;
        textDrawable.f55791h = iC3;
        textDrawable.invalidateSelf();
        return textDrawable;
    }

    @Override // yy0.d
    public final void a(Image image, ImageView to6, Function1 function1, Function0 function0) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(to6, "to");
        Context context = to6.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        TextDrawable textDrawableG = g((TextImage) image, context);
        to6.setImageDrawable(textDrawableG);
        if (function1 != null) {
            function1.invoke(textDrawableG);
        }
    }

    @Override // yy0.d
    public final void b(ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "imageView");
    }

    @Override // yy0.d
    public final boolean e(Image image) {
        Intrinsics.checkNotNullParameter(image, "image");
        return image instanceof TextImage;
    }

    @Override // yy0.d
    public final void f(Image image, Context context, int i, int i2, v1.m mVar, a3l.b bVar) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(context, "context");
        if (image instanceof TextImage) {
            TextDrawable textDrawableG = g((TextImage) image, context);
            if (mVar != null) {
                mVar.invoke(textDrawableG);
            }
        }
    }
}

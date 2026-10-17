package az0;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableKt;
import androidx.core.graphics.drawable.RoundedBitmapDrawable;
import androidx.core.graphics.drawable.RoundedBitmapDrawableFactory;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.CardDesignColorImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ColorResource;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class i implements yy0.d {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // yy0.d
    public final void a(Image image, ImageView to6, Function1 function1, Function0 function0) {
        Drawable colorDrawable;
        Bitmap bitmap$default;
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(to6, "to");
        to6.setScaleType(ImageView.ScaleType.CENTER_CROP);
        ColorResource colorResource = ((CardDesignColorImage) image).f59855a;
        if (colorResource instanceof ColorResource.ColorDrawable) {
            colorDrawable = new ColorDrawable(ContextCompat.getColor(to6.getContext(), ((ColorResource.ColorDrawable) colorResource).getF59880a()));
        } else if (colorResource instanceof ColorResource.Drawable) {
            colorDrawable = ContextCompat.getDrawable(to6.getContext(), ((ColorResource.Drawable) colorResource).getF59881a());
        } else {
            if (!(colorResource instanceof ColorResource.ColorAttrDrawable)) {
                throw new NoWhenBranchMatchedException();
            }
            Context context = to6.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            colorDrawable = new ColorDrawable(kli.a.s(((ColorResource.ColorAttrDrawable) colorResource).getF59879a(), context));
        }
        Drawable drawable = colorDrawable;
        Resources resources = to6.getResources();
        if (drawable != null) {
            Context context2 = to6.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            int iK = kli.a.k(context2, 40.0f);
            Context context3 = to6.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            bitmap$default = DrawableKt.toBitmap$default(drawable, iK, kli.a.k(context3, 40.0f), null, 4, null);
        } else {
            bitmap$default = null;
        }
        RoundedBitmapDrawable roundedBitmapDrawableCreate = RoundedBitmapDrawableFactory.create(resources, bitmap$default);
        Intrinsics.checkNotNullExpressionValue(roundedBitmapDrawableCreate, "create(...)");
        roundedBitmapDrawableCreate.setCircular(true);
        to6.setImageDrawable(roundedBitmapDrawableCreate);
    }

    @Override // yy0.d
    public final void b(ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "imageView");
    }

    @Override // yy0.d
    public final boolean e(Image image) {
        Intrinsics.checkNotNullParameter(image, "image");
        return image instanceof CardDesignColorImage;
    }
}

package az0;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.core.content.ContextCompat;
import androidx.vectordrawable.graphics.drawable.VectorDrawableCompat;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.CardIcon;
import com.revolut.core.ui_kit_core.displayers.image.models.CardIconInfo;
import com.revolut.core.ui_kit_core.displayers.image.models.CardImage;
import com.revolut.core.ui_kit_core.displayers.image.models.RevolutIcon;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class m implements yy0.d {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // yy0.d
    public final void a(Image image, ImageView to6, Function1 function1, Function0 function0) {
        Drawable drawable;
        Drawable drawable2;
        Drawable drawable3;
        Drawable drawable4;
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(to6, "to");
        CardImage cardImage = (CardImage) image;
        Context context = to6.getContext();
        try {
            drawable = VectorDrawableCompat.create(context.getResources(), cardImage.f59865a, context.getTheme());
        } catch (Resources.NotFoundException unused) {
            drawable = ContextCompat.getDrawable(context, cardImage.f59865a);
        }
        Integer num = cardImage.f59866b;
        CardIcon cardIcon = cardImage.f;
        RevolutIcon revolutIcon = cardImage.f59867c;
        if (num != null) {
            int iIntValue = num.intValue();
            try {
                drawable2 = VectorDrawableCompat.create(context.getResources(), iIntValue, context.getTheme());
            } catch (Resources.NotFoundException unused2) {
                drawable2 = ContextCompat.getDrawable(context, iIntValue);
            }
        } else {
            drawable2 = null;
        }
        try {
            drawable3 = VectorDrawableCompat.create(context.getResources(), revolutIcon.getF60000a(), context.getTheme());
        } catch (Resources.NotFoundException unused3) {
            drawable3 = ContextCompat.getDrawable(context, revolutIcon.getF60000a());
        }
        if (cardIcon != null) {
            try {
                drawable4 = VectorDrawableCompat.create(context.getResources(), cardIcon.getF59860a(), context.getTheme());
            } catch (Resources.NotFoundException unused4) {
                drawable4 = ContextCompat.getDrawable(context, cardIcon.getF59860a());
            }
        } else {
            drawable4 = null;
        }
        Integer num2 = cardImage.e;
        PorterDuffColorFilter porterDuffColorFilter = num2 != null ? new PorterDuffColorFilter(num2.intValue(), PorterDuff.Mode.SRC_ATOP) : null;
        if (drawable == null || drawable3 == null) {
            return;
        }
        int i = cardImage.d ? 76 : 255;
        Drawable drawableMutate = drawable.mutate();
        if (porterDuffColorFilter != null) {
            drawableMutate.setColorFilter(porterDuffColorFilter);
        }
        Intrinsics.h(drawableMutate);
        Drawable drawableMutate2 = drawable2 != null ? drawable2.mutate() : null;
        Drawable drawableMutate3 = drawable3.mutate();
        Intrinsics.checkNotNullExpressionValue(drawableMutate3, "mutate(...)");
        Drawable drawableMutate4 = drawable4 != null ? drawable4.mutate() : null;
        int f60001b = revolutIcon.getF60001b();
        CardIconInfo f59861b = cardIcon != null ? cardIcon.getF59861b() : null;
        Resources resources = context.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        l lVar = new l(drawableMutate, drawableMutate2, drawableMutate3, drawableMutate4, f60001b, f59861b, resources);
        lVar.setAlpha(i);
        to6.setImageDrawable(lVar);
    }

    @Override // yy0.d
    public final void b(ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "imageView");
    }

    @Override // yy0.d
    public final boolean e(Image image) {
        Intrinsics.checkNotNullParameter(image, "image");
        return image instanceof CardImage;
    }
}

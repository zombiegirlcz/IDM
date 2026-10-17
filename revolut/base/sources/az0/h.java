package az0;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.widget.ImageView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.drawables.TextDrawable;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.BulletImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.youTransactor.uCube.rpc.Constants;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class h implements yy0.d {

    @NotNull
    private static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static TextDrawable g(Context context, BulletImage bulletImage) {
        Context context2;
        CharSequence charSequenceU0;
        TextDrawable.Companion companion = TextDrawable.INSTANCE;
        BulletImage.Content content = bulletImage.f59850a;
        Integer num = bulletImage.f59851b;
        if (content instanceof BulletImage.Content.Letter) {
            SpannableStringBuilder spannableStringBuilderA = ty0.c.a(jh.d.f(context).b0(), ((BulletImage.Content.Letter) content).getF59853a(), context, null, null, null, null, Constants.TAG_FC_SPEED_MODE);
            context2 = context;
            Intrinsics.checkNotNullParameter(spannableStringBuilderA, "<this>");
            int length = spannableStringBuilderA.length();
            if (1 <= length) {
                length = 1;
            }
            charSequenceU0 = spannableStringBuilderA.subSequence(0, length);
        } else {
            context2 = context;
            if (!(content instanceof BulletImage.Content.Number)) {
                throw new NoWhenBranchMatchedException();
            }
            charSequenceU0 = kotlin.text.f0.U0(2, String.valueOf(((BulletImage.Content.Number) content).getF59854a()));
        }
        CharSequence text = charSequenceU0;
        int iS = kli.a.s(num != null ? num.intValue() : R$attr.uikit_colorForeground, context2);
        companion.getClass();
        Intrinsics.checkNotNullParameter(context2, "context");
        Intrinsics.checkNotNullParameter(text, "text");
        TextDrawable textDrawable = new TextDrawable(context2, text, iS, BitmapDescriptorFactory.HUE_RED, kotlin.ranges.f.f(0.5f, BitmapDescriptorFactory.HUE_RED, 1.0f), 0);
        Integer num2 = bulletImage.f59852c;
        int iS2 = num2 != null ? kli.a.s(num2.intValue(), context2) : 0;
        Integer num3 = bulletImage.d;
        if (num3 != null) {
            num = num3;
        }
        int iS3 = kli.a.s(num != null ? num.intValue() : R$attr.uikit_colorForeground, context2);
        TextDrawable.c(textDrawable, iS2);
        if (true != textDrawable.e) {
            textDrawable.e = true;
            textDrawable.f = true;
            textDrawable.invalidateSelf();
        }
        textDrawable.f55790g = kli.a.k(context2, bulletImage.e);
        textDrawable.f55791h = iS3;
        textDrawable.invalidateSelf();
        return textDrawable;
    }

    @Override // yy0.d
    public final void a(Image image, ImageView to6, Function1 function1, Function0 function0) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(to6, "to");
        Context context = to6.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        TextDrawable textDrawableG = g(context, (BulletImage) image);
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
        return image instanceof BulletImage;
    }

    @Override // yy0.d
    public final void f(Image image, Context context, int i, int i2, v1.m mVar, a3l.b bVar) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(context, "context");
        TextDrawable textDrawableG = g(context, (BulletImage) image);
        if (mVar != null) {
            mVar.invoke(textDrawableG);
        }
    }
}

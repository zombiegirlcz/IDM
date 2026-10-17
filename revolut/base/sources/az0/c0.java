package az0;

import android.content.Context;
import android.widget.ImageView;
import com.revolut.core.ui_kit.drawables.TextDrawable;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.EmojiImage;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class c0 implements yy0.d {

    @NotNull
    private static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // yy0.d
    public final void a(Image image, ImageView to6, Function1 function1, Function0 function0) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(to6, "to");
        EmojiImage emojiImage = (EmojiImage) image;
        TextDrawable.Companion companion = TextDrawable.INSTANCE;
        Context context = to6.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        String str = "";
        String[] strArr = (String[]) new Regex("u").k(kotlin.text.a0.D((String) kotlin.text.d0.n0(emojiImage.f59914a, new String[]{" "}, 0, 6).get(0), "\\", "", false)).toArray(new String[0]);
        if (strArr.length == 1) {
            str = strArr[0];
        } else if (strArr.length > 1) {
            int length = strArr.length;
            for (int i = 1; i < length; i++) {
                str = str + ((char) Integer.parseInt(strArr[i], CharsKt.checkRadix(16)));
            }
        }
        String text = str;
        int iJ = foh.i.j(emojiImage.f59916c);
        float fJ = foh.i.j(emojiImage.f59915b);
        Context context2 = to6.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        int iS = kli.a.s(R$attr.uikit_colorWhite, context2);
        companion.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(text, "text");
        TextDrawable textDrawable = new TextDrawable(context, text, iS, fJ, -1.0f, iJ < 0 ? 0 : iJ);
        Context context3 = to6.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        TextDrawable.c(textDrawable, kli.a.s(emojiImage.d, context3));
        to6.setImageDrawable(textDrawable);
        if (function1 != null) {
            function1.invoke(textDrawable);
        }
    }

    @Override // yy0.d
    public final void b(ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "imageView");
    }

    @Override // yy0.d
    public final boolean e(Image image) {
        Intrinsics.checkNotNullParameter(image, "image");
        return image instanceof EmojiImage;
    }
}

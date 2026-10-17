package az0;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import az0.g0;
import com.revolut.core.ui_kit.drawables.TextDrawable;
import com.revolut.core.ui_kit_core.R$id;
import com.revolut.core.ui_kit_core.displayers.image.AnimatedSlidingDrawable;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UserAvatarImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UserNamePlaceholder;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import skm.a2;

/* JADX INFO: loaded from: classes.dex */
public final class t1 implements yy0.d {

    @NotNull
    public static final p1 Companion = new p1(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q1 f11357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a01.b f11358b;

    public t1(q1 urlProvider, a01.b avatarStorage) {
        Intrinsics.checkNotNullParameter(urlProvider, "urlProvider");
        Intrinsics.checkNotNullParameter(avatarStorage, "avatarStorage");
        this.f11357a = urlProvider;
        this.f11358b = avatarStorage;
    }

    public static float i(UserNamePlaceholder.PlaceholderSize placeholderSize) {
        if (placeholderSize instanceof UserNamePlaceholder.PlaceholderSize.Default) {
            return 0.38f;
        }
        if (placeholderSize instanceof UserNamePlaceholder.PlaceholderSize.OnLargePlaceholder) {
            return 0.32f;
        }
        if (placeholderSize instanceof UserNamePlaceholder.PlaceholderSize.Custom) {
            return ((UserNamePlaceholder.PlaceholderSize.Custom) placeholderSize).getF60051a();
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // yy0.d
    public final void a(Image image, ImageView to6, Function1 function1, Function0 function0) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(to6, "to");
        if (!(image instanceof UserAvatarImage)) {
            throw new IllegalStateException("Check failed.");
        }
        to6.setTag(R$id.internal_view_tag_change_handler_user_avatar_image_display_delegate, new s1(this, (UserAvatarImage) image, to6, this.f11358b, function1, function0));
    }

    @Override // yy0.d
    public final void b(ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        Object tag2 = imageView.getTag(R$id.internal_view_tag_change_handler_user_avatar_image_display_delegate);
        s1 s1Var = tag2 instanceof s1 ? (s1) tag2 : null;
        if (s1Var != null) {
            a2 a2Var = s1Var.f;
            if (a2Var != null) {
                a2Var.f(null);
            }
            s1Var.f = null;
            ImageView imageView2 = s1Var.f11349b;
            imageView2.removeOnAttachStateChangeListener(s1Var);
            if (s1Var.i) {
                s1Var.i = false;
                imageView2.removeCallbacks(s1Var.f11353j);
            }
        }
        imageView.setTag(R$id.internal_view_tag_change_handler_user_avatar_image_display_delegate, null);
        com.bumptech.glide.n nVarD = com.bumptech.glide.b.d(imageView.getContext());
        nVarD.getClass();
        a0.d.z(imageView, nVarD);
    }

    @Override // yy0.d
    public final boolean d() {
        return true;
    }

    @Override // yy0.d
    public final boolean e(Image image) {
        Intrinsics.checkNotNullParameter(image, "image");
        return image instanceof UserAvatarImage;
    }

    @Override // yy0.d
    public final void f(Image image, Context context, int i, int i2, v1.m mVar, a3l.b bVar) {
        int iIntValue;
        Drawable bitmapDrawable;
        Drawable drawableNewDrawable;
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(context, "context");
        if (!(image instanceof UserAvatarImage)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        Drawable drawable = ((a01.f) this.f11358b).f103a;
        int iIntValue2 = 1;
        if (drawable == null) {
            if (((a01.f) this.f11358b).e != 1) {
                v04.b.b(h(context, (UserAvatarImage) image), mVar, bVar).c0();
                return;
            }
            Drawable drawableG = g(context, (UserAvatarImage) image, null);
            if (mVar != null) {
                mVar.invoke(drawableG);
                return;
            }
            return;
        }
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState == null || (drawableNewDrawable = constantState.newDrawable(context.getResources())) == null) {
            Integer numValueOf = Integer.valueOf(i);
            if (i <= 0) {
                numValueOf = null;
            }
            if (numValueOf != null) {
                iIntValue = numValueOf.intValue();
            } else {
                int intrinsicWidth = drawable.getIntrinsicWidth();
                Integer numValueOf2 = Integer.valueOf(intrinsicWidth);
                if (intrinsicWidth <= 0) {
                    numValueOf2 = null;
                }
                iIntValue = numValueOf2 != null ? numValueOf2.intValue() : 1;
            }
            Integer numValueOf3 = Integer.valueOf(i2);
            if (i2 <= 0) {
                numValueOf3 = null;
            }
            if (numValueOf3 != null) {
                iIntValue2 = numValueOf3.intValue();
            } else {
                int intrinsicHeight = drawable.getIntrinsicHeight();
                Integer numValueOf4 = intrinsicHeight > 0 ? Integer.valueOf(intrinsicHeight) : null;
                if (numValueOf4 != null) {
                    iIntValue2 = numValueOf4.intValue();
                }
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iIntValue, iIntValue2, Bitmap.Config.ARGB_8888);
            Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
            Rect rectCopyBounds = drawable.copyBounds();
            Intrinsics.checkNotNullExpressionValue(rectCopyBounds, "copyBounds(...)");
            try {
                drawable.setBounds(0, 0, iIntValue, iIntValue2);
                drawable.draw(new Canvas(bitmapCreateBitmap));
                drawable.setBounds(rectCopyBounds);
                bitmapDrawable = new BitmapDrawable(context.getResources(), bitmapCreateBitmap);
            } catch (Throwable th10) {
                drawable.setBounds(rectCopyBounds);
                throw th10;
            }
        } else {
            bitmapDrawable = drawableNewDrawable.mutate();
            Intrinsics.checkNotNullExpressionValue(bitmapDrawable, "mutate(...)");
        }
        if (mVar != null) {
            mVar.invoke(bitmapDrawable);
        }
    }

    public final Drawable g(Context context, UserAvatarImage userAvatarImage, Drawable drawable) {
        CharSequence charSequence;
        AnimatedSlidingDrawable animatedSlidingDrawable;
        CharSequence charSequence2;
        UserNamePlaceholder userNamePlaceholder = userAvatarImage.f60044a;
        String string = null;
        if (userNamePlaceholder instanceof UserNamePlaceholder.Animated) {
            UserNamePlaceholder.Animated animated = (UserNamePlaceholder.Animated) userNamePlaceholder;
            String str = animated.f60047a;
            int iK = ue0.e.k(userAvatarImage, context, str);
            int iM = ue0.e.m(userAvatarImage, context);
            String strA = b01.c.a(str);
            Locale locale = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
            String upperCase = strA.toUpperCase(locale);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            float fI = i(animated.f60048b);
            if (drawable != null && (animatedSlidingDrawable = (AnimatedSlidingDrawable) zh9.u0.o(drawable, AnimatedSlidingDrawable.class)) != null) {
                Drawable drawableB = animatedSlidingDrawable.b();
                TextDrawable textDrawable = drawableB != null ? (TextDrawable) drawableB : null;
                if (textDrawable != null && (charSequence2 = textDrawable.f55787a) != null) {
                    string = charSequence2.toString();
                }
                if (Intrinsics.f(string, upperCase)) {
                    animatedSlidingDrawable.d(iK, iM);
                    return drawable;
                }
            }
            g0.Companion.getClass();
            return g0.a.a(context, upperCase, iK, iM, fI);
        }
        if (!(userNamePlaceholder instanceof UserNamePlaceholder.Default)) {
            if (userNamePlaceholder == null) {
                return null;
            }
            throw new NoWhenBranchMatchedException();
        }
        UserAvatarImage.INSTANCE.getClass();
        if (userNamePlaceholder.equals(UserAvatarImage.d)) {
            return i0.g(LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_profile, Integer.valueOf(R$attr.uikit_colorGrey50), R$attr.uikit_colorGrey10, 20.0f, null, null, 48), context);
        }
        UserNamePlaceholder.Default r3 = (UserNamePlaceholder.Default) userNamePlaceholder;
        String str2 = r3.f60049a;
        int iK2 = ue0.e.k(userAvatarImage, context, str2);
        int iM2 = ue0.e.m(userAvatarImage, context);
        String strA2 = b01.c.a(str2);
        Locale locale2 = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale2, "getDefault(...)");
        String upperCase2 = strA2.toUpperCase(locale2);
        Intrinsics.checkNotNullExpressionValue(upperCase2, "toUpperCase(...)");
        float fI2 = i(r3.f60050b);
        if (drawable != null) {
            TextDrawable textDrawable2 = (TextDrawable) zh9.u0.o(drawable, TextDrawable.class);
            if (textDrawable2 != null && (charSequence = textDrawable2.f55787a) != null) {
                string = charSequence.toString();
            }
            if (Intrinsics.f(string, upperCase2)) {
                TextDrawable.c(textDrawable2, iK2);
                textDrawable2.a(iM2);
                return drawable;
            }
        }
        return b01.c.b(context, upperCase2, iM2, iK2, 0, fI2);
    }

    public final com.bumptech.glide.j h(Context context, UserAvatarImage userAvatarImage) {
        sz0.b bVar = new sz0.b(this.f11357a.a());
        u8.a aVarI = new u8.h().I(new l8.i(), true);
        Intrinsics.checkNotNullExpressionValue(aVarI, "transform(...)");
        u8.a aVarY = ((u8.h) aVarI).y(g(context, userAvatarImage, null));
        Intrinsics.checkNotNullExpressionValue(aVarY, "placeholder(...)");
        com.bumptech.glide.j jVarA = ((com.bumptech.glide.j) ((com.bumptech.glide.j) ((com.bumptech.glide.j) com.bumptech.glide.b.d(context).t(bVar).g(e8.p.f123506b)).F(true)).v()).a((u8.h) aVarY);
        Intrinsics.checkNotNullExpressionValue(jVarA, "apply(...)");
        return jVarA;
    }
}

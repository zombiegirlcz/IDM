package az0;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.appcompat.content.res.AppCompatResources;
import com.airbnb.lottie.LottieAnimationView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.drawables.StaticVectorDrawable;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImageTint;
import com.revolut.core.ui_kit_core.displayers.image.models.LottieImage;
import com.revolut.core.ui_kit_core.displayers.image.models.SourceUrl;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class f0 extends yy0.o {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final yp0.p f11300b = new yp0.p(0);

    public static final class a {
        private a() {
        }

        public static int a(GlyphImageTint tint, int i) {
            Intrinsics.checkNotNullParameter(tint, "tint");
            if (Intrinsics.f(tint, GlyphImageTint.ENVIRONMENTAL_GREEN.f59930a)) {
                return R$attr.uikit_colorGreen;
            }
            if (Intrinsics.f(tint, GlyphImageTint.STANDARD.f59931a)) {
                Integer numValueOf = Integer.valueOf(i);
                if (i == 0) {
                    numValueOf = null;
                }
                return numValueOf != null ? numValueOf.intValue() : R$attr.uikit_colorAccentNeutral;
            }
            if (Intrinsics.f(tint, GlyphImageTint.DANGER.f59929a)) {
                return R$attr.uikit_colorStatusDanger;
            }
            if (Intrinsics.f(tint, GlyphImageTint.SUCCESS.f59932a)) {
                return R$attr.uikit_colorStatusSuccess;
            }
            if (Intrinsics.f(tint, GlyphImageTint.WARNING.f59933a)) {
                return R$attr.uikit_colorStatusWarning;
            }
            if (tint instanceof GlyphImageTint.Custom) {
                return ((GlyphImageTint.Custom.ConfirmationOfPayeeWarning) ((GlyphImageTint.Custom) tint)).a();
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    public static StaticVectorDrawable g(GlyphImage glyphImage, yp0.q qVar, Context context) {
        a aVar = Companion;
        GlyphImageTint glyphImageTint = glyphImage.f59926b;
        int iB = qVar.b();
        aVar.getClass();
        int iS = kli.a.s(a.a(glyphImageTint, iB), context);
        Drawable drawable = AppCompatResources.getDrawable(context, glyphImage.f59925a);
        if (drawable != null) {
            drawable.mutate().setTint(iS);
        } else {
            drawable = new ColorDrawable(iS);
        }
        int iD = 0;
        if (!(qVar instanceof yp0.o)) {
            if (qVar instanceof yp0.p) {
                iD = io0.a.d(0.1f, iS);
            } else if (!(qVar instanceof yp0.l)) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return new StaticVectorDrawable(drawable, iD, qVar.a(), kli.a.k(context, 300.0f));
    }

    @Override // yy0.d
    public final void a(Image image, ImageView to6, Function1 function1, Function0 function0) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(to6, "to");
        if (!(image instanceof GlyphImage)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        Intrinsics.checkNotNullParameter(to6, "<this>");
        Object tag2 = to6.getTag(R$id.internal_glyph_display_options);
        LottieImage lottieImageA = null;
        yp0.q qVar = tag2 instanceof yp0.q ? (yp0.q) tag2 : null;
        if (qVar == null) {
            qVar = f11300b;
        }
        if ((qVar instanceof yp0.l) && (to6 instanceof LottieAnimationView)) {
            GlyphImage glyphImage = (GlyphImage) image;
            String strA = fz0.b.a(glyphImage.f59925a);
            if (strA != null) {
                String strConcat = "https://assets.revolut.com/mobile/lotties/".concat(strA);
                LottieImage.Companion companion = LottieImage.INSTANCE;
                SourceUrl sourceUrl = new SourceUrl(strConcat, null);
                a aVar = Companion;
                GlyphImageTint glyphImageTint = glyphImage.f59926b;
                aVar.getClass();
                lottieImageA = LottieImage.Companion.a(companion, sourceUrl, true, false, new LottieImage.ColorOverride.TintedWithAttr(a.a(glyphImageTint, 0)), glyphImage, 88);
            }
            if (lottieImageA != null) {
                yy0.b bVar = this.f317758a;
                if (bVar != null) {
                    bVar.a(lottieImageA, to6, function1, function0);
                    return;
                }
                return;
            }
        }
        Context context = to6.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        StaticVectorDrawable staticVectorDrawableG = g((GlyphImage) image, qVar, context);
        to6.setImageDrawable(staticVectorDrawableG);
        if (function1 != null) {
            function1.invoke(staticVectorDrawableG);
        }
    }

    @Override // yy0.d
    public final void b(ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        imageView.setImageDrawable(null);
    }

    @Override // yy0.d
    public final Clause c(Image image) {
        Intrinsics.checkNotNullParameter(image, "image");
        Clause f59924c = image.getF59924c();
        if (f59924c != null) {
            return f59924c;
        }
        oy0.a aVar = oy0.a.f230869a;
        return oy0.a.f(((GlyphImage) image).f59925a);
    }

    @Override // yy0.d
    public final boolean e(Image image) {
        Intrinsics.checkNotNullParameter(image, "image");
        return image instanceof GlyphImage;
    }

    @Override // yy0.d
    public final void f(Image image, Context context, int i, int i2, v1.m mVar, a3l.b bVar) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(context, "context");
        if (!(image instanceof GlyphImage)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        StaticVectorDrawable staticVectorDrawableG = g((GlyphImage) image, f11300b, context);
        staticVectorDrawableG.setBounds(0, 0, i, i2);
        if (mVar != null) {
            mVar.invoke(staticVectorDrawableG);
        }
    }
}

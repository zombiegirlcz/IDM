package az0;

import android.content.Context;
import android.widget.ImageView;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.CurrencyImage;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImageDrawable;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CircleTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.cbeff.ISO781611;
import yhm.m;

/* JADX INFO: loaded from: classes.dex */
public final class a0 extends yy0.o {

    @NotNull
    private static final a Companion = new a(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final LayeredImage f11289b = LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_globe, R$attr.uikit_colorGreyTone50, R$attr.uikit_colorAccentNeutral_10);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ImageTransformations f11290c = new ImageTransformations(null, new CircleTransformation((Float) null, (Integer) null, false, 15), null, null, null, null, null, ISO781611.SMT_TAG);

    /* JADX INFO: loaded from: classes20.dex */
    public static final class a {
        private a() {
        }

        public a(int i) {
        }
    }

    public static Image g(CurrencyImage currencyImage, Context context) throws Throwable {
        Object objA;
        try {
            m.Companion companion = yhm.m.INSTANCE;
            objA = kli.a.q(context) ? cp5.d.n(xi0.b.Companion, currencyImage.f59911a) : cp5.d.t(xi0.b.Companion, currencyImage.f59911a);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th10) {
            m.Companion companion2 = yhm.m.INSTANCE;
            objA = yhm.o.a(th10);
        }
        Throwable thA = yhm.m.a(objA);
        if (thA != null) {
            hx7.e.n(thA);
        }
        UrlImageDrawable.Shimmering.Transformable transformable = null;
        if (objA instanceof yhm.n) {
            objA = null;
        }
        String str = (String) objA;
        LayeredImage layeredImage = f11289b;
        if (str == null) {
            return layeredImage;
        }
        if (currencyImage.f59912b) {
            ImageTransformations imageTransformations = currencyImage.f59913c;
            if (imageTransformations == null) {
                imageTransformations = f11290c;
            }
            transformable = new UrlImageDrawable.Shimmering.Transformable(imageTransformations);
        }
        return new UrlImage(str, (String) null, (UrlImageDrawable) transformable, 0L, 0L, (UrlImage.CustomHeaders) null, (Integer) null, (Integer) null, (ez0.h) null, (Image) layeredImage, false, false, currencyImage.f59913c, (Integer) null, (Integer) null, false, false, (Clause) null, 515578);
    }

    @Override // yy0.d
    public final void a(Image image, ImageView to6, Function1 function1, Function0 function0) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(to6, "to");
        if (!(image instanceof CurrencyImage)) {
            throw new IllegalArgumentException("CurrencyImageDisplayDelegate only displays CurrencyImages");
        }
        yy0.b bVar = this.f317758a;
        if (bVar != null) {
            Context context = to6.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            bVar.a(g((CurrencyImage) image, context), to6, function1, function0);
        }
    }

    @Override // yy0.d
    public final void b(ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "imageView");
    }

    @Override // yy0.d
    public final boolean e(Image image) {
        Intrinsics.checkNotNullParameter(image, "image");
        return image instanceof CurrencyImage;
    }

    @Override // yy0.d
    public final void f(Image image, Context context, int i, int i2, v1.m mVar, a3l.b bVar) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(context, "context");
        if (!(image instanceof CurrencyImage)) {
            throw new IllegalArgumentException("CurrencyImageDisplayDelegate only displays CurrencyImages");
        }
        yy0.b bVar2 = this.f317758a;
        if (bVar2 != null) {
            bVar2.c(g((CurrencyImage) image, context), context, i, i2, mVar, bVar);
        }
    }
}

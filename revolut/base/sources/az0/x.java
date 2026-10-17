package az0;

import android.content.Context;
import android.widget.ImageView;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.CdnImage;
import com.revolut.core.ui_kit_core.displayers.image.models.CountryImage;
import com.youTransactor.uCube.rpc.Constants;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class x extends yy0.o {

    @NotNull
    public static final a Companion = new a(0);

    /* JADX INFO: loaded from: classes20.dex */
    public static final class a {
        private a() {
        }

        public a(int i) {
        }
    }

    public static CdnImage g(CountryImage countryImage) {
        String str = countryImage.f59905a;
        Locale locale = Locale.ENGLISH;
        return new CdnImage(j6.a.q("flag_", p.a.r(locale, "ENGLISH", str, locale, "toLowerCase(...)")), "mobile/flags", null, null, null, null, Constants.TAG_OS_VERSION);
    }

    @Override // yy0.d
    public final void a(Image image, ImageView to6, Function1 function1, Function0 function0) {
        ImageView.ScaleType scaleType;
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(to6, "to");
        if (image instanceof CountryImage) {
            CountryImage countryImage = (CountryImage) image;
            int i = y.f11375a[countryImage.d.ordinal()];
            if (i == 1) {
                scaleType = ImageView.ScaleType.CENTER_INSIDE;
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                scaleType = ImageView.ScaleType.FIT_CENTER;
            }
            to6.setScaleType(scaleType);
            CdnImage cdnImageG = g(countryImage);
            if (this.f317758a == null && function0 != null) {
                function0.invoke();
            }
            yy0.b bVar = this.f317758a;
            if (bVar != null) {
                bVar.a(cdnImageG, to6, function1, function0);
            }
        }
    }

    @Override // yy0.d
    public final void b(ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        com.bumptech.glide.n nVarD = com.bumptech.glide.b.d(imageView.getContext());
        nVarD.getClass();
        a0.d.z(imageView, nVarD);
    }

    @Override // yy0.d
    public final boolean e(Image image) {
        Intrinsics.checkNotNullParameter(image, "image");
        return image instanceof CountryImage;
    }

    @Override // yy0.d
    public final void f(Image image, Context context, int i, int i2, v1.m mVar, a3l.b bVar) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(context, "context");
        if (!(image instanceof CountryImage)) {
            if (bVar != null) {
                bVar.invoke();
                return;
            }
            return;
        }
        CdnImage cdnImageG = g((CountryImage) image);
        if (this.f317758a == null && bVar != null) {
            bVar.invoke();
        }
        yy0.b bVar2 = this.f317758a;
        if (bVar2 != null) {
            bVar2.c(cdnImageG, context, i, i2, mVar, bVar);
        }
    }
}

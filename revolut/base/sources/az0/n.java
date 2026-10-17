package az0;

import android.content.Context;
import android.widget.ImageView;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.CdnImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class n extends yy0.o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fz0.g f11332b;

    public n(fz0.g urlImageFactory) {
        Intrinsics.checkNotNullParameter(urlImageFactory, "urlImageFactory");
        this.f11332b = urlImageFactory;
    }

    @Override // yy0.d
    public final void a(Image image, ImageView to6, Function1 function1, Function0 function0) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(to6, "to");
        if (!(image instanceof CdnImage)) {
            throw new IllegalStateException("CdnImageDisplayDelegate displays only CdnImages");
        }
        yy0.b bVar = this.f317758a;
        if (bVar != null) {
            bVar.a(g((CdnImage) image), to6, function1, function0);
        }
    }

    @Override // yy0.d
    public final void b(ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "imageView");
    }

    @Override // yy0.d
    public final boolean e(Image image) {
        Intrinsics.checkNotNullParameter(image, "image");
        return image instanceof CdnImage;
    }

    @Override // yy0.d
    public final void f(Image image, Context context, int i, int i2, v1.m mVar, a3l.b bVar) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(context, "context");
        if (!(image instanceof CdnImage)) {
            throw new IllegalStateException("CdnImageDisplayDelegate displays only CdnImages");
        }
        yy0.b bVar2 = this.f317758a;
        if (bVar2 != null) {
            bVar2.c(g((CdnImage) image), context, i, i2, mVar, bVar);
        }
    }

    public final UrlImage g(CdnImage image) {
        Intrinsics.checkNotNullParameter(image, "image");
        String str = image.f59869a;
        String str2 = image.f59870b;
        String str3 = image.f59871c;
        fz0.g gVar = this.f11332b;
        String strA = gVar.a(str, str2, str3);
        String str4 = image.f59869a;
        String str5 = image.f59872g;
        return new UrlImage(strA, Intrinsics.f(str4, str5) ? strA : gVar.a(str5, str2, str3), image.e, 0L, 0L, (UrlImage.CustomHeaders) null, (Integer) null, (Integer) null, (ez0.h) null, (Image) null, false, false, image.d, (Integer) null, (Integer) null, image.f59873h, false, image.f, 188408);
    }
}

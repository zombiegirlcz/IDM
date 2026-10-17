package az0;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.widget.ImageView;
import com.revolut.core.ui_kit_core.R$id;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImageDrawable;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import yy0.b;

/* JADX INFO: loaded from: classes.dex */
public final class o1 extends yy0.o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qz0.n f11338b;

    public o1(qz0.n urlImagesRepository) {
        Intrinsics.checkNotNullParameter(urlImagesRepository, "urlImagesRepository");
        this.f11338b = urlImagesRepository;
    }

    public static GlyphImage g(String str) {
        int iA = fz0.e.a(str);
        if (iA == 0) {
            iA = fz0.d.a(str);
        }
        if (iA == 0) {
            return null;
        }
        return new GlyphImage(iA, fz0.a.a(str), null, 4);
    }

    @Override // yy0.d
    public final void a(Image image, ImageView to6, Function1 function1, Function0 function0) {
        ColorDrawable colorDrawable;
        ImageView.ScaleType scaleType;
        Object obj2;
        GlyphImage glyphImageG;
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(to6, "to");
        if (!(image instanceof UrlImage)) {
            throw new IllegalStateException("UrlImagesDisplayDelegate displays only UrlImages");
        }
        fz0.f fVar = fz0.g.Companion;
        UrlImage urlImage = (UrlImage) image;
        cq0.b.Companion.getClass();
        fVar.getClass();
        String strA = fz0.f.a(urlImage);
        if (strA != null && (glyphImageG = g(strA)) != null) {
            yy0.b bVar = this.f317758a;
            if (bVar != null) {
                bVar.a(glyphImageG, to6, function1, function0);
                return;
            }
            return;
        }
        Integer num = urlImage.f60021h;
        if (num != null) {
            int iIntValue = num.intValue();
            Context context = to6.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            colorDrawable = new ColorDrawable(kli.a.s(iIntValue, context));
        } else {
            colorDrawable = null;
        }
        to6.setBackground(colorDrawable);
        ez0.h hVar = urlImage.i;
        int i = hVar == null ? -1 : n1.f11334a[hVar.ordinal()];
        if (i == -1) {
            scaleType = to6.getScaleType();
        } else if (i == 1) {
            scaleType = ImageView.ScaleType.CENTER_CROP;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            scaleType = ImageView.ScaleType.FIT_CENTER;
        }
        to6.setScaleType(scaleType);
        UrlImageDrawable urlImageDrawable = urlImage.f60019c;
        UrlImageDrawable.ImagePlaceholder imagePlaceholder = urlImageDrawable instanceof UrlImageDrawable.ImagePlaceholder ? (UrlImageDrawable.ImagePlaceholder) urlImageDrawable : null;
        if (imagePlaceholder != null) {
            yy0.b bVar2 = this.f317758a;
            if (bVar2 == null) {
                bVar2 = null;
            }
            if (bVar2 != null) {
                Image image2 = imagePlaceholder.getF60039a();
                Intrinsics.checkNotNullParameter(image2, "image");
                Intrinsics.checkNotNullParameter(to6, "to");
                Context context2 = to6.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                Activity activityM = kli.a.m(context2);
                if (activityM == null || !activityM.isDestroyed()) {
                    Object tag2 = to6.getTag(R$id.internal_view_tag_image_display_delegate);
                    b.a aVar = tag2 instanceof b.a ? (b.a) tag2 : null;
                    if (aVar != null) {
                        List listG = bVar2.g();
                        int size = listG.size();
                        int i2 = 0;
                        while (true) {
                            if (i2 >= size) {
                                obj2 = null;
                                break;
                            }
                            obj2 = listG.get(i2);
                            if (((yy0.d) obj2).e(image2)) {
                                break;
                            } else {
                                i2++;
                            }
                        }
                        yy0.d dVar = (yy0.d) obj2;
                        if (dVar == null) {
                            throw new NoSuchElementException("Delegates list doesn't contain delegate for placeholder image " + image2);
                        }
                        if (dVar instanceof yy0.o) {
                            ((yy0.o) dVar).f317758a = bVar2;
                        }
                        aVar.f317748c = dVar;
                        dVar.a(image2, to6, null, null);
                    }
                }
            }
        }
        this.f11338b.e(urlImage, to6, function1, new l1(urlImage, function0, to6, this, function1, 0));
    }

    @Override // yy0.d
    public final void b(ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        com.bumptech.glide.n nVarD = com.bumptech.glide.b.d(imageView.getContext());
        nVarD.getClass();
        a0.d.z(imageView, nVarD);
    }

    @Override // yy0.d
    public final boolean e(Image image) {
        Intrinsics.checkNotNullParameter(image, "image");
        return image instanceof UrlImage;
    }

    @Override // yy0.d
    public final void f(final Image image, final Context context, final int i, final int i2, final v1.m mVar, final a3l.b bVar) {
        GlyphImage glyphImageG;
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(context, "context");
        if (!(image instanceof UrlImage)) {
            throw new IllegalStateException("UrlImagesDisplayDelegate displays only UrlImages");
        }
        fz0.f fVar = fz0.g.Companion;
        UrlImage urlImage = (UrlImage) image;
        cq0.b.Companion.getClass();
        fVar.getClass();
        String strA = fz0.f.a(urlImage);
        if (strA == null || (glyphImageG = g(strA)) == null) {
            this.f11338b.g(context, urlImage, i, i2, mVar, new Function0() { // from class: az0.k1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    yy0.b bVar2;
                    Image image2 = ((UrlImage) image).f60022j;
                    Function0 function0 = bVar;
                    if (image2 != null && (bVar2 = this.f317758a) != null) {
                        bVar2.c(image2, context, i, i2, mVar, function0);
                    }
                    if (function0 != null) {
                        function0.invoke();
                    }
                    return Unit.f186387a;
                }
            });
            return;
        }
        yy0.b bVar2 = this.f317758a;
        if (bVar2 != null) {
            bVar2.c(glyphImageG, context, i, i2, mVar, bVar);
        }
    }
}

package az0;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.core.content.ContextCompat;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ContactImage;
import java.util.Arrays;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class s implements yy0.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qz0.b f11346a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Drawable f11347b;

    public s(qz0.b contactImagesRepository) {
        Intrinsics.checkNotNullParameter(contactImagesRepository, "contactImagesRepository");
        this.f11346a = contactImagesRepository;
    }

    @Override // yy0.d
    public final void a(Image image, ImageView imageView, Function1 function1, Function0 function0) {
        Drawable drawable;
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(imageView, "to");
        if (image instanceof ContactImage) {
            Context contextG = md6.s.g(imageView);
            ContactImage image2 = (ContactImage) image;
            String str = image2.d;
            Drawable fallbackDrawable = g(contextG, image2);
            Integer num = image2.f59892h;
            Drawable placeholder = (num == null || (drawable = ContextCompat.getDrawable(contextG, num.intValue())) == null) ? fallbackDrawable : drawable;
            String contactPhone = str == null ? "" : str;
            xz0.c cVar = (xz0.c) this.f11346a;
            cVar.getClass();
            Intrinsics.checkNotNullParameter(imageView, "imageView");
            Intrinsics.checkNotNullParameter(image2, "image");
            Intrinsics.checkNotNullParameter(placeholder, "placeholder");
            Intrinsics.checkNotNullParameter(fallbackDrawable, "fallbackDrawable");
            Intrinsics.checkNotNullParameter(contactPhone, "contactPhone");
            String strB = ((i51.a) cVar.f309759b).b(image2);
            if (strB != null && !xz0.c.f309757c.contains(strB)) {
                if (str == null) {
                    str = "";
                }
                cVar.b(image2, imageView, new xz0.j(strB, new xz0.h(str)), placeholder, fallbackDrawable, image2.i).T(xz0.c.a(function1, strB, fallbackDrawable)).R(imageView);
                return;
            }
            Context context = imageView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            c8.o[] oVarArrK = te0.w.K(image2, context);
            if (oVarArrK != null) {
                com.bumptech.glide.j jVarA = com.bumptech.glide.b.d(imageView.getContext()).q(fallbackDrawable).a(new u8.h().L((c8.o[]) Arrays.copyOf(oVarArrK, oVarArrK.length)));
                Intrinsics.checkNotNullExpressionValue(jVarA, "apply(...)");
                v04.b.b(jVarA, function1, function0).R(imageView);
            } else {
                imageView.setImageDrawable(fallbackDrawable);
                if (function1 != null) {
                    function1.invoke(fallbackDrawable);
                }
            }
        }
    }

    @Override // yy0.d
    public final void b(ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        ((xz0.c) this.f11346a).getClass();
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        com.bumptech.glide.n nVarD = com.bumptech.glide.b.d(imageView.getContext());
        nVarD.getClass();
        a0.d.z(imageView, nVarD);
    }

    @Override // yy0.d
    public final boolean e(Image image) {
        Intrinsics.checkNotNullParameter(image, "image");
        return image instanceof ContactImage;
    }

    @Override // yy0.d
    public final void f(Image image, Context context, int i, int i2, v1.m mVar, a3l.b bVar) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(context, "context");
        if (image instanceof ContactImage) {
            ContactImage image2 = (ContactImage) image;
            Drawable fallbackDrawable = g(context, image2);
            xz0.c cVar = (xz0.c) this.f11346a;
            cVar.getClass();
            Intrinsics.checkNotNullParameter(image2, "image");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(fallbackDrawable, "fallbackDrawable");
            String strB = ((i51.a) cVar.f309759b).b(image2);
            if (strB == null || xz0.c.f309757c.contains(strB)) {
                if (mVar != null) {
                    mVar.invoke(fallbackDrawable);
                }
            } else {
                String str = image2.d;
                if (str == null) {
                    str = "";
                }
                xz0.j jVar = new xz0.j(strB, new xz0.h(str));
                com.bumptech.glide.b.d(context).t(jVar).a(xz0.c.c(jVar, fallbackDrawable, fallbackDrawable, te0.w.K(image2, context))).T(xz0.c.a(mVar, strB, fallbackDrawable)).c0();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x005b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004f A[Catch: IOException -> 0x0055, TRY_LEAVE, TryCatch #2 {IOException -> 0x0055, blocks: (B:5:0x000a, B:20:0x004f, B:13:0x0040, B:18:0x0049, B:32:0x0063, B:33:0x0066, B:30:0x0061, B:8:0x002b, B:10:0x0035, B:12:0x003b, B:17:0x0047), top: B:107:0x000a, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00e5 A[PHI: r4
      0x00e5: PHI (r4v17 java.lang.String) = 
      (r4v16 java.lang.String)
      (r4v24 java.lang.String)
      (r4v27 java.lang.String)
      (r4v30 java.lang.String)
      (r4v31 java.lang.String)
     binds: [B:45:0x00ad, B:53:0x00bd, B:60:0x00cb, B:67:0x00d9, B:71:0x00e3] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.drawable.Drawable g(android.content.Context r11, com.revolut.core.ui_kit_core.displayers.image.models.ContactImage r12) {
        /*
            Method dump skipped, instruction units count: 401
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: az0.s.g(android.content.Context, com.revolut.core.ui_kit_core.displayers.image.models.ContactImage):android.graphics.drawable.Drawable");
    }
}

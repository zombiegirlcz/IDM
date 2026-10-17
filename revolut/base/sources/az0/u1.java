package az0;

import android.content.Context;
import android.widget.ImageView;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.WallpaperImage;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class u1 implements yy0.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1 f11363a;

    public u1(w1 loader) {
        Intrinsics.checkNotNullParameter(loader, "loader");
        this.f11363a = loader;
    }

    @Override // yy0.d
    public final void a(Image image, ImageView to6, Function1 function1, Function0 function0) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(to6, "to");
        if (!(image instanceof WallpaperImage)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        WallpaperImage image2 = (WallpaperImage) image;
        Intrinsics.checkNotNullParameter(image2, "image");
        Intrinsics.checkNotNullParameter(to6, "to");
        com.bumptech.glide.n nVarD = com.bumptech.glide.b.d(to6.getContext());
        Intrinsics.checkNotNullExpressionValue(nVarD, "with(...)");
        String str = null;
        qz0.e eVar = (function1 == null && function0 == null) ? null : new qz0.e(function1, function0, 1);
        Context context = to6.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Context context2 = to6.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        boolean zQ = kli.a.q(context2);
        w1 w1Var = this.f11363a;
        com.bumptech.glide.j jVarA = w1Var.a(nVarD, image2, context, zQ);
        String str2 = image2.f;
        String str3 = image2.e;
        if (eVar != null) {
            jVarA = jVarA.N(eVar);
            Intrinsics.checkNotNullExpressionValue(jVarA, "addListener(...)");
        }
        if (str3 != null || str2 != null) {
            Context context3 = to6.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            str = kli.a.q(context3) ? str2 : str3;
        }
        if (str != null) {
            com.bumptech.glide.j jVarT = nVarD.t(w1Var.b(str, image2.d));
            qz0.n.Companion.getClass();
            u8.a aVarE = jVarT.E(new x8.e(String.valueOf(0L)));
            Intrinsics.checkNotNullExpressionValue(aVarE, "signature(...)");
            com.bumptech.glide.j jVarD = te0.w.d((com.bumptech.glide.j) aVarE, w1Var.f11372a, w1Var.d);
            if (eVar != null) {
                jVarD = jVarD.N(eVar);
                Intrinsics.checkNotNullExpressionValue(jVarD, "addListener(...)");
            }
            jVarA.d0(jVarD);
        }
        jVarA.R(to6);
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
        return image instanceof WallpaperImage;
    }

    @Override // yy0.d
    public final void f(Image image, Context context, int i, int i2, v1.m mVar, a3l.b bVar) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(context, "context");
        if (!(image instanceof WallpaperImage)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        com.bumptech.glide.n nVarD = com.bumptech.glide.b.d(context);
        Intrinsics.checkNotNullExpressionValue(nVarD, "with(...)");
        boolean zQ = kli.a.q(context);
        ((com.bumptech.glide.j) v04.b.b(this.f11363a.a(nVarD, (WallpaperImage) image, context, zQ), mVar, bVar).w(i, i2)).c0();
    }
}

package zjf;

import a0.d;
import android.widget.ImageView;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.MerchantImage;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import l8.i;
import l8.n;
import u8.h;
import yy0.b;
import yy0.f;
import yy0.o;

/* JADX INFO: loaded from: classes8.dex */
public final class a extends o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bnf.a f322819b;

    public a(bnf.a merchantIconProvider) {
        Intrinsics.checkNotNullParameter(merchantIconProvider, "merchantIconProvider");
        this.f322819b = merchantIconProvider;
    }

    @Override // yy0.d
    public final void a(Image image, ImageView to6, Function1 function1, Function0 function0) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(to6, "to");
        if (image instanceof MerchantImage) {
            to6.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            MerchantImage merchantImage = (MerchantImage) image;
            String str = merchantImage.f59964a;
            Image image2 = merchantImage.f59965b;
            if ((str == null || d0.W(str)) && image2 != null) {
                b bVar = this.f317758a;
                if (bVar != null) {
                    f.e(bVar, image2, to6, null, null, 12);
                    return;
                }
                return;
            }
            String strA = this.f322819b.a(str, true);
            u8.a aVarK = new h().K(n.f192739b, new i());
            Intrinsics.checkNotNullExpressionValue(aVarK, "circleCrop(...)");
            h hVar = (h) aVarK;
            b bVar2 = this.f317758a;
            if (bVar2 != null) {
                bVar2.a(image2, to6, new ryd.f((Object) to6, strA, (Object) hVar, (Object) function1, (Object) function0, 20), function0);
            }
        }
    }

    @Override // yy0.d
    public final void b(ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        com.bumptech.glide.n nVarD = com.bumptech.glide.b.d(imageView.getContext());
        nVarD.getClass();
        d.z(imageView, nVarD);
    }

    @Override // yy0.d
    public final boolean e(Image image) {
        Intrinsics.checkNotNullParameter(image, "image");
        return image instanceof MerchantImage;
    }
}

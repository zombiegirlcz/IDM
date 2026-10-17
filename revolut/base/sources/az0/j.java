package az0;

import android.widget.ImageView;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.CardDesignImage;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class j implements yy0.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w8.a f11305a = new w8.a(300, true);

    @Override // yy0.d
    public final void a(Image image, ImageView to6, Function1 function1, Function0 function0) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(to6, "to");
        CardDesignImage cardDesignImage = (CardDesignImage) image;
        u8.a aVarE = ((u8.h) ((u8.h) ((u8.h) ((u8.h) new u8.h().x(cardDesignImage.f59858b)).j(cardDesignImage.f59858b)).m()).g(e8.p.f123505a)).E(new x8.e(String.valueOf(cardDesignImage.f59859c)));
        Intrinsics.checkNotNullExpressionValue(aVarE, "signature(...)");
        com.bumptech.glide.b.d(to6.getContext()).u(cardDesignImage.f59857a).e0(n8.b.c(this.f11305a)).a((u8.h) aVarE).R(to6);
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
        return image instanceof CardDesignImage;
    }
}

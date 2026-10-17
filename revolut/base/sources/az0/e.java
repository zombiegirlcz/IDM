package az0;

import android.content.Context;
import android.widget.ImageView;
import com.revolut.core.ui_kit_core.displayers.image.AvatarByUserIdTextDrawable;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.AvatarByUserIdImage;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xz0.i;

/* JADX INFO: loaded from: classes.dex */
public final class e implements yy0.d {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zm0.c f11298a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f11299b;

    public e(zm0.c sessionProvider, d urlProvider) {
        Intrinsics.checkNotNullParameter(sessionProvider, "sessionProvider");
        Intrinsics.checkNotNullParameter(urlProvider, "urlProvider");
        this.f11298a = sessionProvider;
        this.f11299b = urlProvider;
    }

    public static AvatarByUserIdTextDrawable g(Context context, AvatarByUserIdImage avatarByUserIdImage) {
        int iK = ue0.e.k(avatarByUserIdImage, context, avatarByUserIdImage.f59842b);
        int iM = ue0.e.m(avatarByUserIdImage, context);
        String strA = b01.c.a(avatarByUserIdImage.f59842b);
        int iK2 = kli.a.k(context, avatarByUserIdImage.f59843c);
        int iC = rim.d.c(iK2 / 2.4f);
        AvatarByUserIdTextDrawable.a aVarA = AvatarByUserIdTextDrawable.a();
        aVarA.e(iM);
        aVarA.d(iK2);
        aVarA.g(iK2);
        aVarA.c(iC);
        aVarA.f();
        aVarA.a();
        AvatarByUserIdTextDrawable avatarByUserIdTextDrawableB = aVarA.b(iK, strA);
        Intrinsics.checkNotNullExpressionValue(avatarByUserIdTextDrawableB, "buildRound(...)");
        return avatarByUserIdTextDrawableB;
    }

    @Override // yy0.d
    public final void a(Image image, ImageView to6, Function1 function1, Function0 function0) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(to6, "to");
        if (!(image instanceof AvatarByUserIdImage)) {
            throw new IllegalStateException("Check failed.");
        }
        AvatarByUserIdImage avatarByUserIdImage = (AvatarByUserIdImage) image;
        if (avatarByUserIdImage.d) {
            AvatarByUserIdTextDrawable avatarByUserIdTextDrawableG = g(md6.s.g(to6), avatarByUserIdImage);
            to6.setImageDrawable(avatarByUserIdTextDrawableG);
            if (function1 != null) {
                function1.invoke(avatarByUserIdTextDrawableG);
                return;
            }
            return;
        }
        xz0.j jVar = new xz0.j(((i51.a) this.f11299b).c(avatarByUserIdImage), i.a.f309767a);
        Context contextG = md6.s.g(to6);
        AvatarByUserIdTextDrawable avatarByUserIdTextDrawableG2 = g(contextG, avatarByUserIdImage);
        boolean z = !(((cn0.g) this.f11298a).d() instanceof mm0.n);
        u8.a aVarH = ((u8.h) new u8.h().y(avatarByUserIdTextDrawableG2)).H(new l8.i());
        Intrinsics.checkNotNullExpressionValue(aVarH, "transform(...)");
        com.bumptech.glide.j jVarA = ((com.bumptech.glide.j) com.bumptech.glide.b.b(contextG).c(contextG).t(jVar).q(z)).e0(n8.b.b()).a((u8.h) aVarH);
        Intrinsics.checkNotNullExpressionValue(jVarA, "apply(...)");
        v04.b.b(jVarA, function1, function0).R(to6);
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
        return image instanceof AvatarByUserIdImage;
    }
}

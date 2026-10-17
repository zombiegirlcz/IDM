package w01;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.airbnb.lottie.LottieAnimationView;
import com.revolut.core.ui_kit_core.displayers.image.models.LottieImage;
import com.revolut.core.ui_kit_core.displayers.image.models.LottieSource;
import com.revolut.core.ui_kit_core.displayers.image.models.SourceUrl;
import com.revolut.core.ui_kit_resources.R$raw;
import com.youTransactor.uCube.rpc.Constants;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewGroup f293607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Lazy f293608b;

    public c(ViewGroup root) {
        Intrinsics.checkNotNullParameter(root, "root");
        this.f293607a = root;
        this.f293608b = yhm.j.b(new vt3.a(this, 7));
    }

    public final void a(int i, g scaleMode) {
        LottieImage lottieImageA;
        ImageView.ScaleType scaleType;
        Intrinsics.checkNotNullParameter(scaleMode, "scaleMode");
        LottieImage.Companion companion = LottieImage.INSTANCE;
        SourceUrl sourceUrl = dz0.a.f121174a;
        Intrinsics.checkNotNullParameter(companion, "<this>");
        if (i == R$raw.uikit_lottie_confetti_deprecated) {
            lottieImageA = dz0.a.b(companion);
        } else {
            LottieSource.Companion companion2 = LottieSource.INSTANCE;
            companion2.getClass();
            lottieImageA = LottieImage.Companion.a(companion, dz0.a.a(companion2, i), false, false, null, null, Constants.TAG_SUPPORTED_LOCALE_LIST);
        }
        LottieImage lottieImage = lottieImageA;
        LottieAnimationView lottieAnimationView = (LottieAnimationView) this.f293608b.getValue();
        lottieAnimationView.setVisibility(0);
        if (i == R$raw.uikit_lottie_confetti_deprecated) {
            scaleType = ImageView.ScaleType.CENTER_CROP;
        } else {
            int i2 = b.f293606a[scaleMode.ordinal()];
            if (i2 == 1) {
                scaleType = ImageView.ScaleType.FIT_XY;
            } else if (i2 == 2) {
                scaleType = ImageView.ScaleType.CENTER_INSIDE;
            } else {
                if (i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                scaleType = ImageView.ScaleType.CENTER_CROP;
            }
        }
        lottieAnimationView.setScaleType(scaleType);
        Context context = lottieAnimationView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        yy0.f.e(jh.d.f(context).Q(), lottieImage, lottieAnimationView, null, null, 12);
    }
}

package b01;

import com.revolut.core.ui_kit_core.displayers.image.models.LottieImage;
import com.revolut.core.ui_kit_core.displayers.image.models.LottieSource;
import com.revolut.core.ui_kit_core.displayers.image.models.SourceUrl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class a {
    private a() {
    }

    public static LottieImage.ColorOverride a(LottieImage image) {
        Intrinsics.checkNotNullParameter(image, "image");
        LottieSource lottieSource = image.f59955a;
        LottieImage.ColorOverride colorOverride = image.f;
        LottieSource.Companion companion = LottieSource.INSTANCE;
        SourceUrl sourceUrl = dz0.a.f121174a;
        Intrinsics.checkNotNullParameter(companion, "<this>");
        if (!Intrinsics.f(lottieSource, dz0.a.f121174a)) {
            return colorOverride;
        }
        LottieImage.ColorOverride.TintedConfetti tintedConfetti = colorOverride instanceof LottieImage.ColorOverride.TintedConfetti ? (LottieImage.ColorOverride.TintedConfetti) colorOverride : null;
        return tintedConfetti == null ? new LottieImage.ColorOverride.TintedConfetti(0) : tintedConfetti;
    }
}

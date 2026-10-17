package dz0;

import com.revolut.core.ui_kit_core.displayers.image.models.LottieImage;
import com.revolut.core.ui_kit_core.displayers.image.models.LottieSource;
import com.revolut.core.ui_kit_core.displayers.image.models.SourceResource;
import com.revolut.core.ui_kit_core.displayers.image.models.SourceUrl;
import com.revolut.core.ui_kit_resources.R$raw;
import com.youTransactor.uCube.rpc.Constants;
import kotlin.jvm.internal.Intrinsics;
import uc0.b;

/* JADX INFO: loaded from: classes20.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SourceUrl f121174a = b.a("mobile/animations/core", "tinted_confetti_v3");

    public static final LottieSource a(LottieSource.Companion companion, int i) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        if (i != R$raw.uikit_lottie_confetti_deprecated) {
            return new SourceResource(i);
        }
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return f121174a;
    }

    public static final LottieImage b(LottieImage.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        Intrinsics.checkNotNullParameter(LottieSource.INSTANCE, "<this>");
        return LottieImage.Companion.a(companion, f121174a, false, false, new LottieImage.ColorOverride.TintedConfetti(0), null, Constants.TAG_BOOT_LOADER_CHECKSUM);
    }
}

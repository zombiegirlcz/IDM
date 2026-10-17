package rp0;

import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit_core.displayers.image.models.LottieColorOverride;
import com.revolut.core.ui_kit_core.displayers.image.models.LottieImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.youTransactor.uCube.rpc.Constants;

/* JADX INFO: loaded from: classes19.dex */
public abstract class l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final LottieImage f256114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final LottieImage f256115b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final LottieImage f256116c;
    public static final LottieImage d;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        LottieImage.Companion companion = LottieImage.INSTANCE;
        Float f = null;
        int i = 12;
        ez0.f fVar = null;
        f256114a = LottieImage.Companion.a(companion, uc0.b.a("mobile/lottie_animations_tooltips", "success"), false, false, new LottieImage.ColorOverride.TintedConfetti(zhm.u.c(new LottieColorOverride(zhm.v.k("Foreground checkmark BG", "**"), new Color.Solid(R$attr.uikit_colorForeground), fVar, f, i))), null, Constants.TAG_BOOT_LOADER_CHECKSUM);
        f256115b = LottieImage.Companion.a(companion, uc0.b.a("mobile/lottie_animations_tooltips", "completion"), false, false, new LottieImage.ColorOverride.Explicit(zhm.u.c(new LottieColorOverride(zhm.v.k("Checkmark BG Foreground", "**"), new Color.Solid(R$attr.uikit_colorForeground), fVar, f, i))), null, Constants.TAG_BOOT_LOADER_CHECKSUM);
        f256116c = LottieImage.Companion.a(companion, uc0.b.a("mobile/lottie_animations_tooltips", "delete"), false, false, new LottieImage.ColorOverride.Explicit(zhm.u.c(new LottieColorOverride(zhm.v.k("Checkmark BG Foreground", "**"), new Color.Solid(R$attr.uikit_colorForeground), fVar, f, i))), null, Constants.TAG_BOOT_LOADER_CHECKSUM);
        d = LottieImage.Companion.a(companion, uc0.b.a("mobile/lottie_animations_tooltips", "info"), false, false, new LottieImage.ColorOverride.Explicit(zhm.v.k(new LottieColorOverride(zhm.v.k("Top", "**"), new Color.Solid(R$attr.uikit_colorForeground), null, null, 12), new LottieColorOverride(zhm.v.k("Bottom", "**"), new Color.Solid(R$attr.uikit_colorForeground), 0 == true ? 1 : 0, null, 12))), null, Constants.TAG_BOOT_LOADER_CHECKSUM);
    }
}

package up0;

import android.widget.ImageView;
import aw0.s8;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.models.NavBarWithContainerBackground;
import com.revolut.core.ui_kit_core.displayers.image.models.LottieColorOverride;
import com.revolut.core.ui_kit_core.displayers.image.models.LottieImage;
import com.revolut.core.ui_kit_core.displayers.image.models.SourceUrl;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f281800a = zhm.v.k("Background", "Background Color", "**");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List f281801b = zhm.v.k("Glow", "Glow Pulse", "Glow Color", "**");

    private z() {
    }

    public static NavBarWithContainerBackground.ImageBackground a(y variant, SourceUrl source) {
        Intrinsics.checkNotNullParameter(variant, "variant");
        Intrinsics.checkNotNullParameter(source, "source");
        Color.SolidRes solidRes = new Color.SolidRes(variant.a());
        Color.SolidRes solidRes2 = new Color.SolidRes(variant.b());
        LottieImage.Companion companion = LottieImage.INSTANCE;
        ez0.f fVar = ez0.f.REPLACE;
        LottieImage.ColorOverride.Explicit explicit = new LottieImage.ColorOverride.Explicit(zhm.v.k(new LottieColorOverride(f281800a, solidRes, fVar, null, 8), new LottieColorOverride(f281801b, solidRes2, fVar, null, 8)));
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_CROP;
        return new NavBarWithContainerBackground.ImageBackground(LottieImage.Companion.a(companion, source, false, false, explicit, null, 206), (s8) null, solidRes, 6);
    }
}

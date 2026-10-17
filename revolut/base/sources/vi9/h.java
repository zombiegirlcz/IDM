package vi9;

import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class h {

    @NotNull
    public static final g Companion = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ia3.u f289542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m93.d f289543b;

    public h(ia3.u disposableCardPlaceholderMapper, m93.d cardThumbnailImageProvider) {
        Intrinsics.checkNotNullParameter(disposableCardPlaceholderMapper, "disposableCardPlaceholderMapper");
        Intrinsics.checkNotNullParameter(cardThumbnailImageProvider, "cardThumbnailImageProvider");
        this.f289542a = disposableCardPlaceholderMapper;
        this.f289543b = cardThumbnailImageProvider;
    }

    public static LayeredImage a(int i, int i2) {
        return LayeredImage.Companion.f(LayeredImage.INSTANCE, i, i2, R$attr.uikit_colorBackground, null, 2.0f, 2.0f, Float.valueOf(8.0f), 8);
    }
}

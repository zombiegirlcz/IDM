package bp5;

import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class e {

    @NotNull
    public static final d Companion = new d();

    static {
        LayeredImage.Companion.f(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_wallet, R$attr.uikit_colorAccent, R$attr.uikit_colorWidgetBackground, Integer.valueOf(R$attr.uikit_colorWhite), 7.2f, 4.8f, null, 64);
    }

    public e(ik5.d cryptoAddressTypeUiMapper) {
        Intrinsics.checkNotNullParameter(cryptoAddressTypeUiMapper, "cryptoAddressTypeUiMapper");
    }
}

package u1a;

import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final LayeredImage f276365b = LayeredImage.Companion.p(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_logo_revolut, Integer.valueOf(R$attr.uikit_colorBlack), R$attr.uikit_colorWhite, 2.0f, 24.0f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fkg.a f276366a;

    public b(fkg.a qrCodeGenerator) {
        Intrinsics.checkNotNullParameter(qrCodeGenerator, "qrCodeGenerator");
        this.f276366a = qrCodeGenerator;
    }
}

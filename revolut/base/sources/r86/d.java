package r86;

import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.devicemanagement.api.model.UserDevice;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f252377a;

    public d(b deviceDetailsInfoMapper) {
        Intrinsics.checkNotNullParameter(deviceDetailsInfoMapper, "deviceDetailsInfoMapper");
        this.f252377a = deviceDetailsInfoMapper;
    }

    public final LayeredImage a(UserDevice userDevice) {
        return LayeredImage.Companion.b(LayeredImage.INSTANCE, this.f252377a.b(userDevice), Integer.valueOf(R$attr.uikit_colorAccent), R$attr.uikit_colorGrey50_10, 16.0f, Float.valueOf(40.0f), null, 32);
    }
}

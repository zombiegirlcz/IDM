package androidx.camera.camera2.impl;

import androidx.camera.core.impl.Config;
import hx7.b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import rkm.d;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u001a\u0010\u0001\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004\"\u001a\u0010\u0006\u001a\u00020\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lrkm/d;", "useCaseCameraIds", "Lrkm/d;", "getUseCaseCameraIds", "()Lrkm/d;", "Landroidx/camera/core/impl/Config$OptionPriority;", "defaultOptionPriority", "Landroidx/camera/core/impl/Config$OptionPriority;", "getDefaultOptionPriority", "()Landroidx/camera/core/impl/Config$OptionPriority;", "camera-camera2"}, k = 2, mv = {2, 1, 0}, xi = 48)
public abstract class UseCaseCameraKt {

    @NotNull
    private static final d useCaseCameraIds = b.h(0);

    @NotNull
    private static final Config.OptionPriority defaultOptionPriority = Config.OptionPriority.OPTIONAL;

    @NotNull
    public static final Config.OptionPriority getDefaultOptionPriority() {
        return defaultOptionPriority;
    }

    @NotNull
    public static final d getUseCaseCameraIds() {
        return useCaseCameraIds;
    }
}

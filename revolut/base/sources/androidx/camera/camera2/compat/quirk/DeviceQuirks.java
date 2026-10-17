package androidx.camera.camera2.compat.quirk;

import androidx.camera.core.Logger;
import androidx.camera.core.impl.Quirk;
import androidx.camera.core.impl.QuirkSettings;
import androidx.camera.core.impl.QuirkSettingsHolder;
import androidx.camera.core.impl.Quirks;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import b0.m;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J,\u0010\b\u001a\u0004\u0018\u00018\u0000\"\n\b\u0000\u0010\u0005*\u0004\u0018\u00010\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0086\u0002¢\u0006\u0004\b\b\u0010\tR(\u0010\u000b\u001a\u00020\n8\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0004\b\u000b\u0010\f\u0012\u0004\b\u0011\u0010\u0003\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Landroidx/camera/camera2/compat/quirk/DeviceQuirks;", "", "<init>", "()V", "Landroidx/camera/core/impl/Quirk;", "T", "Ljava/lang/Class;", "quirkClass", "get", "(Ljava/lang/Class;)Landroidx/camera/core/impl/Quirk;", "Landroidx/camera/core/impl/Quirks;", "all", "Landroidx/camera/core/impl/Quirks;", "getAll", "()Landroidx/camera/core/impl/Quirks;", "setAll", "(Landroidx/camera/core/impl/Quirks;)V", "getAll$annotations", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DeviceQuirks {

    @NotNull
    public static final DeviceQuirks INSTANCE = new DeviceQuirks();
    public static volatile Quirks all;

    static {
        QuirkSettingsHolder.instance().observe(CameraXExecutors.directExecutor(), new m(3));
    }

    private DeviceQuirks() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(QuirkSettings quirkSettings) {
        DeviceQuirksLoader deviceQuirksLoader = DeviceQuirksLoader.INSTANCE;
        Intrinsics.h(quirkSettings);
        setAll(new Quirks(deviceQuirksLoader.loadQuirks(quirkSettings)));
        Logger.d("DeviceQuirks", "camera2 DeviceQuirks = " + Quirks.toString(getAll()));
    }

    @NotNull
    public static final Quirks getAll() {
        Quirks quirks = all;
        if (quirks != null) {
            return quirks;
        }
        Intrinsics.r("all");
        throw null;
    }

    public static final void setAll(@NotNull Quirks quirks) {
        Intrinsics.checkNotNullParameter(quirks, "<set-?>");
        all = quirks;
    }

    public final <T extends Quirk> T get(@NotNull Class<T> quirkClass) {
        Intrinsics.checkNotNullParameter(quirkClass, "quirkClass");
        return (T) getAll().get(quirkClass);
    }
}

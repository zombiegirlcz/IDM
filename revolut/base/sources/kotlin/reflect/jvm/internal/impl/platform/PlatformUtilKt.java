package kotlin.reflect.jvm.internal.impl.platform;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.d0;

/* JADX INFO: loaded from: classes14.dex */
public final class PlatformUtilKt {
    @NotNull
    public static final String getPresentableDescription(@NotNull TargetPlatform targetPlatform) {
        Intrinsics.checkNotNullParameter(targetPlatform, "<this>");
        return d0.k0(targetPlatform.getComponentPlatforms(), "/", null, null, 0, null, 62);
    }
}

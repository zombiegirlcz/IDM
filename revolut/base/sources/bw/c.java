package bw;

import android.os.Build;
import androidx.camera.core.CameraSelector;
import java.util.Collection;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import zhm.y0;

/* JADX INFO: loaded from: classes16.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yw.h f19141a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f19142b;

    public c(yw.h settings, g deviceInfoProvider) {
        Intrinsics.checkNotNullParameter(settings, "settings");
        Intrinsics.checkNotNullParameter(deviceInfoProvider, "deviceInfoProvider");
        this.f19141a = settings;
        this.f19142b = y0.b("R25P");
    }

    public final CameraSelector a() {
        Set<String> set = this.f19142b;
        if (!(set instanceof Collection) || !set.isEmpty()) {
            for (String str : set) {
                String MODEL = Build.MODEL;
                Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
                if (Intrinsics.f(MODEL, str)) {
                    CameraSelector cameraSelectorBuild = new CameraSelector.Builder().addCameraFilter(new b()).build();
                    Intrinsics.h(cameraSelectorBuild);
                    return cameraSelectorBuild;
                }
            }
        }
        return yv.d.a(this.f19141a);
    }
}

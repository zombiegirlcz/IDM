package vv;

import androidx.lifecycle.LifecycleOwner;
import com.revolut.camerakit.client.api.models.CameraCaptureSettings;
import kotlin.jvm.internal.Intrinsics;
import kv.p;
import org.jetbrains.annotations.NotNull;
import vkm.q;
import vkm.z1;

/* JADX INFO: loaded from: classes16.dex */
public final class d {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xv.c f292425a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xv.h f292426b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LifecycleOwner f292427c;
    public final p d;
    public final CameraCaptureSettings e;
    public final z1 f;

    public d(xv.c cameraCoreDelegate, xv.h detector, LifecycleOwner lifecycleOwner, p mediaCaptureProvider, CameraCaptureSettings cameraCaptureSettings) {
        Intrinsics.checkNotNullParameter(cameraCoreDelegate, "cameraCoreDelegate");
        Intrinsics.checkNotNullParameter(detector, "detector");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(mediaCaptureProvider, "mediaCaptureProvider");
        Intrinsics.checkNotNullParameter(cameraCaptureSettings, "cameraCaptureSettings");
        this.f292425a = cameraCoreDelegate;
        this.f292426b = detector;
        this.f292427c = lifecycleOwner;
        this.d = mediaCaptureProvider;
        this.e = cameraCaptureSettings;
        this.f = q.b(0, 6, null);
    }
}

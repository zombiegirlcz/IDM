package com.fourthline.orca.internal;

import com.fourthline.core.internal.devicedata.DeviceDataCollector;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class h9 implements DeviceDataCollector {
    public static final a d = new a(null);
    public static final int e = 8;
    private static final List f = zhm.v.k(new Pair("camera_capture_width", "Width"), new Pair("camera_capture_height", "Height"), new Pair("camera_frame_rate", "FrameRate"), new Pair("camera_facing_mode", "FacingMode"), new Pair("camera_device_id", "DeviceId"), new Pair("camera_label", "Label"), new Pair("camera_max_width", "MaxWidth"), new Pair("camera_max_height", "MaxHeight"), new Pair("camera_max_frame_rate", "MaxFrameRate"), new Pair("camera_torch", "Torch"), new Pair("camera_focus_mode", "FocusMode"), new Pair("camera_exposure_mode", "ExposureMode"), new Pair("camera_white_balance_mode", "WhiteBalanceMode"));

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final List f29181g = zhm.v.k(new Pair("gpu_renderer", "gpuRenderer"), new Pair("gpu_vendor", "gpuVendor"), new Pair("opengles3_supported", "opengles3Supported"), new Pair("vulkan_supported", "vulkanSupported"));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f29182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f29183b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f29184c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Removed duplicated region for block: B:45:0x00b7  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x00ee  */
        /* JADX WARN: Removed duplicated region for block: B:66:0x0122  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void a(com.fourthline.orca.internal.sg0 r9, java.util.Map r10, java.lang.String r11) {
            /*
                Method dump skipped, instruction units count: 298
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.h9.a.a(com.fourthline.orca.internal.sg0, java.util.Map, java.lang.String):void");
        }

        private a() {
        }
    }

    public h9(Map source, Map destination, boolean z) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(destination, "destination");
        this.f29182a = source;
        this.f29183b = destination;
        this.f29184c = z;
    }

    @Override // com.fourthline.core.internal.devicedata.DeviceDataCollector
    public void startDataCollection() {
        if (this.f29184c && !this.f29182a.isEmpty()) {
            this.f29183b.putAll(this.f29182a);
            this.f29182a.size();
        }
    }
}

package com.fourthline.orca.internal;

import android.os.BatteryManager;
import android.os.PowerManager;
import com.fourthline.core.internal.devicedata.AndroidDataCollectorHelper;
import com.fourthline.core.internal.devicedata.DeviceDataCollector;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class c3 implements DeviceDataCollector {
    public static final a d = new a(null);
    public static final int e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AndroidDataCollectorHelper f27348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f27349b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f27350c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public c3(AndroidDataCollectorHelper helper, Map destination, boolean z) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(destination, "destination");
        this.f27348a = helper;
        this.f27349b = destination;
        this.f27350c = z;
    }

    @Override // com.fourthline.core.internal.devicedata.DeviceDataCollector
    public void startDataCollection() {
        if (this.f27350c) {
            AndroidDataCollectorHelper androidDataCollectorHelper = this.f27348a;
            BatteryManager batteryManager = androidDataCollectorHelper.getBatteryManager();
            if (batteryManager != null) {
                this.f27349b.put("batteryChargeLevel", Double.valueOf(((double) batteryManager.getIntProperty(4)) / 100.0d));
                Map map = this.f27349b;
                int intProperty = batteryManager.getIntProperty(6);
                String str = "unknown";
                if (intProperty != 1) {
                    if (intProperty == 2) {
                        str = "charging";
                    } else if (intProperty == 3) {
                        str = "discharging";
                    } else if (intProperty == 4) {
                        str = "unplugged";
                    } else if (intProperty == 5) {
                        str = "full";
                    }
                }
                map.put("batteryChargingState", str);
            }
            PowerManager powerManager = androidDataCollectorHelper.getPowerManager();
            if (powerManager != null) {
                this.f27349b.put("batteryIsInLowPowerMode", Boolean.valueOf(powerManager.isPowerSaveMode()));
            }
        }
    }
}

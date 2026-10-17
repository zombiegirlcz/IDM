package com.fourthline.orca.internal;

import android.app.ActivityManager;
import android.os.Build;
import android.os.Environment;
import android.os.PowerManager;
import android.os.StatFs;
import com.fourthline.core.internal.devicedata.AndroidDataCollectorHelper;
import com.fourthline.core.internal.devicedata.DeviceDataCollector;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class a10 implements DeviceDataCollector {
    public static final a e = new a(null);
    public static final int f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AndroidDataCollectorHelper f26671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f26672b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f26673c;
    private final Double[] d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public a10(AndroidDataCollectorHelper helper, Map destination, boolean z) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(destination, "destination");
        this.f26671a = helper;
        this.f26672b = destination;
        this.f26673c = z;
        this.d = new Double[]{Double.valueOf(0.25d), Double.valueOf(0.5d), Double.valueOf(1.0d), Double.valueOf(2.0d), Double.valueOf(4.0d), Double.valueOf(8.0d)};
    }

    private final double a(long j2) {
        return j2 / 1.073741824E9d;
    }

    @Override // com.fourthline.core.internal.devicedata.DeviceDataCollector
    public void startDataCollection() {
        PowerManager powerManager;
        if (this.f26673c) {
            AndroidDataCollectorHelper androidDataCollectorHelper = this.f26671a;
            String property = System.getProperty("os.arch");
            String str = "unknown";
            if (property == null) {
                property = "unknown";
            }
            this.f26672b.put("deviceArchitectureName", property);
            if (!property.equals("unknown")) {
                this.f26672b.put("deviceArchitectureBitness", kotlin.text.d0.J(property, "64", false) ? "64" : "32");
            }
            this.f26672b.put("deviceProcessorsCount", Integer.valueOf(Runtime.getRuntime().availableProcessors()));
            ActivityManager activityManager = androidDataCollectorHelper.getActivityManager();
            if (activityManager != null) {
                this.f26672b.put("deviceMemoryAmount", Double.valueOf(a(activityManager)));
            }
            Pair pairA = a();
            this.f26672b.put("deviceStorageAmountTotal", pairA.f186385a);
            this.f26672b.put("deviceStorageAmountFree", pairA.f186386b);
            if (Build.VERSION.SDK_INT < 29 || (powerManager = androidDataCollectorHelper.getPowerManager()) == null) {
                return;
            }
            int currentThermalStatus = powerManager.getCurrentThermalStatus();
            Map map = this.f26672b;
            switch (currentThermalStatus) {
                case 0:
                    str = "nominal";
                    break;
                case 1:
                case 2:
                    str = "fair";
                    break;
                case 3:
                    str = "serious";
                    break;
                case 4:
                case 5:
                case 6:
                    str = "critical";
                    break;
            }
            map.put("deviceThermalState", str);
        }
    }

    private final double a(ActivityManager activityManager) {
        activityManager.getMemoryInfo(new ActivityManager.MemoryInfo());
        return a(r0.totalMem / 1.073741824E9d);
    }

    private final double a(double d) {
        double dDoubleValue = ((Number) kotlin.collections.d.O(this.d)).doubleValue();
        double d5 = Double.MAX_VALUE;
        for (Double d6 : this.d) {
            double dDoubleValue2 = d6.doubleValue();
            double dAbs = Math.abs(d - dDoubleValue2);
            if (dAbs < d5) {
                dDoubleValue = dDoubleValue2;
                d5 = dAbs;
            }
        }
        return dDoubleValue;
    }

    private final Pair a() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return new Pair(Double.valueOf(a(statFs.getTotalBytes())), Double.valueOf(a(statFs.getAvailableBlocksLong())));
    }
}

package com.fourthline.orca.internal;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.provider.Settings;
import com.fourthline.core.DeviceMetadata;
import com.fourthline.core.internal.devicedata.DeviceDataCollector;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class t71 implements DeviceDataCollector {
    public static final a e = new a(null);
    public static final int f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f33242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Activity f33243b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f33244c;
    private final boolean d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public t71(Context context, Activity activity, Map destination, boolean z) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(destination, "destination");
        this.f33242a = context;
        this.f33243b = activity;
        this.f33244c = destination;
        this.d = z;
    }

    private final boolean a() {
        return Settings.Secure.getInt(this.f33242a.getContentResolver(), "adb_enabled", 0) > 0;
    }

    private final boolean b() {
        return new DeviceMetadata(null, null, null, null, null, null, null, false, 255, null).getOsCompromised();
    }

    private final String c() {
        String string = Settings.Secure.getString(this.f33242a.getContentResolver(), "android_id");
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    private final String d() {
        String property = System.getProperty("os.version");
        return property == null ? "unknown" : property;
    }

    private final String e() {
        String installingPackageName;
        String packageName = this.f33242a.getPackageName();
        if (Build.VERSION.SDK_INT >= 30) {
            try {
                installingPackageName = this.f33242a.getPackageManager().getInstallSourceInfo(packageName).getInstallingPackageName();
            } catch (PackageManager.NameNotFoundException unused) {
                installingPackageName = "unknown";
            }
        } else {
            installingPackageName = this.f33242a.getPackageManager().getInstallerPackageName(packageName);
            if (installingPackageName == null) {
                installingPackageName = "unknown";
            }
        }
        if (installingPackageName == null) {
            return "unknown";
        }
        int iHashCode = installingPackageName.hashCode();
        return iHashCode != -1859733809 ? iHashCode != -1637701853 ? (iHashCode == -1046965711 && installingPackageName.equals("com.android.vending")) ? "google_play" : "unknown" : !installingPackageName.equals("com.huawei.appmarket") ? "unknown" : "huawei_app_gallery" : !installingPackageName.equals("com.amazon.venezia") ? "unknown" : "amazon_app_store";
    }

    private final int f() {
        return Process.myPid();
    }

    private final long g() {
        return SystemClock.elapsedRealtime() / ((long) 1000);
    }

    private final boolean h() {
        return Settings.Secure.getInt(this.f33242a.getContentResolver(), "development_settings_enabled", 0) > 0;
    }

    private final boolean i() {
        String MODEL = Build.MODEL;
        Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
        if (kotlin.text.d0.J(MODEL, "sdk", false)) {
            return true;
        }
        Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
        if (kotlin.text.d0.J(MODEL, "Emulator", false)) {
            return true;
        }
        Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
        return kotlin.text.d0.J(MODEL, "Android SDK built for x86", false);
    }

    @Override // com.fourthline.core.internal.devicedata.DeviceDataCollector
    public void startDataCollection() {
        if (this.d) {
            this.f33244c.put("isOsCompromised", Boolean.valueOf(b()));
            this.f33244c.put("isAdbEnabled", Boolean.valueOf(a()));
            this.f33244c.put("applicationOrigin", e());
            this.f33244c.put("isDeveloperModeEnabled", Boolean.valueOf(h()));
            this.f33244c.put("processIdentifier", Integer.valueOf(f()));
            this.f33244c.put("processEnvironmentalVariables", System.getenv());
            this.f33244c.put("isRunOnSimulator", Boolean.valueOf(i()));
            this.f33244c.put("systemRelease", d());
            Map map = this.f33244c;
            String property = System.getProperty("os.version");
            if (property == null) {
                property = "unknown";
            }
            map.put("systemVersion", property);
            this.f33244c.put("deviceVendorId", c());
            this.f33244c.put("systemUptime", Long.valueOf(g()));
            Activity activity = this.f33243b;
            if (activity != null) {
                this.f33244c.put("isRunInSplitMode", Boolean.valueOf(activity.isInMultiWindowMode()));
            }
        }
    }
}

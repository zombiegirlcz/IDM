package com.fourthline.orca.internal;

import android.graphics.Rect;
import android.os.Build;
import android.provider.Settings;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.fourthline.core.internal.devicedata.AndroidDataCollectorHelper;
import com.fourthline.core.internal.devicedata.DeviceDataCollector;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class tz0 implements DeviceDataCollector {
    public static final a d = new a(null);
    public static final int e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AndroidDataCollectorHelper f33898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f33899b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f33900c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public tz0(AndroidDataCollectorHelper helper, Map destination, boolean z) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(destination, "destination");
        this.f33898a = helper;
        this.f33899b = destination;
        this.f33900c = z;
    }

    private final float a(WindowManager windowManager) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.density;
    }

    private final int b(WindowManager windowManager) {
        return (int) windowManager.getDefaultDisplay().getMode().getRefreshRate();
    }

    private final Pair c(WindowManager windowManager) {
        Pair pair;
        if (Build.VERSION.SDK_INT >= 30) {
            Rect bounds = windowManager.getCurrentWindowMetrics().getBounds();
            pair = new Pair(Integer.valueOf(bounds.width()), Integer.valueOf(bounds.height()));
        } else {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
            pair = new Pair(Integer.valueOf(displayMetrics.widthPixels), Integer.valueOf(displayMetrics.heightPixels));
        }
        return new Pair(Integer.valueOf((int) (((Number) pair.f186385a).floatValue() / a(windowManager))), Integer.valueOf((int) (((Number) pair.f186386b).floatValue() / a(windowManager))));
    }

    @Override // com.fourthline.core.internal.devicedata.DeviceDataCollector
    public void startDataCollection() {
        AndroidDataCollectorHelper androidDataCollectorHelper;
        WindowManager windowManager;
        if (!this.f33900c || (windowManager = (androidDataCollectorHelper = this.f33898a).getWindowManager()) == null) {
            return;
        }
        Pair pairC = c(windowManager);
        this.f33899b.put("screenWidth", pairC.f186385a);
        this.f33899b.put("screenHeight", pairC.f186386b);
        this.f33899b.put("screenScaleFactor", Float.valueOf(a(windowManager)));
        try {
            this.f33899b.put("screenBrightness", Double.valueOf(((double) Settings.System.getInt(androidDataCollectorHelper.getContentResolver(), "screen_brightness")) / 100.0d));
        } catch (Exception unused) {
        }
        this.f33899b.put("screenMaxFps", Integer.valueOf(b(windowManager)));
    }
}

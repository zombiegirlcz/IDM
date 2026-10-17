package com.appsflyer.internal;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class AFa1aSDK implements AFb1ySDK {

    @NotNull
    private Map<String, String> AFKeystoreWrapper = new LinkedHashMap();

    @Override // com.appsflyer.internal.AFb1ySDK
    @NotNull
    public final Map<String, String> valueOf(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        if (this.AFKeystoreWrapper.isEmpty()) {
            Resources resources = context.getResources();
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            int i = resources.getConfiguration().screenLayout & 15;
            this.AFKeystoreWrapper.put("xdp", String.valueOf(displayMetrics.xdpi));
            this.AFKeystoreWrapper.put("ydp", String.valueOf(displayMetrics.ydpi));
            this.AFKeystoreWrapper.put("x_px", String.valueOf(displayMetrics.widthPixels));
            this.AFKeystoreWrapper.put("y_px", String.valueOf(displayMetrics.heightPixels));
            this.AFKeystoreWrapper.put("d_dpi", String.valueOf(displayMetrics.densityDpi));
            this.AFKeystoreWrapper.put("size", String.valueOf(i));
        }
        return this.AFKeystoreWrapper;
    }
}

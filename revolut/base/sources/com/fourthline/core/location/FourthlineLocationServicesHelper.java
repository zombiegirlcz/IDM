package com.fourthline.core.location;

import android.content.Context;
import android.location.LocationManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"locationServicesEnabled", "", "Landroid/content/Context;", "getLocationServicesEnabled", "(Landroid/content/Context;)Z", "fourthline-core_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class FourthlineLocationServicesHelper {
    public static final boolean getLocationServicesEnabled(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Object systemService = context.getSystemService("location");
        LocationManager locationManager = systemService instanceof LocationManager ? (LocationManager) systemService : null;
        if (locationManager != null) {
            try {
                return locationManager.isLocationEnabled();
            } catch (Exception unused) {
            }
        }
        return false;
    }
}

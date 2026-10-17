package com.google.android.material.internal;

import android.os.Build;
import androidx.annotation.NonNull;
import java.util.Locale;

/* JADX INFO: loaded from: classes16.dex */
public class ManufacturerUtils {
    private static final String MEIZU = "meizu";
    private static final String LGE = "lge";
    private static final String SAMSUNG = "samsung";

    private ManufacturerUtils() {
    }

    @NonNull
    private static String getManufacturer() {
        String str = Build.MANUFACTURER;
        return str != null ? str.toLowerCase(Locale.ENGLISH) : "";
    }

    public static boolean isDateInputKeyboardMissingSeparatorCharacters() {
        return isLGEDevice() || isSamsungDevice();
    }

    public static boolean isLGEDevice() {
        return getManufacturer().equals("lge");
    }

    public static boolean isMeizuDevice() {
        return getManufacturer().equals("meizu");
    }

    public static boolean isSamsungDevice() {
        return getManufacturer().equals("samsung");
    }
}

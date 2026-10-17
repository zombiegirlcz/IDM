package com.onfido.android.sdk.capture.internal.util;

import android.os.Build;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\b\u0010\u0005\u001a\u00020\u0004H\u0003J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0004H\u0002J\b\u0010\b\u001a\u00020\u0004H\u0002¨\u0006\t"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/util/EmulatorDetector;", "", "()V", "isEmulator", "", "isEmulatorByBuildProperties", "isEmulatorByHardware", "isGenericDevice", "isGoogleEmulator", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class EmulatorDetector {

    @NotNull
    public static final EmulatorDetector INSTANCE = new EmulatorDetector();

    private EmulatorDetector() {
    }

    private final boolean isEmulatorByBuildProperties() {
        String HARDWARE = Build.HARDWARE;
        Intrinsics.checkNotNullExpressionValue(HARDWARE, "HARDWARE");
        if (d0.J(HARDWARE, "goldfish", false)) {
            return true;
        }
        Intrinsics.checkNotNullExpressionValue(HARDWARE, "HARDWARE");
        if (d0.J(HARDWARE, "ranchu", false)) {
            return true;
        }
        Intrinsics.checkNotNullExpressionValue(HARDWARE, "HARDWARE");
        Locale locale = Locale.ROOT;
        String lowerCase = HARDWARE.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        if (d0.J(lowerCase, "vbox", false)) {
            return true;
        }
        Intrinsics.checkNotNullExpressionValue(HARDWARE, "HARDWARE");
        String lowerCase2 = HARDWARE.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
        if (d0.J(lowerCase2, "qemu", false)) {
            return true;
        }
        String ID = Build.ID;
        Intrinsics.checkNotNullExpressionValue(ID, "ID");
        return a0.H(ID, "FRF91", false);
    }

    private final boolean isEmulatorByHardware() {
        String FINGERPRINT = Build.FINGERPRINT;
        Intrinsics.checkNotNullExpressionValue(FINGERPRINT, "FINGERPRINT");
        if (a0.H(FINGERPRINT, "generic", false)) {
            return true;
        }
        Intrinsics.checkNotNullExpressionValue(FINGERPRINT, "FINGERPRINT");
        Locale locale = Locale.ROOT;
        String lowerCase = FINGERPRINT.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        if (d0.J(lowerCase, "vbox", false)) {
            return true;
        }
        Intrinsics.checkNotNullExpressionValue(FINGERPRINT, "FINGERPRINT");
        String lowerCase2 = FINGERPRINT.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
        if (d0.J(lowerCase2, "test-keys", false)) {
            return true;
        }
        String MODEL = Build.MODEL;
        Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
        if (d0.J(MODEL, "google_sdk", false)) {
            return true;
        }
        Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
        String lowerCase3 = MODEL.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase3, "toLowerCase(...)");
        if (d0.J(lowerCase3, "emulator", false)) {
            return true;
        }
        Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
        if (d0.J(MODEL, "Android SDK built for x86", false)) {
            return true;
        }
        Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
        if (d0.J(MODEL, "sdk_gphone", false)) {
            return true;
        }
        String MANUFACTURER = Build.MANUFACTURER;
        Intrinsics.checkNotNullExpressionValue(MANUFACTURER, "MANUFACTURER");
        if (d0.J(MANUFACTURER, "Genymotion", false) || isGoogleEmulator() || isGenericDevice()) {
            return true;
        }
        String PRODUCT = Build.PRODUCT;
        if ("google_sdk".equals(PRODUCT)) {
            return true;
        }
        Intrinsics.checkNotNullExpressionValue(PRODUCT, "PRODUCT");
        if (d0.J(PRODUCT, "sdk_gphone", false)) {
            return true;
        }
        Intrinsics.checkNotNullExpressionValue(PRODUCT, "PRODUCT");
        if (d0.J(PRODUCT, "vbox86p", false)) {
            return true;
        }
        Intrinsics.checkNotNullExpressionValue(PRODUCT, "PRODUCT");
        if (d0.J(PRODUCT, "emulator", false)) {
            return true;
        }
        Intrinsics.checkNotNullExpressionValue(PRODUCT, "PRODUCT");
        return d0.J(PRODUCT, "simulator", false);
    }

    private final boolean isGenericDevice() {
        String BRAND = Build.BRAND;
        Intrinsics.checkNotNullExpressionValue(BRAND, "BRAND");
        if (a0.H(BRAND, "generic", false)) {
            String DEVICE = Build.DEVICE;
            Intrinsics.checkNotNullExpressionValue(DEVICE, "DEVICE");
            if (a0.H(DEVICE, "generic", false)) {
                return true;
            }
        }
        return false;
    }

    private final boolean isGoogleEmulator() {
        if (a0.z(Build.MANUFACTURER, "Google", true) && a0.z(Build.BRAND, "google", true)) {
            String PRODUCT = Build.PRODUCT;
            Intrinsics.checkNotNullExpressionValue(PRODUCT, "PRODUCT");
            if (d0.J(PRODUCT, "sdk", false)) {
                return true;
            }
        }
        return false;
    }

    public final boolean isEmulator() {
        return isEmulatorByHardware() || isEmulatorByBuildProperties();
    }
}

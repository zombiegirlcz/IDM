package com.fourthline.core.internal;

import com.fourthline.core.DeviceMetadataKt;
import com.fourthline.core.internal.security.NativeSecurityChecker;

/* JADX INFO: loaded from: classes23.dex */
public final class f extends ib.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f26349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f26350b;

    public f() {
        boolean zIsDeviceRooted;
        int iNativeThreatBitsOrUnavailable;
        super(ib.b.DeviceSecurity);
        this.f26349a = ib.b.DeviceSecurity;
        this.f26350b = "iglu:com.fourthline.sdk/device_security/jsonschema/1-0-0";
        try {
            zIsDeviceRooted = DeviceMetadataKt.isDeviceRooted();
        } catch (Throwable unused) {
            zIsDeviceRooted = false;
        }
        set("os_compromised", Boolean.valueOf(zIsDeviceRooted));
        NativeSecurityChecker nativeSecurityChecker = NativeSecurityChecker.INSTANCE;
        boolean zIsNativeLibraryLoaded = nativeSecurityChecker.isNativeLibraryLoaded();
        set("native_library_loaded", Boolean.valueOf(zIsNativeLibraryLoaded));
        try {
            iNativeThreatBitsOrUnavailable = nativeSecurityChecker.nativeThreatBitsOrUnavailable();
        } catch (Throwable unused2) {
            iNativeThreatBitsOrUnavailable = -1;
        }
        set("threat_bits", Integer.valueOf(iNativeThreatBitsOrUnavailable));
        if (!zIsNativeLibraryLoaded || iNativeThreatBitsOrUnavailable == -1) {
            set("signal_unavailable", Boolean.TRUE);
            return;
        }
        set("signal_root", Boolean.valueOf((iNativeThreatBitsOrUnavailable & 4) != 0));
        set("signal_frida", Boolean.valueOf((iNativeThreatBitsOrUnavailable & 512) != 0));
        set("signal_xposed", Boolean.valueOf((iNativeThreatBitsOrUnavailable & 16384) != 0));
        set("signal_instrumentation", Boolean.valueOf((iNativeThreatBitsOrUnavailable & 134217728) != 0));
    }

    @Override // ib.b
    public String getIdentifier() {
        return this.f26349a;
    }

    @Override // ib.b
    public String getSchema() {
        return this.f26350b;
    }
}

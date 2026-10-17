package com.appsflyer.internal;

import androidx.annotation.NonNull;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class AFe1hSDK {
    public boolean AFInAppEventParameterName;

    @NonNull
    final String AFInAppEventType;

    @NonNull
    public final String AFKeystoreWrapper;
    private final byte[] AFLogger;
    private boolean d;
    private final boolean e;
    public int registerClient;
    private final boolean unregisterClient;

    @NonNull
    final Map<String, String> valueOf;
    public boolean values;

    public AFe1hSDK(@NonNull String str, byte[] bArr, @NonNull String str2, @NonNull Map<String, String> map, boolean z) {
        this(str, bArr, str2, map, z, (byte) 0);
    }

    public final boolean AFInAppEventParameterName() {
        return this.d;
    }

    public final boolean AFInAppEventType() {
        return this.AFInAppEventParameterName;
    }

    public final boolean AFKeystoreWrapper() {
        return this.unregisterClient;
    }

    public final boolean e() {
        return this.values;
    }

    public final boolean valueOf() {
        return this.e;
    }

    public final byte[] values() {
        return this.AFLogger;
    }

    private AFe1hSDK(@NonNull String str, byte[] bArr, @NonNull String str2, @NonNull Map<String, String> map, boolean z, byte b4) {
        this.d = true;
        this.AFInAppEventParameterName = false;
        this.values = true;
        this.registerClient = -1;
        this.AFKeystoreWrapper = str;
        this.AFLogger = bArr;
        this.AFInAppEventType = str2;
        this.valueOf = map;
        this.e = z;
        this.unregisterClient = true;
    }

    public AFe1hSDK(@NonNull String str, @NonNull String str2) {
        this(str, null, str2, new HashMap(), false);
    }
}

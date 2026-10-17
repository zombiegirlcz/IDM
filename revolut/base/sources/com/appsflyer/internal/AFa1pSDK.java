package com.appsflyer.internal;

import android.net.Uri;
import androidx.annotation.NonNull;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class AFa1pSDK {
    public AppsFlyerRequestListener AFInAppEventParameterName;
    public String AFInAppEventType;
    protected final Map<String, Object> AFKeystoreWrapper;
    public String AFLogger;
    private final boolean afInfoLog;
    public String d;
    public String e;
    private byte[] i;
    public int registerClient;
    public String unregisterClient;
    public Map<String, Object> valueOf;
    public String values;

    public AFa1pSDK() {
        this(null, null, null);
    }

    public final boolean AFInAppEventParameterName() {
        return this.e == null && this.AFInAppEventType == null;
    }

    public AFa1pSDK AFInAppEventType(String str) {
        this.unregisterClient = str;
        return this;
    }

    public final AFa1pSDK AFKeystoreWrapper(int i) {
        this.registerClient = i;
        synchronized (this.AFKeystoreWrapper) {
            try {
                if (this.AFKeystoreWrapper.containsKey("counter")) {
                    this.AFKeystoreWrapper.put("counter", Integer.toString(i));
                }
                if (this.AFKeystoreWrapper.containsKey("launch_counter")) {
                    this.AFKeystoreWrapper.put("launch_counter", Integer.toString(i));
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return this;
    }

    public boolean AFLogger() {
        return false;
    }

    public boolean e() {
        return true;
    }

    public boolean registerClient() {
        return true;
    }

    public boolean unregisterClient() {
        return true;
    }

    public final boolean valueOf() {
        return this.afInfoLog;
    }

    public final AFa1pSDK values(String str, Object obj2) {
        synchronized (this.AFKeystoreWrapper) {
            this.AFKeystoreWrapper.put(str, obj2);
        }
        return this;
    }

    public abstract AFf1ySDK values();

    public AFa1pSDK(String str, String str2, Boolean bool) {
        this.AFKeystoreWrapper = new HashMap();
        this.e = str;
        this.unregisterClient = str2;
        this.afInfoLog = bool != null ? bool.booleanValue() : true;
    }

    @NonNull
    public static String valueOf(String str) {
        String strAFLogger = AFb1rSDK.AFInAppEventParameterName().AFInAppEventType().valueOf().AFLogger();
        return strAFLogger != null ? Uri.parse(str).buildUpon().appendQueryParameter("channel", strAFLogger).build().toString() : str;
    }

    public final AFa1pSDK AFInAppEventType(Map<String, ?> map) {
        synchronized (map) {
            this.AFKeystoreWrapper.putAll(map);
        }
        return this;
    }

    public final Map<String, Object> AFInAppEventType() {
        return this.AFKeystoreWrapper;
    }

    public final AFa1pSDK AFKeystoreWrapper(byte[] bArr) {
        this.i = bArr;
        return this;
    }

    public final byte[] AFKeystoreWrapper() {
        return this.i;
    }

    public static boolean AFKeystoreWrapper(double d) {
        if (d < 0.0d || d >= 1.0d) {
            return false;
        }
        if (d == 0.0d) {
            return true;
        }
        int i = (int) (1.0d / d);
        if (i + 1 > 0) {
            return ((int) ((Math.random() * ((double) i)) + 1.0d)) != i;
        }
        throw new IllegalArgumentException("Unsupported max value");
    }
}

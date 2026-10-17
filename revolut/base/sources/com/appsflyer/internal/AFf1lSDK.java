package com.appsflyer.internal;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import com.appsflyer.internal.components.network.http.exceptions.ParsingException;
import com.onfido.android.sdk.capture.ui.camera.CapturePresenter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes16.dex */
public final class AFf1lSDK extends AFf1qSDK<Map<String, String>> {
    public AFa1ySDK AFLogger;
    private final boolean afInfoLog;
    private final UUID afVerboseLog;
    private String force;
    private final AFe1rSDK i;
    private String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private String f26028w;

    public interface AFa1ySDK {
        void AFInAppEventType(String str);

        void AFKeystoreWrapper(Map<String, String> map);
    }

    public AFf1lSDK(@NonNull AFd1fSDK aFd1fSDK, @NonNull UUID uuid, @NonNull Uri uri2) throws Throwable {
        super(AFf1ySDK.ONELINK, new AFf1ySDK[]{AFf1ySDK.RC_CDN}, aFd1fSDK, uuid.toString());
        this.i = aFd1fSDK.values();
        this.afVerboseLog = uuid;
        boolean zBooleanValue = false;
        try {
            if (!AFc1vSDK.valueOf(uri2.getHost()) && !AFc1vSDK.valueOf(uri2.getPath())) {
                try {
                    Object[] objArr = {uri2, aFd1fSDK.afDebugLog()};
                    Map<Integer, Object> map = AFc1iSDK.afDebugLog;
                    Object declaredConstructor = map.get(-666463964);
                    if (declaredConstructor == null) {
                        declaredConstructor = ((Class) AFc1iSDK.AFInAppEventParameterName(Drawable.resolveOpacity(0, 0), (char) (47215 - TextUtils.lastIndexOf("", '0', 0, 0)), 35 - TextUtils.indexOf((CharSequence) "", '0', 0))).getDeclaredConstructor(Uri.class, AFc1tSDK.class);
                        map.put(-666463964, declaredConstructor);
                    }
                    Object objNewInstance = ((Constructor) declaredConstructor).newInstance(objArr);
                    try {
                        Object method = map.get(1694236656);
                        if (method == null) {
                            method = ((Class) AFc1iSDK.AFInAppEventParameterName(ViewConfiguration.getMaximumDrawingCacheSize() >> 24, (char) ((KeyEvent.getMaxKeyCode() >> 16) + 47216), 36 - Color.green(0))).getMethod("valueOf", null);
                            map.put(1694236656, method);
                        }
                        Object objInvoke = ((Method) method).invoke(objNewInstance, null);
                        try {
                            Object method2 = map.get(1188407966);
                            if (method2 == null) {
                                method2 = ((Class) AFc1iSDK.AFInAppEventParameterName((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 36, (char) (ViewConfiguration.getScrollDefaultDelay() >> 16), 51 - View.resolveSize(0, 0))).getMethod("AFKeystoreWrapper", null);
                                map.put(1188407966, method2);
                            }
                            boolean zBooleanValue2 = ((Boolean) ((Method) method2).invoke(objInvoke, null)).booleanValue();
                            try {
                                Object method3 = map.get(1807258970);
                                if (method3 == null) {
                                    method3 = ((Class) AFc1iSDK.AFInAppEventParameterName(36 - TextUtils.indexOf("", "", 0), (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), 51 - (ViewConfiguration.getTouchSlop() >> 8))).getMethod("valueOf", null);
                                    map.put(1807258970, method3);
                                }
                                zBooleanValue = ((Boolean) ((Method) method3).invoke(objInvoke, null)).booleanValue();
                                String[] strArrSplit = uri2.getPath().split("/");
                                if (zBooleanValue2 && strArrSplit.length == 3) {
                                    this.v = strArrSplit[1];
                                    this.f26028w = strArrSplit[2];
                                    this.force = uri2.toString();
                                }
                            } catch (Throwable th10) {
                                Throwable cause = th10.getCause();
                                if (cause == null) {
                                    throw th10;
                                }
                                throw cause;
                            }
                        } catch (Throwable th11) {
                            Throwable cause2 = th11.getCause();
                            if (cause2 == null) {
                                throw th11;
                            }
                            throw cause2;
                        }
                    } catch (Throwable th12) {
                        Throwable cause3 = th12.getCause();
                        if (cause3 == null) {
                            throw th12;
                        }
                        throw cause3;
                    }
                } catch (Throwable th13) {
                    Throwable cause4 = th13.getCause();
                    if (cause4 == null) {
                        throw th13;
                    }
                    throw cause4;
                }
            }
        } catch (Exception e) {
            AFLogger.afErrorLogForExcManagerOnly("OneLinkValidator: reflection init failed", e);
        }
        this.afInfoLog = zBooleanValue;
    }

    @Override // com.appsflyer.internal.AFf1qSDK, com.appsflyer.internal.AFf1xSDK
    public final void AFInAppEventType() {
        ResponseNetwork responseNetwork;
        super.AFInAppEventType();
        AFa1ySDK aFa1ySDK = this.AFLogger;
        if (aFa1ySDK != null) {
            if (this.values == AFe1fSDK.SUCCESS && (responseNetwork = ((AFf1qSDK) this).d) != null) {
                aFa1ySDK.AFKeystoreWrapper((Map) responseNetwork.getBody());
                return;
            }
            Throwable thD = d();
            if (!(thD instanceof ParsingException)) {
                String str = this.force;
                aFa1ySDK.AFInAppEventType(str != null ? str : "Can't get OneLink data");
            } else if (((ParsingException) thD).getRawResponse().isSuccessful()) {
                aFa1ySDK.AFInAppEventType("Can't parse one link data");
            } else {
                String str2 = this.force;
                aFa1ySDK.AFInAppEventType(str2 != null ? str2 : "Can't get OneLink data");
            }
        }
    }

    @Override // com.appsflyer.internal.AFf1qSDK
    public final AFe1uSDK<Map<String, String>> AFKeystoreWrapper(@NonNull String str) {
        return this.i.AFInAppEventParameterName(this.v, this.f26028w, this.afVerboseLog, str);
    }

    @Override // com.appsflyer.internal.AFf1qSDK
    public final boolean a_() {
        return false;
    }

    public final boolean afInfoLog() {
        return this.afInfoLog;
    }

    @Override // com.appsflyer.internal.AFf1qSDK
    public final AppsFlyerRequestListener e() {
        return null;
    }

    @Override // com.appsflyer.internal.AFf1qSDK
    public final boolean force() {
        return false;
    }

    public final boolean v() {
        return (TextUtils.isEmpty(this.v) || TextUtils.isEmpty(this.f26028w) || this.v.equals("app")) ? false : true;
    }

    @Override // com.appsflyer.internal.AFf1qSDK, com.appsflyer.internal.AFf1xSDK
    public final long valueOf() {
        return CapturePresenter.PASSPORT_OVERLAY_DELAY_MS;
    }

    @Override // com.appsflyer.internal.AFf1qSDK, com.appsflyer.internal.AFf1xSDK
    public final boolean values() {
        return false;
    }
}

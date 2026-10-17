package com.appsflyer.internal;

import android.os.Process;
import android.os.SystemClock;
import android.view.Gravity;
import android.view.ViewConfiguration;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/appsflyer/internal/AFb1sSDK;", "", "", "afInfoLog", "()V", "Lcom/appsflyer/internal/AFa1pSDK;", "AFKeystoreWrapper", "Lcom/appsflyer/internal/AFa1pSDK;", "valueOf", "values", "<init>", "(Lcom/appsflyer/internal/AFa1pSDK;)V"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class AFb1sSDK {

    /* JADX INFO: renamed from: AFKeystoreWrapper, reason: from kotlin metadata */
    @NotNull
    private final AFa1pSDK valueOf;

    public AFb1sSDK(@NotNull AFa1pSDK aFa1pSDK) {
        Intrinsics.checkNotNullParameter(aFa1pSDK, "");
        this.valueOf = aFa1pSDK;
    }

    public final void afInfoLog() throws Throwable {
        try {
            Map<Integer, Object> map = AFc1iSDK.afDebugLog;
            Object declaredConstructor = map.get(2118739094);
            if (declaredConstructor == null) {
                declaredConstructor = ((Class) AFc1iSDK.AFInAppEventParameterName(88 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) (Gravity.getAbsoluteGravity(0, 0) + 42277), 36 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)))).getDeclaredConstructor(null);
                map.put(2118739094, declaredConstructor);
            }
            Object objNewInstance = ((Constructor) declaredConstructor).newInstance(null);
            try {
                Object[] objArr = {this.valueOf};
                Object method = map.get(569888260);
                if (method == null) {
                    method = ((Class) AFc1iSDK.AFInAppEventParameterName(88 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) (((Process.getThreadPriority(0) + 20) >> 6) + 42277), (ViewConfiguration.getWindowTouchSlop() >> 8) + 35)).getMethod("AFInAppEventParameterName", AFa1pSDK.class);
                    map.put(569888260, method);
                }
                ((Method) method).invoke(objNewInstance, objArr);
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
    }
}

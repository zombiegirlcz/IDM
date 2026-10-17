package com.appsflyer.internal;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.HandlerThread;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class AFj1vSDK implements AFj1zSDK {
    private static final BitSet AFInAppEventParameterName;
    private final ExecutorService AFInAppEventType;
    private final SensorManager AFKeystoreWrapper;
    private boolean AFLogger;
    private final Runnable afInfoLog;
    private final Map<AFj1wSDK, Map<String, Object>> d;
    private boolean e;
    private final Map<AFj1wSDK, AFj1wSDK> registerClient;
    private final Runnable unregisterClient;
    private final Runnable v;
    private final Handler valueOf;
    private final Object values;

    static {
        BitSet bitSet = new BitSet(6);
        AFInAppEventParameterName = bitSet;
        bitSet.set(1);
        bitSet.set(2);
        bitSet.set(4);
    }

    private AFj1vSDK(@NonNull SensorManager sensorManager, Handler handler, ExecutorService executorService) {
        this.values = new Object();
        BitSet bitSet = AFInAppEventParameterName;
        this.registerClient = new HashMap(bitSet.size());
        this.d = new ConcurrentHashMap(bitSet.size());
        this.unregisterClient = new Runnable() { // from class: com.appsflyer.internal.AFj1vSDK.4
            @Override // java.lang.Runnable
            public final void run() {
                synchronized (AFj1vSDK.this.values) {
                    AFj1vSDK.this.valueOf();
                    AFj1vSDK.this.valueOf.postDelayed(AFj1vSDK.this.afInfoLog, 150L);
                    AFj1vSDK.this.e = true;
                }
            }
        };
        this.afInfoLog = new o(this, 1);
        this.v = new Runnable() { // from class: com.appsflyer.internal.AFj1vSDK.2
            @Override // java.lang.Runnable
            public final void run() {
                synchronized (AFj1vSDK.this.values) {
                    try {
                        if (AFj1vSDK.this.e) {
                            AFj1vSDK.this.valueOf.removeCallbacks(AFj1vSDK.this.unregisterClient);
                            AFj1vSDK.this.valueOf.removeCallbacks(AFj1vSDK.this.afInfoLog);
                            AFj1vSDK.this.AFInAppEventType();
                            AFj1vSDK.this.e = false;
                        }
                    } catch (Throwable th10) {
                        throw th10;
                    }
                }
            }
        };
        this.AFKeystoreWrapper = sensorManager;
        this.valueOf = handler;
        this.AFInAppEventType = executorService;
    }

    @NonNull
    private List<Map<String, Object>> AFLogger() {
        synchronized (this.values) {
            try {
                if (!this.registerClient.isEmpty() && this.AFLogger) {
                    Iterator<AFj1wSDK> it8 = this.registerClient.values().iterator();
                    while (it8.hasNext()) {
                        it8.next().AFInAppEventParameterName(this.d, false);
                    }
                }
                if (this.d.isEmpty()) {
                    return new CopyOnWriteArrayList(Collections.EMPTY_LIST);
                }
                return new CopyOnWriteArrayList(this.d.values());
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d() {
        try {
            for (Sensor sensor : this.AFKeystoreWrapper.getSensorList(-1)) {
                if (valueOf(sensor.getType())) {
                    AFj1wSDK aFj1wSDK = new AFj1wSDK(sensor, this.AFInAppEventType);
                    if (!this.registerClient.containsKey(aFj1wSDK)) {
                        this.registerClient.put(aFj1wSDK, aFj1wSDK);
                    }
                    this.AFKeystoreWrapper.registerListener(this.registerClient.get(aFj1wSDK), sensor, 1, this.valueOf);
                }
            }
        } catch (Throwable th10) {
            AFLogger.afErrorLogForExcManagerOnly("registerListeners error", th10);
        }
        this.AFLogger = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e() {
        try {
            if (!this.registerClient.isEmpty()) {
                for (AFj1wSDK aFj1wSDK : this.registerClient.values()) {
                    this.AFKeystoreWrapper.unregisterListener(aFj1wSDK);
                    aFj1wSDK.AFInAppEventParameterName(this.d, true);
                }
            }
        } catch (Throwable th10) {
            AFLogger.afErrorLogForExcManagerOnly("error while unregistering listeners", th10);
        }
        this.AFLogger = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void registerClient() {
        synchronized (this.values) {
            this.valueOf.post(new o(this, 0));
        }
    }

    @NonNull
    private List<Map<String, Object>> unregisterClient() {
        synchronized (this.values) {
            try {
                Iterator<AFj1wSDK> it8 = this.registerClient.values().iterator();
                while (it8.hasNext()) {
                    it8.next().AFInAppEventParameterName(this.d, true);
                }
                if (this.d.isEmpty()) {
                    return new CopyOnWriteArrayList(Collections.EMPTY_LIST);
                }
                return new CopyOnWriteArrayList(this.d.values());
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    private static boolean valueOf(int i) {
        return i >= 0 && AFInAppEventParameterName.get(i);
    }

    public final void AFInAppEventType() {
        this.valueOf.post(new o(this, 0));
    }

    @Override // com.appsflyer.internal.AFj1zSDK
    public final synchronized void AFKeystoreWrapper() {
        this.valueOf.post(this.v);
    }

    @Override // com.appsflyer.internal.AFj1zSDK
    @NonNull
    public final Map<String, Object> values() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        List<Map<String, Object>> listAFLogger = AFLogger();
        if (!listAFLogger.isEmpty()) {
            concurrentHashMap.put("sensors", listAFLogger);
            return concurrentHashMap;
        }
        List<Map<String, Object>> listUnregisterClient = unregisterClient();
        if (!listUnregisterClient.isEmpty()) {
            concurrentHashMap.put("sensors", listUnregisterClient);
        }
        return concurrentHashMap;
    }

    @Override // com.appsflyer.internal.AFj1zSDK
    public final void AFInAppEventParameterName() {
        this.valueOf.post(this.v);
        this.valueOf.post(this.unregisterClient);
    }

    public final void valueOf() {
        this.valueOf.post(new o(this, 2));
    }

    public AFj1vSDK(@NonNull Context context, ExecutorService executorService) {
        SensorManager sensorManager = (SensorManager) context.getApplicationContext().getSystemService("sensor");
        HandlerThread handlerThread = new HandlerThread("internal");
        handlerThread.start();
        this(sensorManager, new Handler(handlerThread.getLooper()), executorService);
    }
}

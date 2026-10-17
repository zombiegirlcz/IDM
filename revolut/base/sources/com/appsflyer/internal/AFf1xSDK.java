package com.appsflyer.internal;

import android.net.TrafficStats;
import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public abstract class AFf1xSDK<Result> implements Comparable<AFf1xSDK<?>>, Callable<AFe1fSDK> {
    private static final AtomicInteger e = new AtomicInteger();

    @NonNull
    public final Set<AFf1ySDK> AFInAppEventParameterName;
    public volatile int AFInAppEventType;

    @NonNull
    public final AFf1ySDK AFKeystoreWrapper;
    private Throwable AFLogger;
    private final String d;
    private boolean i;
    private final int registerClient;
    private long unregisterClient;

    @NonNull
    public final Set<AFf1ySDK> valueOf;
    public AFe1fSDK values;

    public AFf1xSDK(@NonNull AFf1ySDK aFf1ySDK, @NonNull AFf1ySDK[] aFf1ySDKArr, String str) {
        HashSet hashSet = new HashSet();
        this.AFInAppEventParameterName = hashSet;
        this.valueOf = new HashSet();
        int iIncrementAndGet = e.incrementAndGet();
        this.registerClient = iIncrementAndGet;
        this.i = false;
        this.AFInAppEventType = 0;
        this.AFKeystoreWrapper = aFf1ySDK;
        Collections.addAll(hashSet, aFf1ySDKArr);
        if (str != null) {
            this.d = str;
        } else {
            this.d = String.valueOf(iIncrementAndGet);
        }
    }

    @NonNull
    public abstract AFe1fSDK AFInAppEventParameterName() throws Exception;

    public void AFInAppEventType() {
    }

    public void AFKeystoreWrapper(Throwable th10) {
    }

    public final Throwable d() {
        return this.AFLogger;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 == null || getClass() != obj2.getClass()) {
            return false;
        }
        AFf1xSDK aFf1xSDK = (AFf1xSDK) obj2;
        if (this.AFKeystoreWrapper != aFf1xSDK.AFKeystoreWrapper) {
            return false;
        }
        return this.d.equals(aFf1xSDK.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + (this.AFKeystoreWrapper.hashCode() * 31);
    }

    @Override // java.util.concurrent.Callable
    /* JADX INFO: renamed from: registerClient, reason: merged with bridge method [inline-methods] */
    public final AFe1fSDK call() throws Exception {
        TrafficStats.setThreadStatsTag(82339054);
        this.values = null;
        this.AFLogger = null;
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.AFInAppEventType++;
        try {
            AFe1fSDK aFe1fSDKAFInAppEventParameterName = AFInAppEventParameterName();
            this.values = aFe1fSDKAFInAppEventParameterName;
            return aFe1fSDKAFInAppEventParameterName;
        } finally {
        }
    }

    public String toString() {
        StringBuilder sb6 = new StringBuilder();
        sb6.append(this.AFKeystoreWrapper);
        sb6.append("-");
        sb6.append(this.d);
        String string = sb6.toString();
        if (String.valueOf(this.registerClient).equals(this.d)) {
            return string;
        }
        StringBuilder sbL = v0.a.l(string, "-");
        sbL.append(this.registerClient);
        return sbL.toString();
    }

    public final boolean unregisterClient() {
        return this.i;
    }

    public abstract long valueOf();

    public abstract boolean values();

    public void AFKeystoreWrapper() {
        this.i = true;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: AFKeystoreWrapper, reason: merged with bridge method [inline-methods] */
    public final int compareTo(AFf1xSDK<?> aFf1xSDK) {
        int i = this.AFKeystoreWrapper.AFPurchaseDetails - aFf1xSDK.AFKeystoreWrapper.AFPurchaseDetails;
        if (i != 0) {
            return i;
        }
        if (this.d.equals(aFf1xSDK.d)) {
            return 0;
        }
        return this.registerClient - aFf1xSDK.registerClient;
    }
}

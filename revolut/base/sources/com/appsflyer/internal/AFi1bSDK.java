package com.appsflyer.internal;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;

/* JADX INFO: loaded from: classes.dex */
public abstract class AFi1bSDK extends Observable {
    public final String AFInAppEventParameterName;
    final Runnable AFKeystoreWrapper;
    long AFLogger;
    public final String e;
    public final Map<String, Object> valueOf = new HashMap();
    public AFa1uSDK AFInAppEventType = AFa1uSDK.NOT_STARTED;

    /* JADX INFO: renamed from: com.appsflyer.internal.AFi1bSDK$4, reason: invalid class name */
    public class AnonymousClass4 implements Observer {
        public AnonymousClass4() {
        }

        @Override // java.util.Observer
        public final void update(Observable observable, Object obj2) {
            AFi1bSDK.this.AFKeystoreWrapper.run();
        }
    }

    public enum AFa1uSDK {
        NOT_STARTED,
        STARTED,
        FINISHED
    }

    public AFi1bSDK(String str, String str2, Runnable runnable) {
        this.AFKeystoreWrapper = runnable;
        this.AFInAppEventParameterName = str2;
        this.e = str;
    }

    public final void AFInAppEventType() {
        this.valueOf.put("source", this.AFInAppEventParameterName);
        this.valueOf.put("type", this.e);
        this.valueOf.put("latency", Long.valueOf(System.currentTimeMillis() - this.AFLogger));
        this.AFInAppEventType = AFa1uSDK.FINISHED;
        setChanged();
        notifyObservers();
    }

    public abstract void values(Context context);
}

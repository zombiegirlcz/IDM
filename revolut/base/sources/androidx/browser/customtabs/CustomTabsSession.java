package androidx.browser.customtabs;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.os.IBinder;
import c.b;
import c.e;

/* JADX INFO: loaded from: classes13.dex */
public final class CustomTabsSession {
    private final b mCallback;
    private final ComponentName mComponentName;
    private final PendingIntent mId;
    private final Object mLock = new Object();
    private final e mService;

    public CustomTabsSession(e eVar, b bVar, ComponentName componentName, PendingIntent pendingIntent) {
        this.mService = eVar;
        this.mCallback = bVar;
        this.mComponentName = componentName;
        this.mId = pendingIntent;
    }

    public IBinder getBinder() {
        return this.mCallback.asBinder();
    }

    public ComponentName getComponentName() {
        return this.mComponentName;
    }

    public PendingIntent getId() {
        return this.mId;
    }
}

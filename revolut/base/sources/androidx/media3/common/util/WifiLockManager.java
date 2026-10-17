package androidx.media3.common.util;

import android.content.Context;
import android.net.wifi.WifiManager;
import android.os.Looper;
import j4.g;
import j4.h;
import java.util.Objects;

/* JADX INFO: loaded from: classes15.dex */
public final class WifiLockManager {
    private boolean enabled;
    private final HandlerWrapper mainHandler;
    private boolean stayAwake;
    private final HandlerWrapper wifiLockHandler;
    private final WifiLockManagerInternal wifiLockManagerInternal;

    public static final class WifiLockManagerInternal {
        private final Context applicationContext;
        private WifiManager.WifiLock wifiLock;

        public WifiLockManagerInternal(Context context) {
            this.applicationContext = context;
        }

        public static /* synthetic */ void access$100(WifiLockManagerInternal wifiLockManagerInternal) {
            wifiLockManagerInternal.forceReleaseWifiLock();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public synchronized void forceReleaseWifiLock() {
            WifiManager.WifiLock wifiLock = this.wifiLock;
            if (wifiLock != null) {
                wifiLock.release();
            }
        }

        public void updateWifiLock(boolean z, boolean z3) {
            if (z && this.wifiLock == null) {
                if (this.applicationContext.checkSelfPermission("android.permission.WAKE_LOCK") != 0) {
                    Log.w("WifiLockManager", "WAKE_LOCK permission not granted, can't acquire wake lock for playback");
                    return;
                }
                WifiManager wifiManager = (WifiManager) this.applicationContext.getApplicationContext().getSystemService("wifi");
                if (wifiManager == null) {
                    Log.w("WifiLockManager", "WifiManager is null, therefore not creating the WifiLock.");
                    return;
                } else {
                    WifiManager.WifiLock wifiLockCreateWifiLock = wifiManager.createWifiLock(3, "ExoPlayer:WifiLockManager");
                    this.wifiLock = wifiLockCreateWifiLock;
                    wifiLockCreateWifiLock.setReferenceCounted(false);
                }
            }
            if (this.wifiLock == null) {
                return;
            }
            if (WifiLockManager.shouldAcquireWifilock(z, z3)) {
                this.wifiLock.acquire();
            } else {
                this.wifiLock.release();
            }
        }
    }

    public WifiLockManager(Context context, Looper looper, Clock clock) {
        this.wifiLockManagerInternal = new WifiLockManagerInternal(context.getApplicationContext());
        this.wifiLockHandler = clock.createHandler(looper, null);
        this.mainHandler = clock.createHandler(Looper.getMainLooper(), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$postUpdateWifiLock$0(boolean z, boolean z3) {
        this.wifiLockManagerInternal.updateWifiLock(z, z3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$postUpdateWifiLock$2(Runnable runnable, boolean z, boolean z3) {
        this.mainHandler.removeCallbacks(runnable);
        this.wifiLockManagerInternal.updateWifiLock(z, z3);
    }

    private void postUpdateWifiLock(boolean z, boolean z3) {
        if (shouldAcquireWifilock(z, z3)) {
            this.wifiLockHandler.post(new g(this, z, z3, 1));
            return;
        }
        WifiLockManagerInternal wifiLockManagerInternal = this.wifiLockManagerInternal;
        Objects.requireNonNull(wifiLockManagerInternal);
        a aVar = new a(wifiLockManagerInternal, 2);
        this.mainHandler.postDelayed(aVar, 1000L);
        this.wifiLockHandler.post(new h(this, aVar, z, z3, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean shouldAcquireWifilock(boolean z, boolean z3) {
        return z && z3;
    }

    public void setEnabled(boolean z) {
        if (this.enabled == z) {
            return;
        }
        this.enabled = z;
        postUpdateWifiLock(z, this.stayAwake);
    }

    public void setStayAwake(boolean z) {
        if (this.stayAwake == z) {
            return;
        }
        this.stayAwake = z;
        if (this.enabled) {
            postUpdateWifiLock(true, z);
        }
    }
}

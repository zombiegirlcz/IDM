package androidx.media3.common.util;

import android.content.Context;
import android.os.Looper;
import android.os.PowerManager;
import j4.g;
import j4.h;
import java.util.Objects;

/* JADX INFO: loaded from: classes15.dex */
public final class WakeLockManager {
    private boolean enabled;
    private final HandlerWrapper mainHandler;
    private boolean stayAwake;
    private final HandlerWrapper wakeLockHandler;
    private final WakeLockManagerInternal wakeLockManagerInternal;

    public static final class WakeLockManagerInternal {
        private final Context applicationContext;
        private PowerManager.WakeLock wakeLock;

        public WakeLockManagerInternal(Context context) {
            this.applicationContext = context;
        }

        public static /* synthetic */ void access$200(WakeLockManagerInternal wakeLockManagerInternal) {
            wakeLockManagerInternal.forceReleaseWakeLock();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public synchronized void forceReleaseWakeLock() {
            PowerManager.WakeLock wakeLock = this.wakeLock;
            if (wakeLock != null) {
                wakeLock.release();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public synchronized void updateWakeLock(boolean z, boolean z3) {
            if (z) {
                if (this.wakeLock == null) {
                    if (this.applicationContext.checkSelfPermission("android.permission.WAKE_LOCK") != 0) {
                        Log.w("WakeLockManager", "WAKE_LOCK permission not granted, can't acquire wake lock for playback");
                        return;
                    }
                    PowerManager powerManager = (PowerManager) this.applicationContext.getSystemService("power");
                    if (powerManager == null) {
                        Log.w("WakeLockManager", "PowerManager is null, therefore not creating the WakeLock.");
                        return;
                    } else {
                        PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(1, "ExoPlayer:WakeLockManager");
                        this.wakeLock = wakeLockNewWakeLock;
                        wakeLockNewWakeLock.setReferenceCounted(false);
                    }
                }
            }
            if (this.wakeLock == null) {
                return;
            }
            if (WakeLockManager.shouldAcquireWakelock(z, z3)) {
                this.wakeLock.acquire();
            } else {
                this.wakeLock.release();
            }
        }
    }

    public WakeLockManager(Context context, Looper looper, Clock clock) {
        this.wakeLockManagerInternal = new WakeLockManagerInternal(context.getApplicationContext());
        this.wakeLockHandler = clock.createHandler(looper, null);
        this.mainHandler = clock.createHandler(Looper.getMainLooper(), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$postUpdateWakeLock$0(boolean z, boolean z3) {
        this.wakeLockManagerInternal.updateWakeLock(z, z3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$postUpdateWakeLock$2(Runnable runnable, boolean z, boolean z3) {
        this.mainHandler.removeCallbacks(runnable);
        this.wakeLockManagerInternal.updateWakeLock(z, z3);
    }

    private void postUpdateWakeLock(boolean z, boolean z3) {
        if (shouldAcquireWakelock(z, z3)) {
            this.wakeLockHandler.post(new g(this, z, z3, 0));
            return;
        }
        WakeLockManagerInternal wakeLockManagerInternal = this.wakeLockManagerInternal;
        Objects.requireNonNull(wakeLockManagerInternal);
        a aVar = new a(wakeLockManagerInternal, 1);
        this.mainHandler.postDelayed(aVar, 1000L);
        this.wakeLockHandler.post(new h(this, aVar, z, z3, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean shouldAcquireWakelock(boolean z, boolean z3) {
        return z && z3;
    }

    public void setEnabled(boolean z) {
        if (this.enabled == z) {
            return;
        }
        this.enabled = z;
        postUpdateWakeLock(z, this.stayAwake);
    }

    public void setStayAwake(boolean z) {
        if (this.stayAwake == z) {
            return;
        }
        this.stayAwake = z;
        if (this.enabled) {
            postUpdateWakeLock(true, z);
        }
    }
}

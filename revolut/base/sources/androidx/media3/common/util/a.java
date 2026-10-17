package androidx.media3.common.util;

import androidx.media3.common.util.NetworkTypeObserver;
import androidx.media3.common.util.WakeLockManager;
import androidx.media3.common.util.WifiLockManager;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7461b;

    public /* synthetic */ a(Object obj2, int i) {
        this.f7460a = i;
        this.f7461b = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        switch (this.f7460a) {
            case 0:
                ((NetworkTypeObserver.ListenerHolder) this.f7461b).lambda$callOnNetworkTypeChanged$0();
                break;
            case 1:
                WakeLockManager.WakeLockManagerInternal.access$200((WakeLockManager.WakeLockManagerInternal) this.f7461b);
                break;
            default:
                WifiLockManager.WifiLockManagerInternal.access$100((WifiLockManager.WifiLockManagerInternal) this.f7461b);
                break;
        }
    }
}

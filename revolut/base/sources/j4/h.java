package j4;

import androidx.media3.common.util.WakeLockManager;
import androidx.media3.common.util.WifiLockManager;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class h implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f171268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f171269b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f171270c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Runnable e;

    public /* synthetic */ h(Object obj2, Runnable runnable, boolean z, boolean z3, int i) {
        this.f171268a = i;
        this.d = obj2;
        this.e = runnable;
        this.f171269b = z;
        this.f171270c = z3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f171268a) {
            case 0:
                ((WakeLockManager) this.d).lambda$postUpdateWakeLock$2((androidx.media3.common.util.a) this.e, this.f171269b, this.f171270c);
                break;
            default:
                ((WifiLockManager) this.d).lambda$postUpdateWifiLock$2((androidx.media3.common.util.a) this.e, this.f171269b, this.f171270c);
                break;
        }
    }
}

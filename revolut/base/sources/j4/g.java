package j4;

import androidx.media3.common.util.WakeLockManager;
import androidx.media3.common.util.WifiLockManager;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class g implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f171265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f171266b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f171267c;
    public final /* synthetic */ Object d;

    public /* synthetic */ g(Object obj2, boolean z, boolean z3, int i) {
        this.f171265a = i;
        this.d = obj2;
        this.f171266b = z;
        this.f171267c = z3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f171265a) {
            case 0:
                ((WakeLockManager) this.d).lambda$postUpdateWakeLock$0(this.f171266b, this.f171267c);
                break;
            default:
                ((WifiLockManager) this.d).lambda$postUpdateWifiLock$0(this.f171266b, this.f171267c);
                break;
        }
    }
}

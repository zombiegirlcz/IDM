package androidx.media3.exoplayer;

import androidx.media3.exoplayer.DefaultSuitableOutputChecker;
import androidx.media3.exoplayer.StreamVolumeManager;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7480b;

    public /* synthetic */ a(Object obj2, int i) {
        this.f7479a = i;
        this.f7480b = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7479a) {
            case 0:
                ((DefaultSuitableOutputChecker.ImplApi23) this.f7480b).lambda$disable$2();
                break;
            case 1:
                ((DefaultSuitableOutputChecker.ImplApi35) this.f7480b).lambda$disable$2();
                break;
            default:
                ((StreamVolumeManager.VolumeChangeReceiver) this.f7480b).lambda$onReceive$0();
                break;
        }
    }
}

package androidx.media3.exoplayer;

import android.content.Context;
import androidx.media3.exoplayer.DefaultSuitableOutputChecker;
import androidx.media3.exoplayer.ExoPlayerImplInternal;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7494a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7495b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f7496c;

    public /* synthetic */ c(Object obj2, Object obj3, int i) {
        this.f7494a = i;
        this.f7496c = obj2;
        this.f7495b = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7494a) {
            case 0:
                ((DefaultSuitableOutputChecker.ImplApi23) this.f7496c).lambda$enable$1((Context) this.f7495b);
                break;
            case 1:
                ((DefaultSuitableOutputChecker.ImplApi35) this.f7496c).lambda$enable$1((Context) this.f7495b);
                break;
            case 2:
                ((ExoPlayerImpl) this.f7496c).lambda$new$1((ExoPlayerImplInternal.PlaybackInfoUpdate) this.f7495b);
                break;
            default:
                ((ExoPlayerImplInternal) this.f7496c).lambda$sendMessageToTargetThread$3((PlayerMessage) this.f7495b);
                break;
        }
    }
}

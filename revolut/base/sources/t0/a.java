package t0;

import androidx.camera.video.internal.audio.AudioSource;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f266836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AudioSource.AudioSourceCallback f266837b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f266838c;

    public /* synthetic */ a(AudioSource.AudioSourceCallback audioSourceCallback, boolean z, int i) {
        this.f266836a = i;
        this.f266837b = audioSourceCallback;
        this.f266838c = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f266836a) {
            case 0:
                this.f266837b.onSuspendStateChanged(this.f266838c);
                break;
            default:
                this.f266837b.onSilenceStateChanged(this.f266838c);
                break;
        }
    }
}

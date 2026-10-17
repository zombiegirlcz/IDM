package t0;

import androidx.camera.video.internal.audio.AudioSource;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f266839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AudioSource f266840b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f266841c;

    public /* synthetic */ b(AudioSource audioSource, boolean z, int i) {
        this.f266839a = i;
        this.f266840b = audioSource;
        this.f266841c = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f266839a) {
            case 0:
                this.f266840b.lambda$start$2(this.f266841c);
                break;
            default:
                this.f266840b.lambda$mute$7(this.f266841c);
                break;
        }
    }
}

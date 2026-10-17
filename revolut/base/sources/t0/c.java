package t0;

import androidx.camera.video.internal.audio.BufferedAudioStream;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f266842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BufferedAudioStream f266843b;

    public /* synthetic */ c(BufferedAudioStream bufferedAudioStream, int i) {
        this.f266842a = i;
        this.f266843b = bufferedAudioStream;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f266842a) {
            case 0:
                this.f266843b.lambda$stop$1();
                break;
            case 1:
                this.f266843b.lambda$start$0();
                break;
            case 2:
                this.f266843b.collectAudioData();
                break;
            default:
                this.f266843b.lambda$release$2();
                break;
        }
    }
}

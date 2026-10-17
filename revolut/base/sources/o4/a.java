package o4;

import androidx.media3.exoplayer.audio.AudioRendererEventListener;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f221887a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AudioRendererEventListener.EventDispatcher f221888b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Exception f221889c;

    public /* synthetic */ a(AudioRendererEventListener.EventDispatcher eventDispatcher, Exception exc2, int i) {
        this.f221887a = i;
        this.f221888b = eventDispatcher;
        this.f221889c = exc2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f221887a) {
            case 0:
                this.f221888b.lambda$audioCodecError$9(this.f221889c);
                break;
            default:
                this.f221888b.lambda$audioSinkError$8(this.f221889c);
                break;
        }
    }
}

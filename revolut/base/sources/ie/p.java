package ie;

import androidx.media3.exoplayer.video.VideoRendererEventListener;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f160549a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f160550b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f160551c;
    public final /* synthetic */ Object d;

    public /* synthetic */ p(VideoRendererEventListener.EventDispatcher eventDispatcher, Object obj2, long j2) {
        this.f160551c = eventDispatcher;
        this.d = obj2;
        this.f160550b = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f160549a) {
            case 0:
                r rVar = (r) this.f160551c;
                rVar.o.f173168b.b(new q(rVar, this.f160550b, (String) this.d));
                break;
            default:
                ((VideoRendererEventListener.EventDispatcher) this.f160551c).lambda$renderedFirstFrame$6(this.d, this.f160550b);
                break;
        }
    }

    public /* synthetic */ p(r rVar, long j2, String str) {
        this.f160551c = rVar;
        this.f160550b = j2;
        this.d = str;
    }
}

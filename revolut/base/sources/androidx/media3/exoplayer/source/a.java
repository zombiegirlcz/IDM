package androidx.media3.exoplayer.source;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ProgressiveMediaPeriod f7584b;

    public /* synthetic */ a(ProgressiveMediaPeriod progressiveMediaPeriod, int i) {
        this.f7583a = i;
        this.f7584b = progressiveMediaPeriod;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7583a) {
            case 0:
                this.f7584b.maybeFinishPrepare();
                break;
            default:
                this.f7584b.lambda$onLengthKnown$2();
                break;
        }
    }
}

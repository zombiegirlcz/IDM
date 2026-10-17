package androidx.media3.exoplayer;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class v implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7600b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f7601c;

    public /* synthetic */ v(Object obj2, int i, int i2) {
        this.f7599a = i2;
        this.f7601c = obj2;
        this.f7600b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7599a) {
            case 0:
                ((ExoPlayerImplInternal) this.f7601c).lambda$setScrubbingModeEnabledInternal$2(this.f7600b);
                break;
            default:
                ((StreamVolumeManager) this.f7601c).lambda$new$0(this.f7600b);
                break;
        }
    }
}

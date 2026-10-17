package t6;

import androidx.work.impl.background.systemalarm.DelayMetCommandHandler;

/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f268118a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DelayMetCommandHandler f268119b;

    public /* synthetic */ a(DelayMetCommandHandler delayMetCommandHandler, int i) {
        this.f268118a = i;
        this.f268119b = delayMetCommandHandler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f268118a) {
            case 0:
                this.f268119b.stopWork();
                break;
            default:
                this.f268119b.startWork();
                break;
        }
    }
}

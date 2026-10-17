package e0;

import androidx.camera.core.impl.LiveDataObservable;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class g implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f121369a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LiveDataObservable f121370b;

    public /* synthetic */ g(LiveDataObservable liveDataObservable, int i) {
        this.f121369a = i;
        this.f121370b = liveDataObservable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f121369a) {
            case 0:
                this.f121370b.lambda$enableInternalObserver$5();
                break;
            default:
                this.f121370b.lambda$disableInternalObserver$6();
                break;
        }
    }
}

package j4;

import androidx.media3.common.util.BackgroundThreadStateHandler;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f171254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BackgroundThreadStateHandler f171255b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f171256c;

    public /* synthetic */ a(BackgroundThreadStateHandler backgroundThreadStateHandler, Object obj2, int i) {
        this.f171254a = i;
        this.f171255b = backgroundThreadStateHandler;
        this.f171256c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f171254a) {
            case 0:
                this.f171255b.lambda$setStateInBackground$2(this.f171256c);
                break;
            default:
                this.f171255b.lambda$updateStateAsync$0(this.f171256c);
                break;
        }
    }
}

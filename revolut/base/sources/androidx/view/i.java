package androidx.view;

import androidx.view.ComponentActivity;

/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class i implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6791b;

    public /* synthetic */ i(Object obj2, int i) {
        this.f6790a = i;
        this.f6791b = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6790a) {
            case 0:
                ComponentActivity.ReportFullyDrawnExecutorImpl.execute$lambda$0((ComponentActivity.ReportFullyDrawnExecutorImpl) this.f6791b);
                break;
            case 1:
                ComponentActivity.onBackPressedDispatcher_delegate$lambda$0$0((ComponentActivity) this.f6791b);
                break;
            default:
                super/*android.app.Dialog*/.onBackPressed();
                break;
        }
    }
}

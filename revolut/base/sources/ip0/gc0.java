package ip0;

import android.animation.ValueAnimator;

/* JADX INFO: loaded from: classes19.dex */
public final class gc0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f164397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.core.ui_kit.delegates.fg f164398b;

    public /* synthetic */ gc0(com.revolut.core.ui_kit.delegates.fg fgVar, int i) {
        this.f164397a = i;
        this.f164398b = fgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f164397a) {
            case 0:
                ValueAnimator valueAnimator = this.f164398b.i;
                if (valueAnimator != null) {
                    valueAnimator.resume();
                }
                break;
            default:
                ValueAnimator valueAnimator2 = this.f164398b.i;
                if (valueAnimator2 != null) {
                    valueAnimator2.resume();
                }
                break;
        }
    }
}

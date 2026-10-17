package d7;

import com.airbnb.lottie.LottieAnimationView;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class i implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f111672a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakReference f111673b;

    public i(LottieAnimationView lottieAnimationView, int i) {
        this.f111672a = i;
        switch (i) {
            case 1:
                this.f111673b = new WeakReference(lottieAnimationView);
                break;
            default:
                this.f111673b = new WeakReference(lottieAnimationView);
                break;
        }
    }

    @Override // d7.d0
    public final void onResult(Object obj2) {
        switch (this.f111672a) {
            case 0:
                Throwable th10 = (Throwable) obj2;
                LottieAnimationView lottieAnimationView = (LottieAnimationView) this.f111673b.get();
                if (lottieAnimationView != null) {
                    if (lottieAnimationView.fallbackResource != 0) {
                        lottieAnimationView.setImageResource(lottieAnimationView.fallbackResource);
                    }
                    (lottieAnimationView.failureListener == null ? LottieAnimationView.DEFAULT_FAILURE_LISTENER : lottieAnimationView.failureListener).onResult(th10);
                    break;
                }
                break;
            default:
                j jVar = (j) obj2;
                LottieAnimationView lottieAnimationView2 = (LottieAnimationView) this.f111673b.get();
                if (lottieAnimationView2 != null) {
                    lottieAnimationView2.setComposition(jVar);
                    break;
                }
                break;
        }
    }
}

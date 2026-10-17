package d7;

import com.airbnb.lottie.LottieDrawable;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class p implements z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f111708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LottieDrawable f111709b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f111710c;

    public /* synthetic */ p(LottieDrawable lottieDrawable, int i, int i2) {
        this.f111708a = i2;
        this.f111709b = lottieDrawable;
        this.f111710c = i;
    }

    @Override // d7.z
    public final void run() {
        int i = this.f111708a;
        int i2 = this.f111710c;
        LottieDrawable lottieDrawable = this.f111709b;
        switch (i) {
            case 0:
                List list = LottieDrawable.S;
                lottieDrawable.r(i2);
                break;
            case 1:
                List list2 = LottieDrawable.S;
                lottieDrawable.s(i2);
                break;
            default:
                List list3 = LottieDrawable.S;
                lottieDrawable.y(i2);
                break;
        }
    }
}

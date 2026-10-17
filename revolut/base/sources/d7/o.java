package d7;

import com.airbnb.lottie.LottieDrawable;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class o implements z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f111705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LottieDrawable f111706b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f111707c;

    public /* synthetic */ o(LottieDrawable lottieDrawable, String str, int i) {
        this.f111705a = i;
        this.f111706b = lottieDrawable;
        this.f111707c = str;
    }

    @Override // d7.z
    public final void run() {
        int i = this.f111705a;
        String str = this.f111707c;
        LottieDrawable lottieDrawable = this.f111706b;
        switch (i) {
            case 0:
                List list = LottieDrawable.S;
                lottieDrawable.v(str);
                break;
            case 1:
                List list2 = LottieDrawable.S;
                lottieDrawable.t(str);
                break;
            default:
                List list3 = LottieDrawable.S;
                lottieDrawable.z(str);
                break;
        }
    }
}

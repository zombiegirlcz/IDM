package d7;

import com.airbnb.lottie.LottieDrawable;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class t implements z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f111720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LottieDrawable f111721b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f111722c;

    public /* synthetic */ t(LottieDrawable lottieDrawable, float f, int i) {
        this.f111720a = i;
        this.f111721b = lottieDrawable;
        this.f111722c = f;
    }

    @Override // d7.z
    public final void run() {
        int i = this.f111720a;
        float f = this.f111722c;
        LottieDrawable lottieDrawable = this.f111721b;
        switch (i) {
            case 0:
                List list = LottieDrawable.S;
                j jVar = lottieDrawable.f25588a;
                if (jVar != null) {
                    r7.e eVar = lottieDrawable.f25589b;
                    eVar.j(eVar.f251941j, r7.g.f(jVar.f111683l, jVar.f111684m, f));
                } else {
                    lottieDrawable.f25591g.add(new t(lottieDrawable, f, 0));
                }
                break;
            default:
                List list2 = LottieDrawable.S;
                j jVar2 = lottieDrawable.f25588a;
                if (jVar2 != null) {
                    lottieDrawable.y((int) r7.g.f(jVar2.f111683l, jVar2.f111684m, f));
                } else {
                    lottieDrawable.f25591g.add(new t(lottieDrawable, f, 1));
                }
                break;
        }
    }
}

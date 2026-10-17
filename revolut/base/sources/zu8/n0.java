package zu8;

import com.revolut.feature.kyc.impl.introduction.IntroductionScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes4.dex */
public final class n0 implements xki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f325324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c0 f325325b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f325326c;
    public IntroductionScreenContract$InputData d;
    public final Object e;

    public /* synthetic */ n0(c0 c0Var, Object obj2, int i) {
        this.f325324a = i;
        this.f325325b = c0Var;
        this.e = obj2;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f325324a) {
            case 0:
                this.f325326c = viewController;
                break;
            default:
                this.f325326c = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f325324a) {
            case 0:
                vc.s.h(this.f325326c, ViewController.class);
                vc.s.h(this.d, IntroductionScreenContract$InputData.class);
                return new p0(this.f325325b, (g0) this.e, this.d);
            default:
                vc.s.h(this.f325326c, ViewController.class);
                vc.s.h(this.d, IntroductionScreenContract$InputData.class);
                return new p0(this.f325325b, (e0) this.e, this.d);
        }
    }
}

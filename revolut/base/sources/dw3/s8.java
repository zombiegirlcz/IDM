package dw3;

import com.revolut.feature.credit.application.plugins.impl.ui.offer.animated_intro.AnimatedIntroScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes22.dex */
public final class s8 implements xki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f119790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c1 f119791b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f119792c;
    public AnimatedIntroScreenContract$InputData d;
    public final Object e;

    public /* synthetic */ s8(c1 c1Var, Object obj2, int i) {
        this.f119790a = i;
        this.f119791b = c1Var;
        this.e = obj2;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f119790a) {
            case 0:
                this.f119792c = viewController;
                break;
            case 1:
                this.f119792c = viewController;
                break;
            default:
                this.f119792c = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f119790a) {
            case 0:
                vc.s.h(this.f119792c, ViewController.class);
                vc.s.h(this.d, AnimatedIntroScreenContract$InputData.class);
                return new t8(this.f119791b, (q4) this.e, this.f119792c, this.d);
            case 1:
                vc.s.h(this.f119792c, ViewController.class);
                vc.s.h(this.d, AnimatedIntroScreenContract$InputData.class);
                return new t8(this.f119791b, (f4) this.e, this.f119792c, this.d);
            default:
                vc.s.h(this.f119792c, ViewController.class);
                vc.s.h(this.d, AnimatedIntroScreenContract$InputData.class);
                return new t8(this.f119791b, (n4) this.e, this.f119792c, this.d);
        }
    }
}

package us6;

import com.revolut.feature.freelancer.impl.ui.profile.website.FreelancerWebsiteScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes3.dex */
public final class v1 implements xki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f282778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f282779b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f282780c;
    public FreelancerWebsiteScreenContract$InputData d;
    public final Object e;

    public /* synthetic */ v1(q qVar, Object obj2, int i) {
        this.f282778a = i;
        this.f282779b = qVar;
        this.e = obj2;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f282778a) {
            case 0:
                this.f282780c = viewController;
                break;
            case 1:
                this.f282780c = viewController;
                break;
            default:
                this.f282780c = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f282778a) {
            case 0:
                vc.s.h(this.f282780c, ViewController.class);
                vc.s.h(this.d, FreelancerWebsiteScreenContract$InputData.class);
                return new w1(this.f282779b, (g1) this.e, this.f282780c, this.d);
            case 1:
                vc.s.h(this.f282780c, ViewController.class);
                vc.s.h(this.d, FreelancerWebsiteScreenContract$InputData.class);
                return new w1(this.f282779b, (d0) this.e, this.f282780c, this.d);
            default:
                vc.s.h(this.f282780c, ViewController.class);
                vc.s.h(this.d, FreelancerWebsiteScreenContract$InputData.class);
                return new w1(this.f282779b, (b0) this.e, this.f282780c, this.d);
        }
    }
}

package hc2;

import com.revolut.feature.apm.core.code.ui.ApmCodeControllerContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import p12.t0;

/* JADX INFO: loaded from: classes20.dex */
public final class j implements xki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f150790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewController f150791b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ApmCodeControllerContract$InputData f150792c;
    public final Object d;
    public final Object e;

    public /* synthetic */ j(Object obj2, Object obj3, int i) {
        this.f150790a = i;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f150790a) {
            case 0:
                this.f150791b = viewController;
                break;
            case 1:
                this.f150791b = viewController;
                break;
            case 2:
                this.f150791b = viewController;
                break;
            case 3:
                this.f150791b = viewController;
                break;
            case 4:
                this.f150791b = viewController;
                break;
            default:
                this.f150791b = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f150790a) {
            case 0:
                vc.s.h(this.f150791b, ViewController.class);
                vc.s.h(this.f150792c, ApmCodeControllerContract$InputData.class);
                return new k((m) this.d, (o) this.e, this.f150791b, this.f150792c);
            case 1:
                vc.s.h(this.f150791b, ViewController.class);
                vc.s.h(this.f150792c, ApmCodeControllerContract$InputData.class);
                return new k((ms1.j) this.d, (ms1.n) this.e, this.f150791b, this.f150792c);
            case 2:
                vc.s.h(this.f150791b, ViewController.class);
                vc.s.h(this.f150792c, ApmCodeControllerContract$InputData.class);
                return new k((nh2.o) this.d, (nh2.s) this.e, this.f150791b, this.f150792c);
            case 3:
                vc.s.h(this.f150791b, ViewController.class);
                vc.s.h(this.f150792c, ApmCodeControllerContract$InputData.class);
                return new k((nv1.g) this.d, (nv1.e) this.e, this.f150791b, this.f150792c);
            case 4:
                vc.s.h(this.f150791b, ViewController.class);
                vc.s.h(this.f150792c, ApmCodeControllerContract$InputData.class);
                return new k((p12.v) this.d, (t0) this.e, this.f150791b, this.f150792c);
            default:
                vc.s.h(this.f150791b, ViewController.class);
                vc.s.h(this.f150792c, ApmCodeControllerContract$InputData.class);
                return new k((qd2.f) this.d, (qd2.h) this.e, this.f150791b, this.f150792c);
        }
    }
}

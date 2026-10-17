package dw3;

import com.revolut.feature.credit.application.plugins.impl.ui.agreements.common.viewer.CreditApplicationDocumentViewerScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes22.dex */
public final class t7 implements xki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f119864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f119865b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f119866c;
    public CreditApplicationDocumentViewerScreenContract$InputData d;
    public final Object e;

    public /* synthetic */ t7(Object obj2, Object obj3, int i) {
        this.f119864a = i;
        this.f119865b = obj2;
        this.e = obj3;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f119864a) {
            case 0:
                this.f119866c = viewController;
                break;
            case 1:
                this.f119866c = viewController;
                break;
            case 2:
                this.f119866c = viewController;
                break;
            case 3:
                this.f119866c = viewController;
                break;
            case 4:
                this.f119866c = viewController;
                break;
            case 5:
                this.f119866c = viewController;
                break;
            default:
                this.f119866c = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f119864a) {
            case 0:
                vc.s.h(this.f119866c, ViewController.class);
                vc.s.h(this.d, CreditApplicationDocumentViewerScreenContract$InputData.class);
                return new u7((c1) this.f119865b, (n4) this.e, this.f119866c, this.d);
            case 1:
                vc.s.h(this.f119866c, ViewController.class);
                vc.s.h(this.d, CreditApplicationDocumentViewerScreenContract$InputData.class);
                return new u7((c1) this.f119865b, (q4) this.e, this.f119866c, this.d);
            case 2:
                vc.s.h(this.f119866c, ViewController.class);
                vc.s.h(this.d, CreditApplicationDocumentViewerScreenContract$InputData.class);
                return new u7((c1) this.f119865b, (p0) this.e, this.f119866c, this.d);
            case 3:
                vc.s.h(this.f119866c, ViewController.class);
                vc.s.h(this.d, CreditApplicationDocumentViewerScreenContract$InputData.class);
                return new u7((c1) this.f119865b, (o0) this.e, this.f119866c, this.d);
            case 4:
                vc.s.h(this.f119866c, ViewController.class);
                vc.s.h(this.d, CreditApplicationDocumentViewerScreenContract$InputData.class);
                return new u7((c1) this.f119865b, (z0) this.e, this.f119866c, this.d);
            case 5:
                vc.s.h(this.f119866c, ViewController.class);
                vc.s.h(this.d, CreditApplicationDocumentViewerScreenContract$InputData.class);
                return new u7((c1) this.f119865b, (t) this.e, this.f119866c, this.d);
            default:
                vc.s.h(this.f119866c, ViewController.class);
                vc.s.h(this.d, CreditApplicationDocumentViewerScreenContract$InputData.class);
                return new u7((qz4.a) this.f119865b, (qz4.b) this.e, this.f119866c, this.d);
        }
    }
}

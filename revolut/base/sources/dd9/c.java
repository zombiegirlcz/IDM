package dd9;

import com.revolut.feature.onboarding.impl.qes_terms.QesTermsScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import vc.s;

/* JADX INFO: loaded from: classes5.dex */
public final class c implements xki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f113124a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewController f113125b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public QesTermsScreenContract$InputData f113126c;
    public final Object d;
    public final Object e;

    public /* synthetic */ c(Object obj2, Object obj3, int i) {
        this.f113124a = i;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f113124a) {
            case 0:
                this.f113125b = viewController;
                break;
            default:
                this.f113125b = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f113124a) {
            case 0:
                s.h(this.f113125b, ViewController.class);
                s.h(this.f113126c, QesTermsScreenContract$InputData.class);
                return new d((e) this.d, (f) this.e, this.f113126c);
            default:
                s.h(this.f113125b, ViewController.class);
                s.h(this.f113126c, QesTermsScreenContract$InputData.class);
                return new qc9.e((qc9.c) this.d, (qc9.d) this.e, this.f113126c);
        }
    }
}

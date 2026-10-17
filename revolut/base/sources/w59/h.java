package w59;

import com.revolut.feature.masav.impl.ui.form.MasavDirectDebitFormScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import vc.s;

/* JADX INFO: loaded from: classes4.dex */
public final class h implements d69.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f294753a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewController f294754b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public MasavDirectDebitFormScreenContract$InputData f294755c;

    public h(d dVar) {
        this.f294753a = dVar;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        this.f294754b = viewController;
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        s.h(this.f294754b, ViewController.class);
        s.h(this.f294755c, MasavDirectDebitFormScreenContract$InputData.class);
        return new g(this.f294753a, this.f294755c);
    }

    @Override // d69.a
    public final d69.a d0(MasavDirectDebitFormScreenContract$InputData masavDirectDebitFormScreenContract$InputData) {
        masavDirectDebitFormScreenContract$InputData.getClass();
        this.f294755c = masavDirectDebitFormScreenContract$InputData;
        return this;
    }
}

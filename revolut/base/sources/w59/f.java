package w59;

import com.revolut.feature.masav.impl.ui.form.MasavDirectDebitFormScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import vc.s;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements d69.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f294747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f294748b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f294749c;
    public MasavDirectDebitFormScreenContract$InputData d;

    public f(d dVar, c cVar) {
        this.f294747a = dVar;
        this.f294748b = cVar;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        this.f294749c = viewController;
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        s.h(this.f294749c, ViewController.class);
        s.h(this.d, MasavDirectDebitFormScreenContract$InputData.class);
        return new g(this.f294747a, this.f294748b, this.d);
    }

    @Override // d69.a
    public final d69.a d0(MasavDirectDebitFormScreenContract$InputData masavDirectDebitFormScreenContract$InputData) {
        masavDirectDebitFormScreenContract$InputData.getClass();
        this.d = masavDirectDebitFormScreenContract$InputData;
        return this;
    }
}

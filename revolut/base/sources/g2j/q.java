package g2j;

import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.balance.picker.api.navigation.DualChooserContract$InputData;
import vc.s;

/* JADX INFO: loaded from: classes10.dex */
public final class q implements j2j.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f140131a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewController f140132b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public DualChooserContract$InputData f140133c;
    public od0.i d;

    public q(f fVar) {
        this.f140131a = fVar;
    }

    @Override // j2j.a
    public final j2j.a C(od0.i iVar) {
        this.d = iVar;
        return this;
    }

    @Override // j2j.a
    public final j2j.a N(DualChooserContract$InputData dualChooserContract$InputData) {
        dualChooserContract$InputData.getClass();
        this.f140133c = dualChooserContract$InputData;
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        this.f140132b = viewController;
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        s.h(this.f140132b, ViewController.class);
        s.h(this.f140133c, DualChooserContract$InputData.class);
        s.h(this.d, od0.i.class);
        return new p(this.f140131a, this.f140133c, this.d);
    }
}

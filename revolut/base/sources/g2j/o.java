package g2j;

import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.balance.picker.api.navigation.DualChooserContract$InputData;
import vc.s;

/* JADX INFO: loaded from: classes10.dex */
public final class o implements j2j.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f140123a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f140124b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f140125c;
    public DualChooserContract$InputData d;
    public od0.i e;

    public o(f fVar, h hVar) {
        this.f140123a = fVar;
        this.f140124b = hVar;
    }

    @Override // j2j.a
    public final j2j.a C(od0.i iVar) {
        this.e = iVar;
        return this;
    }

    @Override // j2j.a
    public final j2j.a N(DualChooserContract$InputData dualChooserContract$InputData) {
        dualChooserContract$InputData.getClass();
        this.d = dualChooserContract$InputData;
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        this.f140125c = viewController;
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        s.h(this.f140125c, ViewController.class);
        s.h(this.d, DualChooserContract$InputData.class);
        s.h(this.e, od0.i.class);
        return new p(this.f140123a, this.f140124b, this.d, this.e);
    }
}

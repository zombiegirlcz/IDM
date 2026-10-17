package us6;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.freelancer.impl.ui.sales.qr.share.FreelancerQrShareScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class t0 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FreelancerQrShareScreenContract$InputData f282754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ViewController f282755b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f282756c;
    public final e4m.e d;
    public final e4m.e e;

    public t0(q qVar, ViewController viewController, FreelancerQrShareScreenContract$InputData freelancerQrShareScreenContract$InputData) {
        this.f282756c = qVar;
        this.f282754a = freelancerQrShareScreenContract$InputData;
        this.f282755b = viewController;
        int i = 1;
        this.d = e4m.b.b(new q0(qVar, this, 1, i));
        this.e = e4m.b.b(new q0(qVar, this, 0, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}

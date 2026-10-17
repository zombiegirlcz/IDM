package bt7;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.insurance_credit.impl.ui.screen.details.InsuranceDetailsScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class k implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InsuranceDetailsScreenContract$InputData f18444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f18445b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f18446c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    public k(i iVar, j jVar, ViewController viewController, InsuranceDetailsScreenContract$InputData insuranceDetailsScreenContract$InputData) {
        this.f18445b = iVar;
        this.f18444a = insuranceDetailsScreenContract$InputData;
        this.f18446c = e4m.b.b(new e(iVar, this, 1, 2));
        this.d = e4m.b.b(e4m.c.a(viewController));
        int i = 2;
        this.e = e4m.b.b(new e(iVar, this, 2, i));
        this.f = e4m.b.b(new e(iVar, this, 0, i));
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

package cga;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.pricing_plans.unlock_benefits.impl.ui.screen.unlock_benefits.UnlockBenefitsScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;
import xki.e;

/* JADX INFO: loaded from: classes5.dex */
public final class c implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UnlockBenefitsScreenContract$InputData f23895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ViewController f23896b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f23897c;
    public final e4m.e d;

    public c(a aVar, b bVar, ViewController viewController, UnlockBenefitsScreenContract$InputData unlockBenefitsScreenContract$InputData) {
        this.f23895a = unlockBenefitsScreenContract$InputData;
        this.f23896b = viewController;
        int i = 23;
        this.f23897c = e4m.b.b(new bt7.e(aVar, this, 1, i));
        this.d = e4m.b.b(new bt7.e(aVar, this, 0, i));
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

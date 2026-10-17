package wfb;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.retail.salary_account.impl.salary_promotion.SalaryPromotionControllerContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class n implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SalaryPromotionControllerContract$InputData f297064a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ViewController f297065b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f297066c;
    public final e4m.e d;

    public n(i iVar, ViewController viewController, SalaryPromotionControllerContract$InputData salaryPromotionControllerContract$InputData) {
        this.f297066c = iVar;
        this.f297064a = salaryPromotionControllerContract$InputData;
        this.f297065b = viewController;
        int i = 25;
        this.d = e4m.b.b(new vzc.j(iVar, this, 0, i));
        e4m.b.b(new vzc.j(iVar, this, 1, i));
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

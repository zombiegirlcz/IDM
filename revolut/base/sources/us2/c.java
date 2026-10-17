package us2;

import com.revolut.feature.business.referrals.ui.screens.eligibility_criteria.EligibilityCriteriaScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Collections;
import java.util.Set;
import ufg.k0;

/* JADX INFO: loaded from: classes21.dex */
public final class c implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewController f282384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EligibilityCriteriaScreenContract$InputData f282385b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f282386c;
    public final e4m.e d;
    public final e4m.e e;

    public c(j jVar, h hVar, ViewController viewController, EligibilityCriteriaScreenContract$InputData eligibilityCriteriaScreenContract$InputData) {
        this.f282384a = viewController;
        this.f282385b = eligibilityCriteriaScreenContract$InputData;
        int i = 11;
        this.f282386c = e4m.b.b(new k0(jVar, this, 2, i));
        this.d = e4m.b.b(new k0(jVar, this, 1, i));
        this.e = e4m.b.b(new k0(jVar, this, 0, i));
    }

    @Override // xki.e
    public final Set f() {
        return Collections.EMPTY_SET;
    }

    @Override // xki.e
    public final Set g() {
        return Collections.EMPTY_SET;
    }
}

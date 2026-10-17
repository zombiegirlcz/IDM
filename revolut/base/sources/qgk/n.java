package qgk;

import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.family_plans.invitation.FamilyPlanInvitationScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public final class n implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FamilyPlanInvitationScreenContract$InputData f246150a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ViewController f246151b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i0 f246152c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    public n(i0 i0Var, l lVar, ViewController viewController, FamilyPlanInvitationScreenContract$InputData familyPlanInvitationScreenContract$InputData) {
        this.f246152c = i0Var;
        this.f246150a = familyPlanInvitationScreenContract$InputData;
        this.f246151b = viewController;
        int i = 0;
        this.d = e4m.b.b(new m(i0Var, this, 2, i));
        this.e = e4m.b.b(new m(i0Var, this, 1, i));
        this.f = e4m.b.b(new m(i0Var, this, 0, i));
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

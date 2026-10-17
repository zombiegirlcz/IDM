package pbk;

import com.google.common.collect.ImmutableSet;
import com.revolut.retail.feature.plan_gifting.impl.ui.screens.sender.confirmation.PlanGiftingSendConfirmationScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public final class f implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PlanGiftingSendConfirmationScreenContract$InputData f234737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f234738b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f234739c;

    public f(b bVar, g gVar, PlanGiftingSendConfirmationScreenContract$InputData planGiftingSendConfirmationScreenContract$InputData) {
        this.f234737a = planGiftingSendConfirmationScreenContract$InputData;
        this.f234738b = e4m.b.b(new pa6.f(bVar, this, 1, 10));
        this.f234739c = e4m.b.b(new pa6.f(bVar, this, 0, 10));
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

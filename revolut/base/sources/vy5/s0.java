package vy5;

import com.revolut.core.model.account.AccountId;
import com.revolut.feature.add.new_product.api.AddNewProductFeatureAvailabilityApi$Toggles$P4URevamp;
import com.revolut.feature.pockets.api.ui.add_new.OpenNewPocketDestination;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import okl.l1;

/* JADX INFO: loaded from: classes3.dex */
public final class s0 implements mf1.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uy5.f f293211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rea.g f293212b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gte.a f293213c;

    public s0(uy5.f currencyAccountsInteractor, rea.g newPocketAvailabilityChecker, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(currencyAccountsInteractor, "currencyAccountsInteractor");
        Intrinsics.checkNotNullParameter(newPocketAvailabilityChecker, "newPocketAvailabilityChecker");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f293211a = currencyAccountsInteractor;
        this.f293212b = newPocketAvailabilityChecker;
        this.f293213c = featureToggleInteractor;
    }

    @Override // mf1.c
    public final Flow a() {
        return nim.a.v(nim.a.v(rd0.e.n(rd0.e.b(this.f293212b.d()), zhm.h0.f322473a), new vw4.j(22)), new vw4.j(23));
    }

    @Override // mf1.c
    public final Object c(Continuation continuation) {
        return new of1.d(new OpenNewPocketDestination(io3.l.CURRENT, (AccountId) AccountId.Personal.f51414a, true));
    }

    @Override // mf1.c
    public final Flow isAvailable() {
        if (((jte.d) this.f293213c).c(AddNewProductFeatureAvailabilityApi$Toggles$P4URevamp.f60848c)) {
            return new go.g(Boolean.FALSE, 2);
        }
        return vkm.q.Q(new l1(rd0.e.n(rd0.e.b(((p0) this.f293211a).a(io3.l.CURRENT)), zhm.h0.f322473a), 15), new vdl.c1((Continuation) null, this, 27));
    }
}

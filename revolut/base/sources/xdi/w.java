package xdi;

import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature_rev_points_pocket_api.R$string;
import com.revolut.feature_rev_points_pocket_api.navigation.RevPointsPocketDestination;
import com.revolut.feature_rev_points_pocket_impl.ui.screen.onboarding.RevPointsPocketOnboardingScreenContract$InputData;
import ip0.zj;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class w implements cli.n {

    @NotNull
    public static final v Companion = new v();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RevPointsPocketOnboardingScreenContract$InputData f304478a;

    public w(RevPointsPocketOnboardingScreenContract$InputData inputData, zdi.d headerSectionFactory, zdi.f travelSectionFactory, zdi.e howItWorksSectionFactory) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(headerSectionFactory, "headerSectionFactory");
        Intrinsics.checkNotNullParameter(travelSectionFactory, "travelSectionFactory");
        Intrinsics.checkNotNullParameter(howItWorksSectionFactory, "howItWorksSectionFactory");
        this.f304478a = inputData;
    }

    public final h a(boolean z) {
        int i;
        RevPointsPocketDestination.Onboarding.Mode mode = this.f304478a.f97826a;
        if (mode instanceof RevPointsPocketDestination.Onboarding.Mode.OptIn) {
            i = R$string.rev_points_pocket_onboarding_button_title;
        } else {
            if (!Intrinsics.f(mode, RevPointsPocketDestination.Onboarding.Mode.Boost.f97800a)) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$string.rev_points_pocket_common_continue;
        }
        return new h(new TextLocalisedClause(i, null, null, 14), z);
    }

    public final n b() {
        FullScreenStateDelegate.Model model = new FullScreenStateDelegate.Model("REV_POINTS_POCKET_ERROR_ITEM_ID", new TextLocalisedClause(R$string.rev_points_pocket_common_error_title, null, null, 14), new TextLocalisedClause(R$string.rev_points_pocket_common_error_description, null, null, 14), new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D018", null, null, null, 30)), zj.REGULAR, new TextLocalisedClause(R$string.rev_points_pocket_common_try_again, null, null, 14), false, null, null, false, 0, 0, 32704);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return new n(zhm.u.c(model), a(false), null);
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        g domainState = (g) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (n) iii.c.f(t1.t(domainState.f304451a, domainState.f304452b), new x8h.d(this, 28), new x2g.b(this, 20), new wx6.k(this, domainState, 10));
    }
}

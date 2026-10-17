package g57;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.freelancer.impl.R$string;
import g3e.s;
import ip0.zj;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes3.dex */
public final class r implements cli.n {

    @NotNull
    public static final q Companion = new q();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d57.a f140685a;

    public r(d57.a accountingPeriodClauseFactory, d57.c assessmentPeriodClauseFactory) {
        Intrinsics.checkNotNullParameter(accountingPeriodClauseFactory, "accountingPeriodClauseFactory");
        Intrinsics.checkNotNullParameter(assessmentPeriodClauseFactory, "assessmentPeriodClauseFactory");
        this.f140685a = accountingPeriodClauseFactory;
    }

    public static m a(boolean z) {
        return new m(new TextLocalisedClause(R$string.freelancer_vat_reminder_setup_action_update, null, null, 14), z);
    }

    public static n b() {
        return new n(new TextLocalisedClause(R$string.freelancer_vat_reminder_setup_header_title, null, null, 14));
    }

    public static o d() {
        n nVarB = b();
        FullScreenStateDelegate.Model model = new FullScreenStateDelegate.Model("ERROR_STATE_ID", new TextLocalisedClause(com.revolut.kompot.common.R$string.common_error_state_title, null, null, 14), null, new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D018", null, null, null, 30)), zj.REGULAR, new TextLocalisedClause(com.revolut.kompot.common.R$string.common_error_state_action, null, null, 14), false, null, null, false, 0, 0, 31684);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return new o(nVarB, u.c(model), a(false));
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        h domainState = (h) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (o) iii.c.f(domainState.f140673a, new g3e.h(this, 22), new s(this), new fyg.b(domainState, this, 7));
    }
}

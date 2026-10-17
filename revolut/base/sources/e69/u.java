package e69;

import cli.y;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationPendingAction;
import com.revolut.feature.apm.core.models.payments_authorisations.PaymentMethodDetails;
import com.revolut.feature.rev10_main_screen.api.MainContainerScreenDestination;
import com.revolut.feature.tab.accounts.api.model.TabAccountsInitialPayload;
import com.revolut.feature.tab.accounts.api.model.TabAccountsLaunchConfig;
import com.revolut.feature.tab.accounts.api.model.TabAccountsShotDialogAction;
import com.revolut.kompot.common.transition.AccountCreationTransitionAnimation;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import kotlin.time.b;
import org.jetbrains.annotations.NotNull;
import vkm.z1;

/* JADX INFO: loaded from: classes4.dex */
public final class u extends oki.h implements g {

    @NotNull
    public static final o Companion = new o();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final long f122957r;
    public final g69.d o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final z1 f122958p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f122959q;

    static {
        b.Companion companion = kotlin.time.b.INSTANCE;
        f122957r = kotlin.time.c.g(1, pkm.e.SECONDS);
    }

    public u(g69.d interactor, w stateMapper) {
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = interactor;
        z1 z1VarB = vkm.q.b(0, 2, ukm.f.DROP_OLDEST);
        z1VarB.k(Unit.f186387a);
        this.f122958p = z1VarB;
        this.f122959q = mra.d.b(this, new f(0), stateMapper, null, false, 12);
    }

    public static final void I2(u uVar, ApmPaymentAuthorisationPendingAction apmPaymentAuthorisationPendingAction, TextLocalisedClause textLocalisedClause) {
        PaymentMethodDetails paymentMethodDetails = apmPaymentAuthorisationPendingAction.getF61991a().f61995g;
        PaymentMethodDetails.MasavRequestToPay masavRequestToPay = paymentMethodDetails instanceof PaymentMethodDetails.MasavRequestToPay ? (PaymentMethodDetails.MasavRequestToPay) paymentMethodDetails : null;
        String str = masavRequestToPay != null ? masavRequestToPay.e : null;
        if (str == null || d0.W(str)) {
            uVar.C1(new MainContainerScreenDestination.JustShow(ibb.c.f160140a, new TabAccountsLaunchConfig(null, new TabAccountsInitialPayload.Action(new TabAccountsShotDialogAction.Success(textLocalisedClause, null))), (AccountCreationTransitionAnimation) null, 12));
        } else {
            yji.l.a1(uVar, uVar.X1(new mii.k("SUCCESS_SHOT_DIALOG_ID", textLocalisedClause, null, null, null, 28)), null, null, new t(uVar, str, null), 3);
        }
    }

    @Override // yji.l
    public final void I1() {
        yji.l.a1(this, c8g.c.c(vkm.q.Q(this.f122958p, new dz6.n(null, this, 4)), new e2j.j(this, 20)), null, null, new r(this, null, 0), 3);
        yji.l.a1(this, xam.a.h(new s(this, null), vkm.q.q(this.f122959q.B(new e4k.f(17)))), null, null, new r(this, null, 1), 3);
    }

    public final void J2(m event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.equals(i.f122944a)) {
            B2();
            return;
        }
        Continuation continuation = null;
        if (event.equals(h.f122943a)) {
            l2(new q(this, continuation, 0), new yi5.b(26));
            return;
        }
        if (event.equals(k.f122946a)) {
            l2(new q(this, continuation, 1), new yi5.b(26));
            return;
        }
        if (event.equals(l.f122947a)) {
            H2(this.f122959q, new e4k.f(16));
            this.f122958p.k(Unit.f186387a);
        } else {
            if (!(event instanceof j)) {
                throw new NoWhenBranchMatchedException();
            }
            Object obj2 = ((j) event).f122945a.o;
            if (obj2 instanceof aii.u) {
                C1((aii.u) obj2);
            }
        }
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f122959q;
    }
}

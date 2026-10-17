package dy7;

import com.google.firebase.messaging.t;
import com.revolut.feature.insurance_pet.impl.ui.hub.issues.renewal.RenewalDetailsContract$Configuration;
import com.revolut.retail.core.navigation.ActivityNavigateCommand;
import efm.d0;
import fx7.f;
import fx7.l;
import k3l.j;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pfm.z;
import tm.g;
import zhm.v;
import zx7.i;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements mm.b, g3l.d {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g3l.a f121072a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f121073b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f121074c;
    public final zx7.l d;
    public final ln.a e;
    public final g f;

    public c(g3l.a statusDialogViewConfigurationDispatcher, f petInteractor, l quoteInteractor, zx7.l state, ln.a navigationCommandsDispatcher, t actionDelegateFactory) {
        Intrinsics.checkNotNullParameter(statusDialogViewConfigurationDispatcher, "statusDialogViewConfigurationDispatcher");
        Intrinsics.checkNotNullParameter(petInteractor, "petInteractor");
        Intrinsics.checkNotNullParameter(quoteInteractor, "quoteInteractor");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(navigationCommandsDispatcher, "navigationCommandsDispatcher");
        Intrinsics.checkNotNullParameter(actionDelegateFactory, "actionDelegateFactory");
        this.f121072a = statusDialogViewConfigurationDispatcher;
        this.f121073b = petInteractor;
        this.f121074c = quoteInteractor;
        this.d = state;
        this.e = navigationCommandsDispatcher;
        this.f = actionDelegateFactory.f(new a(this, 1));
    }

    @Override // mm.b
    public final efm.b a3(mm.a aVar) {
        i action = (i) aVar;
        Intrinsics.checkNotNullParameter(action, "action");
        return this.f.a(action);
    }

    @Override // g3l.d
    public final d0 b(j result) {
        Intrinsics.checkNotNullParameter(result, "result");
        if (!v.k("REJECT_SUCCESS_PET_LOSS_DIALOG_ID", "REJECT_SUCCESS_REGULAR_DIALOG_ID").contains(result.a().getF104385a())) {
            ufm.b bVarM = d0.m(Boolean.FALSE);
            Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
            return bVarM;
        }
        if (!(result instanceof k3l.g)) {
            ufm.b bVarM2 = d0.m(Boolean.FALSE);
            Intrinsics.checkNotNullExpressionValue(bVarM2, "just(...)");
            return bVarM2;
        }
        gz7.j.Companion.getClass();
        z zVarD = this.e.a(com.revolut.retail.core.navigation.a.d(new ActivityNavigateCommand(gz7.b.f147942b, new RenewalDetailsContract$Configuration(), null, null, 0, null, null, null, null, false, 1020))).D(Boolean.TRUE);
        Intrinsics.checkNotNullExpressionValue(zVarD, "toSingleDefault(...)");
        return zVarD;
    }
}

package zx7;

import com.google.firebase.messaging.t;
import com.revolut.feature.insurance_pet.impl.ui.profile.pet.PetProfileContract$Configuration;
import com.revolut.retail.core.navigation.ActivityNavigateCommand;
import com.revolut.retail.core.navigation.CompositeCommand;
import com.revolut.retail.core.navigation.ExplicitActivityDestination;
import com.revolut.retail.core.navigation.FinishFlowCommand;
import efm.d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pfm.z;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements mm.b, g3l.d {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g3l.a f326069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fx7.f f326070b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f326071c;
    public final ln.a d;
    public final tm.g e;

    public c(g3l.a statusDialogViewConfigurationDispatcher, t actionDelegateFactory, fx7.f interactor, l state, ln.a navigationCommandsDispatcher) {
        Intrinsics.checkNotNullParameter(statusDialogViewConfigurationDispatcher, "statusDialogViewConfigurationDispatcher");
        Intrinsics.checkNotNullParameter(actionDelegateFactory, "actionDelegateFactory");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(navigationCommandsDispatcher, "navigationCommandsDispatcher");
        this.f326069a = statusDialogViewConfigurationDispatcher;
        this.f326070b = interactor;
        this.f326071c = state;
        this.d = navigationCommandsDispatcher;
        this.e = actionDelegateFactory.f(new a(this, 0));
    }

    public final efm.b a(n08.d dVar) {
        n08.i.Companion.getClass();
        ExplicitActivityDestination explicitActivityDestination = n08.c.f210886b;
        l lVar = this.f326071c;
        return this.d.a(new CompositeCommand(FinishFlowCommand.f98647a, com.revolut.retail.core.navigation.a.d(new ActivityNavigateCommand(explicitActivityDestination, dVar != null ? new PetProfileContract$Configuration((String) ((s) lVar).d().get(), dVar) : new PetProfileContract$Configuration((String) ((s) lVar).d().get()), null, null, 0, null, null, null, null, false, 1020))));
    }

    @Override // mm.b
    public final efm.b a3(mm.a aVar) {
        f action = (f) aVar;
        Intrinsics.checkNotNullParameter(action, "action");
        return this.e.a(action);
    }

    @Override // g3l.d
    public final d0 b(k3l.j result) {
        Intrinsics.checkNotNullParameter(result, "result");
        if (!v.k("pet.loss.dialog.id", "policy.cancelled.dialog.id").contains(result.a().getF104385a())) {
            ufm.b bVarM = d0.m(Boolean.FALSE);
            Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
            return bVarM;
        }
        if (result instanceof k3l.g) {
            z zVarD = a(null).D(Boolean.TRUE);
            Intrinsics.checkNotNullExpressionValue(zVarD, "toSingleDefault(...)");
            return zVarD;
        }
        if (result instanceof k3l.h) {
            return Intrinsics.f(((k3l.h) result).f180818a.getF104385a(), "pet.loss.dialog.id") ? a(n08.d.REMOVE_PROFILE).D(Boolean.TRUE) : d0.m(Boolean.FALSE);
        }
        ufm.b bVarM2 = d0.m(Boolean.FALSE);
        Intrinsics.checkNotNullExpressionValue(bVarM2, "just(...)");
        return bVarM2;
    }
}

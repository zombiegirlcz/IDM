package d08;

import a08.k;
import android.os.Parcelable;
import com.google.firebase.messaging.t;
import com.revolut.feature.insurance_pet.impl.ui.planbuilder.PetPlanBuilderFlowContract$PlanBuilderAction;
import com.revolut.feature.insurance_pet.impl.ui.planbuilder.plan.PetPlanBuilderContract$Configuration;
import com.revolut.retail.core.navigation.ActivityNavigateCommand;
import com.revolut.retail.core.navigation.CompositeCommand;
import com.revolut.retail.core.navigation.FinishFlowCommand;
import efm.d0;
import fx7.f;
import g3l.d;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pfm.m;
import pfm.z;
import rfm.f0;
import tm.g;
import vm.e;
import yhm.j;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends e implements mm.b, d {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g3l.a f110324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f110325b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ang.f f110326c;
    public final ln.a d;
    public final Lazy e;

    public b(g3l.a statusDialogViewConfigurationDispatcher, f petInteractor, ang.f userInteractor, fx7.a petAnalyticsInteractor, ln.a navigationCommandsDispatcher, t actionDelegateFactory) {
        Intrinsics.checkNotNullParameter(statusDialogViewConfigurationDispatcher, "statusDialogViewConfigurationDispatcher");
        Intrinsics.checkNotNullParameter(petInteractor, "petInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(petAnalyticsInteractor, "petAnalyticsInteractor");
        Intrinsics.checkNotNullParameter(navigationCommandsDispatcher, "navigationCommandsDispatcher");
        Intrinsics.checkNotNullParameter(actionDelegateFactory, "actionDelegateFactory");
        this.f110324a = statusDialogViewConfigurationDispatcher;
        this.f110325b = petInteractor;
        this.f110326c = userInteractor;
        this.d = navigationCommandsDispatcher;
        this.e = j.b(new cvi.b(actionDelegateFactory, this, 7));
    }

    @Override // mm.b
    public final efm.b a3(mm.a aVar) {
        PetPlanBuilderFlowContract$PlanBuilderAction action = (PetPlanBuilderFlowContract$PlanBuilderAction) aVar;
        Intrinsics.checkNotNullParameter(action, "action");
        return ((g) this.e.getValue()).a(action);
    }

    @Override // g3l.d
    public final d0 b(k3l.j result) {
        Intrinsics.checkNotNullParameter(result, "result");
        if (!Intrinsics.f(result.a().getF104385a(), "PLAN_BUILDER_PENDING_STATUS_VIEW")) {
            ufm.b bVarM = d0.m(Boolean.FALSE);
            Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
            return bVarM;
        }
        if (!(result instanceof k3l.g)) {
            ufm.b bVarM2 = d0.m(Boolean.FALSE);
            Intrinsics.checkNotNullExpressionValue(bVarM2, "just(...)");
            return bVarM2;
        }
        Parcelable f = result.a().getF();
        Intrinsics.i(f, "null cannot be cast to non-null type com.revolut.feature.insurance_pet.impl.ui.planbuilder.PetPlanBuilderFlowContract.PlanBuilderAction");
        PetPlanBuilderFlowContract$PlanBuilderAction petPlanBuilderFlowContract$PlanBuilderAction = (PetPlanBuilderFlowContract$PlanBuilderAction) f;
        k.Companion.getClass();
        f0 f0VarF = this.d.a(new CompositeCommand(new ActivityNavigateCommand(a08.f.f181b, new PetPlanBuilderContract$Configuration.DefaultConfig(petPlanBuilderFlowContract$PlanBuilderAction.f76353a, petPlanBuilderFlowContract$PlanBuilderAction.f76354b, petPlanBuilderFlowContract$PlanBuilderAction.f76355c, petPlanBuilderFlowContract$PlanBuilderAction.d, petPlanBuilderFlowContract$PlanBuilderAction.f), null, null, 0, null, null, null, null, false, 1020), FinishFlowCommand.f98647a)).f(d0.m(Boolean.TRUE));
        Intrinsics.checkNotNullExpressionValue(f0VarF, "andThen(...)");
        return f0VarF;
    }

    @Override // vm.d
    public final d0 d(um.a errorData) {
        Intrinsics.checkNotNullParameter(errorData, "errorData");
        m mVar = m.f235744a;
        Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
        z zVarD = ue0.e.v(mVar).D(Boolean.FALSE);
        Intrinsics.checkNotNullExpressionValue(zVarD, "toSingleDefault(...)");
        return zVarD;
    }
}

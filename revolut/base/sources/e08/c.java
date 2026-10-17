package e08;

import com.google.firebase.messaging.t;
import com.revolut.core.error.data.model.ServerError;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.insurance_pet.impl.R$string;
import com.revolut.feature.insurance_pet.impl.ui.profile.pet.PetProfileContract$Configuration;
import com.revolut.feature.topup_screen.api.config.TopUpConfig;
import com.revolut.feature.topup_screen.api.destination.InitTopUpDestination;
import com.revolut.retail.core.navigation.ActivityNavigateCommand;
import com.revolut.retail.core.navigation.CompositeCommand;
import com.revolut.retail.core.navigation.FinishFlowCommand;
import com.revolut.retail.operation_status.modal_status.StatusViewConfiguration;
import efm.d0;
import fx7.f;
import k3l.j;
import kotlin.jvm.internal.Intrinsics;
import n08.i;
import org.jetbrains.annotations.NotNull;
import sf0.h;
import tm.g;
import uz7.p;
import uz7.q;
import vm.e;
import zh9.u0;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends e implements mm.b, g3l.d {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g3l.a f121458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f121459b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final uz7.a f121460c;
    public final uz7.b d;
    public final h e;
    public final g f;

    public c(g3l.a statusDialogViewConfigurationDispatcher, f petInteractor, uz7.a presentationModel, uz7.b router, h serverErrorParser, t actionDelegateFactory) {
        Intrinsics.checkNotNullParameter(statusDialogViewConfigurationDispatcher, "statusDialogViewConfigurationDispatcher");
        Intrinsics.checkNotNullParameter(petInteractor, "petInteractor");
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
        Intrinsics.checkNotNullParameter(actionDelegateFactory, "actionDelegateFactory");
        this.f121458a = statusDialogViewConfigurationDispatcher;
        this.f121459b = petInteractor;
        this.f121460c = presentationModel;
        this.d = router;
        this.e = serverErrorParser;
        this.f = actionDelegateFactory.f(new a(this, 0));
    }

    @Override // mm.b
    public final efm.b a3(mm.a aVar) {
        d action = (d) aVar;
        Intrinsics.checkNotNullParameter(action, "action");
        return this.f.a(action);
    }

    @Override // g3l.d
    public final d0 b(j result) {
        Intrinsics.checkNotNullParameter(result, "result");
        String f104385a = result.a().getF104385a();
        boolean zF = Intrinsics.f(f104385a, "SUCCESS_STATUS_DIALOG_ID");
        uz7.b bVar = this.d;
        if (!zF) {
            if (Intrinsics.f(f104385a, "NO_FUNDS_ERROR_STATUS_DIALOG_ID")) {
                return result instanceof k3l.h ? ((q) bVar).f284615a.a(u0.f(new InitTopUpDestination(TopUpConfig.Companion.c(TopUpConfig.INSTANCE, null, null, null, null, 31)))).D(Boolean.TRUE) : d0.m(Boolean.FALSE);
            }
            ufm.b bVarM = d0.m(Boolean.FALSE);
            Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
            return bVarM;
        }
        boolean z = result instanceof k3l.g;
        uz7.a aVar = this.f121460c;
        FinishFlowCommand finishFlowCommand = FinishFlowCommand.f98647a;
        if (z) {
            String petId = ((p) aVar).l3();
            q qVar = (q) bVar;
            qVar.getClass();
            Intrinsics.checkNotNullParameter(petId, "petId");
            ln.a aVar2 = qVar.f284615a;
            PetProfileContract$Configuration petProfileContract$Configuration = new PetProfileContract$Configuration(petId);
            i.Companion.getClass();
            return aVar2.a(new CompositeCommand(finishFlowCommand, com.revolut.retail.core.navigation.a.d(new ActivityNavigateCommand(n08.c.f210886b, petProfileContract$Configuration, null, null, 0, null, null, null, null, false, 1020)))).D(Boolean.TRUE);
        }
        if (result instanceof k3l.h) {
            ln.a aVar3 = ((q) bVar).f284615a;
            nx7.g.Companion.getClass();
            return aVar3.a(new CompositeCommand(finishFlowCommand, com.revolut.retail.core.navigation.a.d(new ActivityNavigateCommand(nx7.a.f220445b, null, null, null, 0, null, null, null, null, false, 1022)))).D(Boolean.TRUE);
        }
        if (!(result instanceof k3l.i)) {
            return d0.m(Boolean.FALSE);
        }
        String petId2 = ((p) aVar).l3();
        q qVar2 = (q) bVar;
        qVar2.getClass();
        Intrinsics.checkNotNullParameter(petId2, "petId");
        ln.a aVar4 = qVar2.f284615a;
        PetProfileContract$Configuration petProfileContract$Configuration2 = new PetProfileContract$Configuration(petId2, n08.d.CHANGE_PIC);
        i.Companion.getClass();
        return aVar4.a(new CompositeCommand(finishFlowCommand, com.revolut.retail.core.navigation.a.d(new ActivityNavigateCommand(n08.c.f210886b, petProfileContract$Configuration2, null, null, 0, null, null, null, null, false, 1020)))).D(Boolean.TRUE);
    }

    @Override // vm.d
    public final d0 d(um.a errorData) {
        Intrinsics.checkNotNullParameter(errorData, "errorData");
        if (!(errorData.f281172a instanceof d)) {
            ufm.b bVarM = d0.m(Boolean.FALSE);
            Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
            return bVarM;
        }
        ServerError serverErrorA = this.e.a(errorData.f281173b);
        Integer numValueOf = serverErrorA != null ? Integer.valueOf(serverErrorA.f51362a) : null;
        if (numValueOf != null && numValueOf.intValue() == 1006) {
            return this.f121458a.c0(new StatusViewConfiguration.Error("NO_FUNDS_ERROR_STATUS_DIALOG_ID", new TextLocalisedClause(R$string.pets_onboarding_error_title, null, null, 14), null, new TextLocalisedClause(R$string.pets_onboarding_error_topup_button_title, null, null, 14), null, null, null, 8180)).D(Boolean.TRUE);
        }
        return d0.m(Boolean.FALSE);
    }
}

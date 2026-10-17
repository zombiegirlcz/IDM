package my7;

import android.os.Parcelable;
import com.google.firebase.messaging.t;
import com.revolut.feature.insurance_pet.impl.ui.edit.details.PetEditDetailsContract$ConfirmPetEditUpdateQuoteAction;
import com.revolut.feature.topup_screen.api.config.TopUpConfig;
import com.revolut.feature.topup_screen.api.destination.InitTopUpDestination;
import com.revolut.retail.core.navigation.FinishFlowCommand;
import efm.d0;
import fx7.f;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sf0.h;
import tm.g;
import vm.e;
import yhm.j;
import zh9.u0;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends e implements mm.b, g3l.d {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f210352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ly7.b f210353b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g3l.a f210354c;
    public final h d;
    public final Lazy e;

    public b(f petInteractor, fx7.a petAnalyticsInteractor, ly7.b router, g3l.a statusDialogViewConfigurationDispatcher, h serverErrorParser, t actionDelegateFactory) {
        Intrinsics.checkNotNullParameter(petInteractor, "petInteractor");
        Intrinsics.checkNotNullParameter(petAnalyticsInteractor, "petAnalyticsInteractor");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(statusDialogViewConfigurationDispatcher, "statusDialogViewConfigurationDispatcher");
        Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
        Intrinsics.checkNotNullParameter(actionDelegateFactory, "actionDelegateFactory");
        this.f210352a = petInteractor;
        this.f210353b = router;
        this.f210354c = statusDialogViewConfigurationDispatcher;
        this.d = serverErrorParser;
        this.e = j.b(new mhd.b(actionDelegateFactory, this, 27));
    }

    @Override // mm.b
    public final efm.b a3(mm.a aVar) {
        PetEditDetailsContract$ConfirmPetEditUpdateQuoteAction action = (PetEditDetailsContract$ConfirmPetEditUpdateQuoteAction) aVar;
        Intrinsics.checkNotNullParameter(action, "action");
        return ((g) this.e.getValue()).a(action);
    }

    @Override // g3l.d
    public final d0 b(k3l.j result) {
        Intrinsics.checkNotNullParameter(result, "result");
        String f104385a = result.a().getF104385a();
        int iHashCode = f104385a.hashCode();
        ly7.b bVar = this.f210353b;
        if (iHashCode != 974813131) {
            FinishFlowCommand finishFlowCommand = FinishFlowCommand.f98647a;
            if (iHashCode != 1261570113) {
                if (iHashCode == 1690656762 && f104385a.equals("ON_OVERDUE_PAYMENT_DIALOG_ID")) {
                    return result instanceof k3l.g ? ((ly7.j) bVar).f200737a.a(finishFlowCommand).D(Boolean.TRUE) : d0.m(Boolean.FALSE);
                }
            } else if (f104385a.equals("SUCCESS_STATUS_DIALOG_ID")) {
                return ((result instanceof k3l.h) || (result instanceof k3l.g)) ? ((ly7.j) bVar).f200737a.a(finishFlowCommand).D(Boolean.TRUE) : d0.m(Boolean.FALSE);
            }
        } else if (f104385a.equals("NO_FUNDS_ERROR_STATUS_DIALOG_ID")) {
            if (!(result instanceof k3l.h)) {
                return d0.m(Boolean.FALSE);
            }
            Parcelable f = ((k3l.h) result).f180818a.getF();
            Intrinsics.i(f, "null cannot be cast to non-null type com.revolut.feature.insurance_pet.impl.ui.edit.details.PetEditDetailsContract.ConfirmPetEditUpdateQuoteAction");
            dj0.d preFilledAmount = ((PetEditDetailsContract$ConfirmPetEditUpdateQuoteAction) f).d;
            ly7.j jVar = (ly7.j) bVar;
            jVar.getClass();
            Intrinsics.checkNotNullParameter(preFilledAmount, "preFilledAmount");
            return jVar.f200737a.a(u0.f(new InitTopUpDestination(TopUpConfig.Companion.a(TopUpConfig.INSTANCE, preFilledAmount, null, null, 30)))).D(Boolean.TRUE);
        }
        ufm.b bVarM = d0.m(Boolean.FALSE);
        Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
        return bVarM;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0096  */
    @Override // vm.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final efm.d0 d(um.a r13) throws java.io.IOException {
        /*
            r12 = this;
            java.lang.String r0 = "errorData"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            mm.a r0 = r13.f281172a
            boolean r0 = r0 instanceof com.revolut.feature.insurance_pet.impl.ui.edit.details.PetEditDetailsContract$ConfirmPetEditUpdateQuoteAction
            if (r0 == 0) goto La4
            java.lang.Throwable r0 = r13.f281173b
            boolean r1 = r0 instanceof retrofit2.HttpException
            if (r1 == 0) goto L9d
            retrofit2.HttpException r0 = (retrofit2.HttpException) r0
            int r1 = r0.code()
            r2 = 422(0x1a6, float:5.91E-43)
            if (r1 != r2) goto L9d
            sf0.h r1 = r12.d
            com.revolut.core.error.data.model.ServerError r0 = r1.c(r0)
            r1 = 0
            if (r0 == 0) goto L2b
            int r0 = r0.f51362a
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L2c
        L2b:
            r0 = r1
        L2c:
            r2 = 14
            if (r0 != 0) goto L31
            goto L5f
        L31:
            int r3 = r0.intValue()
            r4 = 1006(0x3ee, float:1.41E-42)
            if (r3 != r4) goto L5f
            mm.a r13 = r13.f281172a
            java.lang.String r0 = "null cannot be cast to non-null type com.revolut.feature.insurance_pet.impl.ui.edit.details.PetEditDetailsContract.ConfirmPetEditUpdateQuoteAction"
            kotlin.jvm.internal.Intrinsics.i(r13, r0)
            r9 = r13
            com.revolut.feature.insurance_pet.impl.ui.edit.details.PetEditDetailsContract$ConfirmPetEditUpdateQuoteAction r9 = (com.revolut.feature.insurance_pet.impl.ui.edit.details.PetEditDetailsContract$ConfirmPetEditUpdateQuoteAction) r9
            com.revolut.retail.operation_status.modal_status.StatusViewConfiguration$Error r3 = new com.revolut.retail.operation_status.modal_status.StatusViewConfiguration$Error
            com.revolut.core.ui_kit.models.TextLocalisedClause r5 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r13 = com.revolut.feature.insurance_pet.impl.R$string.pets_pet_details_editing_failure_no_funds_error_title
            r5.<init>(r13, r1, r1, r2)
            com.revolut.core.ui_kit.models.TextLocalisedClause r7 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r13 = com.revolut.feature.insurance_pet.impl.R$string.pets_pet_details_editing_failure_topup_button_title
            r7.<init>(r13, r1, r1, r2)
            r10 = 0
            r11 = 8116(0x1fb4, float:1.1373E-41)
            java.lang.String r4 = "NO_FUNDS_ERROR_STATUS_DIALOG_ID"
            r6 = 0
            r8 = 0
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
        L5d:
            r1 = r3
            goto L87
        L5f:
            if (r0 != 0) goto L62
            goto L87
        L62:
            int r13 = r0.intValue()
            r0 = 100001(0x186a1, float:1.40131E-40)
            if (r13 != r0) goto L87
            com.revolut.retail.operation_status.modal_status.StatusViewConfiguration$Error r3 = new com.revolut.retail.operation_status.modal_status.StatusViewConfiguration$Error
            com.revolut.core.ui_kit.models.TextLocalisedClause r5 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r13 = com.revolut.feature.insurance_pet.impl.R$string.pets_pet_details_editing_failure_overdue_payment_title
            r5.<init>(r13, r1, r1, r2)
            com.revolut.core.ui_kit.models.TextLocalisedClause r6 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r13 = com.revolut.feature.insurance_pet.impl.R$string.pets_pet_details_editing_failure_overdue_payment_subtitle
            r6.<init>(r13, r1, r1, r2)
            r10 = 0
            r11 = 8184(0x1ff8, float:1.1468E-41)
            java.lang.String r4 = "ON_OVERDUE_PAYMENT_DIALOG_ID"
            r7 = 0
            r8 = 0
            r9 = 0
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            goto L5d
        L87:
            if (r1 == 0) goto L96
            g3l.a r13 = r12.f210354c
            efm.b r13 = r13.c0(r1)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            pfm.z r13 = r13.D(r0)
            return r13
        L96:
            java.lang.Boolean r13 = java.lang.Boolean.FALSE
            ufm.b r13 = efm.d0.m(r13)
            return r13
        L9d:
            java.lang.Boolean r13 = java.lang.Boolean.FALSE
            ufm.b r13 = efm.d0.m(r13)
            return r13
        La4:
            java.lang.Boolean r13 = java.lang.Boolean.FALSE
            ufm.b r13 = efm.d0.m(r13)
            java.lang.String r0 = "just(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r13, r0)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: my7.b.d(um.a):efm.d0");
    }
}

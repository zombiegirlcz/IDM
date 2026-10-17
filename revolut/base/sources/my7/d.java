package my7;

import android.os.Parcelable;
import ang.f;
import com.google.firebase.messaging.t;
import com.revolut.core.error.data.model.ServerError;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.insurance_pet.impl.R$string;
import com.revolut.feature.insurance_pet.impl.ui.edit.details.PetEditDetailsContract$UpdateQuoteAction;
import com.revolut.feature.insurance_pet.impl.ui.edit.planeditor.PetEditQuoteContract$Configuration;
import com.revolut.retail.core.navigation.ActivityNavigateCommand;
import com.revolut.retail.core.navigation.FinishFlowCommand;
import com.revolut.retail.operation_status.modal_status.StatusViewConfiguration;
import efm.d0;
import fx7.l;
import java.io.IOException;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import mx0.bc;
import mx0.oc;
import org.jetbrains.annotations.NotNull;
import retrofit2.HttpException;
import ry7.q;
import sf0.h;
import tm.g;
import ufm.i;
import vm.e;
import yhm.j;
import zhm.h0;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends e implements mm.b, g3l.d {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g3l.a f210355a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f210356b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f210357c;
    public final fx7.f d;
    public final ly7.b e;
    public final ly7.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final h f210358g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Lazy f210359h;

    public d(g3l.a statusDialogViewConfigurationDispatcher, l quoteInteractor, f userInteractor, fx7.f petInteractor, fx7.a petAnalyticsInteractor, ly7.b router, ly7.c state, q petEditQuotesConfigurator, h serverErrorParser, t actionDelegateFactory) {
        Intrinsics.checkNotNullParameter(statusDialogViewConfigurationDispatcher, "statusDialogViewConfigurationDispatcher");
        Intrinsics.checkNotNullParameter(quoteInteractor, "quoteInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(petInteractor, "petInteractor");
        Intrinsics.checkNotNullParameter(petAnalyticsInteractor, "petAnalyticsInteractor");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(petEditQuotesConfigurator, "petEditQuotesConfigurator");
        Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
        Intrinsics.checkNotNullParameter(actionDelegateFactory, "actionDelegateFactory");
        this.f210355a = statusDialogViewConfigurationDispatcher;
        this.f210356b = quoteInteractor;
        this.f210357c = userInteractor;
        this.d = petInteractor;
        this.e = router;
        this.f = state;
        this.f210358g = serverErrorParser;
        this.f210359h = j.b(new mhd.b(actionDelegateFactory, this, 29));
    }

    @Override // mm.b
    public final efm.b a3(mm.a aVar) {
        PetEditDetailsContract$UpdateQuoteAction action = (PetEditDetailsContract$UpdateQuoteAction) aVar;
        Intrinsics.checkNotNullParameter(action, "action");
        return ((g) this.f210359h.getValue()).a(action);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // g3l.d
    public final d0 b(k3l.j result) {
        Intrinsics.checkNotNullParameter(result, "result");
        String f104385a = result.a().getF104385a();
        int iHashCode = f104385a.hashCode();
        ly7.b bVar = this.e;
        switch (iHashCode) {
            case -2083816160:
                if (f104385a.equals("UPDATING_MULTIPLE_QUOTES_STATUS_VIEW")) {
                    if (!(result instanceof k3l.g)) {
                        return d0.m(Boolean.FALSE);
                    }
                    Parcelable f = ((k3l.g) result).f180817a.getF();
                    Intrinsics.i(f, "null cannot be cast to non-null type com.revolut.feature.insurance_pet.impl.ui.edit.details.PetEditDetailsContract.UpdateQuoteAction");
                    String petId = ((PetEditDetailsContract$UpdateQuoteAction) f).f76296a.f76291a;
                    if (petId == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    ly7.j jVar = (ly7.j) bVar;
                    jVar.getClass();
                    Intrinsics.checkNotNullParameter(petId, "petId");
                    ln.a aVar = jVar.f200737a;
                    ry7.e.Companion.getClass();
                    return aVar.a(new ActivityNavigateCommand(ry7.b.f258241b, new PetEditQuoteContract$Configuration(petId), null, null, 0, null, null, null, null, false, 1020)).D(Boolean.TRUE);
                }
                break;
            case -2082103279:
                if (f104385a.equals("UPDATING_SINGLE_QUOTE_STATUS_VIEW")) {
                    if (!(result instanceof k3l.g)) {
                        return d0.m(Boolean.FALSE);
                    }
                    Parcelable f4 = ((k3l.g) result).f180817a.getF();
                    Intrinsics.i(f4, "null cannot be cast to non-null type com.revolut.feature.insurance_pet.impl.ui.edit.details.PetEditDetailsContract.UpdateQuoteAction");
                    String str = ((PetEditDetailsContract$UpdateQuoteAction) f4).f76296a.f76291a;
                    if (str != null) {
                        return ((ly7.j) bVar).c(str).D(Boolean.TRUE);
                    }
                    throw new IllegalArgumentException("Required value was null.");
                }
                break;
            case 177756705:
                if (f104385a.equals("SUCCESSFUL_UPDATE_STATUS_VIEW")) {
                    if (!(result instanceof k3l.g)) {
                        return d0.m(Boolean.FALSE);
                    }
                    Parcelable f5 = ((k3l.g) result).f180817a.getF();
                    Intrinsics.i(f5, "null cannot be cast to non-null type com.revolut.feature.insurance_pet.impl.ui.edit.details.PetEditDetailsContract.UpdateQuoteAction");
                    return ((ly7.j) bVar).b(((PetEditDetailsContract$UpdateQuoteAction) f5).f76296a).D(Boolean.TRUE);
                }
                break;
            case 941190243:
                if (f104385a.equals("ON_OVERDUE_PAYMENT_ERROR_DIALOG_ID")) {
                    return result instanceof k3l.g ? ((ly7.j) bVar).f200737a.a(FinishFlowCommand.f98647a).D(Boolean.TRUE) : d0.m(Boolean.FALSE);
                }
                break;
        }
        ufm.b bVarM = d0.m(Boolean.FALSE);
        Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
        return bVarM;
    }

    @Override // vm.d
    public final d0 d(um.a errorData) throws IOException {
        Intrinsics.checkNotNullParameter(errorData, "errorData");
        if (!(errorData.f281172a instanceof PetEditDetailsContract$UpdateQuoteAction)) {
            ufm.b bVarM = d0.m(Boolean.FALSE);
            Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
            return bVarM;
        }
        Throwable th10 = errorData.f281173b;
        if (th10 instanceof HttpException) {
            HttpException httpException = (HttpException) th10;
            if (httpException.code() == 422) {
                ServerError serverErrorC = this.f210358g.c(httpException);
                StatusViewConfiguration.Error error = null;
                Integer numValueOf = serverErrorC != null ? Integer.valueOf(serverErrorC.f51362a) : null;
                if (numValueOf != null && numValueOf.intValue() == 100001) {
                    error = new StatusViewConfiguration.Error("ON_OVERDUE_PAYMENT_ERROR_DIALOG_ID", new TextLocalisedClause(R$string.pets_pet_details_editing_failure_overdue_payment_title, null, null, 14), new TextLocalisedClause(R$string.pets_pet_details_editing_failure_overdue_payment_subtitle, null, null, 14), null, null, null, null, 8184);
                }
                return error != null ? this.f210355a.c0(error).D(Boolean.TRUE) : d0.m(Boolean.FALSE);
            }
        }
        return d0.m(Boolean.FALSE);
    }

    public final pfm.a e(PetEditDetailsContract$UpdateQuoteAction petEditDetailsContract$UpdateQuoteAction, boolean z) {
        i iVar = new i(this.f210357c.d.c().o(), new bc(new oc(7), 20), 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        pfm.a aVar = new pfm.a(ue0.e.I(iVar, h0.f322473a, new oc(8)), new bc(new l1.e(this, z, petEditDetailsContract$UpdateQuoteAction, 15), 19), 4);
        Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
        return aVar;
    }
}

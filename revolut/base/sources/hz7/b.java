package hz7;

import android.os.Parcelable;
import com.google.firebase.messaging.t;
import com.revolut.feature.insurance_pet.impl.ui.hub.issues.renewal.action.PetRenewalActionContract$RenewalOptInAction;
import com.revolut.retail.core.navigation.NaviCommand;
import efm.d0;
import fx7.f;
import fx7.g;
import fx7.l;
import g3l.d;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yhm.j;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements mm.b, d {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f157053a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f157054b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f157055c;
    public final g3l.a d;
    public final ln.a e;
    public final Lazy f;

    public b(f petInteractor, g petIssueInteractor, l petQuoteInteractor, g3l.a statusDialogViewConfigurationDispatcher, ln.a navigationCommandsDispatcher, t actionDelegateFactory) {
        Intrinsics.checkNotNullParameter(petInteractor, "petInteractor");
        Intrinsics.checkNotNullParameter(petIssueInteractor, "petIssueInteractor");
        Intrinsics.checkNotNullParameter(petQuoteInteractor, "petQuoteInteractor");
        Intrinsics.checkNotNullParameter(statusDialogViewConfigurationDispatcher, "statusDialogViewConfigurationDispatcher");
        Intrinsics.checkNotNullParameter(navigationCommandsDispatcher, "navigationCommandsDispatcher");
        Intrinsics.checkNotNullParameter(actionDelegateFactory, "actionDelegateFactory");
        this.f157053a = petInteractor;
        this.f157054b = petIssueInteractor;
        this.f157055c = petQuoteInteractor;
        this.d = statusDialogViewConfigurationDispatcher;
        this.e = navigationCommandsDispatcher;
        this.f = j.b(new hl6.b(actionDelegateFactory, this, 24));
    }

    @Override // mm.b
    public final efm.b a3(mm.a aVar) {
        PetRenewalActionContract$RenewalOptInAction action = (PetRenewalActionContract$RenewalOptInAction) aVar;
        Intrinsics.checkNotNullParameter(action, "action");
        return ((tm.g) this.f.getValue()).a(action);
    }

    @Override // g3l.d
    public final d0 b(k3l.j result) {
        Intrinsics.checkNotNullParameter(result, "result");
        if (!Intrinsics.f(result.a().getF104385a(), "SUCCESSFUL_OPT_IN_FOR_RENEWAL_STATUS_VIEW")) {
            ufm.b bVarM = d0.m(Boolean.FALSE);
            Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
            return bVarM;
        }
        if (!(result instanceof k3l.g)) {
            return d0.m(Boolean.FALSE);
        }
        Parcelable f = ((k3l.g) result).f180817a.getF();
        Intrinsics.i(f, "null cannot be cast to non-null type com.revolut.feature.insurance_pet.impl.ui.hub.issues.renewal.action.PetRenewalActionContract.RenewalOptInAction");
        NaviCommand naviCommand = ((PetRenewalActionContract$RenewalOptInAction) f).e;
        return naviCommand != null ? this.e.a(naviCommand).D(Boolean.TRUE) : d0.m(Boolean.TRUE);
    }
}

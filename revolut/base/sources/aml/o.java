package aml;

import aw0.n6;
import com.google.android.gms.location.GeofenceStatusCodes;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.sso.api.R$string;
import com.revolut.sso.impl.ui.consent.common.consent_screen.ConsentScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class o implements cli.n {

    @NotNull
    public static final n Companion = new n();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConsentScreenContract$InputData f6485a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vil.g f6486b;

    public o(ConsentScreenContract$InputData inputData, vil.g consentScreenStateMapperHelper, l80.e dateProvider) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(consentScreenStateMapperHelper, "consentScreenStateMapperHelper");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f6485a = inputData;
        this.f6486b = consentScreenStateMapperHelper;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        cli.k domainState = (cli.k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        ConsentScreenContract$InputData consentScreenContract$InputData = this.f6485a;
        return new h(((m) this.f6486b).b(consentScreenContract$InputData.f106454a, true), new aw0.g(new n6(new TextLocalisedClause(R$string.revolut_sso_login_confirmation_reject, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, "LOADING_TAG_BUTTON_REJECT", false, null, null, GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION), new n6(new TextLocalisedClause(R$string.revolut_sso_common_actions_confirm, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, "LOADING_TAG_BUTTON_CONTINUE", consentScreenContract$InputData.f106454a.getF105925b() - System.currentTimeMillis() > 0, null, null, 972), (Clause) null, (aw0.f) null, 25));
    }
}

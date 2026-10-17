package slj;

import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.retail.feature.esim.api.model.EsimHyperText;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPortingPowerOfAttorneyTerms;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPortingServiceProvider;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.power_of_attorney.terms.EsimMobilePlanPowerOfAttorneyTermsScreenContract$InputData;
import dej.y0;
import ip0.iq;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class m implements n {

    @NotNull
    public static final l Companion = new l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EsimMobilePlanPowerOfAttorneyTermsScreenContract$InputData f264221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wnj.a f264222b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qhj.e f264223c;

    public m(EsimMobilePlanPowerOfAttorneyTermsScreenContract$InputData inputData, wnj.a descriptorApplier, qhj.e phoneNumberFormatter) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(descriptorApplier, "descriptorApplier");
        Intrinsics.checkNotNullParameter(phoneNumberFormatter, "phoneNumberFormatter");
        this.f264221a = inputData;
        this.f264222b = descriptorApplier;
        this.f264223c = phoneNumberFormatter;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        y0 y0Var = y0.PHONE_NUMBER;
        EsimMobilePlanPowerOfAttorneyTermsScreenContract$InputData esimMobilePlanPowerOfAttorneyTermsScreenContract$InputData = this.f264221a;
        String str = esimMobilePlanPowerOfAttorneyTermsScreenContract$InputData.f101358b;
        EsimPhoneNumberPortingPowerOfAttorneyTerms esimPhoneNumberPortingPowerOfAttorneyTerms = esimMobilePlanPowerOfAttorneyTermsScreenContract$InputData.d;
        Pair pair = new Pair(y0Var, this.f264223c.a(str));
        y0 y0Var2 = y0.CARRIER;
        EsimPhoneNumberPortingServiceProvider esimPhoneNumberPortingServiceProvider = esimMobilePlanPowerOfAttorneyTermsScreenContract$InputData.f101359c.f100592a.f100580a;
        Map mapQ = foh.i.q(pair, new Pair(y0Var2, esimPhoneNumberPortingServiceProvider != null ? esimPhoneNumberPortingServiceProvider.f100398b : null));
        EsimHyperText esimHyperText = esimPhoneNumberPortingPowerOfAttorneyTerms.f100379a;
        EsimHyperText esimHyperText2 = esimPhoneNumberPortingPowerOfAttorneyTerms.f100380b;
        wnj.a aVar = this.f264222b;
        InputChecklistDelegate.Model model = esimHyperText != null ? new InputChecklistDelegate.Model("ID_POWER_OF_ATTORNEY_TERMS", aVar.b(esimHyperText.f100276a, esimHyperText.f100277b, esimHyperText.f100278c, mapQ, null), domainState.f264210a, true, new InputChecklistDelegate.a.b(null), iq.CHECK_BUTTON, null, null, null, null, 0, 0, R$attr.uikit_dp8, 516032) : null;
        InputChecklistDelegate.Model model2 = esimHyperText2 != null ? new InputChecklistDelegate.Model("ID_EARLY_TERMINATION_TERMS", aVar.b(esimHyperText2.f100276a, esimHyperText2.f100277b, esimHyperText2.f100278c, mapQ, null), domainState.f264211b, true, new InputChecklistDelegate.a.b(null), iq.CHECK_BUTTON, null, null, null, null, 0, 0, R$attr.uikit_dp8, 516032) : null;
        boolean z = false;
        qv0.i[] elements = {model, model2};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        yp0.b.k(listL, 0, 0, 0, 0, 31);
        if ((domainState.f264211b || esimHyperText2 == null) && (domainState.f264210a || esimPhoneNumberPortingPowerOfAttorneyTerms.f100379a == null)) {
            z = true;
        }
        return new i(listL, z);
    }
}

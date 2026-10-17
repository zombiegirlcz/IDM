package kkj;

import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.retail.feature.esim.api.model.EsimGiftRecipient;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberSelectionOptions;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberSelections;
import com.revolut.retail.feature.esim.impl.R$string;
import ke7.v;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes11.dex */
public final class s implements cli.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nkj.c f185096a;

    public s(nkj.c esimMobilePlanMyNumbersSectionsBuilder, nkj.b esimMobilePlanMyNumbersActionSectionBuilder) {
        Intrinsics.checkNotNullParameter(esimMobilePlanMyNumbersSectionsBuilder, "esimMobilePlanMyNumbersSectionsBuilder");
        Intrinsics.checkNotNullParameter(esimMobilePlanMyNumbersActionSectionBuilder, "esimMobilePlanMyNumbersActionSectionBuilder");
        this.f185096a = esimMobilePlanMyNumbersSectionsBuilder;
    }

    public static g a(EsimPhoneNumberSelections esimPhoneNumberSelections, EsimGiftRecipient esimGiftRecipient) {
        EsimPhoneNumberSelectionOptions esimPhoneNumberSelectionOptions;
        TextLocalisedClause textLocalisedClause = null;
        TextLocalisedClause textLocalisedClause2 = esimGiftRecipient == null ? new TextLocalisedClause(R$string.esim_mobile_plans_my_numbers_title, null, null, 14) : new TextLocalisedClause(R$string.esim_mobile_plans_recipient_numbers_title, u.c(esimGiftRecipient.d), null, 12);
        if (esimGiftRecipient == null) {
            if (((esimPhoneNumberSelections == null || (esimPhoneNumberSelectionOptions = esimPhoneNumberSelections.f100408b) == null) ? null : esimPhoneNumberSelectionOptions.f100405b) != null) {
                textLocalisedClause = new TextLocalisedClause(R$string.esim_mobile_plans_my_numbers_subtitle, null, new Custom(Integer.valueOf(R$attr.uikit_colorGrey50), false, null, false, null, 254), 10);
            }
        }
        return new g(textLocalisedClause2, textLocalisedClause);
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        f domainState = (f) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (m) iii.c.f(t1.t(domainState.f185071b, domainState.f185070a), new v(this, domainState), new kj4.c(this, domainState), new joa.j(this, domainState, 25));
    }
}

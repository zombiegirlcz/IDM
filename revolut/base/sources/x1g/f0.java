package x1g;

import aw0.o9;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.travel.experiences.api.R$string;
import com.revolut.feature.travel.experiences.impl.ui.screen.checkout.TravelExperiencesCheckoutScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class f0 implements cli.n {

    @NotNull
    public static final d0 Companion = new d0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelExperiencesCheckoutScreenContract$InputData f302414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b1g.c f302415b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g0 f302416c;
    public final z1g.d d;
    public final dec.q e;

    public f0(TravelExperiencesCheckoutScreenContract$InputData inputData, b1g.c dateFormatter, z1g.b revPointsOptionsSectionMapper, z1g.c revPointsPaymentSummarySectionMapper, g0 travelExperiencesTermsMapper, z1g.d visitorInformationSectionMapper, dec.q paymentMethodsCommonMapper, z1g.a exchangedAmountMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(dateFormatter, "dateFormatter");
        Intrinsics.checkNotNullParameter(revPointsOptionsSectionMapper, "revPointsOptionsSectionMapper");
        Intrinsics.checkNotNullParameter(revPointsPaymentSummarySectionMapper, "revPointsPaymentSummarySectionMapper");
        Intrinsics.checkNotNullParameter(travelExperiencesTermsMapper, "travelExperiencesTermsMapper");
        Intrinsics.checkNotNullParameter(visitorInformationSectionMapper, "visitorInformationSectionMapper");
        Intrinsics.checkNotNullParameter(paymentMethodsCommonMapper, "paymentMethodsCommonMapper");
        Intrinsics.checkNotNullParameter(exchangedAmountMapper, "exchangedAmountMapper");
        this.f302414a = inputData;
        this.f302415b = dateFormatter;
        this.f302416c = travelExperiencesTermsMapper;
        this.d = visitorInformationSectionMapper;
        this.e = paymentMethodsCommonMapper;
    }

    public static TextLocalisedClause a(i iVar) {
        return p.b(iVar) ? new TextLocalisedClause(R$string.experiences_checkout_pay_button_title, zhm.u.c(new MoneyClause(p.a(iVar), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, o9.NON_SENSITIVE, 4)), null, 12) : new TextLocalisedClause(R$string.experiences_checkout_button_pay_title, null, null, 14);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List b(com.revolut.feature.travel.experiences.api.models.booking.TravelExperiencesBookingContactDetails r39, java.util.List r40, java.util.List r41) {
        /*
            Method dump skipped, instruction units count: 889
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x1g.f0.b(com.revolut.feature.travel.experiences.api.models.booking.TravelExperiencesBookingContactDetails, java.util.List, java.util.List):java.util.List");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:160:0x07e1  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x081d  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x082d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0145  */
    @Override // cli.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final cli.o c(cli.j r64) {
        /*
            Method dump skipped, instruction units count: 3120
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x1g.f0.c(cli.j):cli.o");
    }
}

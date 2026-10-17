package om4;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.core.R$string;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class u0 implements al4.l {

    @NotNull
    private static final p0 Companion = new p0();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Set f226706h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f226707a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xq3.w f226708b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final al4.p f226709c;
    public final al4.u d;
    public final al4.c e;
    public final xq3.u f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final cm4.h f226710g;

    static {
        fs3.b[] elements = {fs3.b.CREDIT_CARD, fs3.b.BALANCE_TRANSFER_CREDIT_CARD, fs3.b.SECURED_CREDIT_CARD, fs3.b.CREDIT_BUILDER_CARD};
        Intrinsics.checkNotNullParameter(elements, "elements");
        f226706h = kotlin.collections.d.y0(elements);
    }

    public u0(gte.a featureToggleInteractor, xq3.w creditPrimaryEntryPointsInteractor, al4.p creditCardProductFeatureTogglesInteractor, al4.u securedCreditCardProductFeatureTogglesInteractor, al4.c creditBuilderCardProductFeatureTogglesInteractor, xq3.u creditMarketingAvailabilityInteractor, cm4.h creditCardProductMapper) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(creditPrimaryEntryPointsInteractor, "creditPrimaryEntryPointsInteractor");
        Intrinsics.checkNotNullParameter(creditCardProductFeatureTogglesInteractor, "creditCardProductFeatureTogglesInteractor");
        Intrinsics.checkNotNullParameter(securedCreditCardProductFeatureTogglesInteractor, "securedCreditCardProductFeatureTogglesInteractor");
        Intrinsics.checkNotNullParameter(creditBuilderCardProductFeatureTogglesInteractor, "creditBuilderCardProductFeatureTogglesInteractor");
        Intrinsics.checkNotNullParameter(creditMarketingAvailabilityInteractor, "creditMarketingAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(creditCardProductMapper, "creditCardProductMapper");
        this.f226707a = featureToggleInteractor;
        this.f226708b = creditPrimaryEntryPointsInteractor;
        this.f226709c = creditCardProductFeatureTogglesInteractor;
        this.d = securedCreditCardProductFeatureTogglesInteractor;
        this.e = creditBuilderCardProductFeatureTogglesInteractor;
        this.f = creditMarketingAvailabilityInteractor;
        this.f226710g = creditCardProductMapper;
    }

    public static int a(fs3.b bVar) {
        int i = q0.f226666a[bVar.ordinal()];
        return (i == 1 || i == 2 || i == 3) ? R$drawable.uikit_icn_24_credit_card : i != 4 ? R$drawable.uikit_icn_24_refinancing_card : R$drawable.uikit_icn_24_refinancing_card;
    }

    public static TextLocalisedClause b(fs3.b bVar) {
        int i = q0.f226666a[bVar.ordinal()];
        return i != 1 ? (i == 2 || i == 3) ? new TextLocalisedClause(l9.l.h(fs3.b.Companion, bVar).f137583a, null, null, 14) : i != 4 ? new TextLocalisedClause(R$string.credit_card_balance_transfer_entry_point_title, null, null, 14) : new TextLocalisedClause(R$string.credit_card_balance_transfer_entry_point_title, null, null, 14) : new TextLocalisedClause(R$string.credit_card_common_product_name, null, null, 14);
    }

    public static al4.k c(fs3.b bVar) {
        fs3.g gVarH = l9.l.h(fs3.b.Companion, bVar);
        return new al4.k(bVar, R$drawable.uikit_icn_24_credit_card, new TextLocalisedClause(gVarH.f137583a, gVarH.f137584b, null, 12), new TextLocalisedClause(gVarH.f137585c, gVarH.d, null, 12));
    }
}

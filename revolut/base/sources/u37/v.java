package u37;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.feature.freelancer.impl.R$string;
import com.revolut.feature.freelancer.impl.ui.tax_hub.profile.create.TaxHubCreateProfileScreenContract$InputData;
import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import org.jetbrains.annotations.NotNull;
import zhm.h0;

/* JADX INFO: loaded from: classes3.dex */
public final class v {

    @NotNull
    public static final t Companion = new t();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TaxHubCreateProfileScreenContract$InputData f276813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l80.e f276814b;

    public v(TaxHubCreateProfileScreenContract$InputData inputData, w37.b taxPeriodClauseFactory, l80.e dateProvider) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(taxPeriodClauseFactory, "taxPeriodClauseFactory");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f276813a = inputData;
        this.f276814b = dateProvider;
    }

    public static TextLocalisedClause a() {
        return new TextLocalisedClause(R$string.freelancer_tax_profile_setup_action_continue, null, null, 14);
    }

    public final Clause b(wi0.b countryCode) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        TaxHubCreateProfileScreenContract$InputData taxHubCreateProfileScreenContract$InputData = this.f276813a;
        if (taxHubCreateProfileScreenContract$InputData.f74340c == ds6.j.VAT) {
            wi0.b.Companion.getClass();
            if (countryCode.equals(wi0.b.p0)) {
                return new TextLocalisedClause(R$string.freelancer_tax_profile_setup_closing_month_dropdown_title_vat_gb, null, null, 14);
            }
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("No closing month title supported for " + countryCode.f297794a + "-" + taxHubCreateProfileScreenContract$InputData.f74340c);
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var);
        m70.a.c(t0.f186434a);
        return new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
    }

    public final TimeClause c(Month month) {
        Intrinsics.checkNotNullParameter(month, "month");
        LocalDate localDateOf = LocalDate.of(((l80.f) this.f276814b).j(), month.getValue(), 1);
        Intrinsics.checkNotNullExpressionValue(localDateOf, "of(...)");
        return new TimeClause(oc.c.F(localDateOf), new TimeClause.Format.Month(0), null, null, 12);
    }

    public final Clause d(wi0.b countryCode) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        int i = u.f276812a[this.f276813a.f74340c.ordinal()];
        if (i == 1) {
            wi0.b.Companion.getClass();
            if (countryCode.equals(wi0.b.f297750h0)) {
                return new TextLocalisedClause(R$string.freelancer_tax_profile_setup_frequency_dropdown_title_income_es, null, null, 14);
            }
            if (countryCode.equals(wi0.b.f297760n0)) {
                return new TextLocalisedClause(R$string.freelancer_tax_profile_setup_frequency_dropdown_title_income_fr, null, null, 14);
            }
            if (countryCode.equals(wi0.b.p0)) {
                return new TextLocalisedClause(R$string.freelancer_tax_profile_setup_frequency_dropdown_title_income_gb, null, null, 14);
            }
            if (countryCode.equals(wi0.b.T0)) {
                return new TextLocalisedClause(R$string.freelancer_tax_profile_setup_frequency_dropdown_title_income_it, null, null, 14);
            }
            m70.a.c(t0.f186434a);
            return new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        }
        if (i == 2) {
            wi0.b.Companion.getClass();
            if (countryCode.equals(wi0.b.f297760n0)) {
                return new TextLocalisedClause(R$string.freelancer_tax_profile_setup_frequency_dropdown_title_social_security_fr, null, null, 14);
            }
            m70.a.c(t0.f186434a);
            return new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        wi0.b.Companion.getClass();
        if (countryCode.equals(wi0.b.f297750h0)) {
            return new TextLocalisedClause(R$string.freelancer_tax_profile_setup_frequency_dropdown_title_vat_es, null, null, 14);
        }
        if (countryCode.equals(wi0.b.p0)) {
            return new TextLocalisedClause(R$string.freelancer_tax_profile_setup_frequency_dropdown_title_vat_gb, null, null, 14);
        }
        if (countryCode.equals(wi0.b.L0)) {
            return new TextLocalisedClause(R$string.freelancer_tax_profile_setup_frequency_dropdown_title_vat_ie, null, null, 14);
        }
        if (countryCode.equals(wi0.b.T0)) {
            return new TextLocalisedClause(R$string.freelancer_tax_profile_setup_frequency_dropdown_title_vat_it, null, null, 14);
        }
        m70.a.c(t0.f186434a);
        return new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
    }
}

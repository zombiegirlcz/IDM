package com.revolut.feature.giro.impl.ui.form;

import b77.j;
import b77.n;
import b77.o;
import cli.y;
import com.revolut.feature.apm.bills.billers.api.model.Biller;
import com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationSummary;
import com.revolut.feature.apm.core.models.payments_authorisations.Creditor;
import com.revolut.feature.apm.core.models.payments_authorisations.PaymentMethodDetails;
import com.revolut.feature.giro.impl.ui.form.DirectDebitFormScreenContract$InputData;
import com.revolut.feature.giro.impl.ui.form.domain.FormState;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import l80.e;
import l80.f;
import mra.d;
import oki.h;
import org.jetbrains.annotations.NotNull;
import vz1.g;
import yji.l;
import zhm.h0;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends h implements j {

    @NotNull
    public static final n Companion = new n();
    public final DirectDebitFormScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e f74548p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final d77.a f74549q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final g f74550r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final xi0.b f74551s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y f74552t;
    public final com.revolut.kompot.navigable.vc.modal.a u;

    public b(cli.n stateMapper, DirectDebitFormScreenContract$InputData inputData, e dateProvider, d77.a validator, g apmPaymentsAuthorisationsRepository, xi0.b featureCurrency) {
        b77.h hVar;
        String str;
        String str2;
        String str3;
        LocalDate localDate;
        Creditor.Details details;
        String str4;
        Creditor.Details details2;
        String str5;
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(validator, "validator");
        Intrinsics.checkNotNullParameter(apmPaymentsAuthorisationsRepository, "apmPaymentsAuthorisationsRepository");
        Intrinsics.checkNotNullParameter(featureCurrency, "featureCurrency");
        this.o = inputData;
        this.f74548p = dateProvider;
        this.f74549q = validator;
        this.f74550r = apmPaymentsAuthorisationsRepository;
        this.f74551s = featureCurrency;
        if (inputData instanceof DirectDebitFormScreenContract$InputData.CreateByCreditor) {
            b77.g gVar = b77.g.CREATE;
            Biller biller = ((DirectDebitFormScreenContract$InputData.CreateByCreditor) inputData).f74541a;
            m70.a.c(t0.f186434a);
            hVar = new b77.h(gVar, new FormState(biller, "", I2(), null, null), h0.f322473a);
        } else {
            if (!(inputData instanceof DirectDebitFormScreenContract$InputData.Edit)) {
                throw new NoWhenBranchMatchedException();
            }
            b77.g gVar2 = b77.g.EDIT;
            ApmPaymentAuthorisationSummary apmPaymentAuthorisationSummary = ((DirectDebitFormScreenContract$InputData.Edit) inputData).f74542a;
            PaymentMethodDetails paymentMethodDetails = apmPaymentAuthorisationSummary.f61995g;
            Creditor creditor = apmPaymentAuthorisationSummary.d;
            if (!(paymentMethodDetails instanceof PaymentMethodDetails.Giro)) {
                throw new IllegalArgumentException("Expected Payment Authorisation with GIRO Payment details");
            }
            if (creditor == null || (str5 = creditor.f62010a) == null) {
                m70.a.c(t0.f186434a);
                str = "";
            } else {
                str = str5;
            }
            t0 t0Var = t0.f186434a;
            m70.a.c(t0Var);
            if (creditor == null || (details2 = creditor.f62012c) == null || (str2 = details2.f62013a) == null) {
                Intrinsics.checkNotNullParameter(t0Var, "<this>");
                str2 = "";
            }
            if (creditor == null || (details = creditor.f62012c) == null || (str4 = details.f62014b) == null) {
                Intrinsics.checkNotNullParameter(t0Var, "<this>");
                str3 = "";
            } else {
                str3 = str4;
            }
            Biller biller2 = new Biller(str, "", null, null, null, null, null, false, false, false, new Biller.Details(str2, str3, null, null, false));
            String str6 = ((PaymentMethodDetails.Giro) paymentMethodDetails).f62033a.f62035a;
            LocalDateTime localDateTime = apmPaymentAuthorisationSummary.k;
            LocalDate localDateI2 = (localDateTime == null || (localDate = localDateTime.toLocalDate()) == null) ? I2() : localDate;
            LocalDateTime localDateTime2 = apmPaymentAuthorisationSummary.f61998l;
            hVar = new b77.h(gVar2, new FormState(biller2, str6, localDateI2, localDateTime2 != null ? localDateTime2.toLocalDate() : null, apmPaymentAuthorisationSummary.f62001p), h0.f322473a);
        }
        this.f74552t = d.b(this, hVar, stateMapper, null, false, 12);
        this.u = hx7.e.a(this, new av8.n(this, 27));
    }

    @Override // yji.l
    public final void I1() {
        l.a1(this, this.f74552t.B(new b77.l(this, 0)), null, null, new b74.e(this, null, 1), 3);
    }

    public final LocalDate I2() {
        LocalDate localDatePlusDays = ((f) this.f74548p).e().plusDays(1L);
        Intrinsics.checkNotNullExpressionValue(localDatePlusDays, "plusDays(...)");
        DayOfWeek dayOfWeek = localDatePlusDays.getDayOfWeek();
        int i = dayOfWeek == null ? -1 : o.f12933a[dayOfWeek.ordinal()];
        if (i == 1) {
            LocalDate localDatePlusDays2 = localDatePlusDays.plusDays(2L);
            Intrinsics.checkNotNullExpressionValue(localDatePlusDays2, "plusDays(...)");
            return localDatePlusDays2;
        }
        if (i != 2) {
            return localDatePlusDays;
        }
        LocalDate localDatePlusDays3 = localDatePlusDays.plusDays(1L);
        Intrinsics.checkNotNullExpressionValue(localDatePlusDays3, "plusDays(...)");
        return localDatePlusDays3;
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.u;
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f74552t;
    }
}
